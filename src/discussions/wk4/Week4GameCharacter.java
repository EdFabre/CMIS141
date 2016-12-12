package discussions.wk4;

public class Week4GameCharacter {

    // Repesents the possible race and class of the character.
    private enum Race {
        HUMAN, ORC, ELF
    }

    private enum Class {
        WARRIOR, HUNTER, WIZARD, GUARDIAN
    }

    // This is the character's name.
    private String characterName;

    // These enums represent the race and class of the GameCharacter object.
    private Race charRace;
    private Class charClass;

    // These are the character's main stats.
    private int hitpoints, attack, defence, stamina;

    /**
     * This no argument constructor creates a GameCharacter with default values
     */
    public Week4GameCharacter() {
        this.charRace = Race.HUMAN;
        this.charClass = Class.WARRIOR;
        this.characterName = "JohnDoe";
        this.hitpoints = 105;
        this.attack = 18;
        this.defence = 16;
        this.stamina = 17;
    }

    /**
     * This constructor takes in arguments and generates stats based on
     * selection.
     *
     * @param charRace
     * @param charClass
     * @param characterName
     */
    public Week4GameCharacter(Race charRace, Class charClass, String characterName) {
        this.charRace = charRace;
        this.charClass = charClass;
        this.characterName = characterName;
        setStat(charRace, charClass);
    }

    /**
     * This method will generate the stats of the character based on the
     * combination of its Race and Class.
     *
     * @param stat
     * @param charRace
     * @param charClass
     * @return
     */
    private void setStat(Race charRace, Class charClass) {
        if (charRace.compareTo(Race.HUMAN) == 0) {
            if (charClass.compareTo(Class.GUARDIAN) == 0) {
                setStatHelper(1.1);
            } else if (charClass.compareTo(Class.HUNTER) == 0) {
                setStatHelper(.81);
            } else if (charClass.compareTo(Class.WARRIOR) == 0) {
                setStatHelper(1.05);
            } else {
                setStatHelper(.82);
            }
        } else if (charRace.compareTo(Race.ORC) == 0) {
            if (charClass.compareTo(Class.GUARDIAN) == 0) {
                setStatHelper(1.15);
            } else if (charClass.compareTo(Class.HUNTER) == 0) {
                setStatHelper(.83);
            } else if (charClass.compareTo(Class.WARRIOR) == 0) {
                setStatHelper(1.1);
            } else {
                setStatHelper(.84);
            }
        } else if (charClass.compareTo(Class.GUARDIAN) == 0) {
            setStatHelper(1.05);
        } else if (charClass.compareTo(Class.HUNTER) == 0) {
            setStatHelper(.79);
        } else if (charClass.compareTo(Class.WARRIOR) == 0) {
            setStatHelper(1.0);
        } else {
            setStatHelper(.8);
        }
    }

    /**
     * Will calculate specific combinations stats based on comboCode. This is
     * pretty interesting.
     *
     * @param stat
     * @param code
     * @return
     */
    private void setStatHelper(double comboCode) {
        this.hitpoints = (int) Math.round(100 * comboCode);
        this.attack = (int) Math.round(50 - (comboCode * 50) + 20);
        this.defence = (int) Math.round((10 * comboCode) + 5);
        this.stamina = (int) Math.round(50 - (comboCode * 60) + 30);
    }

    /**
     * Returns string representation of the character object.
     * @return
     */
    @Override
    public String toString() {
        return "GameCharacter{" + "\n"
                + "characterName=" + characterName + "\n"
                + "charRace=" + charRace + "\n"
                + "charClass=" + charClass + "\n"
                + "hitpoints=" + hitpoints + "\n"
                + "attack=" + attack + "\n"
                + "defence=" + defence + "\n"
                + "stamina=" + stamina + "\n"
                + '}';
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing code creates 3 characters.
        Week4GameCharacter orcWarrior
                = new Week4GameCharacter(Race.ORC, Class.WARRIOR, "Uglúk");
        Week4GameCharacter elfHunter
                = new Week4GameCharacter(Race.ELF, Class.HUNTER, "Legolas");
        Week4GameCharacter humanMage
                = new Week4GameCharacter(Race.HUMAN, Class.WIZARD, "Gandalf");

        System.out.println(orcWarrior.toString());
        System.out.println(elfHunter.toString());
        System.out.println(humanMage.toString());
    }

}
