package safaryzone.controller.menu.help.view;

import safaryzone.common.MakeCommon;

public class OutputView {
    private final int MILLIS = 5;

    public void welcome() {
        System.out.println("매뉴를 선택해주세요!");
        System.out.println("🔸 1️⃣ 상점가기 이용하는 방법");
        System.out.println("🔸 2️⃣ 정원 가꾸러 가기 이용하는 방법");
        System.out.println("🔸 3️⃣ 포획하기 이용하는 방법");
        System.out.println("🔸 4️⃣ 배틀라운드 이용하는 방법");
        System.out.println("🔸 5️⃣ 진화 이용하는 방법");
        System.out.println("🔸 6️⃣ 내 정보 보기 이용하는 방법");
        System.out.println("🔸 7️⃣ 저장/불러오기 이용하는 방법");
        System.out.println("🔸 0️⃣ 메인 메뉴로 돌아가기..");
    }

    public void shopHelp() {
        String message = "\n\n🏪 상점 이용하는 방법 .....🚶\n\n";
        message += "1. 플레이어는 전투에서 획득한 머니로 [몬스터볼] 과 [열매] 를 구매할 수 있습니다.\n";
        message += "2. 구매할 수 있는 아이템은 다음과 같습니다.\n";
        message += "🔴 [일반 몬스터 볼] - 1200머니\n";
        message += "⚫️ [하이퍼 몬스터 볼] - 5000머니\n";
        message += "🟣 [마스터 몬스터 볼] - 7500머니\n";
        message += "🍇 [블루 베리] - 1000머니\n";
        message += "🍓 [라즈 베리] - 1200머니\n";
        message += "♠️ [블랙 베리] - 1500머니\n\n";
        message += "3. 구매하려는 아이템이 보유한 머니보다 비쌀 경우, 구매할 수 없습니다.\n";
        message += "4. 열심히 머니를 모아서 좋은 아이템을 획득해봅시다!\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void gardenHelp() {
        String message = "\n\n🌼 정원 이용하는 방법 .....🚶\n\n";
        message += "1. 플레이어는 상점에서 구입한 열매를 정원에 심을 수 있습니다.\n";
        message += "2. 정원은 5X5 배열로 플레이어가 선택한 위치에 열매가 심어집니다.\n";
        message += "3. 열매를 심었을 때, 보너스 열매가 주변에 심어집니다.\n";
        message += "👉 블루베리 : 30% 확률로 [좌, 우] 에 보너스 열매가 심어집니다.\n";
        message += "👉 라즈베리 : 20% 확률로 [상, 하] 에 보너스 열매가 심어집니다.\n";
        message += "👉 블랙베리 : 10% 확률로 [상, 하, 좌, 우] 에 보너스 열매가 심어집니다.\n\n";
        message += "4. 이미 열매가 심어져있는 곳에는 열매를 심을 수 없습니다.\n";
        message += "5. 열매를 심은 후, 포획을 5회 진행하면 해당 열매는 사라집니다.\n";
        message += "6. 4번 사항을 유의하며 정원을 가득 채워봅시다!\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void captureHelp() {
        String message = "\n\n🎣 포획하기 이용하는 방법 .....🚶\n\n";
        message += "1. 입장하면 랜덤하게 포켓몬이랑 만나게 됩니다!\n";
        message += "2. 플레이어는 포켓몬에게 볼을 던지거나 가까이 다가갈 수 있습니다!\n";
        message += "👉 볼은 던지면 포켓몬을 포획할 수 있습니다\n";
        message += "👉 🔴NORMAL볼, 🟡HYPER볼, 🟣MASTERBALL 순으로 포획할 확률이 높습니다\n";
        message += "👉 🪄볼이 다 떨어지면 포획할 수 없게 되므로 꼭 챙기세요!\n";
        message += "👉 포획하기 어렵다면 먼저 다가가보세요👣👣!\n";
        message += "👉 포켓몬에게 다가가면 잡기 쉬워집니다🎯🎯!\n";
        message += "👉 대신 다가가기에 실패하면 포켓몬이 플레이어를 발견해 도망칩니다🏃🏃!\n\n";
        message += "3. 포획한 포켓몬은 📋보유한 포켓몬📋에 추가됩니다!\n";
        message += "4. 다양한 포켓몬을 잡아봅시다! 어쩌면 ⭐⭐귀한 포켓몬⭐⭐을 만날지도...?!\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void battleHelp() {
        String message = "\n\n🥊 배틀라운드 이용하는 방법 .....🚶\n\n";
        message += "1. 플레이어의 레벨에 따라 만날 수 있는 몬스터의 등급이 달라집니다!\n";
        message += "👉 Lv1~3 : Normal 95%, Rare 4%, Finally 1%\n";
        message += "👉 Lv4~7 : Normal 30%, Rare 60%, Finally 10%\n";
        message += "👉 Lv8~10 : Normal 10%, Rare 60%, Finally 30%\n\n";
        message += "2. 속성에 따라 추가 데미지가 적용됩니다.\n";
        message += "👉 [불 🔥] 속성은 [풀 🍀] 속성에게 강합니다!\n";
        message += "👉 [물 🌊] 속성은 [불 🔥] 속성에게 강합니다!\n";
        message += "👉 [풀 🍀] 속성은 [물 🌊] 속성에게 강합니다!\n";
        message += "👉 [전기 ⚡️] 속성은 [물 🌊] 속성에게 강합니다!\n\n";
        message += "3. 배틀에서 승리하면 일정 확률로 야생 포켓몬을 획득합니다.\n";
        message += "4. 배틀에서 승리하면 일정 금액을 획득합니다.\n";
        message += "5. 배틀에서 승리하면 참가한 포켓몬스터의 레벨이 오릅니다.(최대 10)\n";
        message += "6. 배틀에서 승리하면 플레이어의 경험치가 오릅니다.\n";
        message += "\n\n";
        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }


