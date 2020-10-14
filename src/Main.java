import Tools.Dice;
import Tools.DiceTask;

public class Main {

    public static void main(String[] args) {

        Thread t1, t2, t3;
        Dice dice;

        dice = new Dice();
        t1 = new Thread(new DiceTask(dice));
        t2 = new Thread(new DiceTask(dice));
        t3 = new Thread(new DiceTask(dice));

        startThreads(t1, t2, t3);
        startJoins(t1, t2, t3);

        showPrint(t1, t2, t3, dice);
    }

    private static void showPrint(Thread t1, Thread t2, Thread t3, Dice dice) {

        System.out.printf("Number 1: %s times\n" +
                "Number 2: %s times\n" +
                "Number 3: %s times\n" +
                "Number 4: %s times\n" +
                "Number 5: %s times\n" +
                "Number 6: %s times\n" +
                "Total times: %1$s + %2$s + %3$s + %4$s + %5$s + %6$s = %s\n", dice.getNumber1(), dice.getNumber2(), dice.getNumber3(), dice.getNumber4(), dice.getNumber5(), dice.getNumber6(), sumDiceThreads(dice));

    }

    private static void startThreads(Thread t1, Thread t2, Thread t3) {

        t1.start();
        t2.start();
        t3.start();

    }

    private static void startJoins(Thread t1, Thread t2, Thread t3) {

        try{
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            System.out.println("Error!!");
        }

    }

    private static int sumDiceThreads(Dice dice) {

        int total = dice.getNumber1() + dice.getNumber2() + dice.getNumber3() + dice.getNumber4() + dice.getNumber5() + dice.getNumber6();
        return total;

    }

}
