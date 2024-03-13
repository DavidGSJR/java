package br.com.david;

public class Main {

	public static void main(String[] args) {
		
		String welcome = """
				--------------------------------------
				Seja Bem Vindo a Biblioteca Digital,
					um lugar de muito saber!
				--------------------------------------
				""";
		
		System.out.println(welcome);
		
		String nomeLivro = "Boa Noite Punpun vol. 01";
		int anoDePublicacao = 2019;
		double avaliacao = 4.5;
		boolean planoPlus = true;
		double mediaAvaliacao = 0;
		String sinopse = "Punpun Onodera é um garoto normal, que vive feliz com sua família. Um dia, Aiko Tanaka é transferida para a sua escola. Foi paixão à primeira vista!! \n"
				+ "Voltando juntos para casa, ela conta que no futuro, \"a Terra vai se tornar um planeta inabitável\". É nessa hora que Punpun decide ser um cientista espacial. \nPorém, bem quando encontra seu objetivo na vida, a sua realidade começa a desmoronar. Considerado por muitos como a obra-prima do aclamado Inio Asano, \n"
				+ "Boa Noite Punpun é um slice of life que trata de temas delicados como solidão, relações familiares conturbadas e depressão.";
		
		mediaAvaliacao = (4.5 + 4.8 + 3.8) / 3;
		
		System.out.println("Nome: " + nomeLivro);
		System.out.println("Ano de Publicação: " + anoDePublicacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Plano Plus: " + planoPlus);
		System.out.println("Média das Avaliações: " + mediaAvaliacao);
		System.out.println("Sinopse: " + sinopse);
		

	}

}
