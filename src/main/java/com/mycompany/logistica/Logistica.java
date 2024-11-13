package com.mycompany.logistica;

import com.mycompany.logistica.config.Conexion;
import static com.mycompany.logistica.config.Conexion.getConnection;
import com.mycompany.logistica.views.GuiOM;
import com.mycompany.logistica.views.GuiOT;
import java.sql.Connection;
import javax.swing.JOptionPane;


/**
 *
 * @author Ibrahim Calzadilla
 */
public class Logistica {

    public static void main(String[] args) {
        
        
        Connection connection = getConnection();
        
        if(connection != null){  
        
        
        String[] opciones = {"Terrestre", "Marítimo"};
          GuiOT pantallaT = new GuiOT();
          GuiOM pantallaM = new GuiOM();
        
       
        // Mostrar el JOptionPane con las dos opciones
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Selecciona el tipo de orden a registrar:", "Registro de Ordenes", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        
        if (opcionSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Ha cancelado el registro", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        if(opcionSeleccionada == "Terrestre"){
          pantallaT.setTitle("Registro Orden Terrestre");
          pantallaT.setTxtEnvio("Terrestre");
          pantallaT.setVisible(true);
          pantallaT.setLocationRelativeTo(null);
            
        }
        if(opcionSeleccionada == "Marítimo"){
          pantallaM.setTitle("Registro Orden Marítima");
          pantallaM.setTxtEnvio("Marítimo");
          pantallaM.setVisible(true);
          pantallaM.setLocationRelativeTo(null);
            
        }
         } 
    }
}
