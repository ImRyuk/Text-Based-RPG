package entities;

public class Spider extends Monster{
	private static final String NAME = "Spider";
	private static final int HEALTH = 40;
	private static final int DAMAGE = 12;
	private static final int XP_GIVEN = 10;
	private static final int GOLD_GIVEN = 15;
	
	public Spider(EntityPosition position) {
		super(position ,NAME ,HEALTH ,DAMAGE ,XP_GIVEN ,GOLD_GIVEN);
	}
}
