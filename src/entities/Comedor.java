package entities;

import java.util.List;

public class Comedor extends Instalacion {
    public Comedor() {
        super("Comedor");
    }

    private int capacidadMaxima;
    private List<Usuario> personasEnElComedor;

    @Override
    public boolean verificarAcceso(Usuario usuario) {

        if(personasEnElComedor.size() < 30 )
        {
            personasEnElComedor.add(usuario);
            return true;
        }

        return false;
    }
}
