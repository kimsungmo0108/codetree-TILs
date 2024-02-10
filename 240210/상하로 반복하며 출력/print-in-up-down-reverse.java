public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=1; j<=n; j++){
                if(j%2 == 1){
                    System.out.printf("%d", i+1);
                }else{System.out.printf("%d", n-i);}
            }
            System.out.println();
        }
    }
}