package entities;

import interfaces.MantenimientoProgramado;

import java.time.LocalDate;
import java.util.Date;

public class Comedor extends Instalacion implements MantenimientoProgramado {

    public Comedor(int capacidadMaxima) {
        super("Comedor");
        this.capacidadMaxima = capacidadMaxima;
    }

    private int capacidadMaxima;
    private int personasEnElComedor;
    private Date fechaProximoMantenimiento;

    public void printCantidadPersonas(){
        System.out.println("La cantidad de usuarios en el comedor es: " + personasEnElComedor);
    }

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
        System.out.println("\nSe programo el mantenimiento de para la fecha: " + fecha);
    }

    @Override
    public Date obtenerProximaFechaMantenimiento() {
        return fechaProximoMantenimiento;
    }
}
