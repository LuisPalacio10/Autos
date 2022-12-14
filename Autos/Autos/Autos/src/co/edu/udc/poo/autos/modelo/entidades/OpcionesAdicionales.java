/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

/**
 *
 * @author Luis Palacio
 */
public class OpcionesAdicionales {
    
    //Propiedades
    private String vehiculo_id;
    private String adicional_id; 
    
    //Constructor
    public OpcionesAdicionales(){
    
    }
    
    //Constructor con parametros
    public OpcionesAdicionales(String vehiculo_id, String adicional_id){
        this.vehiculo_id=vehiculo_id;
        this.adicional_id=adicional_id;    
    }   

    public void setVehiculo_id(String vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public void setAdicional_id(String adicional_id) {
        this.adicional_id = adicional_id;
    }

    public String getVehiculo_id() {
        return vehiculo_id;
    }

    public String getAdicional_id() {
        return adicional_id;
    }
}
