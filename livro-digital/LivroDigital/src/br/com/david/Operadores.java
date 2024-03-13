package br.com.david;

public class Operadores {

	public static void main(String[] args) {
		
		int anoDePublicacao = 2019;
		double avaliacao = 4.5;
		boolean planoPlus = false;
		String clienteVip = "Regular";
		
		if(anoDePublicacao > 2015) {
			System.out.println("O livro é atual!");
		} else {
			System.out.println("Um livro nostalgico!");
		}
		
		if(avaliacao == 5) {
			System.out.println("Excelente livro!");
		} else if(avaliacao < 5 && avaliacao > 4) {
			System.out.println("Um bom livro!");
		} else if(avaliacao < 4) {
			System.out.println("Um bom livro!");
		}
		
		if(planoPlus) {
			System.out.println("Pode levar o livro");
		} else {
			System.out.println("Você deve alugar o livro");
		}
		
		if(clienteVip.equals("Vip") || planoPlus) {
			System.out.println("Cliente Vip!");
		} else {
			System.out.println("Faça uma assinatura para se tornar Vip!");
		}

	}

}
