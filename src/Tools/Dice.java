package Tools;

public class Dice {


    private int number[] = {0,0,0,0,0,0};

    void useDice(int random){

        synchronized (this) {
            number[random-1]++;
        }
    }

    public int getNumber(int num) {
        return number[num-1];
    }


}
