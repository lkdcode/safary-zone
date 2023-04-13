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
                if (inputValidate.menuNumberValidate(inputMenuNumber)) return inputMenuNumber;
                ErrorMessage.GARDEN_MENU.print();
            } catch (IOException e) {
                ErrorMessage.UNKNOWN_ERROR.print();
            }
        }
    }

    public String inputPlantingMenu() {
        while(true) {
            try {
                String inputMenuNumber = br.readLine();
                if (inputValidate.PlantingMenuNumberValidate(inputMenuNumber)) return inputMenuNumber;
                ErrorMessage.GARDEN_MENU.print();
            } catch (IOException e) {
                ErrorMessage.UNKNOWN_ERROR.print();
            }
        }
    }

    public int inputPlantLocation() {
        while (true) {
            try {
                // 열매를 심을 가로 또는 세로 위치 입력 (1~5)
                int rowOrColumn = Integer.parseInt(br.readLine());
                // 범위 안의 숫자를 입력했는지 검사
                // 1 ~ 5 사이로 입력했을 시 입력한 위치를 리턴
                // 잘못 입력했으면 반복문 처음으로 돌아가서 재입력 요청
                if (!inputValidate.PlantingLocationValidate(rowOrColumn)) {
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
        while (true) {
            try {
                System.out.println("✔ 열매를 더 심으시겠습니까? [ 1. 네 / 2. 아니오 ]");
                answer = br.readLine();
                if(!inputValidate.answerValidate(answer)) {
                    ErrorMessage.GARDEN_MENU.print();
                    continue;
                }
                break;
            } catch (IOException e) {
                ErrorMessage.UNKNOWN_ERROR.print();
            }
        }
        return answer;
    }
}
