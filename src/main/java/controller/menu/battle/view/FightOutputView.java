package controller.menu.battle.view;

/**
 * 전투 결과를 출력해주는 클래스
 */
public class FightOutputView {

    public void attackResult(String attacker, String target, int damage, int currentHp, boolean isSkillAttack) {
        System.out.println(attacker + "(이)가 " + target + "을(를) 공격하였다");
        System.out.println("...효과는 대단했다!");
        System.out.println(target + "의 체력이" + damage + "만큼 감소하였다!");
        System.out.println(target + "의 현재 체력은 " + currentHp + "이다");
    }
}
