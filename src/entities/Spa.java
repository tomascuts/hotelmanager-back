package entities;

import interfaces.MantenimientoProgramado;

import java.util.List;

public class Spa extends Instalacion {
    public Spa() {
        super("Spa");
    }

    private int cantidadAccesosPermitido;
    private List<Usuario> listaAccesosUsuarios;

    @Override
    public boolean verificarAcceso(Usuario usuario) {

        int limiteAccesosSegunCredencial = usuario.getCredencial().getNivel();

        long accesosActuales = listaAccesosUsuarios.stream()
                .filter(x -> x.getDni() == usuario.getDni())
                .count();

        if (accesosActuales < limiteAccesosSegunCredencial) {
            listaAccesosUsuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }
}
