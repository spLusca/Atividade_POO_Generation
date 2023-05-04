package Exercicio_1;

public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, int idade, String email, String telefone, String endereco, String cpf) {
        super(nome, idade, email, telefone, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + cpf);
    }
}
