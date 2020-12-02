package weapons;

public class Axe extends Weapon{
	
		private static final String NAME = "Axe";
		private static final int DAMAGE = 20;
		private static final int PRICE = 30;
		
		public Axe() {
			super(NAME,DAMAGE,PRICE);
		}
		
		public String ascii_art() {
			return 
					" _,-, \n" +
					" T_  |\n" +
					" ||`-'\n" +
					" ||   \n" +
					" ||   \n" +
					" ~~   \n";
		}
	}


