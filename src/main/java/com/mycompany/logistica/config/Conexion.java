package com.mycompany.logistica.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ibrahim Calzadilla
 */

public class Conexion {
    // Datos de conexión
    private static final String URL = "jdbc:mysql://localhost:3306/logistica";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {

            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

}