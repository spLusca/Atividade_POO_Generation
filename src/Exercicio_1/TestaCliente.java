package Exercicio_1;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João da Silva", 30, "joao.silva@gmail.com", "(11) 99999-9999", "Rua A, 123");
        Cliente cliente2 = new Cliente("Maria Souza", 25, "maria.souza@hotmail.com", "(21) 88888-8888", "Av. B, 456");

        System.out.println("Dados do cliente 1:");
        System.out.println("*************************************");
        cliente1.visualizar();
        System.out.println("*************************************");
        System.out.println("\n*************************************");
        System.out.println("Dados do cliente 2:");
        cliente2.visualizar();
        System.out.println("*************************************");
    }
}