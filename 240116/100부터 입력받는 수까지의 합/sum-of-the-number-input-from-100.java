public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(; n<=100 ;n++){
            sum += n;
        }
        System.out.println(sum);
    }
}