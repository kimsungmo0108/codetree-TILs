public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a =sc.nextInt();
        if(a%2 == 1){
            a+=3;
        }
        if(a%3 == 0){
            a /= 3;
        }
        System.out.println(a);
    }
}