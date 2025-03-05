public class Funcionario {
    String nome;
    double salario;

    void aumentarSalario() {
        salario += salario * ((double) 15 / 100);
    }

    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Daniele";
        func.salario = 3500.0;

        System.out.println("Salário antes do aumento: R$ " + func.salario);
        func.aumentarSalario();
        System.out.println("Salário após aumento de 15%: R$ " + func.salario);
    }
}

