import java.util.ArrayList;
import java.util.List;

public class IsThisPhoneNumber {
    private String number;
    private List<Character> allChar;
    private List<Character> numbers;
    private List<Character> characters;

    private Character[] keyList;

    public List<Character> getAllChar() {
        return allChar;
    }

    public void setAllChar(List<Character> allChar) {
        this.allChar = allChar;
    }

    public List<Character> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Character> numbers) {
        this.numbers = numbers;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public IsThisPhoneNumber() {
        this.number = number;
        this.allChar = new ArrayList<>();
        this.numbers = new ArrayList<>();
        this.characters = new ArrayList<>();
        this.keyList = new Character[]{' ','+', '(', ')', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }

    public boolean generalTest(String number) {
        this.number = number;
        if (firstTest()){
            makeList();
        }else {
            System.out.println("invalid number");
            return false;
        }
        if (this.numbers.size()>14||this.numbers.size()<11){
            System.out.println("sayisal degerler 14 ten fazla veya 11 den az");
            return false;
        }else{
            System.out.println("sayisal degerler uygun");
        }
        if (secondTest()) {
            System.out.println("ikinci test gecildi");
        }else {
            System.out.println("parantezle yanlış");
            return false;
        }

        System.out.println("gecerli numara");
        return true;
    }

    public boolean firstTest() {

        int counter = 0;

        for (int i = 0; i < this.keyList.length; i++) {
            for (int j = 0; j < this.number.length(); j++) {
                if (this.number.charAt(j) == this.keyList[i]) {
                    this.allChar.add(this.number.charAt(j));
                    counter++;
                }
            }

        }

        System.out.println(this.allChar);
        if (counter == this.number.length()) {
            System.out.println("karakter testini gecti...");
            return true;
            }

        return false;
    }

        public boolean secondTest(){
           if (this.number.charAt(0) == '(') {
                if (this.number.charAt(3) == ')' || this.number.charAt(4) == ')') {
                    System.out.println("parantezler dogru yerde!");
                }else{
                    System.out.println("invalid number! brackets are wrong!");
                    return false;
                }
            }
           if (this.number.charAt(this.number.length() - 11) == '0') {
               System.out.println(this.number.charAt(this.number.length() - 11));
               System.out.println("sondan 11 inci karakter 0 testi gecti");


            }else{
               System.out.println(this.number.charAt(this.number.length() - 11));
               System.out.println("sehir alan kodu 0 ile baslamali");
               return false;
           }

            return true;
        }

        public void makeList(){
            for (int i = 0; i < this.number.length(); i++) {
                if (this.number.charAt(i) == '+') {
                    System.out.println("+ eklendi");
                    this.characters.add(this.number.charAt(i));
                } else if (this.number.charAt(i) == '(') {
                    System.out.println("( eklendi");
                    this.characters.add(this.number.charAt(i));
                } else if (this.number.charAt(i) == ')') {
                    System.out.println(") eklendi");
                    this.characters.add(this.number.charAt(i));
                }else {
                    System.out.println("numara eklendi");
                    this.numbers.add(this.number.charAt(i));
                }
            }
            System.out.println(this.characters);
            System.out.println(this.numbers);
        }

    }





