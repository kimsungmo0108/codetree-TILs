public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0){
                    System.out.print("* ");
                }  
            }
            if(i>0){
            System.out.println();
                for(int k=0; k<i; k++){
                    System.out.print("* ");
                }
                for(int m=i; m<n-1; m++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
        }
    }
}