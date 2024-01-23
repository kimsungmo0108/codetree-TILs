public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        while(true){
            if(n!=1){
                if(n%2 == 0){
                    n = n/2;
                    c++;
                }else if(n%2 == 1){
                    n = (n*3)+1;
                    c++;
                }
            }else if(n==1){
                break;
            }
        }
        System.out.println(c);
    }
}