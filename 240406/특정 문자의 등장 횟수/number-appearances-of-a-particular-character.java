public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int c1 = 0;
        int c2 = 0;
        String c = new String();
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == 'e'){
                if(str.charAt(i+1) == 'e'){
                    c1++;
                }else if(str.charAt(i+1)=='b'){
                    c2++;
                }
            }
        }
        System.out.printf("%d %d ", c1, c2);
    }
}