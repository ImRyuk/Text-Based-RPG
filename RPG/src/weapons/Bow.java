package weapons;

public class Bow extends Weapon{
	
		private static final String NAME = "Bow";
		private static final int DAMAGE = 22;
		private static final int PRICE = 35;
		
		public Bow() {
			super(NAME,DAMAGE,PRICE);
		}
		
		public String ascii_art() {
			return 
					   		"	(		\n" +
							"    -		\n" +
							"     )		\n" +
							"##-------->\n" +
							"     )		\n" +	
							"    -		\n" +	
							"   (		\n" ;
				
		}
	}
