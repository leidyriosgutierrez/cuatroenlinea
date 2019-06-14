
package com.juegocuatroenlinea.modelo;

import java.io.Serializable;

public class Persona implements Serializable{
    private String identificacion;
    private String nombre;
    private Byte edad;

    public Persona(String identificacion, String nombre, Byte edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "identificacion=" + identificacion + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
 
    
}
