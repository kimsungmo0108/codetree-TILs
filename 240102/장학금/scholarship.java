public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>=90 && b>=95){
            System.out.println("100000");
        }else if(a>=90 && b>=90){
            System.out.println("50000");
        }else{System.out.println("0");}
    }
}