public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >= 7) {
            System.out.println("Aprovado");
        }
        //Estrutura condicional encadeada, pois teve mais de 2 condições
        else if (nota >= 5 && nota < 7) {
            System.out.println("Prova de Recuperação");
        }
        else
            System.out.println("Reprovado");
    }
}
