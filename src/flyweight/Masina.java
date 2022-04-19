package flyweight;

public abstract class Masina {
    private int roti;
    private String exterior;
    private String sigla;
    private String culoare;

    public Masina(int roti, String exterior, String sigla, String culoare) {
        this.roti = roti;
        this.exterior = exterior;
        this.sigla = sigla;
        this.culoare = culoare;
    }

    public int getRoti() {
        return roti;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public String getExterior() {
        return exterior;
    }

    public void setExterior(String exterior) {
        this.exterior = exterior;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public abstract void afiseaza();
}
