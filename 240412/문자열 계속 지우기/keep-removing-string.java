public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int index = -2;
        for(;;){
            index = str1.indexOf(str2);
            if(index == -1){
                break;
            }
            str1 = str1.substring(0, index) + str1.substring(index+str2.length());
        }
        System.out.println( str1);
    }
}