public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1; i<=a; i++){
            if(i%2 == 0){
                System.out.printf("%d ", 1);
            }else if(i%3 == 0){
                System.out.printf("%d ", 1);
            }else{System.out.printf("%d ", 0);}
        }
    }
}