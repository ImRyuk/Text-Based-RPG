package weapons;

public class BigSword extends Weapon{
	
		private static final String NAME = "BigSword";
		private static final int DAMAGE = 36;
		private static final int PRICE = 130;
		
		public BigSword() {
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
