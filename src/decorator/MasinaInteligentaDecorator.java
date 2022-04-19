package decorator;

public class MasinaInteligentaDecorator extends MasinaDecoerator{
    public MasinaInteligentaDecorator(Masina decoredMasina) {
        super(decoredMasina);
    }

    public void pornesteMotorul(){
        decoredMasina.pornesteMototrul();
        incalzireScaune();
    }

    private void incalzireScaune() {
        System.out.println("Scaunele sunt incalzite!");
    }


}
