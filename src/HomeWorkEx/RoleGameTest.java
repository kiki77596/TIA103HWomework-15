package HomeWorkEx;

import HomeWorkEx.CharAction.ActionId;

public class RoleGameTest {

	public static void main(String[] args) {
		Hero saber = new SwordMan("亞拉岡", 1, 0);
		Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
		
		saber.RunChar(ActionId.eAttack);
		saber.RunChar(ActionId.aMove);
		
		archer.RunChar(ActionId.eAttack);
		archer.RunChar(ActionId.aMove);
	}

}
