public class TASK7sameEnds {
    static void main(String[] args) {
        String str="abXYZba";
        System.out.println(sameEnds(str));

    }

    public static String sameEnds(String str) {
        String len = str.length();
        String result = "";
        for (int i = 0; i <= len / 2; i++) {
            String start = str.substring(0, i);
            String end = str.substring(len, -i);
            if (start.equals(end)) {
                result = start;
            }

        }
        return result;

    }
}

