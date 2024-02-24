public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<10; i++){
            n = sc.nextInt();
            if((i+1)%2 == 0){
                sum2 += n;
            }else if((i+1)%2 == 1){
                sum1 += n;
            }
        }

        if(sum1>sum2){
            System.out.printf("%d", sum1-sum2);
        }else if(sum1<sum2){
            System.out.printf("%d", sum2-sum1);
        }
    }
}