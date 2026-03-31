
public class Main {
    public static void main(String[] args) {

        CC contaCorrente = new CC(101, "Itaú", "Livia Vitoria", 1000);
        CP contaPoupanca = new CP(202, "Nubank", "Luisa Guimarães", 550);
        PJ contaPessoaJuridica = new PJ(303, "Bradesco", "Emanuel Santiago", 5400);

        contaCorrente.depositar(200);
        contaCorrente.exibirSaldo();

        contaPoupanca.sacar(55);
        contaPoupanca.exibirSaldo();

        contaPessoaJuridica.sacar(2500);
        contaPessoaJuridica.exibirSaldo();
    }
}