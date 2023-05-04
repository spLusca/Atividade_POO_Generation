package Exercicio_1;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new PessoaFisica("João da Silva", 30, "joao.silva@gmail.com", "(11) 99999-9999", "Rua A, 123", "123.456.789-00");
        Cliente cliente2 = new PessoaFisica("Maria Souza", 25, "maria.souza@hotmail.com", "(21) 88888-8888", "Av. B, 456", "987.654.321-00");
        Cliente cliente3 = new PessoaJuridica("Empresa ABC", 10, "empresaabc@gmail.com", "(11) 77777-7777", "Rua X, 789", "12.345.678/0001-99");
        Cliente cliente4 = new PessoaJuridica("Empresa XYZ", 5, "empresaxyz@hotmail.com", "(21) 66666-6666", "Av. Y, 987", "98.765.432/0001-99");

        System.out.println("Dados do cliente 1:");
        System.out.println("*************************************");
        cliente1.visualizar();
        System.out.println("*************************************");
        System.out.println("\n*************************************");
        System.out.println("Dados do cliente 2:");
        cliente2.visualizar();
        System.out.println("*************************************");
        System.out.println("\n*************************************");
        System.out.println("Dados do cliente 3:");
        cliente3.visualizar();
        System.out.println("*************************************");
        System.out.println("\n*************************************");
        System.out.println("Dados do cliente 4:");
        cliente4.visualizar();
        System.out.println("*************************************");
    }
}
