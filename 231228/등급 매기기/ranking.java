public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90){System.out.println("A");
        }else if(a>=80&&a<90){System.out.println("B");
        }else if(a>=70&&a<80){System.out.println("C");
        }else if(a>=60&&a<70){System.out.println("D");
        }else{System.out.println("F");}
    }
}