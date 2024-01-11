public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        int a = sc.nextInt();
        if(s.equals("A")){
            for(int i = 1; i<=a; i++){
                System.out.printf("%d ",i);
            }
        }else if(s.equals("D")){
            for(int i = a; i>0; i--){
                System.out.printf("%d ",i);
            }
        }
    }
}