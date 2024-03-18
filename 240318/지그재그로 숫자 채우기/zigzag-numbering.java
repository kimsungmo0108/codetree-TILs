public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 2;
        int c1 = 2;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==0){
                    System.out.printf("%d ", i);
                }else if(j%2 == 0){
                    System.out.printf("%d ", (c1*n)+i);
                    c1 += 2;
                }else if(j%2 == 1){
                    System.out.printf("%d ", (c*n)-i-1);
                    c += 2;
                }
            }
            c1 = 2;
            c = 2;
            System.out.println();
        }
    }
}