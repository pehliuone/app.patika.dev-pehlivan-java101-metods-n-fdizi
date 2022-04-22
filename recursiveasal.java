import java.util.Scanner;

public class recursiveasal {
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        System.out.print("Sayi Giriniz:");
        int n= gir.nextInt();
        System.out.println(asal(n,2)?"Asal Sayidir":"Asal Sayi Degildir");
        gir.close();
    }
    static boolean asal(int sayi,int i){
        if(i>=sayi){
            return true;
        }
       if(sayi%i==0){
           return false;
       }
       else return asal(sayi,i+1);
       
    }
      
}