package Tools;

import java.util.Random;

public class Dice {

    private int number1 = 0,
            number2 = 0,
            number3 = 0,
            number4 = 0,
            number5 = 0,
            number6 = 0;

    void useDice(){

        Random rnd;

        rnd = new Random();

        synchronized (this) {
            switch (rnd.nextInt(6)+1){
                case 1:
                    number1++;
                    break;
                case 2:
                    number2++;
                    break;
                case 3:
                    number3++;
                    break;
                case 4:
                    number4++;
                    break;
                case 5:
                    number5++;
                    break;
                case 6:
                    number6++;
                    break;
            }
        }
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public int getNumber4() {
        return number4;
    }

    public int getNumber5() {
        return number5;
    }

    public int getNumber6() {
        return number6;
    }

}
