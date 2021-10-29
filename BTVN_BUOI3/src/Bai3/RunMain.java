package Bai3;
import java.util.Random;

public class RunMain {
    public static void main(String[] args) {
        Random rand = new Random();
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        DiepBeDe.setWeaponName("Ak-X6");
        DiepBeDe.setAmmoNumber(100);

        DiepBeDe.setWeaponName("MK14-X8");
        DoanXinhGai.setAmmoNumber(100);

        while(DiepBeDe.getAmmoNumber() != 0 && DoanXinhGai.getAmmoNumber() != 0) {

            DiepBeDe.Shoot(rand.nextInt(10) + 1);
            DoanXinhGai.Shoot(rand.nextInt(10) + 1);

            if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() == 0) {
                System.out.println("Hai anh hoà nhau");
            } else if (DiepBeDe.getAmmoNumber() == 0 && DoanXinhGai.getAmmoNumber() != 0) {
                System.out.println("Anh Doan Win");
            } else if (DiepBeDe.getAmmoNumber() != 0 && DoanXinhGai.getAmmoNumber() == 0) {
                System.out.println("Anh Diep Win");
            }
        }
    }
}
