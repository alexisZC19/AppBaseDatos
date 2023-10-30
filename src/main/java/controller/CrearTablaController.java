/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CrearTablaModel;

/**
 *
 * @author zavaletaax
 */
public class CrearTablaController {
    CrearTablaModel crearTab= new CrearTablaModel();
    boolean dat;
    public boolean crearTabla(){
        dat=crearTab.creaTabla();
        return dat;
    }
    
    
}
