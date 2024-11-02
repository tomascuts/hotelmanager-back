package entities;

public abstract class Instalacion {
    private String nombre;

    public Instalacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos para verificar el tipo de instalación
    public abstract boolean esEjecutiva();
    public abstract boolean esBasica();
    public abstract boolean esPremium();
}
