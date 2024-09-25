package Herança;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jack", "(11) 9999-9999");
		System.out.println("Pessoa:");
		System.out.println("Nome: " + pessoa.getTelefone());
		System.out.println("Telefone: " + pessoa.getTelefone());
		
		PessoaFisica pessoaFisica = new PessoaFisica("Jack", "(11) 9999_999", "123.456.789-00", "300.456.989-x");
		System.out.println("\nPessoa física:");
		System.out.println("Nome: " + pessoaFisica.getNome());
		System.out.println("Telefone: " + pessoaFisica.getTelefone());
		System.out.println("CPF: " + pessoaFisica.getCpf());
		System.out.println("RG: " + pessoaFisica.getRg());
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa kum", "(11) 9999-9999", "12.345-678/9001-23");
		System.out.println("\nPessoa juridica:");
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getNome());
		System.out.println("CNPJ: " + pessoaJuridica.getNome());
	}
}
