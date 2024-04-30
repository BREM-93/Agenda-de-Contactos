/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendatelefonica;

/**
 *
 * @author HP
 */
public class Contacto {
    
    //Atributos
    private String nombre;
    private int telefono;

    //Creamos contructor con todos los elementos
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Constructor para nombre
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }

    
    //Creamos los setters y getters de cada atributo
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    //Metodo que comprobara que no hayan contactos con el mismo nombre
    public boolean equals(Contacto contacto){
    
        if(nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){//trim borrara todos los espacios en blanco en la lista de contactos
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "\nNombre : " + nombre + "\nTelefono : " + telefono + "\n";
    } 
}

