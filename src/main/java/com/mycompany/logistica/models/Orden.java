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

    }
    
    protected String validarNumeroGuia(String numeroGuia) {
        // Validación: 10 caracteres alfanuméricos
        if (!numeroGuia.matches("[A-Za-z0-9]{10}")) {
            throw new IllegalArgumentException("Formato de número de guía inválido");
        }
        return numeroGuia;
    }
    

}