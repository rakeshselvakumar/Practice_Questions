import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int num=a;num<b;num++){
            if(num<2) continue;
            boolean isprime=true;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(num+" ");
            }

        }
    }
}