public class ExemploForContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            //Se o número for igual a 3 ele não vai aparecer na saída, porém, o laço de repetição continua
            if(numero == 3)
            continue;

          System.out.println(numero);
          
          /* Resultado esperado
          * 1
          * 2
          * 4
          * 5
          **/  

        }
    }
}
