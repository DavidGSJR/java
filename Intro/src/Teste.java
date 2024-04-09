public class Teste {

    String raca;
    String cor;

   public Teste(String raca, String cor){
       this.raca = raca;
       this.cor = cor;
   }

   public void dogInfo(){
        System.out.println("A raça do cachorro é " + raca);
        System.out.println("A cor do cachorro é " + cor);
    }

}

