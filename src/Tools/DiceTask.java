package Tools;

public class DiceTask implements Runnable {


    private Dice dice;

    public DiceTask(Dice dice){

        this.dice = dice;

    }

    @Override
    public void run(){

        for (int i=0; i < 10000; i++){
            dice.useDice();
        }

    }
}
