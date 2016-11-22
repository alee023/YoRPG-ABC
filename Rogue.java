public class Rogue extends Character {

     //default constructor
    public Rogue(String setName) {
	name = setName;
	HP = 100;
	strength = (int)((Math.random() * 45) + 10);
	defense = 10;
	attack = 2;
    }//end Rogue()


	
}//end class Rogue
