import java.io.*;

public class CenterTriangle 
{
public static void main(String[] args)
{
	int n=5;
    int k = 2*n - 2;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 2;  
            for (int j=0; j<=i*2; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
}
}
}