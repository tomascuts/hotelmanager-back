import entities.Hotel;
import entities.Usuario;
import entities.Credencial;

public class Main {
    public static void main(String[] args) {
        mostrarAccesos();
    }

    public static void mostrarAccesos(){
        Usuario ana = new Usuario("Ana", 19, 27889345, new Credencial(1));
        Usuario luis = new Usuario("Luis",15, 29669784,  new Credencial(2));

        Hotel hotel = new Hotel();

        hotel.mostrarAccesos(ana);
        hotel.mostrarAccesos(luis);
    }
}