package controller.menu.ending.service;

import user.Player;

public class EndingServiceLogic {


    public boolean check() {
        return (checkGarden() && checkGarden());
    }


    private boolean checkLevel() {
        return Player.getInstance().getLevel() == 10;
    }

    private boolean checkGarden() {
        int[][] checkGarden = Player.getInstance().getGarden().getCountMap();

        for (int i = 0; i < checkGarden.length; i++) {
            for (int j = 0; j < checkGarden[i].length; j++) {
                if (checkGarden[i][j] == 0) return false;
            }
        }

        return true;
    }

}
