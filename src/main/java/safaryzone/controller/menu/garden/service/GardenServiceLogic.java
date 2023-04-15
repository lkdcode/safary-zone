package safaryzone.controller.menu.garden.service;

import safaryzone.user.Player;

public class GardenServiceLogic {
    public boolean checkCapacity() {
        int[][] garden = Player.getInstance().getGarden().getCountMap();
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j] == 0) return false;
            }
        }

        return true;
    }
}
