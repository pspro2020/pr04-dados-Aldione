package Tools;

import java.util.Random;

public class DiceTask implements Runnable {


    private Dice dice;

    public DiceTask(Dice dice){

        this.dice = dice;

    }

    @Override
    public void run(){
        Random rnd;

        rnd = new Random();

        for (int i=0; i < 10000; i++){
            dice.useDice(rnd.nextInt(6)+1);
        }

    }
}
