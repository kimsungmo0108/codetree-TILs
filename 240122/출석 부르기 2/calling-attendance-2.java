public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String[] str = new String[100];
        for(int i=0; i<100; i++){
            String a = sc.next();
            if(a.equals("1")){
                str[i] = "John";
            }else if(a.equals("2")){
                str[i] = "Tom";
            }else if(a.equals("3")){
                str[i] = "Paul";
            }else if(a.equals("4")){
                str[i] = "Sam";
            }else{
                str[i] = "Vacancy";
                break;
            }
        }

        for(String s : str){
            if(s == null){
                //break;
            }else{
                System.out.println(s);
            }
        }
    }
}