import java.util.Scanner;
public class recursiveus {

    static int recus(int taban,int us)
    {
   
       if(us==0)
       return 1;
       else
       return taban * recus(taban,(us-1));
    
    }
    public static void main(String[] args) {
      int taban,us;
      Scanner gir =new Scanner(System.in);
      System.out.print("Taban degeri gir :");
      taban=gir.nextInt();
      System.out.print("Us degeri gir :");
      us=gir.nextInt();
      System.out.println(recus(taban,us));
      gir.close();
    }
    
}
