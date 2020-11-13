package lab5;

public enum States {
    OFF("Выключено"),
    WAIT("Ожидание"),
    ACCEPT("Прием денег"),
    CHECK("Проверка наличности"),
    COOK("Приготовление");

    private String statesName;

    States(String statesName) {
        this.statesName = statesName;
    }

    public String getStatesName() {
        return statesName;
    }

    @Override
    public String toString() {
        return statesName;
    }
}
