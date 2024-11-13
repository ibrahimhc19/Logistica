package com.mycompany.logistica.models;

import java.util.Date;

/**
 *
 * @author Ibrahim Calzadilla
 */

import com.mycompany.logistica.config.Conexion;
import java.util.Date;
import javax.swing.JTextField;

public class Orden {


    protected String tipoProducto;
    protected int cantidadProducto;
    protected Date fechaRegistro;
    protected Date fechaEntrega;
    protected String lugarEntrega;
    protected double precioEnvio;
    protected String numeroGuia;
    protected String cliente;
    protected String tipoTransporte;
    protected Conexion con;

    public Orden() {
        this.con = new Conexion();
    }
    
    public void RegistrarOrden(JTextField tipoP, JTextField cantidad, JTextField fechaR, JTextField fechaE, JTextField lugarE, JTextField precio){
        
        int cantidadInt = Integer.parseInt(cantidad.getText());
        int precioInt = Integer.parseInt(precio.getText());
        setTipoProducto(tipoP.getText());
        setCantidadProducto(cantidadInt);
        setFechaRegistro(new Date());
        setFechaEntrega(new Date());
        setLugarEntrega(lugarE.getText());
        setPrecioEnvio(precioInt);
        
        
        String sql = "INSER INTO transporte (tipoProducto,cantidadProducto,fechaRegistro,fechaEntrega,lugarEntrega,precioEnvio,tipo) VALUES (this.tipoProducto, this.cantidadProductos, this.fechaRegistro, this.fechaEntrega, this.lugarEntrega, this.precioEnvio)";
    }
    
    protected String validarNumeroGuia(String numeroGuia) {
        // Validación: 10 caracteres alfanuméricos
        if (!numeroGuia.matches("[A-Za-z0-9]{10}")) {
            throw new IllegalArgumentException("Formato de número de guía inválido");
        }
        return numeroGuia;
    }
    
        public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }
}