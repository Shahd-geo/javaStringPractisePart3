public class TASK10sumNumbers {
    static void main(String[] args) {

    }
    public static Integer sumNumbers(String str) {
        String num = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);

            }
        } else{
            if (!num.equals("")) {
                sum += Integer.parseInt(num);
                num = "";
            }
        }
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}


