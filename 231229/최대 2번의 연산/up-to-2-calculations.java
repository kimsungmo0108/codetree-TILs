public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = a%2;
        if(b == 0){
            a /= 2;
            b = a%2;
            if(b == 1){
                a = (a+1)/2;
                System.out.println(a);
            }else{
                System.out.println(a);}
        }
        
    }
}