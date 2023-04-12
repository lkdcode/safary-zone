package controller.menu.garden.view;

import java.util.Arrays;

public class ArrayToString {

    int[] arr;

    public ArrayToString(int[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "{"+ Arrays.toString(arr) + "}";
    }
}
