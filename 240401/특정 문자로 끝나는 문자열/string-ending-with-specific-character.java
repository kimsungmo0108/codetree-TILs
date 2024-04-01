public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] str = new String[10];
        for(int i=0; i<10; i++){
            str[i] = sc.next();
        }
        char a = sc.next().charAt(0);
        int len = 0;
        for(int i=0; i<10; i++){
            len = str[i].length()-1;
            if(str[i].charAt(len) == a){
                System.out.println(str[i]);
            }
        }
    }
}