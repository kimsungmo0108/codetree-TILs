public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(n>1){
            n /= i++;
        }
        System.out.println(--i);
    }
}