public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int num  = 0;
        String str2 = new String();
        for(int i=0; i<n; i++){
            num = sc.nextInt();
            if(num == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j=0; j<str.length(); j++){
                    if(j == a-1){
                        str2 += str.charAt(b-1);
                        System.out.print(str.charAt(b-1));    
                    }else if(j == b-1){
                        str2 += str.charAt(a-1);
                        System.out.print(str.charAt(a-1));
                    }else{
                        str2 += str.charAt(j);
                        System.out.print(str.charAt(j));
                    }
                }
            System.out.println();
            str = str2;
            str2 = "";
            }else if(num == 2){
                char a1 = sc.next().charAt(0);
                char b1 = sc.next().charAt(0);
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j) == a1){
                        str2 += b1;
                        System.out.print(b1);
                    }else{
                        str2 += str.charAt(j);
                        System.out.print(str.charAt(j));
                    }
                }
            System.out.println();
            str = str2;
            str2 = "";
           }
        }
    }
}