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
    private EstadoPedido estado;

    private EstadoPedido obtenerEstado() {
        return estado;
    }

    private enum EstadoPedido {
        pendiente,
        cancelado,
        completado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getProducSolicitado() {
        return producSolicitado;
    }

    public int getCantiPedido() {
        return cantiPedido;
    }

    public void setCantiPedido(int cantiPedido) {
        this.cantiPedido = cantiPedido;
    }

    public EstadoPedido getEstado() {
        return obtenerEstado();
    }

    public Pedido(Cliente cliente, String producSolicitado, int cantiPedido, boolean estadoPedido) {
        this.cliente = cliente;
        this.producSolicitado = producSolicitado;
        this.cantiPedido = cantiPedido;

    }

}
