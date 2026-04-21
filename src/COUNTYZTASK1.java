public class COUNTYZTASK1 {
    static void main(String[] args) {
        String countYZ = "fez day";
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
