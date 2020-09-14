package ar.uba.fi.algo3.final20200910;

import ar.uba.fi.algo3.final20200910.componentes.CercoElectrico;
import ar.uba.fi.algo3.final20200910.componentes.Estufa;
import ar.uba.fi.algo3.final20200910.componentes.LosaRadiante;
import ar.uba.fi.algo3.final20200910.componentes.Salamandra;
import ar.uba.fi.algo3.final20200910.maderas.Pino;
import ar.uba.fi.algo3.final20200910.maderas.Quebracho;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CasaTest {

    @Test
    public void test01CasaConEstufaLosaRadianteYCercoElectrico() {
        Casa casa = new Casa();

        Estufa estufaDelBanio = new Estufa(1,1000);

        casa.agregarComponente(estufaDelBanio);

        LosaRadiante losaComedor = new LosaRadiante(10);
        casa.agregarComponente(losaComedor);

        CercoElectrico cercoFondo = new CercoElectrico(10);
        casa.agregarComponente(cercoFondo);

        assertEquals(11100, casa.getGastoTotal());
    }

    @Test
    public void test02CasaConEstufaLosaRadianteCercoElectricoYSalamandra() {
        Casa casa = new Casa();

        Estufa estufaDelBanio = new Estufa(1,1000);

        casa.agregarComponente(estufaDelBanio);

        LosaRadiante losaComedor = new LosaRadiante(10);
        casa.agregarComponente(losaComedor);

        CercoElectrico cercoFondo = new CercoElectrico(10);
        casa.agregarComponente(cercoFondo);

        Salamandra salamandra = new Salamandra(5);

        Quebracho quebracho2kg = new Quebracho(2);
        salamandra.agregarMadera(quebracho2kg);

        Pino pino3kg = new Pino(3);
        salamandra.agregarMadera(pino3kg);

        casa.agregarComponente(salamandra);

        assertEquals(11190, casa.getGastoTotal());
    }

    @Test
    public void test03CasaSinComponentesNoGastaNada() {
        Casa casa = new Casa();

        assertEquals(0, casa.getGastoTotal());
    }
}
