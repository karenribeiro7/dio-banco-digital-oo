import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco Javeiro");
        banco.setContas(new ArrayList<>());

        System.out.println("Bem vindo ao " + banco.getNome() + "!!!");
        System.out.println("*******************************************");

        Conta cc = new ContaCorrente(new Cliente("Karen Ribeiro", "1243"));

        Conta cp = new ContaPoupanca(new Cliente("Maria Geruza", "2345"));

        Conta cc2 = new ContaCorrente(new Cliente("Miguel Ribeiro", "4356"));

        Conta cp2 = new ContaPoupanca(new Cliente("Maria Julia", "6536"));

        Conta cc3 = new ContaCorrente(new Cliente("Nolan Marina", "4657"));

        Conta cp3 = new ContaPoupanca(new Cliente("Maria Divanete", "4446"));

        banco.getContas().add(cc);
        banco.getContas().add(cc2);
        banco.getContas().add(cp);
        banco.getContas().add(cp2);
        banco.getContas().add(cc3);
        banco.getContas().add(cp3);

        banco.getContas().sort(Conta.NUMERO_COMPARATOR);

        System.out.println("Aqui estão as contas dos nossos clientes:");
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
        }
        System.out.println("*******************************************");
        
        cc.depositar(1000);
        cp.depositar(500);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
      
        cc.transferir(500, cp2);
        cp.transferir(600, cc2);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc2.imprimirExtrato();
        cp2.imprimirExtrato();

        System.out.println("Aqui estão as contas dos nossos clientes:");
        for (Conta conta : banco.getContas()) {
            System.out.println(conta);
        }
        System.out.println("*******************************************");
    }
}
