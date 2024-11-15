package com.mycompany.logistica;
import com.mycompany.logistica.config.Conexion;
import com.mycompany.logistica.views.MenuInicio;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;

public class Logistica {


    private static final String TITULO_MENU = "Seleccione su opción";
    private static final String MENSAJE_ERROR_CONEXION = "Error de conexión con la base de datos";
    private static final String TITULO_ERROR = "Error de conexión";

    public static void main(String[] args) {
        // Intentar obtener la conexión
        Connection connection = Conexion.getConnection();

        // Si la conexión es nula, mostrar el mensaje de error
        if (connection == null) {
            JOptionPane.showMessageDialog(null, MENSAJE_ERROR_CONEXION, TITULO_ERROR, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // Si la conexión fue exitosa, mostrar el menú
        MenuInicio menu = new MenuInicio();
        menu.setTitle(TITULO_MENU);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
