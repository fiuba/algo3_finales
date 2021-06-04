package edu.fiuba.algo3.algomail;

import java.util.ArrayList;

public class MultiFactorFallido extends AutenticacionMultiple {
    public MultiFactorFallido() {

        super(new ArrayList<>());
    }

    public boolean verificacionSecundaria(CodigoSeguridad codigoLogueo) {

        throw new VerificacionImpropia();
    }
}
