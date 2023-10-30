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

    @Override
    public void CrearBase() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01", "postgres", "informatica");
            Statement s = cn.createStatement();

            String createBase = "Create database grupo506";
            System.out.println(createBase);
            int rs = s.executeUpdate(createBase);

            
            
            

        } catch (Exception e) {
            e.getMessage();
        }
    }
    
}
