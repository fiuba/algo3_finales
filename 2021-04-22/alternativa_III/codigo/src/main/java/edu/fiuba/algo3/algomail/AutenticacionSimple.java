package edu.fiuba.algo3.algomail;

import java.util.ArrayList;

public class AutenticacionSimple {
    private ArrayList<Usuario> usuarios;

    public AutenticacionSimple(ArrayList<Usuario> usuarios) {

        this.usuarios = usuarios;
    }

    public boolean verificar(String usuarioNombre, Credencial credencial) {

        return this.usuarios.stream().anyMatch(u ->
                u.verificar(usuarioNombre, credencial));
    }
}
