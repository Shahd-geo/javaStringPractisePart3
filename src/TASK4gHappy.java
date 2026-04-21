public class TASK4gHappy {
    static void main(String[] args) {
        String str = "xxgxx";
        System.out.println(gHappy(str));
    }


    public static boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' ){
                if ((i >0 &&str.charAt(i - 1) == 'g' )||
                        i >str.length()-1 &&str.charAt(i + 1) == 'g'){
                    return true;

                }else{
                    return false;
                }
            }

            }

        return true ;
    }
}

