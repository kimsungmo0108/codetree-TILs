public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n;j>i+1;j--){
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        for(int m=1;m<n;m++){
            for(int o=n;o>m;o--){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}