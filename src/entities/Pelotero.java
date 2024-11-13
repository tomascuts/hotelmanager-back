package entities;

public class Pelotero extends InstalacionConCosto {
    private int edadMaxima;

    public Pelotero(String nombre, int costoEntrada, int edadMaxima) {
        super(nombre, costoEntrada);
        this.edadMaxima = edadMaxima;
    }

    @Override
    public boolean verificarSaldoSuficiente(Usuario usuario) {
        return usuario.getCredencial().getSaldoAcreditado() >= costoEntrada;
    }

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        return usuario.getEdad() <= edadMaxima;
    }
}
