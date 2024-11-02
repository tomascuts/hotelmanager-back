package entities;

public class CredencialEjecutiva extends Credencial{
    @Override
    public boolean puedeAcceder(Instalacion instalacion) {
        return instalacion.esEjecutiva();
    }
}
