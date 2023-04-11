package controller.menu.shop.service;

public interface TradeItem<T> {
    boolean isEnoughMoney(T t, int quantity);
}