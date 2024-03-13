public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[][] c = new char[5][3];
        String str;
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                str = sc.next();
                c[i][j] = str.charAt(0);
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%S ",(char)((int)(c[i][j])-32));
            }
            System.out.println();
        }
    }
}