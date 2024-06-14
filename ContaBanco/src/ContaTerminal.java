public class ContaTerminal {
    public static void main(String[] args) {
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        /*
         * Numero	Inteiro	1021
         * Agencia	Texto	067-8
         * Nome Cliente	Texto	MARIO ANDRADE
         * Saldo	Decimal	237.48
         * 
         */
        
         int numero = Integer.valueOf(args[0]);
         String agencia = args[1];
         String nome = args[2];
         double saldo = Double.valueOf(args[3]);

         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: "
          + agencia + " conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");






    }
}
