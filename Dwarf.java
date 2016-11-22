public class Dwarf  extends Character {

     //default constructor
    public Dwarf(String setName) {
	name = setName;
	HP = 110;
	strength = (int)((Math.random() * 45) + 15);
	defense = 15;
	attack = 2;
    }//end Dwarf()

  
}//end class Dwarf
