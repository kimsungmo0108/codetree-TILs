public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] str = new String[4];
        for(int i=0; i<4; i++){
            str[i] = sc.nextLine();
        }
        for(int i=3; i>=0; i--){
            System.out.println(str[i]);
        }
    }
}