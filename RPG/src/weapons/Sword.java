package weapons;

public class Sword extends Weapon{
	
		private static final String NAME = "Sword";
		private static final int DAMAGE = 18;
		private static final int PRICE = 25;
		
		public Sword() {
			super(NAME,DAMAGE,PRICE);
		}
		
		public String ascii_art() {
			return 
				   "   ==                         \n" +
				   "   ||_________________________\n" +
				"OOOOO||_________________________>\n" +
				 "     ||						  \n" +
				 "     ==						  ";
				
		}
	}
