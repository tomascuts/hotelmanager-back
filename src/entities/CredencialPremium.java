package entities;

public class CredencialPremium extends Credencial {
    @Override
    public boolean puedeAcceder(Instalacion instalacion) {
        return instalacion.esPremium();
    }
}
