public class TASK9maxBlock {
    static void main(String[] args) {
        String str = "hoopla";
        System.out.println(maxBlock(str));


    }

    public static Integer maxBlock(String str) {
        int max = 0;
        int count = 1;
        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }



        }
        return max;

    }
}


