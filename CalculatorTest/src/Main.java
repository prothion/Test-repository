import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner expression = new Scanner(System.in);
        String x = expression.nextLine();
        calc(x);
    }
    public static String calc(String input) throws IOException {
        String [] elements = input.split(" ");
        if (elements.length != 3) {
            if (elements.length>3) {
                try {
                    throw new IOException();
                } catch (Exception e) {
                    System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                }
            }
            else {
                try {
                    throw new IOException();
                } catch (Exception e) {
                    System.out.println("throws Exception //т.к. строка не является математической операцией");
                }
            }
        }
        else {
            String operator = elements[1];
            operator = findOper(operator);
            String term1 = elements[0];
            String term2 = elements[2];
            String firstNumb = findingTerm(term1);
            String secondNumb = findingTerm(term2);
            boolean check = cheking(firstNumb, secondNumb);
            if (check) {
                int answer = answer(firstNumb, secondNumb, operator);
            }
        }
        return "";
    }


    private static boolean cheking (String firstNumb, String secondNumb) {
        boolean check = true;
        if (firstNumb.indexOf("10") == 0 || firstNumb.indexOf("9") == 0 || firstNumb.indexOf("8") == 0 || firstNumb.indexOf("7") == 0 || firstNumb.indexOf("6") == 0 || firstNumb.indexOf("5") == 0 || firstNumb.indexOf("4") == 0 || firstNumb.indexOf("3") == 0 || firstNumb.indexOf("2") == 0 || firstNumb.indexOf("1") == 0) {
            if (secondNumb.lastIndexOf("X") == 0 || secondNumb.lastIndexOf("IX") == 0 || secondNumb.lastIndexOf("VIII") == 0 || secondNumb.lastIndexOf("VII") == 0 || secondNumb.lastIndexOf("VI") == 0 || secondNumb.lastIndexOf("V") == 0 || secondNumb.lastIndexOf("IV") == 0 || secondNumb.lastIndexOf("III") == 0 || secondNumb.lastIndexOf("II") == 0 || secondNumb.lastIndexOf("I") == 0) {
                check = false;
                try {
                    throw new IOException();
                } catch (Exception e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                }
            }
        }
        else if (firstNumb.lastIndexOf("X") == -1 || firstNumb.lastIndexOf("IX") == 0 || firstNumb.lastIndexOf("VIII") == 0 || firstNumb.lastIndexOf("VII") == 0 || firstNumb.lastIndexOf("VI") == 0 || firstNumb.lastIndexOf("V") == 0 || firstNumb.lastIndexOf("IV") == 0 || firstNumb.lastIndexOf("III") == 0 || firstNumb.lastIndexOf("II") == 0 || firstNumb.lastIndexOf("I") == 0) {
            if (secondNumb.indexOf("10") == 0 || secondNumb.indexOf("9") == 0 || secondNumb.indexOf("8") == 0 || secondNumb.indexOf("7") == 0 || secondNumb.indexOf("6") == 0 || secondNumb.indexOf("5") == 0 || secondNumb.indexOf("4") == 0 || secondNumb.indexOf("3") == 0 || secondNumb.indexOf("2") == 0 || secondNumb.indexOf("1") == 0) {
                check = false;
                try {
                    throw new IOException();
                } catch (Exception e) {
                    System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                }
            }
        }
        return check;
    }


    private static Integer answer (String firstNumb, String secondNumb, String operator) {
        int answer, tmp1 = 10, tmp2 = 10;
        if (firstNumb.indexOf("10") == 0 || firstNumb.indexOf("9") == 0 || firstNumb.indexOf("8") == 0 || firstNumb.indexOf("7") == 0 || firstNumb.indexOf("6") == 0 || firstNumb.indexOf("5") == 0 || firstNumb.indexOf("4") == 0 || firstNumb.indexOf("3") == 0 || firstNumb.indexOf("2") == 0 || firstNumb.indexOf("1") == 0) {
            if (firstNumb.lastIndexOf("10") == 0) {
                tmp1 = 10;
            }
            else if (firstNumb.lastIndexOf("2") == 0) {
                tmp1 = 2;
            }
            else if (firstNumb.lastIndexOf("3") == 0) {
                tmp1 = 3;
            }
            else if (firstNumb.lastIndexOf("4") == 0) {
                tmp1 = 4;
            }
            else if (firstNumb.lastIndexOf("5") == 0) {
                tmp1 = 5;
            }
            else if (firstNumb.lastIndexOf("6") == 0) {
                tmp1 = 6;
            }
            else if (firstNumb.lastIndexOf("7") == 0) {
                tmp1 = 7;
            }
            else if (firstNumb.lastIndexOf("8") == 0) {
                tmp1 = 8;
            }
            else if (firstNumb.lastIndexOf("9") == 0) {
                tmp1 = 9;
            }
            else if (firstNumb.lastIndexOf("1") == 0) {
                tmp1 = 1;
            }
            if (secondNumb.lastIndexOf("10") == 0) {
                tmp2 = 10;
            }
            else if (secondNumb.lastIndexOf("2") == 0) {
                tmp2 = 2;
            }
            else if (secondNumb.lastIndexOf("3") == 0) {
                tmp2 = 3;
            }
            else if (secondNumb.lastIndexOf("4") == 0) {
                tmp2 = 4;
            }
            else if (secondNumb.lastIndexOf("5") == 0) {
                tmp2 = 5;
            }
            else if (secondNumb.lastIndexOf("6") == 0) {
                tmp2 = 6;
            }
            else if (secondNumb.lastIndexOf("7") == 0) {
                tmp2 = 7;
            }
            else if (secondNumb.lastIndexOf("8") == 0) {
                tmp2 = 8;
            }
            else if (secondNumb.lastIndexOf("9") == 0) {
                tmp2 = 9;
            }
            else if (secondNumb.lastIndexOf("1") == 0) {
                tmp2 = 1;
            }
            if (operator == "+") {
                answer = tmp1 + tmp2;
                System.out.println(answer);
            }
            else if (operator == "/") {
                answer = tmp1 / tmp2;
                System.out.println(answer);
            }
            else if (operator == "*") {
                answer = tmp1 * tmp2;
                System.out.println(answer);
            }
            else if (operator == "-") {
                answer = tmp1 - tmp2;
                System.out.println(answer);
            }
        }
        else {
            if (firstNumb.lastIndexOf("X") == 0) {
                tmp1 = 10;
            }
            else if (firstNumb.lastIndexOf("IX") == 0) {
                tmp1 = 9;
            }
            else if (firstNumb.lastIndexOf("VIII") == 0) {
                tmp1 = 8;
            }
            else if (firstNumb.lastIndexOf("VII") == 0) {
                tmp1 = 7;
            }
            else if (firstNumb.lastIndexOf("VI") == 0) {
                tmp1 = 6;
            }
            else if (firstNumb.lastIndexOf("V") == 0) {
                tmp1 = 5;
            }
            else if (firstNumb.lastIndexOf("IV") == 0) {
                tmp1 = 4;
            }
            else if (firstNumb.lastIndexOf("III") == 0) {
                tmp1 = 3;
            }
            else if (firstNumb.lastIndexOf("II") == 0) {
                tmp1 = 2;
            }
            else if (firstNumb.lastIndexOf("I") == 0) {
                tmp1 = 1;
            }
            if (secondNumb.lastIndexOf("X") == 0) {
                tmp2 = 10;
            }
            else if (secondNumb.lastIndexOf("IX") == 0) {
                tmp2 = 9;
            }
            else if (secondNumb.lastIndexOf("VIII") == 0) {
                tmp2 = 8;
            }
            else if (secondNumb.lastIndexOf("VII") == 0) {
                tmp2 = 7;
            }
            else if (secondNumb.lastIndexOf("VI") == 0) {
                tmp2 = 6;
            }
            else if (secondNumb.lastIndexOf("V") == 0) {
                tmp2 = 5;
            }
            else if (secondNumb.lastIndexOf("IV") == 0) {
                tmp2 = 4;
            }
            else if (secondNumb.lastIndexOf("III") == 0) {
                tmp2 = 3;
            }
            else if (secondNumb.lastIndexOf("II") == 0) {
                tmp2 = 2;
            }
            else if (secondNumb.lastIndexOf("I") == 0) {
                tmp2 = 1;
            }
            if (operator == "+") {
                answer = tmp1 + tmp2;
                RomAnswer(answer);
            }
            else if (operator == "/") {
                answer = tmp1 / tmp2;
                RomAnswer(answer);
            }
            else if (operator == "*") {
                answer = tmp1 * tmp2;
                RomAnswer(answer);
            }
            else if (operator == "-") {
                answer = tmp1 - tmp2;
                RomAnswer(answer);
            }
        }
        return -1;
    }

    private static String findingTerm (String term) {
        String Numb;
        if (term.lastIndexOf("10") == 0) {
            Numb = "10";
            return Numb;
        }
        else if (term.lastIndexOf("2") == 0) {
            Numb = "2";
            return Numb;
        }
        else if (term.lastIndexOf("3") == 0) {
            Numb = "3";
            return Numb;
        }
        else if (term.lastIndexOf("4") == 0) {
            Numb = "4";
            return Numb;
        }
        else if (term.lastIndexOf("5") == 0) {
            Numb = "5";
            return Numb;
        }
        else if (term.lastIndexOf("6") == 0) {
            Numb = "6";
            return Numb;
        }
        else if (term.lastIndexOf("7") == 0) {
            Numb = "7";
            return Numb;
        }
        else if (term.lastIndexOf("8") == 0) {
            Numb = "8";
            return Numb;
        }
        else if (term.lastIndexOf("9") == 0) {
            Numb = "9";
            return Numb;
        }
        else if (term.lastIndexOf("1") == 0) {
            Numb = "1";
            return Numb;
        }
        else if (term.lastIndexOf("X") == 0) {
            Numb = "x";
            return Numb;
        }
        else if (term.lastIndexOf("IX") == 0) {
            Numb = "IX";
            return Numb;
        }
        else if (term.lastIndexOf("VIII") == 0) {
            Numb = "VIII";
            return Numb;
        }
        else if (term.lastIndexOf("VII") == 0) {
            Numb = "VII";
            return Numb;
        }
        else if (term.lastIndexOf("VI") == 0) {
            Numb = "VI";
            return Numb;
        }
        else if (term.lastIndexOf("V") == 0) {
            Numb = "V";
            return Numb;
        }
        else if (term.lastIndexOf("IV") == 0) {
            Numb = "IV";
            return Numb;
        }
        else if (term.lastIndexOf("III") == 0) {
            Numb = "III";
            return Numb;
        }
        else if (term.lastIndexOf("II") == 0) {
            Numb = "II";
            return Numb;
        }
        else if (term.lastIndexOf("I") == 0) {
            Numb = "I";
            return Numb;
        }
        return "-1";
    }

    private static String findOper (String oper) throws IOException {
        if (oper.lastIndexOf("+") > -1 && oper.lastIndexOf("+") == 0) {
            oper = "+";
            return oper;
        }
        else if (oper.lastIndexOf("/") > -1 && oper.lastIndexOf("/") == 0) {
            oper = "/";
            return oper;
        }
        else if (oper.lastIndexOf("*") > -1 && oper.lastIndexOf("*") == 0) {
            oper = "*";
            return oper;
        }
        else if (oper.lastIndexOf("-") > -1 && oper.lastIndexOf("-") == 0) {
            oper = "-";
            return oper;
        }
        else {
            try{
                throw new IOException();
            } catch (Exception e) {
                System.out.println("throws Exception //т.к. выбран неверный операнд, доступные (+, -, /, *)");
            }
        }
        return oper;
    }


    private static String RomAnswer (int answer) {
        String romAnsw = "";
        if (answer>0) {
            String[] romanNumbers = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C" };
            romAnsw = romanNumbers[answer];
            System.out.println(romAnsw);
        }
        else {
            try {
                throw new IOException();
            } catch (Exception e) {
                System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            }
        }
        return romAnsw;
    }

}