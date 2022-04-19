package flyweight;

import flyweight.Autoturism;
import flyweight.Camion;
import flyweight.Masina;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    public Map<TipMasina, Masina> map = new HashMap<>();

    public Masina getMasina(TipMasina tipMasina){

        Masina masina = null;

        if(map.containsKey(tipMasina)) {
            return map.get(tipMasina);
        } else if(tipMasina.equals(TipMasina.AUTOTURISM_GALBEN)){
            masina = new Autoturism(4,"Sedan","VW","Auriu","Suport");
            map.put(TipMasina.AUTOTURISM_GALBEN, masina);
        } else if(tipMasina.equals(TipMasina.CAMION_GALBEN)){
            masina = new Camion(4,"flyweight.Camion","BMW","Auriu","Remorca");
            map.put(TipMasina.CAMION_GALBEN, masina);
        } else if(tipMasina.equals(TipMasina.AUTOTURISM_ROSU)){
            masina = new Autoturism(4,"Clasic","Range Rover","Rosu","Suport");
            map.put(TipMasina.AUTOTURISM_ROSU,masina);
        } else if(tipMasina.equals(TipMasina.CAMION_ROSU)){
            masina = new Camion(4,"Clasic","BMW","Rosu","Remorca");
            map.put(TipMasina.CAMION_ROSU,masina);
        }

        return masina;
    }
}
