import java.util.Scanner;

public class task4 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print a string: ");
        String string = scanner.nextLine();
        if(string == ""){
            throw new Exception("Empty string");
        } else {System.out.println(string);}
    }
}
