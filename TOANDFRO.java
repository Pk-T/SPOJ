import java.util.*;
import java.io.*;

class TOANDFRO {

    public static void main(String args[]) throws Exception {
        
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String message = null;
        int numCol = 0;
       
        while(true)
        {
        numCol = Integer.parseInt(buff.readLine());
        if(numCol == 0)
        {
            System.exit(0);
        }
        message = buff.readLine();
        
        int numRow = (int)message.length()/numCol;
        
        char[][] output = new char[numRow][numCol];
        int j = 0,k=0,flag = 0,index = 0;
        
        for(int i = 0; i < numRow; i++)
        {
            k = 0;
            if( i % 2 == 0)
            {
                j=0;
                flag  = 1;
            }
            else
                j=numCol-1;
            while(k< numCol)
            {
                output[i][j] = message.charAt(index);
                if(flag == 1)
                {
                    j++;
                }
                else
                    j--;
                k++;
                index++;
            }
            flag = 0;
        }
        
        for(int i = 0; i< numCol; i++)
        {
            for(int n = 0; n<numRow; n++)
            {
                System.out.print(output[n][i]+"");
            }
        }
        System.out.println();
        
        }

    }
}
