package edu.fiuba.algo3.algomail;

import java.util.ArrayList;

public class Usuario {
    private final ArrayList<Credencial> credencials;
    private final String nombre;

    public Usuario(String nombre, Credencial credencial) {
        this.nombre = nombre;
        this.credencials = new ArrayList<>();
        this.credencials.add(credencial);
    }

    public Usuario(String nombreUsuario, Password passwordRegistracion, CodigoSeguridad codigo) {
        this.nombre = nombreUsuario;
        this.credencials = new ArrayList<>();
        this.credencials.add(passwordRegistracion);
        this.credencials.add(codigo);

    }

    public boolean verificar(String usuarioNombre, Credencial credencial) {
        return this.nombre.equals(usuarioNombre) && verificarAlgunaCredencial(credencial);
    }

    private boolean verificarAlgunaCredencial(Credencial credencial) {

        for( Credencial c : this.credencials) {
            if (c.equals(credencial)) {
                return true;
            }
        }

        return false;
    }

}
