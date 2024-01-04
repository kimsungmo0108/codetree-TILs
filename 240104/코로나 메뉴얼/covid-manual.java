public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String a1 = sc.next();
        int a2 = sc.nextInt();
        String b1 = sc.next();
        int b2 = sc.nextInt();
        String c1 = sc.next();
        int c2 = sc.nextInt();
        char a,b,c;
        int count=0;

        if(a1.equals("Y") && a2>=37){
            a = 'A';
        }else if(a1.equals("N") && a2>=37){
            a = 'B';
        }else if(a1.equals("Y") && a2<37){
            a = 'C';
        }else{a='D';}

        if(b1.equals("Y") && b2>=37){
            b = 'A';
        }else if(b1.equals("N") && b2>=37){
            b = 'B';
        }else if(b1.equals("Y") && b2<37){
            b = 'C';
        }else{b='D';}

        if(c1.equals("Y") && c2>=37){
            c = 'A';
        }else if(c1.equals("N") && c2>=37){
            c = 'B';
        }else if(c1.equals("Y") && c2<37){
            c = 'C';
        }else{c='D';}

        if(a=='A'){count++;}
        if(b=='A'){count++;}
        if(c=='A'){count++;}
   
        if(count>=2){
            System.out.println("E");
        }else{System.out.println("N");}

    }
}