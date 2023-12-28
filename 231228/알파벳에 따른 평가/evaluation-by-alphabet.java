public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        if(s.equals("S")){
            System.out.println("Superior");
        }else if(s.equals("A")){
            System.out.println("Excellent");
        }else if(s.equals("B")){
            System.out.println("Good");
        }else if(s.equals("C")){
            System.out.println("Usually");
        }else if(s.equals("D")){
            System.out.println("Effort");
        }else {System.out.println("Failure");}
    }
}