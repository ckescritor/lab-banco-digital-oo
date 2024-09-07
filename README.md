# Sistema Bancário em Java

## Descrição

Este projeto simula um sistema bancário orientado a objetos em Java. O sistema inclui funcionalidades básicas de um banco, como contas correntes e poupança, além de validação de operações, gerenciamento de contas, relatórios e resumos. Adicionalmente, o sistema suporta o envio de notificações via SMS e e-mail para cada movimentação de conta.

## Funcionalidades

- **Contas Bancárias**: Suporte para contas correntes e contas poupança.
- **Operações**: Depósito, saque, transferência entre contas.
- **Notificações**: Envio de notificações via SMS e e-mail para cada transação realizada.
- **Relatórios**: Geração de relatórios com extratos de todas as contas.
- **Validações**: Validações de operações e gerenciamento de contas.

## Estrutura do Projeto

- **`Cliente.java`**: Representa um cliente do banco.
- **`Conta.java`**: Classe abstrata que define as operações básicas de uma conta.
- **`ContaCorrente.java`**: Implementação específica da conta corrente.
- **`ContaPoupanca.java`**: Implementação específica da conta poupança.
- **`Banco.java`**: Gerencia a lista de contas e fornece funcionalidades adicionais para o banco.
- **`Transacao.java`**: Representa uma transação financeira realizada em uma conta.
- **`IConta.java`**: Interface que define os métodos que uma conta deve implementar.
- **`Main.java`**: Classe principal para execução do programa.


## Uso

1. **Criação de Cliente e Contas**

    No código `Main.java`, um cliente é criado e duas contas são instanciadas: uma conta corrente e uma conta poupança.

2. **Operações**

    São realizadas operações de depósito e transferência entre as contas. As transações são notificadas via SMS e e-mail.

3. **Geração de Relatório**

    Após as operações, um relatório com os extratos de todas as contas é gerado.

## Detalhes da Implementação

- **Cliente**: Representa um cliente com um nome.
- **Conta**: Classe abstrata que define operações básicas como depósito, saque e transferência. Inclui funcionalidades de envio de notificações e impressão de extratos.
- **ContaCorrente** e **ContaPoupanca**: Implementações específicas da conta corrente e poupança, respectivamente.
- **Banco**: Gerencia as contas e gera relatórios.
- **Transacao**: Representa uma transação com tipo e valor.
- **Notificações**: Simulação de envio de notificações para cada transação.





