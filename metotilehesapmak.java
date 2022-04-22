import java.util.Scanner;

public class metotilehesapmak {

    static void topla() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuc : " + result);
        scan.close();
    }

    static void cikar() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuc : " + result);
        scan.close();
    }

    static void carp() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuc : " + result);
        scan.close();
    }

    static void bol() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac adet sayi gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuc : " + result);
        scan.close();
    }

    static void us() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban degeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Us degeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc : " + result);
        scan.close();
    }

    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc : " + result);
        scan.close();
    }
    
    static void mod() {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.print("Lutfen ilk sayiyi giriniz: ");
        num1 = scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        num2 = scan.nextInt();
        
        int md = num1%num2;
        
        System.out.println("Sonuc: " + md);
        scan.close();
    }
    
    static void alandikdortgen() {
        Scanner scan = new Scanner(System.in);
        int longSide, shortSide;
        System.out.print("Lutfen dikdörtgenin uzun kenarini giriniz: ");
        longSide = scan.nextInt();
        System.out.print("Lutfen dikdörtgenin kisa kenarini giriniz: ");
        shortSide = scan.nextInt();
        
        int area, circum;
        
        area = longSide * shortSide;
        circum = 2 * (longSide + shortSide);
        
        System.out.println("Dikdortgenin Alani: " + area);
        System.out.println("Dikdortgenin Cevresi: " + circum);
        scan.close();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    topla();
                    break;
                case 2:
                    cikar();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alandikdortgen();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
        scan.close();
    }
}