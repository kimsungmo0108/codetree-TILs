public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int c = 0;
        for(int i=a; i<=b; i++){
            for(int j=1; j<=i; j++){
                if(sum>=i*2){
                    if(sum-i == i){
                        c++;
                    }
                    sum = 0;
                }
                if(i%j == 0){
                    sum += j;
                }
            }
        }
        System.out.print(c);
    }
}