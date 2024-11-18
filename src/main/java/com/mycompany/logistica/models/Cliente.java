package com.mycompany.logistica.models;

import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Ibrahim Calzadilla
 */
public class Cliente {

    protected int id;
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

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getTelefono());
            ps.setString(4, getCorreo());
            ps.setString(5, getDireccion());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Se agregó correctamente el cliente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el cliente: " + e.getMessage());
        }
    }

    public void MostrarClientes(JTable listadoClientes) {

        String[] columnas = {"ID", "Nombre", "Apellido", "Teléfono", "Correo", "Dirección"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        String sql = "SELECT id_cliente, nombre, apellido, telefono, correo, direccion FROM clientes";

        try (PreparedStatement ps = conexion.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

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

    public void ActualizarCliente(int id, String nombre, String apellido, String telefono, String correo, String direccion) {
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setCorreo(correo);
        setDireccion(direccion);
        setId(id);

        String sql = "UPDATE clientes SET nombre=?, apellido=?,telefono=?, correo=?, direccion=? where id_cliente =?;";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getTelefono());
            ps.setString(4, getCorreo());
            ps.setString(5, getDireccion());
            ps.setInt(6, getId());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Se actualizó correctamente el cliente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el cliente: " + e.getMessage());
        }
    }

    public void EliminarCliente(int id) {
        String sql = "DELETE FROM clientes WHERE id_cliente=?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con ID: " + id);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente: " + e.getMessage());
            JOptionPane.showMessageDialog(null, id);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
