package edu.fiuba.algo3.algomail;

import java.util.ArrayList;

public class AlgoMail {

    private final ArrayList<Usuario> usuarios;

    public AlgoMail() {

        this.usuarios = new ArrayList<>();
    }

    public void registrar(Usuario u) {

        this.usuarios.add(u);
    }

    /****
     * Problemas:
     *  - Usuario expone todo su estado
     *
     * Consecuencias:
     *  - Violamos encapsulamiento
     *  - Violamos ocultamiento de la información.
     *  - Acoplamiento entre algomail y usuario.
     *  - Violamos tell don't ask
     */
    //    public boolean loguearse_01(String usuarioNombre, String password) {
    //
    //        for( Usuario i : this.usuarios ) {
    //            if (i.getNombe().equals(usuarioNombre) && i.getPassword().equals(password)) {
    //                return true;
    //            }
    //        }
    //
    //        return false;
    //    }


    //    public boolean loguearse_02(String usuarioNombre, String password) {
    //
    //        for (Usuario i : this.usuarios) {
    //            if (i.getNombe().equals(usuarioNombre) && i.getPassword().equals(password)) {
    //                return true;
    //            }
    //        }
    //
    //        return false;
    //    }

    //    public boolean loguearse_03(String usuarioNombre, String password) {
    //
    //        for (Usuario i : this.usuarios) {
    //            if (i.misCredencialesSonCorrectas(usuarioNombre, password)) {
    //                return true;
    //            }
    //        }
    //
    //        return false;
    //    }

    public boolean loguearse(String usuarioNombre, Credencial credencial) {

        AutenticacionSimple s = new AutenticacionSimple(this.usuarios);

        return s.verificar(usuarioNombre, credencial);
    }

    public AutenticacionMultiple verificacionInicial(String nombreUsuario, Password pwdLogueo) {
        AutenticacionMultiple mf = new AutenticacionMultiple(this.usuarios);

        return mf.verificacionInicial(nombreUsuario, pwdLogueo);
    }
}
