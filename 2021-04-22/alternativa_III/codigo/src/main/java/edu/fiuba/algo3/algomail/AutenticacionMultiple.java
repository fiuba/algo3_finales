package edu.fiuba.algo3.algomail;

import java.util.ArrayList;

public class AutenticacionMultiple {
    private ArrayList<Usuario> usuarios;
    private String nombreUsuario;

    public AutenticacionMultiple(ArrayList<Usuario> usuarios) {

        this.usuarios = usuarios;
    }

    public AutenticacionMultiple(String nombreUsuario, ArrayList<Usuario> usuarios) {

        this.nombreUsuario = nombreUsuario;
        this.usuarios = usuarios;
    }

    public AutenticacionMultiple verificacionInicial(String nombreUsuario, Password pwdLogueo) {
        AutenticacionSimple s = new AutenticacionSimple(this.usuarios);

        if (s.verificar(nombreUsuario, pwdLogueo)) {
            return new AutenticacionMultiple(nombreUsuario, this.usuarios);
        }

        return new MultiFactorFallido();
    }

    public boolean verificacionSecundaria(CodigoSeguridad codigoLogueo) {
        AutenticacionSimple s = new AutenticacionSimple(this.usuarios);

        return s.verificar(nombreUsuario, codigoLogueo);
    }
}
