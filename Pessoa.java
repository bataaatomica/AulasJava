public class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Fernanda";
        pessoa1.idade = 27;
        pessoa1.apresentar();
    }
}
