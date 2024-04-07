public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            if(i == 1){
                System.out.print("a");
            }else if(i == str.length()-2){
                System.out.print("a");
            }else{
                System.out.print(str.charAt(i));
            }
        }
    }
}