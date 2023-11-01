
/*https://github.com/AMMAD-2022532/pablo.git
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pablo;

/**
 *
 * @author me
 */
public class Pablo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Create abilities
       Ability fireAttack = new Ability("Fire Attack", AbilityType.OFFENSIVE);
        Ability waterShield = new Ability("Water Shield", AbilityType.DEFENSIVE);

        // Create Algomon instances
        Algomon fireAlgomon = new Algomon("FireAlgomon", Type.FIRE, 100, 50, 30, 20);
        fireAlgomon.abilities[0] = fireAttack;

        Algomon waterAlgomon = new Algomon("WaterAlgomon", Type.WATER, 120, 40, 50, 15);
        waterAlgomon.abilities[1] = waterShield;

        // Create players
        Player player1 = new Player("Player1");
        player1.algomons[0] = fireAlgomon;

        Player player2 = new Player("Player2");
        player2.algomons[0] = waterAlgomon;

        // Create a match
        Match match = new Match(player1, player2);

        // Activate abilities
        fireAlgomon.abilities[0].activate();
        waterAlgomon.abilities[1].activate();
    }
}
    
    
    

