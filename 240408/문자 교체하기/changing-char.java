public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.printf("%s",str1.charAt(0));
        System.out.printf("%s",str1.charAt(1));
        for(int i=2; i<str2.length(); i++){
            System.out.printf("%s",str2.charAt(i));
        }
    }
}