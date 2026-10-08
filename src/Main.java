public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario(
                "João",
                "123.456.789-00",
                2000
        );

        funcionario1.exibirDados();

        System.out.println();

        System.out.println("Aplicando aumento de 10%...");

        funcionario1.aumentoSalarial(10);

        System.out.println();

        funcionario1.exibirDados();
    }
}