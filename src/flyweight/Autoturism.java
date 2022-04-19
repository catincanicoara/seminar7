package flyweight;

public class Autoturism extends Masina {
    public String suportBicicleta;

    public Autoturism(int roti, String exterior, String sigla, String culoare, String suportBicicleta) {
        super(roti, exterior, sigla, culoare);
        this.suportBicicleta = suportBicicleta;
    }

    @Override
    public void afiseaza() {
        System.out.println(this.getRoti()+this.getExterior()+this.getSigla()+this.getCuloare()+this.suportBicicleta);
    }
}
