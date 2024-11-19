package entities;

import interfaces.MantenimientoProgramado;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Spa extends Instalacion implements MantenimientoProgramado {
    public Spa() {
        super("Spa");
        listaAccesosUsuarios = new ArrayList<Usuario>();
    }

    private int cantidadAccesosPermitido;
    private List<Usuario> listaAccesosUsuarios;
    private Date fechaProximoMantenimiento;

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        boolean respuesta = false;

        int limiteAccesosSegunCredencial = usuario.getCredencial().getNivel();

        long accesosActuales = listaAccesosUsuarios.stream()
                .filter(item -> item.getDni() == usuario.getDni()) //Recorremos usuario por usuario
                .count();

        if (accesosActuales < limiteAccesosSegunCredencial) {
            listaAccesosUsuarios.add(usuario);
            respuesta = true;
        }

        return respuesta;
    }

    @Override
    public void programarMantenimiento(Date fecha) {
        this.fechaProximoMantenimiento = fecha;
        System.out.println("\nSe programo el mantenimiento de para la fecha: " + fecha);
    }

    @Override
    public Date obtenerProximaFechaMantenimiento() {
        return fechaProximoMantenimiento;
    }
}
