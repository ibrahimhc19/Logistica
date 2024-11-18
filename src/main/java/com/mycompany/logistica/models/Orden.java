package com.mycompany.logistica.models;


/**
 *
 * @author Ibrahim Calzadilla
 */

import com.mycompany.logistica.config.Conexion;
import java.util.Date;

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

    
    public void RegistrarOrden(){
    }
    
    protected String validarNumeroGuia(String numeroGuia) {
        // Validación: 10 caracteres alfanuméricos
        if (!numeroGuia.matches("[A-Za-z0-9]{10}")) {
            throw new IllegalArgumentException("Formato de número de guía inválido");
        }
        return numeroGuia;
    }
    

}