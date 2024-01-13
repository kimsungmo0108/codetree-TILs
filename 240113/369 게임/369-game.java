public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n ; i++){
            if(i%10 == 3 || i%10 == 6 || i%10 == 9){
                System.out.printf("%d ", 0);
            }else {System.out.printf("%d ", i);}
        }
    }
}