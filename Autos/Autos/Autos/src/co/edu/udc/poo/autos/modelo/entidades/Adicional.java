/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

/**
 *
 * @author Luis Palacio
 */
public class Adicional {
    
    //Propiedades
    private String id;
    private String nombre;
    private String descripcion;  
    
    //Constructor
    public Adicional(){
    
    }
    
    //Constructor con parametros
    public Adicional(String id, String nombre, String descripcion){
    this.id=id;
    this.nombre=nombre;
    this.descripcion=descripcion;    
    }   

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
