/*
 * Ad Soyad: [Elif İkra ÇAKMAK]
 * Ogrenci No: [250541010]
 * Tarih: [10.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */


import java.util.Scanner;

public class FizikHesaplayici {

    // Sabit tanımlama
    final static double GRAVITY = 9.8; // m/s^2

    public static void main(String[] args) {

        double yol = 100.0;   // metre
        double zaman = 5.0;   // saniye
        double deltaV = 20.0; // m/s
        double kütle = 10.0;  // kg
        double mesafe = 50.0; // metre
        double yükseklik = 10.0; // metre
        double hiz = calculateVelocity(yol, zaman);

        System.out.printf("Hız (v): %.2f m/s%n", hiz);
        System.out.printf("İvme (a): %.2f m/s²%n", calculateAcceleration(deltaV, zaman));
        System.out.printf("Kuvvet (F): %.2f N%n", calculateForce(kütle, calculateAcceleration(deltaV, zaman)));
        System.out.printf("İş (W): %.2f J%n", calculateWork(calculateForce(kütle, calculateAcceleration(deltaV, zaman)), mesafe));
        System.out.printf("Güç (P): %.2f W%n", calculatePower(calculateWork(calculateForce(kütle, calculateAcceleration(deltaV, zaman)), mesafe), zaman));
        System.out.printf("Kinetik Enerji (KE): %.2f J%n", calculateKineticEnergy(kütle, hiz));
        System.out.printf("Potansiyel Enerji (PE): %.2f J%n", calculatePotentialEnergy(kütle, yükseklik));
        System.out.printf("Momentum (p): %.2f kg·m/s%n", calculateMomentum(kütle, hiz));
    }

    // Hız: v = s / t
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // İvme: a = Δv / t
    public static double calculateAcceleration(double deltaV, double time) {
        return deltaV / time;
    }

    // Kuvvet: F = m × a
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // İş: W = F × d
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    //  Güç: P = W / t
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // Kinetik Enerji: KE = 0.5 × m × v²
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // Potansiyel Enerji: PE = m × g × h
    public static double calculatePotentialEnergy(double mass, double height) {
        return mass * GRAVITY * height;
    }

    // Momentum: p = m × v
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }
}
