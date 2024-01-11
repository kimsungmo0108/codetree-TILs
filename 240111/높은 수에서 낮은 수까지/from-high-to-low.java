public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a>b?a:b;
        int min = a<b?a:b;
        for(; max>=min; max--){
            System.out.printf("%d ", max);
        }
    }
}