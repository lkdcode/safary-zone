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
        if (endingServiceLogic.check()) outputView.ending();
    }

}
