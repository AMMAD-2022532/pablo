/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pablo;

/**
 *
 * @author me
 */
enum AbilityType {
    OFFENSIVE, DEFENSIVE, HEALING
}

class Ability {
    String name;
    AbilityType type;

    public Ability(String name, AbilityType type) {
        this.name = name;
        this.type = type;
    }

    public void activate() {
        System.out.println("Ability " + name + " activated!");
    }
}
