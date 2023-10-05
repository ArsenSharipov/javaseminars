import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class program {

    public static final int info = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] info = input.split(" ");
        if(info.length != info.length){
            System.err.println("Неверное кол-во введенных полей");
        }
        String Lname = info[0];
        String Fname = info[1];
        String Sname = info[2];

        LocalDate birthDate;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            birthDate = LocalDate.parse(info[3], formatter);
        } catch (DateTimeException e) {
            System.err.println("Неверный формат ввода даты рождения");
            return;
        }

        long phone;
        try{
            phone = Long.parseLong(info[4]);
        } catch(NumberFormatException e) {
            System.err.println("Неверный формат ввода номера");
            return;
        }

        String gender = info[5];
        if((!"m".equals(gender)) && (!"f".equals(gender))){
            System.err.println("Неверный формат ввода пола");
            return;
        }

        String fileName = Lname + ".txt";
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))){
            writer.write(Lname + " " + Fname + " " + Sname + " " + birthDate.format(DateTimeFormatter.ISO_LOCAL_DATE) + " " + phone + " " + gender);
            writer.newLine();
        } catch(IOException e){
            System.out.println("Wrong type of print");
        }
    }
}