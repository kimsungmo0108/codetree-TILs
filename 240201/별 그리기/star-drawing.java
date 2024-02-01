public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

       for(int i=n; i>1; i--){
        for(int k=n; k>=i; k--){
            System.out.print(" ");
        }
        for(int j=3; j<=(i*2)-1; j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
}