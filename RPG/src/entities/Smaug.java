package entities;

public class Smaug extends Monster{
	private static final String NAME = "Smaug";
	private static final int HEALTH = 300;
	private static final int DAMAGE = 40;
	private static final int XP_GIVEN = 1000;
	private static final int GOLD_GIVEN = 1000;
	
	public Smaug(EntityPosition position) {
		super(position ,NAME ,HEALTH ,DAMAGE ,XP_GIVEN ,GOLD_GIVEN);
	}
}