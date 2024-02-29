public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = 0;
        int[] num = new int[10];
        for(int i=0; ; i++){
            n = sc.nextInt();
            if(n==0){
                break;
            }
            n = n/10;
            num[n] += 1;
        }

        for(int j=1; j<10; j++){
            System.out.printf("%d - %d\n", j, num[j]);
        }
    }
}