    public void evolution() {
        String message = "\n\n🪫 진화 이용하는 방법 .....🚶\n\n";
        message += "1. 현재 보유한 포켓몬스터 중 진화가 가능한 포켓몬스터의 정보를 볼 수 있습니다.\n";
        message += "2. 진화할 포켓몬스터의 이름을 입력하여 진화시킬 수 있습니다.\n";
        message += "👉 포켓몬스터의 레벨이 10이 되면 진화할 수 있습니다.\n\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }


    public void informationHelp() {
        String message = "\n\n🏪 내 정보 보기 이용하는 방법 .....🚶\n\n";
        message += "📂 내 정보 보는 방법 📂\n";
        message += "1. 이 곳에서 🪪플레이어의 정보를 볼 수 있습니다!\n";
        message += "2. 보고 싶은 메뉴의 번호를 입력해주세요!\n";
        message += "👉 1️⃣ 플레이어가 현재 가지고 있는 📕볼 📗열매 📘게임 머니 📙계정 레벨을 보여줍니다!\n";
        message += "👉 2️⃣ 플레이어가 가지고 있는 📖모든 포켓몬들의 상세 스텟📖을 보여줍니다!\n";
        message += "👉 0️⃣ 메인 메뉴로 돌아갑니다↪️↪️!\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void saveHelp() {
        String message = "\n\n💿 저장 / 불러오기 이용하는 방법 .....🚶\n\n";
        message += "1. 게임을 하다가 갑자기 바쁜 일이 생겨도 걱정하지마세요!\n";
        message += "2. [저장하기] 에서 플레이어는 진행하던 게임을 내 컴퓨터에 저장해둘 수 있습니다.\n";
        message += "3. [불러오기] 에서 저장해두었던 파일 이름을 입력하여, 진행하던 게임을 불러올 수 있습니다.\n";
        message += "\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }

    public void exit() {
        String message = "\n\n메인 메뉴로 가는 중......🚶\n\n";

        MakeCommon.dottedPrint(message, MILLIS);
        MakeCommon.stopLine();
    }
}
