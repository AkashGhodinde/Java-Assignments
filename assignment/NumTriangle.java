import java.io.*;

public class NumTriangle{
public static void main(String[] args){
	int n=5;
  int k =8;
       for (int i=1; i<=n; i++)
        {
            for (int j=0; j<k; j++)
            {
               System.out.print(" ");
            }
  
           k = k - 2;
            for(int j=1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
}
}}