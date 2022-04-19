package decorator;

public abstract class MasinaDecoerator implements Masina{
    protected Masina decoredMasina;

    public MasinaDecoerator(Masina decoredMasina) {
        this.decoredMasina = decoredMasina;
    }

    @Override
    public void pornesteMototrul() {
        decoredMasina.pornesteMototrul();
    }
}
