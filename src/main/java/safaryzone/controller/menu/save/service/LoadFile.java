package safaryzone.controller.menu.save.service;

import safaryzone.controller.menu.save.Path;
import safaryzone.controller.menu.save.view.InputView;
import safaryzone.controller.menu.save.view.OutputView;
import safaryzone.user.Player;

import java.io.*;

import static safaryzone.controller.menu.save.Path.PATH;

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

    public boolean loadFile(String fileName) {
        try (FileInputStream fis
                     = new FileInputStream(PATH + "/" + fileName + ".sav")) {

            ObjectInputStream ois = new ObjectInputStream(fis);
            Player.load((Player) ois.readObject());

        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }

}
