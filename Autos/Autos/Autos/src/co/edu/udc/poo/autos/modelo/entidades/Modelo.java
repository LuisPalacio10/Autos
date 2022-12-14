/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

/**
 *
 * @author Luis Palacio
 */
public class Modelo {
    
    //Propiedades
    private String id;
    private String nombre;
    private String marca_id;    
    
    //Constructor
    public Modelo(){
    
    }
    
    //Constructor con parametros
    public Modelo(String id, String nombre, String marca_id){
        this.id=id;
        this.nombre=nombre;
        this.marca_id=marca_id;    
    }    

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca_id(String marca_id) {
        this.marca_id = marca_id;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca_id() {
        return marca_id;
    }
}
