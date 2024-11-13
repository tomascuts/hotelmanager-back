package entities;

import interfaces.MantenimientoProgramado;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Comedor extends Instalacion implements MantenimientoProgramado {

    public Comedor(int capacidadMaxima) {
        super("Comedor");
        this.capacidadMaxima = capacidadMaxima;
    }

    private int capacidadMaxima;
    private int personasEnElComedor;
    private Date fechaProximoMantenimiento;

    @Override
    public boolean verificarAcceso(Usuario usuario) {
        boolean respuesta = false;

        if(personasEnElComedor < capacidadMaxima )
        {
            this.personasEnElComedor++;
            respuesta = true;
        }

        return respuesta;
    }

    @Override
    public void programarMantenimiento(Date fecha) {
        this.fechaProximoMantenimiento = fecha;
    }

    @Override
    public Date obtenerProximaFechaMantenimiento() {
        return fechaProximoMantenimiento;
    }
}
