public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int i=1; i<=n; i++){
            if(i%2 == 1){
                for(int j=1; j<=n; j++){
                System.out.printf("%d ", c++);
                }
            }else{
                for(int j=n-1; j>=0; j--){
                System.out.printf("%d ", c+j);
                }
                c+=n;
            }
            System.out.println();
        }
    }
}