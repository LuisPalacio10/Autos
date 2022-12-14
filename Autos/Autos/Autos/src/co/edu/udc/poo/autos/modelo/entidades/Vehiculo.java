/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

/**
 *
 * @author Luis Palacio
 */
public class Vehiculo {
    
    //Propiedades
    private String id;
    private String modelo_id;
    private String cilindraje;
    private String precio;
    private String matricula;
    private String precio_tasacion;
    
    //Constructor
    public Vehiculo(){
    
    }
    
    //Constructor con parametros
    public Vehiculo(String id, String modelo_id,String cilindraje,String matricula,String precio_tasacion){
        this.id = id;
        this.modelo_id = modelo_id;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.matricula = matricula;
        this.precio_tasacion = precio_tasacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelo_id(String modelo_id) {
        this.modelo_id = modelo_id;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setPrecio_tasacion(String precio_tasacion) {
        this.precio_tasacion = precio_tasacion;
    }

    public String getId() {
        return id;
    }

    public String getModelo_id() {
        return modelo_id;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public String getPrecio() {
        return precio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getPrecio_tasacion() {
        return precio_tasacion;
    }

    
    
}
