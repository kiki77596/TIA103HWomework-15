package HomeWorkEx;
public class ArrowMan extends Hero implements CharAction{
	
	public ArrowMan() {
		super();
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	public void RunChar(CharAction.ActionId actionId)
	{
		if(actionId==CharAction.ActionId.eAttack)
			RunAction(actionId,"放弓箭");
		else
			RunAction(actionId," ");
	}
}
