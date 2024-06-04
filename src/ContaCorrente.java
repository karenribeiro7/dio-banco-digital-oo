public class ContaCorrente extends Conta {
    private static int SEQUENCIAL = 0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.numero = SEQUENCIAL++;
        super.agencia = Conta.agenciaPadrao;
        this.saldo = 0;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrado Conta Corrente ***");
        super.imprimirExtrato();
    }

}
