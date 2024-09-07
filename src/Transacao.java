import java.util.Date;

public class Transacao {

    private Date data; // Data em que a transação foi realizada
    private String tipo; // Tipo de transação (ex: Saque, Depósito, Transferência)
    private double valor; // Valor envolvido na transação

    // Construtor da classe Transacao
    public Transacao(String tipo, double valor) {
        this.data = new Date(); // Inicializa a data com o momento atual
        this.tipo = tipo;
        this.valor = valor;
    }

    // Método para representar a transação como uma String
    @Override
    public String toString() {
        return String.format("%s: %s - R$ %.2f", data.toString(), tipo, valor);
    }
}
