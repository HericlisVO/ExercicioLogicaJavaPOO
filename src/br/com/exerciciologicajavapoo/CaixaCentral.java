package br.com.exerciciologicajavapoo;

public class CaixaCentral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// declarando a variavel sobre o valor da compra
			Double valorCompra;
			
			//atribuindo o valor da compra do cliente
			valorCompra = 2800.0;
			
		
		System.out.println("Supermercado Bom Dia!\n");
		
		//instanciando o objeto cliente
		Cliente cliente1 = new Cliente();
		
		// setando os dados do cliente
		cliente1.setId(0);
		cliente1.setNome("Hericlis Ventura");
		cliente1.setIdade(23);
		//setando  o valor do saldo do cartaõ do cliente
		cliente1.setSaldoCartao(900.0);
		
		
		// Buscando e imprimindo os dados
		System.out.println("Cliente: "+ cliente1.getId()+1);
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: "+ cliente1.getIdade());
		System.out.println("Valor da Compra: " + valorCompra);
		
		// utilizando o metodo pagarCompra para verificar o saldo e aprovar o pagamento.
		cliente1.pagarCompra(valorCompra);
		
		System.out.println("O Supermercado Bom Dia Agradece, volte sempre para fazer suas compras!");
	}

}
