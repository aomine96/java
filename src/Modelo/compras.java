/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class compras {

    //variables
    private int id, id_clientes, id_series, cantidad;
    private double precio;
    private Date fecha_compra;

    //constructores
    public compras() {

    }

    public compras(int id, int id_clientes, int id_series, int cantidad, double precio, Date fecha_compra) {
        this.id = id;
        this.id_clientes = id_clientes;
        this.id_series = id_series;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
    }
    //métodos getter && setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public int getId_series() {
        return id_series;
    }

    public void setId_series(int id_series) {
        this.id_series = id_series;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

}
