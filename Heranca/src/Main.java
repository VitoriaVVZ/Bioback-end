//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bolo b = new Bolo("Bolo de Chocolate", 1.5, "marrom");
        b.Cobertura();
        b.Massa();

        System.out.println("----");

        Torta t = new Torta("Torta de Limão", 0.8, "amarela");
        t.Cobertura();
        t.Massa();
    }
}