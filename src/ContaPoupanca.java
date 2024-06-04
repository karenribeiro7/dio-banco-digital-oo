public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 0;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL++;
        super.agencia = Conta.agenciaPadrao;
        this.saldo = 0;
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("*** Extrado Conta Poupança ***");
        super.imprimirExtrato();
    }
}
