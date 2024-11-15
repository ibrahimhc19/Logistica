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
    
    public void MostrarClientes(JTable listadoClientes){
        
        
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
