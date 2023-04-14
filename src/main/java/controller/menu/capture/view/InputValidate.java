package controller.menu.capture.view;


/**
 * 유저로부터 입력받은 값의 유효성 검사
 */
public class InputValidate {


    public boolean menuNumber(String inputMenuNumber) {
        if (inputMenuNumber.equals("1") || inputMenuNumber.equals("2") || inputMenuNumber.equals("3")) return true;
        return false;
    }


}
