import java.util.*;
public class minmax{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min2=min;
                min=arr[i];
            }
            else if(min2>arr[i] && min2!=min){
                min2=arr[i];
            }
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
            else if(max2<arr[i] && max2!=max){
                max2=arr[i];
            }
            
        }
        System.out.println("1st MAX:"+max);
        System.err.println("1st MIN:"+min);
        System.err.println("2nd MAX:"+max2);
        System.out.println("2nd MIN:"+min2);
        
    }
}