package entities;

public class Skeleton extends Monster{
	private static final String NAME = "Skeleton";
	private static final int HEALTH = 60;
	private static final int DAMAGE = 22;
	private static final int XP_GIVEN = 14;
	private static final int GOLD_GIVEN = 22;
	
	public Skeleton(EntityPosition position) {
		super(position ,NAME ,HEALTH ,DAMAGE ,XP_GIVEN ,GOLD_GIVEN);
	}
}
