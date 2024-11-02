import entities.CredencialEjecutiva;
import entities.CredencialPremium;
import entities.Hotel;
import entities.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        mostrarAccesos();
    }

    public static void mostrarAccesos(){
        Usuario usuario1 = new Usuario("Ana", 27889345, new CredencialEjecutiva());
        Usuario usuario2 = new Usuario("Luis", 29669784,  new CredencialPremium());

        Hotel hotel = new Hotel();

        hotel.mostrarAccesos(usuario1);
        hotel.mostrarAccesos(usuario2);
    }
}