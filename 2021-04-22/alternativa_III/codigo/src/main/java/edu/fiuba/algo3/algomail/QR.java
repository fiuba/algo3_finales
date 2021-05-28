package edu.fiuba.algo3.algomail;

import java.util.Arrays;

public class QR implements Credencial {
    private int[] bytes;

    public QR(int[] bytes) {

        this.bytes = bytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QR qr = (QR) o;
        return Arrays.equals(bytes, qr.bytes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(bytes);
    }
}
