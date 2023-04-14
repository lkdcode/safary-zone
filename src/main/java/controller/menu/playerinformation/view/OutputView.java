package controller.menu.playerinformation.view;

import controller.menu.playerinformation.PlayerInformationServiceLogic;
import user.Inventory;
import user.Player;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {


    public void showPokemonList(String pokemonList) {
        System.out.println(pokemonList);
    }

    public void showPlayerMenu() {
        System.out.println("플레이어의 정보입니다");
        System.out.println("1. 인벤토리, 계정 레벨");
        System.out.println("2. 보유 포켓몬");
        System.out.println("3. 나가기");
    }

    public void backToMain() {
        System.out.println("메인화면으로 돌아갑니다");
    }

    public void showPlayerInventory(){
        Inventory inventory = Player.getInstance().getInventory();
        System.out.println("<<플레이어 인벤토리>>");
        System.out.println(inventory.getBallPouch().getBallPouch().toString());
        System.out.println(inventory.getBerryPouch().getBerryPouch().toString());
        System.out.printf("용돈: %d원\n\n", inventory.getMoney());

    }
    public void showPlayerLevel(){
        System.out.printf("플레이어 레벨: Lv.%s\n\n",Player.getInstance().getLevel());
    }

}