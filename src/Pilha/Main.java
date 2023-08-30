package Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilhaDeCaixa = new Pilha();
        pilhaDeCaixa.empilhar(new Caixa());
        pilhaDeCaixa.empilhar(new Caixa());
        pilhaDeCaixa.empilhar(new Caixa());

        var caixaRetirada1 = (Caixa) pilhaDeCaixa.retirar();
        caixaRetirada1.tamanhoDaCaixa();
        var caixaRetirada2 = (Caixa) pilhaDeCaixa.retirar();
        caixaRetirada2.tamanhoDaCaixa();
        var caixaRetirada3 = (Caixa) pilhaDeCaixa.retirar();
        caixaRetirada3.tamanhoDaCaixa();

        Pilha pilhaDePrato = new Pilha();
        pilhaDePrato.empilhar(new Prato());
        pilhaDePrato.empilhar(new Prato());
        pilhaDePrato.empilhar(new Prato());

        var pratoRetirada1 = (Prato) pilhaDePrato.retirar();
        pratoRetirada1.pesoDoPrato();
        var pratoRetirada2 = (Prato) pilhaDePrato.retirar();
        pratoRetirada2.pesoDoPrato();
        var pratoRetirada3 = (Prato) pilhaDePrato.retirar();
        pratoRetirada3.pesoDoPrato();
    }
}
