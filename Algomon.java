/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pablo;

/**
 *
 * @author me
 */
enum Type {
    FIRE, WATER, EARTH, SUN, MOON, STAR
}

class Algomon {
    String name;
    Type type;
    int health;
    int attack; 
    
     int Sout;
    int defense;
    int speed;
    Ability[] abilities = new Ability[3];

    public Algomon(String name, Type type, int health, int attack, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
}
