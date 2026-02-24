//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Vaca vaca = new Vaca();

    vaca.nome = "Odete";
    vaca.filhos = 1 ;

    Vaca angus = new Vaca("Mimosa", "Qualhada", 7);

    vaca.mugir();

    Conta contaMu = new Conta();

    contaMu.depositar(600);

    IO.println(contaMu);

    contaMu.saldo = 900;

    contaMu.sacar(700);

    contaMu.sacar(200);

   Carro carro = new Carro("HB20", 190);
   System.out.println(carro.toString());
   carro.acelerar();
}



