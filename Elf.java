public class Elf extends Character {

     //default constructor
    public Elf(String setName) {
	name = setName;
	HP = 120;
	strength = (int)((Math.random() * 45) + 10);
	defense = 20;
	attack = 3;
    }//end Elf()

  
}//end class Elf
