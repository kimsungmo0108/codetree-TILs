public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-c; j++){
                System.out.printf("%d * %d = %d ",i, j, i*j);
                if(j<n-c){
                    System.out.print("/ ");
                }
            }
            c++;
            System.out.println();
        }
    }
}