package controller;


import static common.MakeCommon.*;

public class OutputView {
    private final int MILLIS = 30;

    //메인메뉴를 보여준다
    public void menu() {

        System.out.println("1번 매뉴");
        System.out.println("2번 매뉴");
        System.out.println("3번 매뉴");
        System.out.println("4번 매뉴");
        System.out.println("5번 매뉴");
        System.out.println("6번 매뉴");
        System.out.println("7번 매뉴");

    }

    public void welcome() {
        System.out.println("게임 사용 설명서 ....... 개요 등");
        System.out.println("게임 사용 설명서 ....... 개요 등");
        System.out.println("게임 사용 설명서 ....... 개요 등");
        System.out.println("게임 사용 설명서 ....... 개요 등");
        System.out.println("게임 사용 설명서 ....... 개요 등");
        System.out.println("게임 사용 설명서 ....... 개요 등");
    }

    public void shop() {
        String message = "\n\n🏪 상점으로 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void garden() {
        String message = "\n\n🌸 정원으로 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void capture() {
        String message = "\n\n🎣 포획하러 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void battle() {
        String message = "\n\n🤜 전투하러 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void information() {
        String message = "\n\nℹ️ 내 정보 보러 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void save() {
        String message = "\n\n📀 저장/불러오기하러 이동하는 중 .....🚶\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void isExit() {
        String message = "\n\n🤷 정말로 종료하시겠습니까? 🤷\n"
                + "[1️⃣ 종료] [2️⃣ 돌아가기]\n";
        dottedPrint(message, MILLIS);
    }

    public void exit() {
        String message = "\n\n🙋🙋🙋🙋‍👋✋ 종료되었습니다. ✋👋🙋🙋🙋\n\n";
        dottedPrint(message, MILLIS);
    }


}
