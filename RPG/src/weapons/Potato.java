package weapons;

public class Potato extends Weapon{
	
		private static final String NAME = "Potato";
		private static final int DAMAGE = 3;
		private static final int PRICE = 1;
		
		public Potato() {
			super(NAME,DAMAGE,PRICE);
		}
		
		public String ascii_art() {
			return 
					"______________▓▓▓▓▓▓▓▓▓▓▓▓▓▓____________\n" +
					"__________▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓________\n" +
					"________▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓______\n" + 
					"______▓▓▓▓▒▒▒▒▒▒▒▒██████████▒▒▒▒▓▓▓▓____\n" +
					"____▓▓▓▓▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓__\n" + 
					"▓▓▓▓▓▓▓▓▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓\n" +
					"▓▓▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓\n" +
					"▓▓▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓\n" +
					"▓▓▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓\n" +
					"▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓\n" +
					"__▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓\n" +
					"__▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓__\n" +
					"____▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓____\n" +
					"______▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓________\n" +
					"____________▓▓▓▓▓▓▓▓▓▓▓▓▓▓______________";
				
		}
	}


