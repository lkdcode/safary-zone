package View;


import static common.MakeCommon.*;

public class OutputView {
    private final int MILLIS = 30;

    public void welcome() {
        System.out.println("  🐶🐱🐭🐹🐰🦊🐻🐼🐨🐯🦁🐮🐷🐸🐵");
        System.out.println("➖➖➖➖➖ Safary - Zone ➖➖➖➖➖");
        System.out.println("🔻 사파리 존에 오신 여러분들을 환영합니다.");
        System.out.println("🔻 포켓몬스터와 함께 성장하는 게임입니다.");
        System.out.println("🔻 상점에서 씨앗을 사서 정원을 가꾸고,");
        System.out.println("🔻 몬스터 볼로 다양한 포켓몬들을 포획해보세요.");
        System.out.println("🔻 야생의 포켓몬스터와 대결도 할 수 있습니다.");
        System.out.println("🔻 전설의 포켓몬도 획득할 수 있습니다!");
        System.out.println("➖➖➖➖➖  Pokemonster  ➖➖➖➖➖");
        System.out.println("  🐵🐸🐷🐮🦁🐯🐨🐼🐻🦊🐰🐹🐭🐱🐶\n\n\n");
    }

    public void menu() {
        System.out.println("➖➖➖➖➖  메인 메뉴  ➖➖➖➖➖");
        System.out.println("🔻 1번 상점가기");
        System.out.println("🔻 2번 정원 가꾸러 가기");
        System.out.println("🔻 3번 포획하기");
        System.out.println("🔻 4번 배틀라운드");
        System.out.println("🔻 5번 내 정보 보기");
        System.out.println("🔻 6번 저장/불러오기");
        System.out.println("🔻 7번 종료하기\n");
        System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");

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
