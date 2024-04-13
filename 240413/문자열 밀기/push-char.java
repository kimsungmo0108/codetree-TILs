public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
         String s = sc.next();
        int len = s.length();
        s = s.substring(1, len) + s.substring(0,1);

        System.out.println(s);
    }
}