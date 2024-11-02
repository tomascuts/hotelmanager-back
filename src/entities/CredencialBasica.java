package entities;

public class CredencialBasica extends Credencial{
    @Override
    public boolean puedeAcceder(Instalacion instalacion) {
        return instalacion.esBasica();
    }
}
