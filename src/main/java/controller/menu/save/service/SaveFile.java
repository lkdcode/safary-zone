package controller.menu.save.service;

import controller.menu.save.Path;
import controller.menu.save.view.InputView;
import controller.menu.save.view.OutputView;
import user.Player;

import java.io.*;

/**
 * 유저의 데이터를 라이브러리 폴더에 저장하는 클래스
 * - 이미 데이터가 있는 경우: 기존파일 삭제하고 업데이트된 파일 저장
 * - 데이터가 없는 경우: 새로 저장
 */
public class SaveFile {

    private final InputView inputView;
    private final OutputView outputView;

    public SaveFile() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void saveFile() {

        // 기존 플레이어 객체 가져오기
        Player savePlayer = Player.getInstance();
        // 저장할 파일명 입력
        outputView.saveFileName();
        String name = inputView.inputFileName();
        // 입력한 파일명으로 기존 플레이어 객체 저장
        try (FileOutputStream fos
                     = new FileOutputStream(Path.USER_SAVE_PATH + "/" + name + ".sav")) {
            // 객체 저장
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(savePlayer);
        } catch (FileNotFoundException e) {
            System.out.println("❌ 파일 저장 처리에 실패했습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("❌ 출력 시스템에 문제가 생겼습니다.");
            e.printStackTrace();
        }
    }
}
