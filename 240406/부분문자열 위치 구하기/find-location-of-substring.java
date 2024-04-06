public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        if(str1.contains(str2)){
            for(int i=0; i<str1.length()-1; i++){
                if(str1.charAt(i) == str2.charAt(0)){
                    if(str1.charAt(i+1) == str2.charAt(1)){
                        System.out.println(i);
                        break;
                    }
                }
            }
            if(str2.length() == 1){
                for(int i=0; i<str1.length(); i++){
                    if(str1.charAt(i) == str2.charAt(0)){
                        System.out.println(i);
                    }
                }
            }
        }else{System.out.println("-1");}
    }
}