package esercisesPresentation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ActualDateTime {
    Scanner scan = new Scanner(System.in);
       System.out.("PODAJ PESEL");
    String pesel = scan.nextLine();


    public static boolean isIdCorrect(String pesel){
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(pesel).matches();
    }

    public static boolean isEmail(String email){
        Pattern emailPattern = Pattern.compile("[0-9a-z_\\.\\-]+@[0-9a-z_\\.\\-]+");
        return emailPattern.matcher(email).matches();
    }

    public static void main(String[] args){
        System.out.println("is id correct: " + isIdCorrect("92010101077")); // true -  dl = 11
        System.out.println("is id correct: " + isIdCorrect("920101010773")); // false - dl = 12
        System.out.println("is email correct: " + isEmail("aaa.bbb@gmail.com"));
    }
}