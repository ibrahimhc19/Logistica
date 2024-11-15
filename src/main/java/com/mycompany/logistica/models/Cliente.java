package com.mycompany.logistica.models;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Ibrahim Calzadilla
 */
public class Cliente {

    protected String nombre;
    protected String apellido;
    protected String telefono;
    protected String correo;
    protected String direccion;
    protected Connection conexion;
    
    public Cliente(Connection conexion) {
        this.conexion = conexion;
    }

    public void RegistrarCliente(String nombre, String apellido, String telefono, String correo, String direccion) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setCorreo(correo);
        setDireccion(direccion);

        String sql = "INSERT INTO clientes (nombre, apellido,telefono, correo, direccion) VALUES(?,?,?,?,?)";

        try (CallableStatement cs = conexion.prepareCall(sql)) {
            cs.setString(1, getNombre());
            cs.setString(2, getApellido());
            cs.setString(3, getTelefono());
            cs.setString(4, getCorreo());
            cs.setString(5, getDireccion());
            cs.execute();

            JOptionPane.showMessageDialog(null, "Se agregó correctamente el cliente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente: " + e.getMessage());
        }
    }
    
public void MostrarClientes(JTable listadoClientes) {

    String[] columnas = {"ID", "Nombre", "Apellido", "Teléfono", "Correo", "Dirección"};
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

    String sql = "SELECT id_cliente, nombre, apellido, telefono, correo, direccion FROM clientes";

    try (PreparedStatement ps = conexion.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        // Llenar el modelo con los datos obtenidos de la consulta
        while (rs.next()) {
            Object[] fila = {
                rs.getInt("id_cliente"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("telefono"),
                rs.getString("correo"),
                rs.getString("direccion")
            };
            modelo.addRow(fila); // Agregar la fila al modelo
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar los clientes: " + e.getMessage());
    }

    // Asignar el modelo al JTable
    listadoClientes.setModel(modelo);

    // Agregar funcionalidad de ordenamiento de filas
    TableRowSorter<TableModel> ordenarTabla = new TableRowSorter<>(modelo);
    listadoClientes.setRowSorter(ordenarTabla);
}

    public void ActualizarCliente(){
        
    }
    public void EliminarCliente(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
