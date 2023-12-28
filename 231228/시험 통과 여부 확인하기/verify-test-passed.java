public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if(a>=80){
            System.out.println("pass");
        }else{
            System.out.printf("%d more score", (80-a));
        }
    }
}