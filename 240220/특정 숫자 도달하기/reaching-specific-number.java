public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int sum=0;
        int a=0;
        int c=0;
        for(int i=0; i<10; i++){
            a = sc.nextInt();
            if(a>=250){
                break;
            }
            sum += a;
            c++;
        }
        System.out.printf("%d %.1f", sum, ((float)sum/c));
    }
}