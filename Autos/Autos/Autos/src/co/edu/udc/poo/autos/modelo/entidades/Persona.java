/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udc.poo.autos.modelo.entidades;

/**
 *
 * @author Luis Palacio
 */
public class Persona {
    
    //Propiedades
    protected String id;
    protected String nombre;
    protected String apellido;    
    protected String dni;
    protected String direccion;
    protected String telefono;   
    
    //Constructor
    public Persona(){
    }
    
    //Constructor con parametros
    public Persona(String id, String nombre, String apellido, String dni,String direccion,String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Aqui utilizare el metodo GET para devolver un valor
    
    public String getIdPersona() {
        return id;
    }

    public String getNombrePersona() {
        return nombre;
    }

    public String getApellidoPersona() {
        return apellido;
    }

    public String getDniPersona() {
        return dni;
    }

    public String getDireccionPersona() {
        return direccion;
    }

    public String getTelefonoPersona() {
        return telefono;
    }   

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

      