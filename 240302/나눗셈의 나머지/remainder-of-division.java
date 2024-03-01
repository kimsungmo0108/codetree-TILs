public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] num = new int[10];
        int c = 0;
        int sum = 0;
        for(;;){
            c = a%b;
            a = a/b;
            num[c] += 1;
            if(a<=1){
                break;
            }
        }
        for(int i=0; i<10; i++){
            sum = sum+(num[i]*num[i]);
        }
        System.out.println(sum);
    }
}