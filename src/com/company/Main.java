package com.company;

public class Main {

    public static void main(String[] args) {
        Hero Medi  = new Medic("healing","Medi");
        Hero Mag = new Magic("firing like a dragon","Mag");
        Hero MuayThay = new Warrior("Critical Damage","MuayThay");
        Hero[] Avakarrot = {Medi,Mag,MuayThay};
        for (int i = 0; i < Avakarrot.length; i++) {
            System.out.println(Avakarrot[i].applySuperAbility(Avakarrot[i].getSuperPower()));
        }

    }
}
