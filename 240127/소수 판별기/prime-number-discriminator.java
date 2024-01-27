public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                c++;
            }
        }
        if(c>2){
            System.out.println("C");
        }else{
            System.out.println("P");
        }
    }
}