import java.util.Scanner;
public class task1 {
    public static void main(String[] ares) {
        float number = getFloatingPointNumber();
        System.out.printf("You printed %f", number);
    }
    public static float getFloatingPointNumber(){
        Scanner scanner = new Scanner (System.in);
        float number = 0f;
        boolean validinput = false;
        while (validinput==false) {
        System.out.print("print a fractional number: ");
        if(scanner.hasNextFloat()) {
        number = scanner.nextFloat();
        validinput = true;
        } else {
        scanner.next();
            }
        }
        return number;
    }
}
