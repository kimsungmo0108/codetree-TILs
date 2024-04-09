public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = str1;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(0) == str1.charAt(i)){
                System.out.print(str1.charAt(1));
            }else if(str1.charAt(1) == str1.charAt(i)){
                System.out.print(str1.charAt(0));
            }else{
                System.out.print(str1.charAt(i));
            }
        }
    }
}