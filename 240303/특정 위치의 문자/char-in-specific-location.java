public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[] word = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };
        String str = sc.next();
        int index = 0;
        for(int i=0; i<6; i++){
            if(str.equals(word[i])){
                index = i;
            }
        }
        System.out.println(index);

    }
}