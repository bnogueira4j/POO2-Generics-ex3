package Pilha;

import java.util.Random;

public class Prato {

    public void pesoDoPrato(){
        System.out.println("Peso do prato: " + new Random().nextInt(30) + 1);
    }
}
