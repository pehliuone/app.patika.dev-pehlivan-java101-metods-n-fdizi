import java.util.Scanner;
public class palindrom {
    static boolean isPalindrom(int sayi) {
        int gec = sayi, terssayi = 0, sonrakam;
        while (gec != 0) {
            sonrakam = gec % 10;
            terssayi = (terssayi * 10) + sonrakam;
            gec /= 10;
        }
        if (sayi == terssayi) {
            return true;
        } else
            return false;
    }
    public static void main(String[] args) {
        int sayac;
      Scanner gir =new Scanner(System.in);
      System.out.print("Sayi gir :");
      sayac=gir.nextInt();
      System.out.print(isPalindrom(sayac));
    }
}