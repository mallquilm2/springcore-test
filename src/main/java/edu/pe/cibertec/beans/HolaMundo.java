package edu.pe.cibertec.beans;

import org.springframework.beans.factory.annotation.Value;

public class HolaMundo {
    @Value("Alumnos backend desde anotaciones Configuración")
    private String nombre;

    public void saludar(){
        System.out.println("Saludando desde spring"+nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
