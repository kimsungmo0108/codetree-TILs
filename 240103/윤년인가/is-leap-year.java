public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int y = sc.nextInt();
        if(y%4 == 0){
            if(y%100 == 0){System.out.println("false");
            }else if(y%100 == 0 && y%400 == 0){
                System.out.println("true");
            }
            System.out.println("true");
        }else{System.out.println("false");}
    }
}