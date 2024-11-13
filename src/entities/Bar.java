package entities;

public class Bar extends InstalacionConCosto {
    private int edadMinima;

    public Bar(String nombre, int costoEntrada, int edadMinima) {
        super(nombre, costoEntrada);
        this.edadMinima = edadMinima;
    }

    @Override
    public boolean verificarSaldoSuficiente(Usuario usuario) {
        return usuario.getCredencial().getSaldoAcreditado() >= costoEntrada;
    }

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        return usuario.getEdad() >= edadMinima;
    }
}
