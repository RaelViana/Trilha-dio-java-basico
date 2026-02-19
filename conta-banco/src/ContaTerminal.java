import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);


        int numero;
        String agencia;
        String cliente_nome;
        Double saldo;

        System.out.println();
        System.out.println();
        System.out.println("*************************************************");
        System.out.println("*** Olá, vamos iniciar a criação da sua conta ***");
        System.out.println("*************************************************");
        System.out.println();
        System.out.println("Por favor informe o nome do titular: ");
        cliente_nome = s.nextLine();
        // s.nextLine(); 
        System.out.println();
        System.out.printf("Perfeito '%s' vamos dar continuidade ao processo abaixo: ", cliente_nome);
        System.out.println();
        System.out.println();
        System.out.println("Insira dados da agência: Ex(000-0)");
        agencia = s.next();
        System.out.println();
        System.out.println("Agora informe dados da conta: (somente números)");
        numero = s.nextInt();
        System.out.println();
        System.out.println("Por fim, caso deseje adicionar saldo por favor insira-o: Ex(000,00)");
        saldo = s.nextDouble();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", cliente_nome, agencia, numero, saldo);
        System.out.println();
        System.out.println();
        System.out.println("------------------------------------------------------------------");

    }
}
