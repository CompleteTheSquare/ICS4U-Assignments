/*
 * The Pokemon class.
 */
package pokemonbattle;

/**
 *
 * @author anonymous
 */
public class Pokemon {

    // the Pokemon's name
    protected String name;

    // the Pokemon's original hit points (i.e. health points); cannot be negative
    protected int originalHP;

    // the Pokemon's current hit points (i.e. health points); cannot be negative
    protected int hp;

    // the Pokemon's combat points (i.e. attack points); cannot be negative
    protected int cp;

    protected String type;

    protected String weakness;

    /**
     * Creates a new Pokemon. The default HP is 100; the default CP is 25.
     *
     * @param name the Pokemon's name
     */
    public Pokemon(String name) {
        this.name = name;
        this.originalHP = 100;
        this.hp = 100;
        this.cp = 25;
    }

    /**
     * Creates a new Pokemon.
     *
     * @param name the name
     * @param hp the hit points
     * @param cp the combat points
     */
    public Pokemon(String name, int hp, int cp) {
        this.name = name;

        if (hp < 0) {
            this.originalHP = 0;
            this.hp = 0;
        } else {
            this.originalHP = hp;
            this.hp = hp;
        }

        if (cp < 0) {
            this.cp = 0;
        } else {
            this.cp = cp;
        }
    }

    /**
     *
     * @return the name of the Pokemon
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the Pokemon's HP
     */
    public int getHP() {
        return this.hp;
    }

    /**
     * @return the Pokemon's CP
     */
    public int getCP() {
        return this.cp;
    }

    public String getType() {
        return this.type;
    }

    public String getWeakness() {
        return this.weakness;
    }

    /**
     * Changes the Pokemon's HP to another number. Since HP cannot be negative,
     * if newHP is negative, it changes to 0.
     *
     * @param newHP the new HP
     */
    public void changeHP(int newHP) {
        if (newHP < 0) {
            this.hp = 0;
        } else {
            this.hp = newHP;
        }
    }

    /**
     * Changes the Pokemon's HP to its original value.
     */
    public void restoreHP() {
        hp = originalHP;
    }

    /**
     * Attacks another Pokemon and reduces its HP by the attacker's CP. Prints a
     * statement indicating the new HP of the attacked Pokemon.
     *
     * @param p the other Pokemon
     */
    public void attack(Pokemon p) {
        p.changeHP(p.getHP() - this.cp);

        if (p.getHP() < 0) {
            p.changeHP(0);
        }

        System.out.println(String.format("%s attacks %s. %s's hp is now %d.", this.name, p.getName(), p.getName(), p.getHP()));
    }

}
