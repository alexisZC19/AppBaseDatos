/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zavaletaax
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class EliminarModel implements EliminarInterfaceModel{

    @Override
    public void Eliminar() {
        try {
            
        String elemento = JOptionPane.showInputDialog("Ingrese la el id a eliminar:");
        
            Class.forName("org.postgresql.Driver");
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01", "postgres", "informatica");
            Statement s = cn.createStatement();

            String dato = "delete from grupo506 where id="+elemento;
            System.out.println(dato);
            int ns = s.executeUpdate(dato);

            String consulta = "select * from grupo506";
            System.out.println(consulta);
            ResultSet rs = s.executeQuery(consulta);

            if(rs!= null){
                
                while(rs.next()){
                    System.out.println("id: " +rs.getInt(1));
                    System.out.println("nombre: " +rs.getString(2));
                    System.out.println("Matricula: " +rs.getInt(3));
                    System.out.println("Carrera : " +rs.getString(4));
                    System.out.println("\n");
                
                
                }
            
            
            }

                
                
           

        } catch (Exception e) {
            e.getMessage();
        }
        
        
    }
    
}
