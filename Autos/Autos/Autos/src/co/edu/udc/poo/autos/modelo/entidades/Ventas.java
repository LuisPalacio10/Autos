/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

import java.util.Date;

/**
 *
 * @author Luis Palacio
 */
public class Ventas {
    
    //PROPIEDADES
    private String id;
    private String vehiculo_id;
    private String vendedor_id;
    private String cliente_id;
    private String fecha_venta;
    
    //Constructor
    
    public Ventas(){
    
    }
   
    
    //Constructor con parametros
    public Ventas(String id, String vehiculo_id, String vendedor_id, String cliente_id, String fecha_venta){
    this.id = id;
    this.vehiculo_id = vehiculo_id;
    this.vendedor_id = vendedor_id;
    this.cliente_id = cliente_id;
    this.fecha_venta = fecha_venta;
    }    

    public void setId(String id) {
        this.id = id;
    }

    public void setVehiculo_id(String vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public void setVendedor_id(String vendedor_id) {
        this.vendedor_id = vendedor_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getId() {
        return id;
    }

    public String getVehiculo_id() {
        return vehiculo_id;
    }

    public String getVendedor_id() {
        return vendedor_id;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    
}
