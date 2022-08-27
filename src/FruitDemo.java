import java.util.Scanner;

public class FruitDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x = 7;
        int y = 10;
        x = y;
        y = y+1;

        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Green";
        apple.numberOfPieces = 4;

        Fruit mango = new Fruit();
        mango.name = "Mango";
        mango.color = "Yellow";
        mango.numberOfPieces = 5;

        mango = apple;
        mango.name = "Mango";
        System.out.println(apple.name);
        mango = null;

        Fruit watermelon = new Fruit();
        watermelon.name = "Watermelon";
        watermelon.color = "Green";
        watermelon.numberOfPieces = 8;


    }
}
