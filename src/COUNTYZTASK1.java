public class COUNTYZTASK1 {
    /* static void main(String[] args) {
         String countYZ = "day fez";

         int count = 0;
         for (int i = 0; i < countYZ.length(); i++) {
             if (countYZ.charAt(i)=='z'|| countYZ.charAt(i)=='Z' ||
                     countYZ.charAt(i)=='y'||countYZ.charAt(i)=='Y' &&
                     (i==countYZ.length()-1||!Character.isLetter(countYZ.charAt(i+1)))){
                 count ++;
             }

         }
         System.out.println(count);

     }
 }
     */
    static void main(String[] args) {
        String str = "day fez";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z' || str.charAt(i) == 'Z' || str.charAt(i) == 'y' || str.charAt(i) == 'Y' && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        System.out.println(count);
    }
}