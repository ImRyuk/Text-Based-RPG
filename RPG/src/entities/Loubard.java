package entities;

public class Loubard extends Monster{
	private static final String NAME = "Loubard";
	private static final int HEALTH = 100;
	private static final int DAMAGE = 25;
	private static final int XP_GIVEN = 18;
	private static final int GOLD_GIVEN = 22;
	
	public Loubard(EntityPosition position) {
		super(position ,NAME ,HEALTH ,DAMAGE ,XP_GIVEN ,GOLD_GIVEN);
	}
}
