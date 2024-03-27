public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int max = str1.length()>str2.length() ? str1.length():str2.length();
        max = max>str3.length() ? max:str3.length();
        int min = str1.length()<str2.length() ? str1.length():str2.length();
        min = min<str3.length() ? min:str3.length();
        System.out.printf("%d ",max-min);
    }
}