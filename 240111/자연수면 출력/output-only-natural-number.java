public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0){
            for(int i = 0;i<b;i++){
                System.out.printf("%d",a);
            }
        }else{System.out.println(0);}
    }
}