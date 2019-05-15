/*
 * The Battle class.
 */
package pokemonbattle;

/**
 *
 * @author anonymous
 */
public class Battle {
    
    private final Pokemon p1;
    private final Pokemon p2;
    
    
    /**
     * Creates a new Battle.
     * @param p1 the first Pokemon
     * @param p2 the second Pokemon
     */
    public Battle(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    /**
     * Restores the HP of the two Pokemon.
     */
    public void rest() {
        p1.restoreHP();
        p2.restoreHP();
    }
    
    
    /**
     * Performs a battle between the two Pokemon.
     * Prints a play-by-play to the console.
     */
    public void doBattle() {
        
        System.out.println(String.format("Begin Battle: %s vs. %s!", p1.getName(), p2.getName()));
        System.out.println();
        
        // the Pokemon attack each other until one of their HP are depleted
        while (p1.getHP() > 0) {
            p1. attack(p2);
            if (p2.getHP() > 0 ) {
                p2. attack(p1);
            } else {
                // p2's HP is at 0
                System.out.println(String.format("The winner is %s!", p1.getName()));
                System.out.println();
                return;
            }
        }
        
        // p1's HP is at 0
        System.out.println(String.format("The winner is %s!", p2.getName()));
        System.out.println();
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 70, 25);
        Pokemon charmander = new Pokemon("Charmander", 75, 40);
        Pokemon squirtle = new Pokemon("Squirtle", 60, 35);
                
        Battle match1 = new Battle(bulbasaur, charmander);
        match1.doBattle();
        match1.rest();

        Battle match2 = new Battle(squirtle, bulbasaur);
        match2.doBattle();
        match2.rest();

        Battle match3 = new Battle(charmander, squirtle);
        match3.doBattle();
        match3.rest();
        
    }
    
}
