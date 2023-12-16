import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task_02_4();
    }

    public static void task_02_1(){
        String str1="Hello",str2="World!";
        String str=str1+" "+str2;//сложение строк

        int a=1;
        float b=123.4F;
        String str3 = String.valueOf(a);//перевод обекта типа int в строку
        String str4 = String.valueOf(b);//перевод обекта типа float в строку

        String str5="12";
        Integer i = Integer.parseInt(str5);//Перевод строки в число

        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";

        String[] peopleArray = people.split("; ");
        for (String human : peopleArray) {
            System.out.println(human);//Разбиение строки на массив строк
        }

        String str6=str.toLowerCase();//Перевод строки в нижний регистр:
        String str7=str.toUpperCase();//Перевод строки в верхний регистр:

        char myChar = str.charAt(2);//Возвращает символ с указанным смещением в этой строке, вывод: l

        int Unicode_index = str.codePointAt(3);//Возвращает Unicode-символ в заданном индексе , вывод: 108

        boolean cont =str.contains("Hello");//Определяет, содержит ли строка последовательность символов в str, вывод: true


    }
    public static void task_02_2(){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext())
            System.out.println(scanner.next());

        scanner.close();



    }
    public static void task_02_3(){
        int a=5,b=10;
        if(a<b && b>5){
            System.out.println(a < b ? a : b);
        }
        System.out.println(1&0);
        System.out.println(1|0);
        System.out.println(1^0);
        int x=1;
        System.out.println(~x);
        System.out.println(x<<3);
        int y=-8;
        System.out.println(y>>3);
    }


    public static void task_02_4(){
        System.out.print("String: ");
        String day = "day_of_week";
        switch (day) {
            case "Monday":
                System.out.println("First");
                break;
            case "Thursday":
                System.out.println("Second");
                break;
            case "Wednesday":
                System.out.println("Third");
                break;
            default:
                System.out.println("Error");
        }

        System.out.print("Enum: ");
        Numbers c;
        c = Numbers.First;
        switch (c) {
            case First:
                System.out.println("First");
                break;
            case Second:
                System.out.println("Second");
                break;
            case Third:
                System.out.println("Third");
                break;
            case Fourth:
                System.out.println("Fourth");
                break;
            case Fifth:
                System.out.println("Fifth");
                break;
            case Sixth:
                System.out.println("Sixth");
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.print("Char: ");
        char letter = 'T';
        switch (letter)
        {
            case 'T':
                System.out.println("TRUE!");
                break;
            case 'F':
                System.out.println("FALSE!");
                break;
            case 'N':
                System.out.println("NOT STATED!");
                break;
            default:
                System.out.println("Choose another answer!");
                break;
        }

        System.out.print("Byte: ");
        byte valB = 4;
        switch (valB)
        {
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.print("int: ");
        int valI = 5;
        switch (valI)
        {
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error");
                break;
        }

        System.out.print("Short: ");
        short valS = 3;
        switch (valS)
        {
            case 5:
                System.out.println("Five");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    }


enum Numbers {
    First,
    Second,
    Third,
    Fourth,
    Fifth,
    Sixth
}
