package OOPs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {


        for(int i = 2;i<=100;i++)
        {
            int dem = 0;
            for(int j = 2;j<=i;j++)
            {
                if(i%j==0)
                {
                    dem+=1;
                }
            }
            if(dem<=1)
            {
                System.out.print(i+"\t");
            }
        }
    }
}
