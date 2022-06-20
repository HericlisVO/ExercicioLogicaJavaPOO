package br.com.exerciciologicajavapoo;

public class Cliente {
	
	private int id;
	private String nome;
	private int idade;
	private Double saldoCartao;
	
	
	
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(int id, String nome, int idade, Double saldoCartao) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.saldoCartao = saldoCartao;
	}
	
	
	void pagarCompra(Double contas) {
		
		if(saldoCartao >= contas) {
			saldoCartao-= contas;
			System.out.println("compra realizada com sucesso!");
			System.out.println("Seu Saldo é de: "+ getSaldoCartao());
		}else {
			System.out.println("Seu saldo é : " + saldoCartao+ " \nMelhor Cancelar algo!");
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getSaldoCartao() {
		return saldoCartao;
	}
	public void setSaldoCartao(Double saldoCartao) {
		this.saldoCartao = saldoCartao;
	}
	
	
	
	
	
	
	

}
