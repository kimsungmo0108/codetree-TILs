public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        byte[] b = new byte[100];
        for (int i=0; true; i++){
            b[i] = sc.nextByte();
            if(b[i] == 0){
                break;
            }
        }

        for (int i=0; true; i++){
            if(b[i] == 0){
                break;
            }else{
                System.out.println(b[i]);
            }
        }

    }
}