import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       while (true){
           IsThisPhoneNumber makeList=new IsThisPhoneNumber();
           System.out.println("Give a number");
           String number = scanner.nextLine();
           number=number.replace(" ","");
           if(number.equals("-")){
               break;
           }
           makeList.generalTest(number);
           System.out.println(makeList.getCharacters());
           System.out.println(makeList.getNumbers());
       }
        while (true){
            IsThisMailAdress adres=new IsThisMailAdress();
            System.out.println("Give an mail adress");
            String mailAdress = scanner.nextLine();
            mailAdress=mailAdress.toLowerCase(Locale.ROOT);
            mailAdress=mailAdress.trim();
            if(mailAdress.equals("-")){
                break;
            }
            adres.lastTest(mailAdress);

        }

    }

}

