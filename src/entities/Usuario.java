package entities;

import interfaces.Acceso;

public class Usuario {
    private String nombre;
    private int edad;
    private int dni;
    private Credencial credencial;

    public Usuario(String nombre,int edad,  int dni, Credencial credencial) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.credencial = credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public Credencial getCredencial() {
        return credencial;
    }
}
