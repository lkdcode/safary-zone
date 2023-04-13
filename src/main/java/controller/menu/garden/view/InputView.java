package controller.menu.garden.view;

import controller.menu.garden.exception.ErrorMessage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 유저로부터 입력을 받는 역할
 */
public class InputView {

    private final BufferedReader br;
    private final InputValidate inputValidate;

    public InputView() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.inputValidate = new InputValidate();
    }

    public String inputMenu() {

        while(true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputValidate.menuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.GARDEN_MENU.print();
        }
    }

    public String inputPlantingMenu() {

        while(true) {
            String inputMenuNumber = null;
            try {
                inputMenuNumber = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (inputValidate.PlantingMenuNumber(inputMenuNumber)) return inputMenuNumber;
            ErrorMessage.GARDEN_MENU.print();
        }
    }

    public int inputPlantLocation() {
        while (true) {
            try {
                // 열매를 심을 가로 또는 세로 위치 입력 (1~5) 5 0 1 2 3 4
                int rowOrColumn = Integer.parseInt(br.readLine());
                // 범위 안의 숫자를 입력했는지 검사
                // 잘못 입력했으면 반복문 처음으로 돌아가기
                if (!inputValidate.PlantingLocation(rowOrColumn)) {
                    ErrorMessage.PLANT_LOCATION.print();
                    continue;
                }
                return rowOrColumn;
            } catch (IOException e) {
                ErrorMessage.UNKNOWN_ERROR.print();
            } catch (NumberFormatException e) {
                ErrorMessage.PLANT_LOCATION.print();
            }
        }
    }

    public String plantingMore() {
        String answer = null;
        System.out.println("✔ 열매를 더 심으시겠습니까? [ 1. 네 / 2. 아니오 ]");
        // 범위 안의 숫자를 입력했는지 검사
        while (true) {
            try {
                answer = br.readLine();
                if(!inputValidate.answerValidate(answer)) {
                    ErrorMessage.GARDEN_MENU.print();
                }
            } catch (IOException e) {
                ErrorMessage.UNKNOWN_ERROR.print();
                break;
            }
            break;
        }
        return answer;
    }
}
