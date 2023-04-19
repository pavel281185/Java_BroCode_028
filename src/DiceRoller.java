import java.util.Random;

public class DiceRoller {
//    Local
//    DiceRoller(){
//        Random random = new Random();
//        int number = 0;
//        roll(random, number);
//
//    }
//    void roll(Random random, int number){
//        number = random.nextInt();
//        System.out.println(number);
//    }

    //Global
    Random random = new Random();
    int number;

    DiceRoller() {
        roll();
    }

    void roll() {
        number = random.nextInt();
        System.out.println(number);
    }
}
