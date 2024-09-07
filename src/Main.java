public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        venilton.setTelefone("+5511970707070");
        venilton.setEmail("70@gmail.com");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        // Operações
        cc.depositar(100);
        cc.transferir(50, poupanca);
        poupanca.depositar(30);

        // Relatórios
        cc.imprimirExtratoDetalhado();
        poupanca.imprimirExtratoDetalhado();

        Banco banco = new Banco("Banco Exemplo");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        banco.imprimirRelatorioContas();
    }
}
