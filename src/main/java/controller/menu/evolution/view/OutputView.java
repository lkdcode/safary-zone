package controller.menu.evolution.view;

import static common.MakeCommon.dottedPrint;
import static common.MakeCommon.stopLine;

public class OutputView {
    private final int MILLIS = 10;

    public void welcome() {
        String message = "\n\n🥼 오박사 : 오랜만이구나 ...!\n\n";
        message += "😀 그래, 포켓몬은 잘 키우고 있겠지?\n";
        message += "😃 궁금한게 있으면 뭐든 물어보려무나!\n\n";
        dottedPrint(message, MILLIS);
        stopLine();
    }

    public void menu() {
        String message = "";
        message += "1️⃣ 진화 가능한 포켓몬스터 목록 보기\n";
        message += "2️⃣ 진화 시키기\n";
        message += "0️⃣ 돌아가기\n\n";
        dottedPrint(message, MILLIS);
    }

    public void evolutionList(String evolutionList) {
        if (evolutionList.equals("")) {
            System.out.println("\n❌ 진화 가능한 포켓몬이 없습니다.\n\n");
            return;
        }

        String message = "➖➖➖➖ 진화 가능한 포켓몬 리스트 ➖➖➖➖\n\n";
        message += evolutionList;
        message += "➖➖➖➖➖ ➖➖➖➖➖➖ ➖➖➖➖➖\n\n";

        dottedPrint(message, MILLIS);
    }

    public void notEvolution() {
        System.out.println("\n❌ 진화 가능한 포켓몬이 없습니다.");
        System.out.println("메인 메뉴로 돌아갑니다.\n\n");
    }

    public void evolution() {
        String message = "";
        message += "👉 진화 시킬 포켓몬스터의 이름을 입력하세요.\n";
        dottedPrint(message, MILLIS);

    }

    public void successEvolution() {
        String message = "";
        message += "\n\n🪫 진화에 성공하였습니다 !!!\n";
        message += "ℹ️ 내 정보 보기에서 확인해보세요!! 😀\n\n";
        dottedPrint(message, MILLIS);
    }
}
