/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Pedido {
    private Cliente cliente;
    private String producSolicitado;
    private int cantiPedido;
   // private boolean estadoPedido;

    public Cliente getCliente() {
        return cliente;
    }

    public String getProducSolicitado() {
        return producSolicitado;
    }

    public int getCantiPedido() {
        return cantiPedido;
    }

//    public boolean isEstadoPedido() {
//        return estadoPedido;
//    }

    public void setCantiPedido(int cantiPedido) {
        this.cantiPedido = cantiPedido;
    }

    public Pedido(Cliente cliente, String producSolicitado, int cantiPedido, boolean estadoPedido) {
        this.cliente = cliente;
        this.producSolicitado = producSolicitado;
        this.cantiPedido = cantiPedido;
       // this.estadoPedido = estadoPedido;
    }
    
    
    
}
