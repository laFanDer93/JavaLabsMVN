package lab2;

public class Test {
    public static void main(String[] args) {
        Automata automata = new Automata();
        System.out.println(automata.getMenu());

        automata.on();
        System.out.println(automata);
        automata.coin(130);
        System.out.println(automata);
        automata.choice(2);
        System.out.println(automata);
        System.out.println(automata.getMenu());


    }}
