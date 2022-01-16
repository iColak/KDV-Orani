package githubPatika;
import java.util.Scanner;

public class KDVOrani {
    public static void main(String[] args) {

        double fiyat, KDVliFiyat, KDVTutari;

        //Scanner sınıfını oluşturalım
        Scanner input = new Scanner(System.in);

        //Fiyatı alalım
        System.out.print("Fiyatı Giriniz: ");
        fiyat = input.nextDouble();

        //KDV oranını fiyat 1000 den küçükse %18, büyükse %8 olarak belirleyelim.
        double KDVOrani = (fiyat < 1000) ?  0.18 : 0.08;

        //KDV tutarını ve KDV li fiyatı hesaplayıp ekrana basalım
        KDVTutari = fiyat * KDVOrani;
        KDVliFiyat = KDVTutari + fiyat;
        System.out.println("Girilen " + fiyat + " lira için KDV tutarı " + KDVTutari + " lira olup, KDV li fiyatı " + KDVliFiyat + " liradır.");
    }
}
