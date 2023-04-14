package controller;


public class InputValidate {

    public boolean menuNumber(String inputMenuNumber) {
        if (inputMenuNumber.equals("1")
                || inputMenuNumber.equals("2")
                || inputMenuNumber.equals("3")
                || inputMenuNumber.equals("4")
                || inputMenuNumber.equals("5")
                || inputMenuNumber.equals("6")
                || inputMenuNumber.equals("7")
        ) return true;
        return false;
    }
}
