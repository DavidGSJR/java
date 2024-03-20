public class Main {
    public static void main (String[] args){
        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "David";
        pessoa1.idade = 24;
        pessoa1.sexo = "Masculino";

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.idade + " anos");
        System.out.println(pessoa1.sexo);

        pessoa1.fazAniversario();
        System.out.println(pessoa1.idade + " anos");
    }
}

