   import java.util.Locale;
   import java.util.Scanner;
public class ContaTerminal {

    
    public static void main(String[] args) {
        System.out.println("Criar conta no banco DIO");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Agora, você deve informar o seu nome:");
        String nome = scanner.next();

        System.out.println("E para finalizar, deseje o saldo que será depositado: ");
        double saldo = scanner.nextDouble();        

         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: "
          + agencia + " conta: " + numero + " e seu saldo " + saldo + " já está disponível para saque.");






    }
}
