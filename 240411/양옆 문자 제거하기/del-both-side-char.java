public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(i == 1 || i == str.length()-2){
                continue;
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}