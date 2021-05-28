package edu.fiuba.algo3.algomail;

import java.util.Arrays;

public class CodigoSeguridad implements Credencial {
    private byte[] bytes;

    public CodigoSeguridad(byte[] bytes) {

        this.bytes = bytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodigoSeguridad that = (CodigoSeguridad) o;
        return Arrays.equals(bytes, that.bytes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }
}
