package entities;

public class Rat extends Monster{
	private static final String NAME = "Rat";
	private static final int HEALTH = 25;
	private static final int DAMAGE = 10;
	private static final int XP_GIVEN = 8;
	private static final int GOLD_GIVEN = 12;
	
	public Rat(EntityPosition position) {
		super(position ,NAME ,HEALTH ,DAMAGE ,XP_GIVEN ,GOLD_GIVEN);
	}
}
