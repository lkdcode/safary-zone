package safaryzone.controller.menu.save;

import java.io.File;

public interface Path {

    String SAVE_DIRECTORY = "user_library";
    String PATH = System.getProperty("user.dir")
            + File.separator
            + SAVE_DIRECTORY;
}
