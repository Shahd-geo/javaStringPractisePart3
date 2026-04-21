public class TASK5countTriple {
    static void main(String[] args) {
        String str="abcXXXabc";
        System.out.println(countTriple(str));


    }
    public static Integer countTriple(String str){
        int count3=0;
        for (int i =0 ; i <str.length();i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count3++
            }
        }
        return count3;

    }
}
