import entities.*;
import exceptions.UsuarioYaRegistradoException;

import java.util.Date;


public class Main {
    public static void main(String[] args) throws UsuarioYaRegistradoException {

        Hotel fragataHotel = new Hotel();

        Spa spa = new Spa();
        Bar bar = new Bar("Hall principal",3000,18);
        Bar barTerraza = new Bar("Terraza",3500,23);
        Casino casino = new Casino(22);
        Pelotero pelotero = new Pelotero("Pelotero patio",1000,13 );
        Comedor comedor = new Comedor(4);

        fragataHotel.agregarInstalacion(spa);
        fragataHotel.agregarInstalacion(bar);
        fragataHotel.agregarInstalacion(casino);
        fragataHotel.agregarInstalacion(barTerraza);
        fragataHotel.agregarInstalacion(pelotero);
        fragataHotel.agregarInstalacion(comedor);

        fragataHotel.printInstalaciones();
        comedor.printCantidadPersonas();

        Credencial credencialStandard = new Credencial(1);
        Credencial credencialGold = new Credencial(2);
        Credencial credencialBlack = new Credencial(3);

        credencialStandard.setSaldoAcreditado(1000);
        credencialGold.setSaldoAcreditado(5000);

        Usuario tomas = new Usuario("Tomas Joaquin", 22,43344670,credencialGold);
        Usuario maria = new Usuario("Maria Segura", 22,44657845,credencialGold);
        Usuario hana = new Usuario("Hana Soler", 14,45845922,credencialStandard);

        Usuario nicolas = new Usuario("Nicolas Alvarez", 27,40344670,credencialBlack);
        Usuario diego = new Usuario("Diego Cagno", 33,33344128,credencialBlack);
        Usuario diegoOtraVez = new Usuario("Diego Cagno", 33,33344128,credencialBlack);

        fragataHotel.registrarUsuario(tomas);
        fragataHotel.registrarUsuario(maria);
        fragataHotel.registrarUsuario(hana);
        fragataHotel.registrarUsuario(nicolas);
        fragataHotel.registrarUsuario(diego);

        fragataHotel.printUsuarios();

        boolean accesoTomas = bar.verificarAcceso(tomas);
        boolean saldoTomas = bar.verificarSaldoSuficiente(tomas);
        System.out.println("Acceso = " + accesoTomas + " y saldo: " +  saldoTomas);

        boolean accesoHana = pelotero.verificarAcceso(hana);
        System.out.println("\nAcceso al pelotero para " + hana.getNombre() + " = " + accesoHana);

        Date fechaActual = new Date();
        fechaActual.getDate();

        boolean acessoComedorTomas = comedor.verificarAcceso(tomas);
        comedor.programarMantenimiento(fechaActual);
        System.out.println("El usuario " + tomas.getNombre() +" tiene Acceso = " + acessoComedorTomas + " al " + comedor.getNombre());

        boolean accesoHanaCasino = casino.verificarAcceso(hana);
        System.out.println("El usuario " + hana.getNombre() +" tiene Acceso = " + accesoHanaCasino + " al " + casino.getNombre());

        boolean accesoNicolas = spa.verificarAcceso(nicolas);
        System.out.println("El usuario " + nicolas.getNombre() +" tiene Acceso = " + accesoNicolas + " al " + spa.getNombre());
        spa.programarMantenimiento(fechaActual);

    }

}