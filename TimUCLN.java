import java.util.Scanner;
public class TimUCLN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap vao so a");
        int a,b;
        a=scanner.nextInt();
        System.out.println("nhap vao so b");
        b=scanner.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
       if(a==0||b==0){
           System.out.println("UCLN la:" +(a+b));
       } while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }System.out.println("UCLN la:"+a);
    }

    }

