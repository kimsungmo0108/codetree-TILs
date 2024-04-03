public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        String str2 = new String();
        for(int i=1; i<=str.length()-1; i+=2){
            str2 += str.charAt(i);
        }
        for(int i=str2.length()-1; i>=0; i--){
            System.out.printf("%s",str2.charAt(i));
        }
    }
}