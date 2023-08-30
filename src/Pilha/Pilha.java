package Pilha;

import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Object> pilha;
    public Pilha() {
        pilha = new ArrayList<>();
    }

    public void empilhar(Object item) {
        pilha.add(item);
    }

    public Object retirar() {
        if (!pilha.isEmpty()) {
            var objetoDaPilha = pilha.remove(pilha.size() - 1);
            System.out.println("Retirado: " + objetoDaPilha);
            return objetoDaPilha;
        }
        return null;
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

}
