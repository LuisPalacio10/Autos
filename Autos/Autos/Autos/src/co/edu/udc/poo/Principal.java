/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udc.poo;
import co.edu.udc.poo.autos.modelo.entidades.Adicional;
import co.edu.udc.poo.autos.modelo.entidades.Cliente;
import co.edu.udc.poo.autos.modelo.entidades.Marca;
import co.edu.udc.poo.autos.modelo.entidades.Modelo;
import co.edu.udc.poo.autos.modelo.entidades.OpcionesAdicionales;
import co.edu.udc.poo.autos.modelo.entidades.Vehiculo;
import co.edu.udc.poo.autos.modelo.entidades.Vendedor;
import co.edu.udc.poo.autos.modelo.entidades.Ventas;
import java.util.Scanner;

/**
 *
 * @author Luis Palacio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
       
        //FACTURA VENTA DE VEHICULO
        
        //DATOS DE CLIENTE NUMERO 1
        
        Cliente cliente1 = new Cliente();
        cliente1.setId(" 1047474782 ");
        cliente1.setNombre(" Damian Emiliano ");
        cliente1.setApellido(" Martinez Romero ");
        cliente1.setDni(" 1047474782 ");
        cliente1.setDireccion(" Socorro Etapa Nr3 ");
        cliente1.setTelefono(" +57 3205476390 \n ");        
        
        //DATOS DEL VENDEDOR
        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setId(" 1143386500 ");
        vendedor1.setNombre(" Luis David ");
        vendedor1.setApellido(" Palacio Diaz ");
        vendedor1.setDni(" 1143386500 ");
        vendedor1.setDireccion(" Los cerezos Mz D - Lote 4 ");
        vendedor1.setTelefono(" +57 3107267442 \n");

        //DATOS DE LA VENTA
        
        Ventas venta1 = new Ventas();
        venta1.setFecha_venta("03/12/2022  \n");
        
        //DATOS DE LA MARCA
        
        Marca marca1 = new Marca();
        marca1.setId("000001");
        marca1.setNombre("Alfa Romeo");
        marca1.setDescripcion("Automovil deportivo gama alta");
        
        //DATOS DE OPCIONES ADICIONALES
        
        OpcionesAdicionales opcion1 = new OpcionesAdicionales();
        opcion1.setAdicional_id("");
        opcion1.setVehiculo_id("");
        
        //DATOS ADICIONAL
        
        Adicional adicional = new Adicional();
        adicional.setId("");
        adicional.setNombre("Pintura Perlada");
        adicional.setDescripcion("Transparencia y refraccion de la luz \n");
        
       
        //DATOS DEL MODELO
        
        Modelo modelo1 = new Modelo();
        modelo1.setId("010101");
        modelo1.setMarca_id("000001");
        modelo1.setNombre("GIULIA QUADRIFOGLIO RWD");
        
           
        System.out.println("CONCESIONARIO DE AUTOS CARTAGENA \n");
        System.out.println("Informacion de compra: \n");
        System.out.println("Datos del cliente: 001 \n ");
        System.out.println("id :" + cliente1.getId());
        System.out.println("Nombre :" + cliente1.getNombre());
        System.out.println("Apellido :" + cliente1.getApellido());
        System.out.println("Dni :" + cliente1.getDni());
        System.out.println("Direccion :" + cliente1.getDireccion());
        System.out.println("Telefono :" + cliente1.getTelefono());
        
        
        System.out.println("Datos del vendedor: 001 \n ");
        System.out.println("id :" + vendedor1.getId());
        System.out.println("Nombre :" + vendedor1.getNombre());
        System.out.println("Apellido :" + vendedor1.getApellido());
        System.out.println("Dni :" + vendedor1.getDni());
        System.out.println("Direccion :" + vendedor1.getDireccion());
        System.out.println("Telefono :" + vendedor1.getTelefono());
        
        
        //DATOS VEHICULO NUEVO ADQUIRIDO
        
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.setId("X0001");
        vehiculo1.setModelo_id("010101");
        vehiculo1.setCilindraje("1.0 L");       
        vehiculo1.setPrecio("450.000.000");
        vehiculo1.setMatricula("ULN-94F");
        
       
        
        
        System.out.println("Datos del vehiculo nuevo adquirido: \n ");
        System.out.println("id : " + vehiculo1.getId());
        System.out.println("Modelo_id : " + vehiculo1.getModelo_id());
        System.out.println("Marca : " + marca1.getNombre());
        System.out.println("Modelo : " + modelo1.getNombre());
        System.out.println("Descripcion : " + marca1.getDescripcion());
        System.out.println("Cilindraje : " + vehiculo1.getCilindraje());
        System.out.println("Precio : " + vehiculo1.getPrecio());
        System.out.println("Matricula : " + vehiculo1.getMatricula());
        System.out.println("Fecha de venta : " + venta1.getFecha_venta());
        System.out.println("Opcion Adicional : " + adicional.getNombre());
        System.out.println("Descripcion : " + adicional.getDescripcion());
                
        
        //DATOS VEHICULO CEDIDO
        
        Vehiculo vehiculocedido1 = new Vehiculo();  
        vehiculocedido1.setMatricula("ULN-543");
        vehiculocedido1.setPrecio_tasacion("97.000.000");
        
        //DATOS DE LA MARCA CEDIDA
        
        Marca marcacedido1 = new Marca();
        marcacedido1.setNombre("Ferrari");
        
        //DATOS DEL MODELO CEDIDO
        
        Modelo modelocedido1 = new Modelo();
        modelocedido1.setNombre("GIULIA QUADRIFOGLIO RWD");
        
       
        System.out.println("Datos del vehiculo cedido: \n ");
        System.out.println("Marca : " + marcacedido1.getNombre());
        System.out.println("Modelo : " + modelocedido1.getNombre());
        System.out.println("Matricula : " + vehiculocedido1.getMatricula());
        System.out.println("Precio Tasacion : " + vehiculocedido1.getPrecio_tasacion());       
        
        
    }
    
}
        
    

