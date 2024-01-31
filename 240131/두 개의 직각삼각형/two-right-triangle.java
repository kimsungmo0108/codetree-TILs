public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("*");
            }
            for(int m=1; m<(i*2)-1; m++){
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}