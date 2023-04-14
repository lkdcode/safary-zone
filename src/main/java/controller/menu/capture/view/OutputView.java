package controller.menu.capture.view;

/**
 * 콘솔에 출력하는 역할
 */
public class OutputView {

    private final String Capture ="[1. 포획]";
    private final String GoNear ="[2.다가간다]";
    private final String RunAway ="[3.도망간다]";

    private final String ChooseBall = "===========볼을 고르세요!===========";
    private final String MonsterBall = "➡️몬스터볼";
    private final String HyperBall = "➡️하이퍼볼";
    private final String MasterBall = "➡️마스터볼";
    private final String ThrowBall = "을 던졌다!";



    public void menu() {

        //메뉴에 들어갈 항목
        //1. 포획
        //2. 다가간다 (go near)
        //3. 도망간다 (Capture 종료)
//        print(Capture);
//        print(GoNear);
//        println(RunAway);
        System.out.println("[1.포획] [2.다가간다] [3.도망간다]");
    }

    public void showMonsterBallMenu(){
        print(MonsterBall);
        print(HyperBall);
        print(MasterBall);
    }

    private void print(String message) {
        System.out.print(message+"\t");
    }
    private void println(String message) {
        System.out.println(message);
    }

    /**
     * TODO : 도망갔을 때 capture를 아예 나갈지 아니면 capture를 다시 실행할지 고민입니다
     * */
    public void exit() {
        System.exit(0);
    }

    public void selectBall() {
        println(ChooseBall);
        showMonsterBallMenu();



    }
}