package entities;

import exceptions.UsuarioYaRegistradoException;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Instalacion> instalaciones;
    private List<Usuario> usuarios;

    public Hotel() {
        instalaciones = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarInstalacion(Instalacion instalacion) {
        this.instalaciones.add(instalacion);
    }

    public void registrarUsuario(Usuario usuario) throws UsuarioYaRegistradoException {

        // Valido que el usuario no se encuentre registrado en el hotel actualmente.
        if (usuarios.stream().anyMatch(u -> u.getDni() == usuario.getDni())) {
            throw new UsuarioYaRegistradoException("El usuario con DNI: " + usuario.getDni() + " ya está registrado.");
        }
        usuarios.add(usuario);
    }

    public void printUsuarios(){
        System.out.println("\nLos usuarios registrados en el hotel son:");
        usuarios.forEach(usuario ->
                    System.out.println("- " + usuario.getNombre() + " (DNI: " + usuario.getDni() + ") ")
        );
    }

    public void printInstalaciones() {
        System.out.println("\nLas instalaciones del hotel son: ");
        instalaciones.forEach(instalacion -> System.out.println("* " + instalacion.getNombre()));
    }
}
