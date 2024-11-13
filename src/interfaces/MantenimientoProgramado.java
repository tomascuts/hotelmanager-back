package interfaces;

import java.util.Date;

public interface MantenimientoProgramado {
    void programarMantenimiento(Date fecha);
    Date obtenerProximaFechaMantenimiento();
}
