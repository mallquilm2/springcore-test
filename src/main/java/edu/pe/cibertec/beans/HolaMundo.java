package edu.pe.cibertec.beans;

public class HolaMundo {

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
