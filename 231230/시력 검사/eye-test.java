public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a>=1.0 && b>=1.0){
            System.out.println("High");
        }else if(a>=0.5 && b>=0.5){
            System.out.println("Middle");
            }else{System.out.println("Low");}
    }
}