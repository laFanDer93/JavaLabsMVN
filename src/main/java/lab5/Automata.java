package lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Automata {

    private int cash;
    private States states = States.OFF;
    private final File file = new File("C:\\Users\\sham\\IdeaProjects\\JavaLabsMvn\\src\\main\\resources\\drinks");
    private final List<String> menu = new ArrayList<>();
    private final List<Integer> prices = new ArrayList<>();
    private final StringBuilder fullMenu = new StringBuilder();
    private int myChoice;
    private String statesInClass="";

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


    public List<Integer> getPrices() {
        return prices;
    }

    public String getStatesInClass() {
        return statesInClass;
    }

    public void on() {
        if (states == States.OFF) {
            states = States.WAIT;
            statesInClass+=("Включили аппарат\n");
        }
    }

    public void off() {
        if (states == States.WAIT) {
            states = States.OFF;
            statesInClass="";
            statesInClass+=("Выключили аппарат\n");


        }
    }

    public void coin(int cash) {
        if (states == States.WAIT || states == States.ACCEPT) {
            states = States.ACCEPT;
            this.cash += cash;
            statesInClass+=("Принято " + cash + " рублей\n");

        }
    }

    public List<String> getMenuString(){
        return menu;
    }
    public StringBuilder getMenu() {
        return fullMenu;
    }

    public States getState() {
        return states;
    }

    public void choice(int numOfMenu) {
        if (states == States.ACCEPT) {
            myChoice = numOfMenu - 1;
            states = States.CHECK;
            statesInClass+=("Ваш выбор " + getMenuString().get(numOfMenu-1)+"\n");
            check();
        }
    }

    public void check() {
        statesInClass+=("Проверяем, достаточно ли денег\n");
        if (states == States.CHECK) {
            if (cash < prices.get(myChoice)) {
                statesInClass+=("Недостаточно средств\n");
                 cancel();
            } else if (cash >= prices.get(myChoice)) {
                statesInClass+=("Готовим!\n");
                cook();
            }
        }
    }

    public void cancel() {
        statesInClass+=("Отмена!\n");
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
            statesInClass+=("Ваша сдача = "+cash+" рублей.\n");
            statesInClass+=("Приятного кофепития!\n");
            finish();
        }
    }

    public void finish() {
        if (states == States.COOK) {
            states = States.WAIT;
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
