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
    boolean val= false;
    @Override
    public boolean creaTabla() {
        try {
        Class.forName("org.postgresql.Driver");
        Connection cn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba01", "postgres", "informatica");
        Statement s = cn.createStatement();

        // Nombre de la tabla que deseas verificar
        String tablaDeseada = "grupo506";

        // Consulta para verificar si la tabla ya existe
        ResultSet rs = cn.getMetaData().getTables(null, null, tablaDeseada, null);
        
        if (!rs.next()) {
            // La tabla no existe, la creas
            String createTable = "CREATE TABLE grupo506 (id int primary key, nombre varchar(30), matricula int, carrera varchar(25))";
            System.out.println(createTable);
            int result = s.executeUpdate(createTable);
            cn.close();
            val=true;
         
        } else {
            
            System.out.println("La tabla " + tablaDeseada + " ya existe.");
            cn.close();
            
            
        }
    } catch (Exception e) {
        e.getMessage();
    }
        return val;
    

    }
}
