import java.util.Comparator;

public abstract class Conta {
    protected Cliente cliente;
    protected int numero;
    protected int agencia;
    protected double saldo;

    protected static int agenciaPadrao = 1;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void transferir(double valor, Conta conta2) {
        if(podeSacar(valor)) {
            this.sacar(valor);
            conta2.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para realizar esta transferência!");
        }       
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean podeSacar(double valor) {
        return valor > 0 && saldo >= valor;
    }

    public void sacar(double valor) {
        if(podeSacar(valor)) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }        
    }

    protected void imprimirExtrato() {
        System.out.println("Agência: " + this.getAgencia() + ", Número: " + this.getNumero() + ", Titular: " + this.cliente.getNome() + ", Saldo: R$ " + this.getSaldo());
    }

    @Override
    public String toString() {
        return "Conta [numero: " + numero + ", saldo: " + saldo + ", cliente: " + cliente + "]";

    }

    public static final Comparator<Conta> NUMERO_COMPARATOR = 
        (Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero());
}

    

