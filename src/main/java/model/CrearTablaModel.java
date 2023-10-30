/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author zavaletaax
 */
public class CrearTablaModel implements CrearTablaInterfaceModel {

    @Override
    public void creaTabla() {
         try{
            Class.forName("org.postgresql.Driver");
            Connection cn= DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01","postgres","informatica");
            Statement s = cn.createStatement();
       
            String createTable= "Create table grupo506 ( id int primary key , nombre varchar(30) , matricula int, carrera varchar(25))";
            System.out.println(createTable);
            int rs = s.executeUpdate(createTable);
            cn.close();
        }catch(Exception e){
            System.out.println(e);
        }
    
    }
}
