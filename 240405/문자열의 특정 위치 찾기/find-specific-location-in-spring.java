public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                System.out.println(i);
                break;
            }else if(i == str.length()-1){
                System.out.println("No");
            }
        }
    }
}