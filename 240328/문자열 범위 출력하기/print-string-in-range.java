public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        for(int i=2; i<10; i++){
            System.out.printf("%s", str.charAt(i));
        }
    }
}