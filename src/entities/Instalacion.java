package entities;

public abstract class Instalacion {
    private String nombre;

    public Instalacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean verificarAcceso(Usuario usuario);
}
