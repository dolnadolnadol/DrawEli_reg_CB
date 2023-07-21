import java.util.Scanner;

public class Main {
    private FoodShape food = new FoodShape();
    public String SendDraw(String Shape) {
        switch(Shape) {
            case "Elipse":
                return food.drawAsElipse();
            case "rectangle":
                return food.drawAsRestangle();
        }
        return "";
    }
    public static void main(String[] args){
        Main main = new Main();
        String str = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("What to draw? 1. Elipse, 2. Rectangle ");
        int inp = sc.nextInt();
        switch (inp) {
            case 1: str = main.SendDraw("Elipse"); break;
            case 2: str = main.SendDraw("rectangle"); break;
        }
        System.out.println(str);
        sc.close();
    }
    
}
