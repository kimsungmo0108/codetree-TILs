public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int a = 0;
        for(int i = 0; i<n ; i++){
            a = sc.nextInt();
            if(a%2==1 && a%3==0){
                sum += a;
            }
        }
        System.out.println(sum);
    }
}