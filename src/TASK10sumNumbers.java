public class TASK10sumNumbers {
    static void main(String[] args) {
        String str = "abc123xyz";
        System.out.println(sumNumbers(str));

    }

    public static Integer sumNumbers(String str) {
        String num = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if (i == str.length() - 1 || !Character.isDigit(str.charAt(i+1))) {
                    sum += Integer.parseInt(num);
                    num = "";

                }
            }
        }

        return sum;
    }

}
