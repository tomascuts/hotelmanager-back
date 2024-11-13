package entities;

public class Casino extends Instalacion {
    private int edadMinima;

    public Casino(int edadMinima) {

        super("Casino");
        this.edadMinima = edadMinima;
    }

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        return usuario.getEdad() >= edadMinima;
    }
}
