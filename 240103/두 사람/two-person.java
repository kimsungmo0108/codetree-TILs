public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a1 = sc.nextInt();
        String a2 = sc.next();
        int b1 = sc.nextInt();
        String b2 = sc.next();
        if (a1 >= 19 || b1 >= 19) {
            if (a2.equals("M") && a1>=19) {
                System.out.println("1");
            }else if(b2.equals("M") && b1>=19) {
                System.out.println("1");
            }else {System.out.println("0");}
        }else {System.out.println("0");}
    }   
}