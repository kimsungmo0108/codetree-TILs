public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c == 'a'){
            c = (char)123;
        }
        System.out.printf("%s", (char)(c-1));
    }
}