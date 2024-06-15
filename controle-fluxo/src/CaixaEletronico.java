public class CaixaEletronico {
    public static void main(String[] args) {
        //declarando as variaveis
        //Condicional Simples
        double saldo = 25.0;
        double valorSolicitado = 18;

        if(valorSolicitado < saldo)

        //Se a condição for verdadeira, essa ação será realizada
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);
    }
}
