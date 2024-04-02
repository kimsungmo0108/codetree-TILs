public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=str.length()-1; i>=str.length()-n; i--){
            System.out.printf("%s", str.charAt(i));
        }
    }
}