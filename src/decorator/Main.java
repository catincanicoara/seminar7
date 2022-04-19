package decorator;

public class Main {
    public static void main(String[] args) {
        Masina m = new MasinaPersonala();
        m.pornesteMototrul();

        Masina masina = new MasinaInteligentaDecorator(new MasinaPersonala());
        masina.pornesteMototrul();
    }
}
