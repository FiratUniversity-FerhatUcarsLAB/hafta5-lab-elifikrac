/*
 * Ad Soyad: [Elif İkra ÇAKMAK]
 * Ogrenci No: [250541010]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Kare
        System.out.print("Karenin kenar uzunluğunu giriniz: ");
        double kenar = scan.nextDouble();
        double kareAlan = calculateSquareArea(kenar);
        double kareCevre = calculateSquarePerimeter(kenar);
        System.out.println("Kare Alanı: " + kareAlan);
        System.out.println("Kare Çevresi: " + kareCevre);

        // Dikdörtgen
        System.out.print("\nDikdörtgenin kısa kenarını giriniz: ");
        double kisaKenar = scan.nextDouble();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        double uzunKenar = scan.nextDouble();
        double dikdortgenAlan = calculateRectangleArea(uzunKenar, kisaKenar);
        double dikdortgenCevre = calculateRectanglePerimeter(uzunKenar, kisaKenar);
        System.out.println("Dikdörtgen Alanı: " + dikdortgenAlan);
        System.out.println("Dikdörtgen Çevresi: " + dikdortgenCevre);

        // Daire
        System.out.print("\nDairenin yarıçapını giriniz: ");
        double radius = scan.nextDouble();
        double daireAlan = calculateCircleArea(radius);
        double daireCevre = calculateCircleCircumference(radius);
        System.out.println("Daire Alanı: " + daireAlan);
        System.out.println("Daire Çevresi: " + daireCevre);

        // Üçgen
        System.out.print("\nÜçgenin taban uzunluğunu giriniz: ");
        double taban = scan.nextDouble();
        System.out.print("Üçgenin yüksekliğini giriniz: ");
        double yukseklik = scan.nextDouble();
        double ucgenAlan = calculateTriangleArea(taban, yukseklik);
        System.out.println("Üçgen Alanı: " + ucgenAlan);

        System.out.print("Üçgenin 1. kenarını giriniz: ");
        double a = scan.nextDouble();
        System.out.print("Üçgenin 2. kenarını giriniz: ");
        double b = scan.nextDouble();
        System.out.print("Üçgenin 3. kenarını giriniz: ");
        double c = scan.nextDouble();
        double ucgenCevre = calculateTrianglePerimeter(a, b, c);
        System.out.println("Üçgen Çevresi: " + ucgenCevre);

        scan.close();
    }

    // Kare Alan
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // Kare Çevre
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // Dikdörtgen Alan
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // Dikdörtgen Çevre
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // Daire Alan
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Daire Çevre
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // Üçgen Alan
    public static double calculateTriangleArea(double base, double height) {
        return (base * height) / 2;
    }

    // Üçgen Çevre
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}

    
    
   
