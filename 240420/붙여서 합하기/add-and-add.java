public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.printf("%d", Integer.parseInt(str1+str2)+Integer.parseInt(str2+str1));
    }
}