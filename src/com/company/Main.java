package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        boss.setHealth(250);
        boss.setDamage(50);
        boss.setSuperAbillity("Ultra");
        weapon.setTypeWeapon("Служебное");
        weapon.setWeapon("AK-47");
        boss.setWeapon(weapon);
        System.out.println("Здоровье Босса = " + boss.getHealth() + " Урон Босса = " + boss.getDamage() + " Суперспособность Босса = " + boss.getSuperAbillity() + " Тип оружия Босса = " + boss.getWeapon().getTypeWeapon() + " Название оружия Босса = " + boss.getWeapon().getTypeWeapon());

    }
}
