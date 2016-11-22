public class Mage extends Character {

    public Mage(String setName){
	name = setName;
	HP = 100;
	strength = (int)((Math.random() * 45) + 5);
	defense = 10;
	attack = 4;
    }//end Mage()
	
	
}//end class Mage
