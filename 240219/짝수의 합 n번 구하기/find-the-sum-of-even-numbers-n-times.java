public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int sum=0;
        for(int i=1; i<=n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            for(int j=a; j<=b; j++){
                if(j%2==0){
                    sum += j;
                }
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}