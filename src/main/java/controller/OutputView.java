package controller;


import controller.menu.battle.controller.BattleController;
import controller.menu.capture.controller.CaptureController;
import controller.menu.garden.controller.GardenController;
import controller.menu.playerinformation.controller.PlayerInformationController;
import controller.menu.save.controller.SaveController;

public class OutputView {

    private BattleController battleController;
    private CaptureController captureController;
    private GardenController gardenController;
    private PlayerInformationController myInformationController;
    private SaveController saveController;
    private String exit;

    //메인메뉴를 보여준다
    public void menu() {
        System.out.println("\n\t\t<사파리존에 어서오세요!>\n");
        System.out.println("\t\t┌────게임 메뉴────┐");
        System.out.println("\t\t\t1. 상점");
        System.out.println("\t\t\t2. 정원");
        System.out.println("\t\t\t3. 포획");
        System.out.println("\t\t\t4. 배틀");
        System.out.println("\t\t\t5. 프로필");
        System.out.println("\t\t\t6. 저장");
        System.out.println("\t\t\t7. 나가기");
        System.out.println("\t\t└────────────────┘");

    }
}
