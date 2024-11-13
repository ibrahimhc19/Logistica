package com.mycompany.logistica.models;

import com.mycompany.logistica.config.Conexion;

/**
 *
 * @author Ibrahim Calzadilla
 */
public class Cliente {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String telefono;
     protected Conexion con;

    public Cliente() {
        this.con = new Conexion();
    }
}
