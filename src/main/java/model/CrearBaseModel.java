/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author zavaletaax
 */
public class CrearBaseModel implements CrearBaseInterfaceModel{
    Connection cn= null;
    Statement s= null;
    boolean baseExiste = false;

    @Override
    public boolean CrearBase() {
        try {
            Class.forName("org.postgresql.Driver");
            cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01", "postgres", "informatica");
            s = cn.createStatement();
            
            ResultSet ns = cn.getMetaData().getCatalogs();
            
            String baseCrear = "grupo506";
            while (ns.next()) {
                String databaseName = ns.getString(1);
                if (databaseName.equalsIgnoreCase(baseCrear)) {
                    baseExiste = true;
                    break;
                }
            }
            if (!baseExiste) {
                String createBase = "CREATE DATABASE " + baseCrear;
                System.out.println(createBase);
                int rs = s.executeUpdate(createBase);
                System.out.println("La base de datos " + baseCrear+ " ha sido creada.");
                
            } else {
                System.out.println("La base de datos " + baseCrear + " ya existe.");
                
            }
       
                   
             cn.close();
                
            } catch (Exception e) {
                e.getMessage();
        }
        return baseExiste;
    }
    
}
