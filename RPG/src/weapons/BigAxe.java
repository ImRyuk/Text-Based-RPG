package weapons;

public class BigAxe extends Weapon{
	
		private static final String NAME = "BigAxe";
		private static final int DAMAGE = 40;
		private static final int PRICE = 100;
		
		public BigAxe() {
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


