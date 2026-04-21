public class TASK5countTriple {
    static void main(String[] args) {

    }
    public static Integer countTriple(String str){
        int count3=0;
        for (int i =0 ; i <str.length();i++){
            if (str.substring(i , i+4).equals(i)){
                count3++;
            }
        }

    }
}
