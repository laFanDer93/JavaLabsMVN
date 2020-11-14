package lab1;

//Напишите программу, которая будет считывать
//из командной строки число (например 41072819) и выводить его в виде символов "*"

public class Task5 {
    public static void main(String[] args) {
        String input = "165409";
        char[] str = input.toCharArray();

        Figure figure=new Figure();
        figure.choiceNumber(str);

        for (String line:figure.picture) {
            System.out.println(line);
        }
    }

    }

class Figure{
    String zero[] = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
    };

    String one[] = {
            "  *  ",
            " **  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            " *** "
    };

    String two[] = {
            "  ***  ",
            " *   * ",
            " *  *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " ***** "
    };

    String three[] = {
            "  **  ",
            " *  * ",
            "    * ",
            "  **  ",
            "    * ",
            " *  * ",
            "  **  "
    };

    String four[] = {
            "    * ",
            "   ** ",
            "  * * ",
            " *  * ",
            " **** ",
            "    * ",
            "    * "
    };

    String five[] = {
            " ***** ",
            " *     ",
            " ****  ",
            "     * ",
            "     * ",
            " *   * ",
            "  ***  "
    };

    String six[] = {
            "    * ",
            "   *  ",
            "  *   ",
            " ***  ",
            " *  * ",
            " *  * ",
            " ***  "
    };

    String seven[] = {
            " ***** ",
            "     * ",
            "    *  ",
            "   *   ",
            "  *    ",
            " *     ",
            " *     "
    };

    String eight[] = {
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  ",
            " *   * ",
            " *   * ",
            "  ***  "
    };

    String nine[] = {
            "  *** ",
            " *  * ",
            " *  * ",
            "  *** ",
            "   *  ",
            "  *   ",
            " *    "
    };
    static String[] picture = new String[7];

    static {
        for (int i = 0; i < picture.length; i++)
            picture[i] = "";
    }

    void createPicture(String[] line) {
        for (int i = 0; i < picture.length; i++)
            picture[i] += line[i] + " ";
    }

    void choiceNumber(char[] str) {

        for (char symbol : str) {
            switch (symbol) {
                case '0':
                    createPicture(zero);
                    break;
                case '1':
                    createPicture(one);
                    break;
                case '2':
                    createPicture(two);
                    break;
                case '3':
                    createPicture(three);
                    break;
                case '4':
                    createPicture(four);
                    break;
                case '5':
                    createPicture(five);
                    break;
                case '6':
                    createPicture(six);
                    break;
                case '7':
                    createPicture(seven);
                    break;
                case '8':
                    createPicture(eight);
                    break;
                case '9':
                    createPicture(nine);
                    break;
                default: {
                    System.out.println("NaN");
                    return;
                }
            }
        }
    }
}

