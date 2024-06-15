public class SistemaMedida {
    public static void main(String[] args) {
        //Define a variavel com o valor que vai ser comparado nas condicionais

        String sigla = "G";

        switch( sigla ){
            case "P": {
                System.out.println("PEQUENA");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
            System.out.println("INDEFINIDO");
            

        }
    }
}
