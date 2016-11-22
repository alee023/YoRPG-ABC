public class Character {
    //declare instance variables
    protected int HP ;
    protected int strength ;
    protected int defense ;
    protected double attack ;
    protected String name ;

    //returns boolean indicating living or dead
    public boolean isAlive() {
	return( HP > 0 ) ;
    }//end isAlive()

    //returns value of defense attribute
    public int getDefense() {
	return defense ;
    }//end getDefense()

    //returns value of name attribute
    public String getName() {
	return name ;
    }//end getName()

    //takes an int parameter, decreases life attribute by that amount
    public void lowerHP( int damage ) {
	HP -= damage ;
    }//end lowerHP()

    /*takes a Monster as a parameter
      calculates damage using this formula: damage = (strength * attack rating) - monster defense
      damage should be an integer value*/
    public int attack(Character attacked ) {
	int Defense = attacked.getDefense() ;	
		
	int damage = (int)( strength * attack - Defense ) ;
	attacked.lowerHP(damage) ;
        return damage;
    }//end attack()

    public void specialize() {
	defense = 10 ;
	attack = 0.8 ;
    }//end specialize()
    
    /*prepares the Character to perform a normal attack
      resets defense attribute
      resets attack attribute*/
    public void normalize() {
	defense = 20 ;
	attack = 0.4 ;
    }//end normalize()

    public static String about ( Character a ) {
	String retStr = "";
	if (a.name.length() > 1) {
	    retStr = "Name: " + a.name;
	}
	retStr += "HP: " + a.HP + "\n" ;
	retStr += "Strength: " + a.strength + "\n" ;
	retStr += "Defense: " + a.defense + "\n" ;
	retStr += "Attack: " + a.attack + "\n" ;
		
	return retStr ;
    }
   
} //end class Character
