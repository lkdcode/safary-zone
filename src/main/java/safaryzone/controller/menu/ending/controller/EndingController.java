package safaryzone.controller.menu.ending.controller;

import safaryzone.controller.menu.ending.service.EndingServiceLogic;
import safaryzone.controller.menu.ending.view.OutputView;

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
