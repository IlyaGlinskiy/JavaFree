package by.glinkiy.lesson2.task6;


    /**
     * Создайте число. Определите, является ли число трехзначным. Определите, является
     * ли его последняя цифра семеркой. Определите, является ли число четным.
     */
    public class EvenNumber {
        public static void main(String[] args) {
            int x = 127;
            System.out.println(checkParity(x));

        }

        public static String checkParity(int value) {
            if (value > 99 && value < 1000) {
                if (value % 10 == 7) {
                    return "Digit odd and ending 7";
                } else {
                    if (value % 2 == 0) {
                        return "Digit even and not ending 7";
                    } else return "Digit odd and not ending 7";
                }
            } else return "The number is not three-digit or digit is negative.";
        }
    }


