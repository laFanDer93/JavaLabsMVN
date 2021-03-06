package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automata {
    private String pathname = "C:\\Users\\sham\\IdeaProjects\\JavaLabsMvn\\src\\main\\resources\\drinks";
    private int cash;
    private States states = States.OFF;
    private final File file = new File(pathname);
    private final List<String> menu = new ArrayList<>();
    private final List<Integer> prices = new ArrayList<>();
    private final StringBuilder fullMenu = new StringBuilder();
    private int myChoice;
    private int change = 0; //сдача

    {
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            menu.add(s.substring(0, s.indexOf(":")));
            prices.add(Integer.parseInt(s.substring(s.indexOf(':') + 1)));
        }
        for (int i = 0; i < menu.size(); i++) {
            fullMenu.append(menu.get(i) + " cost --> " + prices.get(i) + " RUB \n");
        }
    }
//
//    on() - включение автомата;
//    off() - выключение автомата;
//    coin() - занесение денег на счёт пользователем;
//    getMenu() - отображение меню с напитками и ценами для пользователя;
//    getState() - отображение текущего состояния для пользователя;

//    choice() - выбор напитка пользователем;
//    check() - проверка наличия необходимой суммы;
//    cancel() - отмена сеанса обслуживания пользователем;
//    cook() - имитация процесса приготовления напитка;
//    finish() - завершение обслуживания пользователя.


    public void on() {
        if (states == States.OFF) {
            states = States.WAIT;
        }
    }

    public void off() {
        if (states == States.WAIT) {
            states = States.OFF;
        }
    }

    public void coin(int cash) {
        if (states == States.WAIT || states == States.ACCEPT) {
            states = States.ACCEPT;
            this.cash += cash;
        }
    }

    public StringBuilder getMenu() {
        return fullMenu;
    }

    public int getCash() {
        return cash;
    }

    public int getChange() {
        return change;
    }

    public States getState() {
        return states;
    }

    public void choice(int numOfMenu) {
        if (states == States.ACCEPT) {
            myChoice = numOfMenu - 1;
            states = States.CHECK;
            check();
        }
    }

    public void check() {
        if (states == States.CHECK) {
            if (cash < prices.get(myChoice)) {
                cancel();
            } else if (cash >= prices.get(myChoice)) {
                cook();
            }
        }
    }

    public void cancel() {
        if (states == States.ACCEPT) {
            states = States.WAIT;
            myChoice = 0;
            cash = 0;
        } else if (states == States.CHECK) {
            states = States.WAIT;
            myChoice = 0;
            cash = 0;
        }
    }

    public void cook() {
        if (states == States.CHECK) {
            cash -= prices.get(myChoice);
            states = States.COOK;
            finish();
        }
    }

    public void finish() {
        if (states == States.COOK) {
            states = States.WAIT;
            change = cash;
            cash = 0;
        }
    }

    @Override
    public String toString() {
        return "Automata{" +
                "cash=" + cash +
                ", states=" + states +
                ", myChoice=" + myChoice +
                ", menu=" + menu.get(myChoice) +
                '}';
    }
}
