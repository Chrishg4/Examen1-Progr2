/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Producto {
    private int id;
    private String descripcion;
    private String precio; 

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(int id, String descripcion, String precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {
        this(0,"","");
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", precio=" + precio + '}';
    }
    
    
    
}
