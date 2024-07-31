package HomeWorkEx;
public class SwordMan extends Hero implements CharAction{
	
	public SwordMan() {
		super();
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	
	public void RunChar(CharAction.ActionId actionId)
	{
		if(actionId==CharAction.ActionId.eAttack)
			RunAction(actionId,"揮劍");
		else
			RunAction(actionId," ");
	}
}
