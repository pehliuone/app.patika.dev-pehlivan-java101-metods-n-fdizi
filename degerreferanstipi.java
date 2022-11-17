public class start {
    int a;
    public static void main(String []args)
    {
        start s1=new start();
        s1.a=5;
        System.out.println("Eski deger :"+s1.a);
        s1.degistir(s1);
        System.out.println("Yeni deger :"+s1.a);

    }
    void degistir(start s1)
    {s1.a+=10;}
}
