/*
Eger girilen tutar 0 ve 1000 TL arasinda ise KDV orani %18 ,
tutar 1000 TL'den buyuk ise KDV oranini %8 olarak KDV tutari hesaplayan program
*/


import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kdvOrani = 0, kdvTutari = 0, kdvToplamTutari = 0;

        System.out.print(" Ücret tutarı giriniz : ");
        double tutar = scan.nextDouble();

        kdvOrani = (tutar > 1000) ? 0.08 : 0.18;

        kdvTutari = kdvOrani*tutar;
        kdvToplamTutari = tutar+kdvTutari;

        System.out.println("KDV oranı : " + kdvOrani);
        System.out.println("KDV tutarı : " + kdvTutari + " TL");
        System.out.println("Girilen tutar : " + tutar + " TL");
        System.out.println("KDV'li toplam tutar : " + kdvToplamTutari + " TL");
    }
}