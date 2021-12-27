import java.util.Random;
public class Dice {
    int a;


    Dice (){
                roll();
    }

    void printDice(){
        System.out.println("Liczba wyrzuconych oczek to " + a);
    }
    Dice (int a){
        this.a = a;
    }

    void roll(){
        Random next = new Random();
        this.a = next.nextInt(1,7);
    }

    void printInfo (){
        System.out.println("Liczba wyrzuconych oczek to " + a);
    }
}
