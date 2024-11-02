package entities;

import interfaces.Acceso;

public class Usuario implements Acceso {
    private String nombre;
    private int dni;
    private Credencial credencial;

    public Usuario(String nombre, int dni, Credencial credencial) {
        this.nombre = nombre;
        this.dni = dni;
        this.credencial = credencial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    @Override
    public boolean tieneAcceso(Instalacion instalacion) {
        return credencial.puedeAcceder(instalacion);
    }
}
