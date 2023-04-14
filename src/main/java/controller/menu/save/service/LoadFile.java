package controller.menu.save.service;

import controller.menu.save.Path;
import controller.menu.save.view.InputView;
import controller.menu.save.view.OutputView;
import user.Player;

import java.io.*;

/**
 * 저장되어있는 유저 데이터를 불러오는 클래스
 */
public class LoadFile {

    private final InputView inputView;
    private final OutputView outputView;
    private Player player;

    public LoadFile() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void loadFile() {

        // 불러올 파일명 입력
        outputView.loadFileName();
        String name = inputView.inputFileName();
        // 불러오기
        try (FileInputStream fis
                     = new FileInputStream(Path.USER_SAVE_PATH + "/" + name + ".sav")) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            Player.load((Player) ois.readObject());

        } catch (FileNotFoundException e) {
            // TODO : ErrorMessage enum 추가해야합니다.
            System.out.println("파일 찾을수없음!!");
        } catch (IOException e) {
            System.out.println("예외발생!!");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을수없음");
        }

    }

}
