package ar.uba.fi.algo3.final20200917;

public class Bici implements Carga {

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass());
    }

}
