/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CrearBaseModel;

/**
 *
 * @author zavaletaax
 */
public class CrearBaseController {
    CrearBaseModel crearB = new CrearBaseModel();
    boolean al;
    
    public boolean CrearBase(){
       al= crearB.CrearBase();
       return al; 
    }
    
}
