public class Warrior extends Character {

     //default constructor
    public Warrior(String setName) {
	name = setName;
	HP = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attack = 1;
    }//end Warrior()

  
}//end class Warrior
