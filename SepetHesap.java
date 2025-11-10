/*
 * Ad Soyad: [Elif İkra ÇAKMAK]
 * Ogrenci No: [259541010]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 3 - E-Ticaret Sepet Hesaplayici
 *
 * Bu program 3 adet urunun sepet tutarini
 * KDV, indirim ve kargo dahil hesaplar.
 */

import java.util.Scanner;

public class SepetHesaplayici {

    // 🔹 Sabit tanımları
    final static double VAT_RATE = 0.18;        // KDV oranı (%18)
    final static double SHIPPING_FEE = 29.99;   // Kargo ücreti (₺)

    public static void main(String[] args) {

        // Ürünlerin fiyat ve adet bilgileri
        double fiyat1 = 150.0;
        int adet1 = 2;

        double fiyat2 = 300.0;
        int adet2 = 1;

        double fiyat3 = 80.0;
        int adet3 = 3;

        double indirimYuzdesi = 10.0; // %10 indirim

        // 🔸 Hesaplamalar (sadece metot çağrıları)
        double urunTop1 = calculateProductTotal(fiyat1, adet1);
        double urunTop2 = calculateProductTotal(fiyat2, adet2);
        double urunTop3 = calculateProductTotal(fiyat3, adet3);

        double araToplam = calculateSubtotal(urunTop1, urunTop2, urunTop3);
        double indirimTutar = calculateDiscountAmount(araToplam, indirimYuzdesi);
        double indirimliToplam = calculateDiscountedTotal(araToplam, indirimTutar);
        double kdvTutar = calculateVAT(indirimliToplam);
        double genelToplam = calculateGrandTotal(indirimliToplam, kdvTutar, SHIPPING_FEE);

        // 🔸 Sonuçlar
        System.out.printf("Ürün 1 Toplam: %.2f ₺%n", urunTop1);
        System.out.printf("Ürün 2 Toplam: %.2f ₺%n", urunTop2);
        System.out.printf("Ürün 3 Toplam: %.2f ₺%n", urunTop3);
        System.out.printf("Ara Toplam: %.2f ₺%n", araToplam);
        System.out.printf("İndirim (%.0f%%): -%.2f ₺%n", indirimYuzdesi, indirimTutar);
        System.out.printf("İndirimli Toplam: %.2f ₺%n", indirimliToplam);
        System.out.printf("KDV (%.0f%%): %.2f ₺%n", VAT_RATE * 100, kdvTutar);
        System.out.printf("Kargo Ücreti: %.2f ₺%n", SHIPPING_FEE);
        System.out.printf("Genel Toplam: %.2f ₺%n", genelToplam);
    }

    // Ürün satış toplamı = Fiyat × Adet
    public static double calculateProductTotal(double price, int quantity) {
        return price * quantity;
    }

    // Ara toplam = 3 ürünün toplamı
    public static double calculateSubtotal(double total1, double total2, double total3) {
        return total1 + total2 + total3;
    }

    // İndirim tutarı = Ara toplam × (% / 100)
    public static double calculateDiscountAmount(double subtotal, double discountPercent) {
        return subtotal * (discountPercent / 100);
    }

    // İndirimli toplam = Ara toplam - İndirim tutarı
    public static double calculateDiscountedTotal(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // KDV tutarı = İndirimli toplam × VAT_RATE
    public static double calculateVAT(double discountedTotal) {
        return discountedTotal * VAT_RATE;
    }

    // Genel toplam = İndirimli toplam + KDV + Kargo
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }
}
