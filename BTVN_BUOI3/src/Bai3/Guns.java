package Bai3;
import java.util.Scanner;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public Guns(){
        weaponName = "";
        ammoNumber = 0;
    }

    public Guns(String weaponName, int ammoNumber){
            this.weaponName = weaponName;
            this.ammoNumber = ammoNumber;
    }

    public String getWeaponName(){
        return weaponName;
    }

    public int getAmmoNumber(){
        return ammoNumber;
    }

    public void setWeaponName(String weaponName){
        this.weaponName = weaponName;
    }

    public void setAmmoNumber(int ammoNumber){
        this.ammoNumber = ammoNumber;
    }

    public void Load(int x){
        ammoNumber += x;
    }

    public void Shoot(int x){
        if(ammoNumber >= x) ammoNumber -= x;
        else if(ammoNumber == 0) System.out.println("Het dan mat tieu luon ^^");
    }

}
