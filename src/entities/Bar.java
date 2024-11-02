package entities;

public class Bar extends Instalacion {
    public Bar() {
        super("Bar");
    }

    @Override
    public boolean esEjecutiva() {
        return false;
    }

    @Override
    public boolean esBasica() {
        return false;
    }

    @Override
    public boolean esPremium() {
        return true;
    }
}
