package entities;

public abstract class InstalacionConCosto extends Instalacion {
    protected int costoEntrada;

    public InstalacionConCosto(String nombre, int costoEntrada) {
        super(nombre);
        this.costoEntrada = costoEntrada;
    }

    public abstract boolean verificarSaldoSuficiente(Usuario usuario);

    public int getCostoEntrada() {
        return costoEntrada;
    }
}
