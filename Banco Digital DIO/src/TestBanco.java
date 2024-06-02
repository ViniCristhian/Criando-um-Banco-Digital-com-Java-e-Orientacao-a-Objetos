public class TestBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius");

        Conta viniContaCorr = new ContaCorrente(cliente);
        Conta viniContaPoup = new ContaPoupanca(cliente);

        viniContaCorr.depositar(1000);

        viniContaCorr.transferir(100, viniContaPoup);

        viniContaCorr.imprimirExtrato();
        viniContaPoup.imprimirExtrato();
    }
}
