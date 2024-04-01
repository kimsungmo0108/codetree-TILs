public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = new String();
        for(int i=1; i<=10; i++){
            str = sc.next();
            if(i%2==1){
                System.out.println(str);
            }
        }
    }
}