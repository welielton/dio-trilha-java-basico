public class ExemploForBreak {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            //Se o número for igual a 3, o laço de repetição é interrompido
            if(numero == 3)
            break;

          System.out.println(numero);
          
          /* Resultado esperado
          * 1
          * 2
          **/  

        }
    }
}
