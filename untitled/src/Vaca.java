public class Vaca {

    public String nome;
    private String leite;
    protected int filhos;

    public Vaca(){
    }

    public Vaca(String nome, String leite, int filhos) {
        this.nome = nome;
        this.leite = leite;
        this.filhos = filhos;
    }

    public void mugir(){
        System.out.println("Muuuuuuuuuuh");
    }

    public int bezerros(int filho){
        filhos = filhos + filho;
        return filhos;
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "nome='" + nome + '\'' +
                ", leite='" + leite + '\'' +
                ", filhos=" + filhos +
                '}';
    }
}
