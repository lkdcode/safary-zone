package controller;

import controller.menu.garden.controller.GardenController;
import controller.menu.save.service.LoadFile;
import controller.menu.save.service.SaveFile;
import controller.menu.shop.controller.ShopController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveLoadTest_Yewon {

    public static void main(String[] args) {

        SaveFile saveFile = new SaveFile();
        LoadFile loadFile = new LoadFile();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num;
        System.out.println("1 열매심기 2 상점 3 저장 4 불러오기");
        try {
            num = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        switch (num) {
            case "1": new GardenController().start();break;
            case "2": new ShopController().start(); break;
            case "3": saveFile.saveFile(); break;
            case "4": loadFile.loadFile(); new ShopController().start(); break;
            default:
                System.out.println("default");
        }

    }
}
