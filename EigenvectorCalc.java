import java.util.Scanner;


public class EigenvectorCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input the matrix(2*2)");
        int a = s.nextInt();
        int b =s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();

        double x1;
        double x2;

        double x_i;
        int delta = (a+d)*(a+d) - 4*(a*d-b*c);

        if(delta>0){
           x1=((a+d)+Math.sqrt(delta))/2.0;
           x2=((a+d)-Math.sqrt(delta))/2.0;
           System.out.println("X1="+x1+"\nX2="+x2);
           double v1=b/(x1-a);
           System.out.println("V1=("+v1+",1.0)");
           double v2=b/(x2-a);
           System.out.println("V2=("+v2+",1.0)");
        }else if(delta==0){
            x1=((a+d))/2.0;
            double v1=b/(x1-a);
            System.out.println("X="+x1);
            System.out.println("V=("+v1+",1.0)");
        }else if(delta<0){
            delta=-delta;
            x_i=Math.sqrt(delta)/2.0;
            x1 = (a+d)/2.0;
            System.out.println("X1="+x1+"+"+x_i+"i");
            System.out.println("X2="+x1+"-"+x_i+"i");
        }
    }
}
