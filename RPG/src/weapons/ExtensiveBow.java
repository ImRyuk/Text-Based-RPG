package weapons;

public class ExtensiveBow extends Weapon{
	
		private static final String NAME = "ExtensiveBow";
		private static final int DAMAGE = 45;
		private static final int PRICE = 200;
		
		public ExtensiveBow() {
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
