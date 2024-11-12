package entities;

public class Casino extends Instalacion {
    private int edadMinima;

    public Casino() {
        super("Casino");
    }

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        return usuario.getEdad() >= edadMinima;
    }
}
