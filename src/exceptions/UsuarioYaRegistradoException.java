package exceptions;

public class UsuarioYaRegistradoException extends Exception{
    public UsuarioYaRegistradoException(String mensaje) {
        super(mensaje);
    }
}
