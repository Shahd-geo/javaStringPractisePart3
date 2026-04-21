public class TASK4gHappy {
    static void main(String[] args) {
        String str = "xxggxx";
        System.out.println(gHappy(str));
    }


    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' && str.charAt(i + 1) == 'g' || str.charAt(i - 1) == 'g') {
                return true;

            } else {
                return false;
            }

        }
            return true ;
    }
}

