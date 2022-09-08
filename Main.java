import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Sayi giriniz:");
          int a = sc.nextInt();
          int toplam=0;
          for(int i=0 ; a>i ; i++)
          {
               if(i%12==0)
               {
                   toplam += i;
               }
          }
          System.out.println("Sonuc:"+toplam);
    }
}