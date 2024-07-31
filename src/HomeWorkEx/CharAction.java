package HomeWorkEx;

public interface CharAction {
	enum ActionId{eAttack,aMove,aDefend}
	public default void RunAction (ActionId id,String Attackstr)
	{
		switch (id) {
		case eAttack:
			System.out.println(Attackstr);
			break;
		case aMove:
			System.out.println("做防禦動作");
			break;
		case aDefend:
			System.out.println("跑步");
			break;
		default:
			
		}
	}
}
