package edu.fiuba.algo3.algomail;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlgoMailTest
{
    @Test
    public void unUsuarioSeLogueaConUsuarioPasswordSatisfactoriamente()
    {
        String nombreUsuario = "joaquin";

        Usuario joaquin = new Usuario(nombreUsuario, new Password("palabra-clave"));

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        Password passwordLogueo = new Password("palabra-clave");
        assertTrue(servicio.loguearse(nombreUsuario, passwordLogueo));
    }

    @Test
    public void unUsuarioSeLogueaConUsuarioPasswordConError()
    {
        String nombreUsuario = "joaquin";
        Password passwordRegistracion = new Password("palabra-clave");

        Usuario joaquin = new Usuario(nombreUsuario, passwordRegistracion);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        Password passwordLogueo = new Password("palabra-");
        assertFalse(servicio.loguearse(nombreUsuario, passwordLogueo));

    }

    @Test
    public void unUsuarioSeLogueaConUsuarioQRSatisfactoriamente()
    {
        String nombreUsuario = "joaquin";
        QR qrReferencia = new QR(new int[] {1, 3, 5});

        Usuario joaquin = new Usuario(nombreUsuario, qrReferencia);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        QR qrLogueo = new QR(new int[] {1, 3, 5});
        assertTrue(servicio.loguearse(nombreUsuario, qrLogueo));
    }


    @Test
    public void unUsuarioSeLogueaConUsuarioQRConError()
    {
        String nombreUsuario = "joaquin";
        QR qrReferencia = new QR(new int[] {1, 3});

        Usuario joaquin = new Usuario(nombreUsuario, qrReferencia);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        QR qrLogueo = new QR(new int[] {1, 3, 5});
        assertFalse(servicio.loguearse(nombreUsuario, qrLogueo));
    }

    @Test
    public void unUsuarioSeLogueaConPasswordSatisfactoriamenteYLuegoIngresaCodigoDeSeguridadSatisfactoriamente()
    {
        String nombreUsuario = "joaquin";
        Password passwordRegistracion = new Password("palabra-clave");
        CodigoSeguridad codigo = new CodigoSeguridad(new byte[] {1, 3});

        Usuario joaquin = new Usuario(nombreUsuario, passwordRegistracion, codigo);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        Password pwdLogueo = new Password("palabra-clave");
        AutenticacionMultiple mf = servicio.verificacionInicial(nombreUsuario, pwdLogueo);

        CodigoSeguridad codigoLogueo = new CodigoSeguridad(new byte[] {1, 3});
        assertTrue(mf.verificacionSecundaria(codigoLogueo));
    }

    @Test
    public void unUsuarioSeLogueaConPasswordSatisfactoriamenteYLuegoIngresaCodigoDeSeguridadErroño()
    {
        String nombreUsuario = "joaquin";
        Password passwordRegistracion = new Password("palabra-clave");
        CodigoSeguridad codigo = new CodigoSeguridad(new byte[] {1, 3});

        Usuario joaquin = new Usuario(nombreUsuario, passwordRegistracion, codigo);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        Password pwdLogueo = new Password("palabra-clave");
        AutenticacionMultiple mf = servicio.verificacionInicial(nombreUsuario, pwdLogueo);

        CodigoSeguridad codigoLogueo = new CodigoSeguridad(new byte[] {1});
        assertFalse(mf.verificacionSecundaria(codigoLogueo));
    }

    @Test
    public void unUsuarioSeLogueaConPasswordErroñoYLuegoIngresaCodigoDeSeguridadSatisfactoriamente()
    {
        String nombreUsuario = "joaquin";
        Password passwordRegistracion = new Password("palabra-clave");
        CodigoSeguridad codigo = new CodigoSeguridad(new byte[] {1, 3});

        Usuario joaquin = new Usuario(nombreUsuario, passwordRegistracion, codigo);

        AlgoMail servicio = new AlgoMail();

        servicio.registrar(joaquin);

        Password pwdLogueo = new Password("palabra-clave");
        AutenticacionMultiple mf = servicio.verificacionInicial(nombreUsuario, new Password(""));

        CodigoSeguridad codigoLogueo = new CodigoSeguridad(new byte[] {1, 3});
        assertFalse(mf.verificacionSecundaria(codigoLogueo));
    }

}
