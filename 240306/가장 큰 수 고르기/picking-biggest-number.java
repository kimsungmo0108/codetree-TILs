public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int max = 0;
        int n = 0;
        for(int i=0; i<10; i++){
            n = sc.nextInt();
            max = max > n ? max : n;
        }
        System.out.println(max);
    }
}