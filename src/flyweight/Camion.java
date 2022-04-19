package flyweight;

public class Camion extends Masina {

    public String remorca;

    public Camion(int roti, String exterior, String sigla, String culoare, String remorca) {
        super(roti, exterior, sigla, culoare);
        this.remorca = remorca;
    }


    @Override
    public void afiseaza() {
        System.out.println(this.getRoti()+this.getExterior()+this.getSigla()+this.getCuloare()+this.remorca);
    }
}
