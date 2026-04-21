public class TASK5countTriple {
    static void main(String[] args) {
        String str="abcXXXabc";
        System.out.println(countTriple(str));


    }
    public static Integer countTriple(String str){
        int count3=0;
        for (int i =0 ; i <str.length();i++){
            if (i<str.length()-3 && str.substring(i , i+4).equals(i)){
                count3++;
            }
        }
        return count3;

    }
}
