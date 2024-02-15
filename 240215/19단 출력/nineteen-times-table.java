public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int n = 19;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.printf("%d * %d = %d",i,j,i*j);
                if(j%2==0){
                    System.out.println();
                }else if(j==19){
                    System.out.print("");
                }else{
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}