public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = str1 + str2;
        String str4 = str2 + str1;
        for(int i=0; i<str3.length(); i++){
            if(str3.charAt(i) != str4.charAt(i)){
                System.out.println("false");
                break;
            }else if(i==str3.length()-1){
                System.out.println("true");
            }
        }
    }
}