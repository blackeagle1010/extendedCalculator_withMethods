import java.util.Scanner;

public class extendedCalculator {
    static void plus(int num1, int num2) {
        System.out.println("plus result is:"+ (num1+num2));
    }
    static void minus(int num1, int num2) {
        if (num1 >= num2){
            System.out.println("minus result is:"+ (num1-num2));
        }
        else {
        System.out.println("minus result is:"+ (num2-num1));
        }
    }
    static void multiple(int num1, int num2) {
        System.out.println("multiple result is:"+ (num2*num1));
    }
    static void divided(int num1, int num2) {
        int result=num1/num2;
        System.out.println("divided result is:"+  result);
    }
    static void pow(int num1, int num2) {
        int i = 1, result=1;
        while (i <= num2) {
            i++;
            result *= num1;
        }System.out.println("pow result is:" + result);
    }
    static void factorial(int num1) {
        System.out.println("used only the first number you entered");
        int i=1,result=1;
        while (i<=num1){
            i++;
        result *= i;
        }System.out.println("factorial result is:"+ result);
    }
    static void modding(int num1, int num2) {
        if (num1 >= num2) {
            System.out.println("modding result is:" + num1 % num2);
        }else
            System.out.println("modding result is:" + num2 % num1);
    }
    static void rectangular(int num1, int num2) {
        System.out.println("for perimeter: enter 1");
        System.out.println("for square: enter 2");
        Scanner Inp=new Scanner(System.in);
        int option=Inp.nextInt();
        switch (option) {
            case 1 -> System.out.println("rectangular result is:" + 2 * (num1 + num2));
            case 2 -> System.out.println("rectangular result is:" + num1 * num2);
            default -> System.out.println("error for rectangular option");
        }
    }
    public static void main(String[] args) {
        int select;
        Scanner Inp = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = Inp.nextInt();
        System.out.println("enter second number:");
        int num2 = Inp.nextInt();
        String menu =
                """
                        1- Toplama İşlemi
                        2- Çıkarma İşlemi
                        3- Çarpma İşlemi
                        4- Bölme işlemi
                        5- Üslü Sayı Hesaplama
                        6- Faktoriyel Hesaplama
                        7- Mod Alma
                        8- Dikdörtgen Alan ve Çevre Hesabı
                        0- Çıkış""";
        System.out.println("menu:" + menu);
        do {
            System.out.println("enter selection (if you wanna quit, press 0:");
            select = Inp.nextInt();
            switch (select) {
                case 1 -> plus(num1, num2);
                case 2 -> minus(num1, num2);
                case 3 -> multiple(num1, num2);
                case 4 -> divided(num1, num2);
                case 5 -> pow(num1, num2);
                case 6 -> factorial(num1);
                case 7 -> modding(num1, num2);
                case 8 -> rectangular(num1, num2);
                default -> System.out.println("bye");
            }
        }while (select != 0);
    }
}
