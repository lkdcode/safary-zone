package controller.menu.esteregg;

import common.MakeCommon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static common.MakeCommon.*;

/**
 * 이스터 에그!!
 */
public class EsterEgg {
    private final BufferedReader br;

    public EsterEgg() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
    }

    public void inputKey() {
        timeSleep();
        System.out.println("\n");
        dottedPrint("?\n", 1000);
        System.out.println("너 개발자구나?");
        timeSleep();

        dottedPrint(".\n", 800);
        dottedPrint(".\n", 800);
        dottedPrint(".\n", 800);
        dottedPrint("\n", 500);
        dottedPrint("\n", 500);
        dottedPrint("\n", 500);
        String hint = "....(char) 74 + 89 + 87 + \\n + 76 + 74 + 70 + \\n + 76 + 75 + 68 + \\n\n";

        dottedPrint(hint, 50);

        try {
            String inputFirstKey = br.readLine();
            String inputSecondKey = br.readLine();
            String inputThirdKey = br.readLine();
            timeSleep();
            timeSleep();
            checkKey(inputFirstKey, inputSecondKey, inputThirdKey);
        } catch (IOException e) {

        }
    }

    private void checkKey(String firstKey, String secondKey, String thirdKey) {
        if (firstKey.equalsIgnoreCase("JYW")
                && secondKey.equalsIgnoreCase("LJF")
                && thirdKey.equalsIgnoreCase("LKD")) {

            StringBuilder message = new StringBuilder();
            message.append("☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡˚✩☁︎︎⋆｡\n")
                    .append("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀\n")
                    .append("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                            "█░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀██████░\n" +
                            "░░░░░░░░░░░▀█▄█▄███▀░░░ ▀██▄█▄███▀░\n\n")
                    .append("\n" +
                            "______                     _                                    ___ __   __ _    _ \n" +
                            "|  _  \\                   | |                            _     |_  |\\ \\ / /| |  | |\n" +
                            "| | | |  ___ __   __  ___ | |  ___   _ __    ___  _ __  (_)      | | \\ V / | |  | |\n" +
                            "| | | | / _ \\\\ \\ / / / _ \\| | / _ \\ | '_ \\  / _ \\| '__|          | |  \\ /  | |/\\| |\n" +
                            "| |/ / |  __/ \\ V / |  __/| || (_) || |_) ||  __/| |     _   /\\__/ /  | |  \\  /\\  /\n" +
                            "|___/   \\___|  \\_/   \\___||_| \\___/ | .__/  \\___||_|    (_)  \\____/   \\_/   \\/  \\/ \n" +
                            "                                    | |                                            \n" +
                            "                                    |_|                                            \n\n\n")
                    .append("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                            "█░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀██████░\n" +
                            "░░░░░░░░░░░▀█▄█▄███▀░░░ ▀██▄█▄███▀░\n\n")
                    .append("\n" +
                            "______                     _                                  _        ___ ______ \n" +
                            "|  _  \\                   | |                            _   | |      |_  ||  ___|\n" +
                            "| | | |  ___ __   __  ___ | |  ___   _ __    ___  _ __  (_)  | |        | || |_   \n" +
                            "| | | | / _ \\\\ \\ / / / _ \\| | / _ \\ | '_ \\  / _ \\| '__|      | |        | ||  _|  \n" +
                            "| |/ / |  __/ \\ V / |  __/| || (_) || |_) ||  __/| |     _   | |____/\\__/ /| |    \n" +
                            "|___/   \\___|  \\_/   \\___||_| \\___/ | .__/  \\___||_|    (_)  \\_____/\\____/ \\_|    \n" +
                            "                                    | |                                           \n" +
                            "                                    |_|                                           \n\n\n")


                    .append("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n" +
                            "█░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀██████░\n" +
                            "░░░░░░░░░░░▀█▄█▄███▀░░░ ▀██▄█▄███▀░\n\n")
                    .append("\n" +
                            "______                     _                                  _      _   ________ \n" +
                            "|  _  \\                   | |                            _   | |    | | / /|  _  \\\n" +
                            "| | | |  ___ __   __  ___ | |  ___   _ __    ___  _ __  (_)  | |    | |/ / | | | |\n" +
                            "| | | | / _ \\\\ \\ / / / _ \\| | / _ \\ | '_ \\  / _ \\| '__|      | |    |    \\ | | | |\n" +
                            "| |/ / |  __/ \\ V / |  __/| || (_) || |_) ||  __/| |     _   | |____| |\\  \\| |/ / \n" +
                            "|___/   \\___|  \\_/   \\___||_| \\___/ | .__/  \\___||_|    (_)  \\_____/\\_| \\_/|___/  \n" +
                            "                                    | |                                           \n" +
                            "                                    |_|                                           \n\n\n")
                    .append("▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀\n\n")
                    .append("\n" +
                            "   ___        __        ___        __                       __      __ __                        _      ________ \n" +
                            " /'___`\\    /'__`\\    /'___`\\    /'__`\\                   /'__`\\   /\\ \\\\ \\                     /' \\    /\\_____  \\\n" +
                            "/\\_\\ /\\ \\  /\\ \\/\\ \\  /\\_\\ /\\ \\  /\\_\\L\\ \\                 /\\ \\/\\ \\  \\ \\ \\\\ \\                   /\\_, \\   \\/___//'/'\n" +
                            "\\/_/// /__ \\ \\ \\ \\ \\ \\/_/// /__ \\/_/_\\_<_                \\ \\ \\ \\ \\  \\ \\ \\\\ \\_                 \\/_/\\ \\      /' /' \n" +
                            "   // /_\\ \\ \\ \\ \\_\\ \\   // /_\\ \\  /\\ \\L\\ \\ __             \\ \\ \\_\\ \\  \\ \\__ ,__\\ __               \\ \\ \\   /' /'   \n" +
                            "  /\\______/  \\ \\____/  /\\______/  \\ \\____//\\_\\             \\ \\____/   \\/_/\\_\\_//\\_\\               \\ \\_\\ /\\_/     \n" +
                            "  \\/_____/    \\/___/   \\/_____/    \\/___/ \\/_/              \\/___/       \\/_/  \\/_/                \\/_/ \\//      \n" +
                            "                                                                                                                 \n" +
                            "                                                                                                                 \n");


            dottedPrint(message.toString(), 2);
            System.exit(0);
        }
    }

    private void timeSleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }


}
