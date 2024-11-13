package entities;

import exceptions.UsuarioYaRegistradoException;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Instalacion> instalaciones;
    private List<Usuario> usuarios = new ArrayList<>();

    public Hotel() {
        instalaciones = new ArrayList<>();
    }

    public void agregarInstalacion(Instalacion instalacion) {
        this.instalaciones.add(instalacion);
    }

    public void registrarUsuario(Usuario usuario) throws UsuarioYaRegistradoException {

        // Valido que el usuario no se encuentre registrado en el hotel actualmente.
        if (usuarios.stream().anyMatch(u -> u.getDni() == usuario.getDni())) {
            throw new UsuarioYaRegistradoException("El usuario ya está registrado.");
        }
        usuarios.add(usuario);
    }
}
