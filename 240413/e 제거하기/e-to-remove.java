public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int index = str.indexOf("e");
        if(index != -1){
            str = str.substring(0, index) + str.substring(index+1);
        }
        System.out.printf("%s ", str);
    }
}