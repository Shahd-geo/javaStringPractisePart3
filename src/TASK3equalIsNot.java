public class TASK3equalIsNot {
    /* static void main(String[] args) {
         String str = "This is not";
         System.out.println(equalIsNot(str));

     }

     public static boolean equalIsNot(String str) {
         int countis = 0;
         int countnot = 0;
         for (int i = 0; i < str.length(); i++) {
             if (i <=str.length()-2 &&
                     str.substring(i, i + 2).equals("is")) {
                 countis++;

             }
             if (i <=str.length()-3 &&
                     str.substring(i, i + 3).equals("not")) {
                 countnot++;

             }
         }

         return countis == countnot;
     }
 }
 */
    static void main(String[] args) {
        String str = "noisxxnotyynotxisi";
        System.out.println(equalIsNot(str));
    }

    public static boolean equalIsNot(String str) {
        int countis = 0;
        int countnot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i<=str.length()-2 &&str.substring(i, i + 2).equals("is")) {
                countis++;
            } else if (i<= str.length()-3 &&str.substring(i, i + 3).equals("not")) {
                countnot++;

            }
        }
        return countis==countnot;
    }
}