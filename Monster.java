public class Monster extends Character{

    //default constructor
    public Monster() {
	HP = 150;
	strength = (int)((Math.random() * 45) + 20);
	defense = 20;
	attack = 1;
    }//end Monster()

}//end class Monster
