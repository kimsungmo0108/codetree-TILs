public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 7){
            if(n == 2){
            System.out.println("28");
            }else if(n%2 == 1){
                System.out.println("31");
            }else{System.out.println("30");}
        }else{
            if(n%2 == 1){
                System.out.println("30");
            }else{System.out.println("31");}
        }




        
    }
}