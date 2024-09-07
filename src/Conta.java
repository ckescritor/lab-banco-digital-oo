import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> transacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.transacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        transacoes.add(new Transacao("Saque", valor));
        enviarNotificacao("Saque de R$ " + valor + " realizado.");
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor));
        enviarNotificacao("Depósito de R$ " + valor + " realizado.");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        transacoes.add(new Transacao("Transferência", valor));
        enviarNotificacao("Transferência de R$ " + valor + " realizada.");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public void imprimirExtratoDetalhado() {
        imprimirExtrato();
        System.out.println("Histórico de Transações:");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }
    }

    private void enviarNotificacao(String mensagem) {
        // Simulação de envio de notificação (SMS e E-mail)
        System.out.println("Enviando notificação: " + mensagem);
        // Aqui você pode integrar com serviços de SMS e e-mail reais
    }
}
