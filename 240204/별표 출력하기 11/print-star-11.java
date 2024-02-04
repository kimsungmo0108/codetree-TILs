public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        n = n*2 +1;
        for(int i=0; i<n; i++){
            if(i%2 == 1){
                for(int j=0; j<n; j+=2){
                    System.out.print("*   ");
                }
            }else if(i%2 == 0){
                for(int j=0; j<n; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}