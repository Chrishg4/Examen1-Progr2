/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public final class GestorPedido {

    private static GestorPedido instancia;
    private ArrayList<String> listaPedido = null;

    public GestorPedido instancia() {
        if (instancia == null) 
            instancia = new GestorPedido();

        return instancia;

    }

    private GestorPedido() {
        listaPedido = new ArrayList<String>();
    }
    
    public ArrayList<String>getArray(){
        return this.listaPedido;
    }
    
    public void agregarPedido(String pedido){
        listaPedido.add(pedido);
    }
//
//    public void cancelar() {
//
//    }
//
//    public void mostrar() {
//
//    }
}
