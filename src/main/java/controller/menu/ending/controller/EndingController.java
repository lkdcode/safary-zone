package controller.menu.ending.controller;

import controller.menu.ending.service.EndingServiceLogic;
import controller.menu.ending.view.OutputView;

public class EndingController {
    private final EndingServiceLogic endingServiceLogic;
    private final OutputView outputView;

    public EndingController() {
        this.endingServiceLogic = new EndingServiceLogic();
        this.outputView = new OutputView();
    }

    public void check() {
        // 특정 조건을 계속 체크
        // 열매가 모두 1이상이어야 하고
        // 플레이어의 레벨이 10이어야한다

        if (endingServiceLogic.check()) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("엔딩 조건 달성 완료!!!!!!!!!!!!!!!!!!!");
            System.out.println("전설의 포켓몬을 하나 얻습니다!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
