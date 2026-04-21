public class TASK2withoutString {
    static void main(String[] args) {

    }
    public static String withoutString(String str1,String remove){
        String result = "";
        String str=str1.toLowerCase();
        String Remove=remove.toLowerCase();
        for (int i =0 ;i<str1.length();i++){
            if (str1.startsWith(remove,i)){
                i+=remove.length()-1;//skip
            }else {
        }
    }
}
