import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplamTutar;
        int armutK, elmaK, domatesK, muzK, patlicanK;
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Armut'un kilosunu giriniz : ");
        armutK = inp.nextInt();

        System.out.print("Lütfen Elma'nın kilosunu giriniz : ");
        elmaK = inp.nextInt();

        System.out.print("Lütfen Domates'in kilosunu giriniz : ");
        domatesK = inp.nextInt();

        System.out.print("Lütfen Muz'un kilosunu giriniz : ");
        muzK = inp.nextInt();

        System.out.print("Lütfen Patlıcan'ın kilosunu giriniz : ");
        patlicanK = inp.nextInt();

        toplamTutar = (armutK * armut) + (elmaK * elma) + (domatesK * domates) + (muzK * muz) + (patlicanK * patlican);

        System.out.print("Toplam tutar : " + toplamTutar);
    }
}