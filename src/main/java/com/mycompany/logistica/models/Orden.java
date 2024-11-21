package com.mycompany.logistica.models;


/**
 *
 * @author Ibrahim Calzadilla
 */

import com.mycompany.logistica.config.Conexion;


public abstract class Orden {

    protected int idEnvio;
    protected int idCliente;
    protected String tipoDeProducto;
    protected int cantidadProducto;
    protected String fechaDeRegistro;
    protected String fechaDeEntrega;
    protected double precioDeEnvio;
    protected String numeroDeGuia;
    protected Connection conexion;

    public Orden(Connection conexion){
        this.conexion = conexion;
    }

    
    public abstract void RegistrarOrden(){
    }
    
    protected String validarNumeroGuia(String numeroGuia) {
        // Validación: 10 caracteres alfanuméricos
        if (!numeroGuia.matches("[A-Za-z0-9]{10}")) {
            throw new IllegalArgumentException("Formato de número de guía inválido");
        }
        return numeroGuia;
    }

    public static Orden obtenerPorTipo(String tipo, int idEnvio) {
        if ("terrestre".equalsIgnoreCase(tipo)) {
            return OrdenTerrestre.obtener(idEnvio);
        } else if ("maritima".equalsIgnoreCase(tipo)) {
            return OrdenMaritima.obtener(idEnvio);
        } else {
            throw new IllegalArgumentException("Tipo de orden no válido");
        }
    }

}


