package Problem_Solving;

import java.util.Scanner;

public class String_Shufflle {
    public static void main(String[] args)
    {
        String s1;
        String s2;
        String s3;
        String s4;
        Scanner sc=new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();
        s3=sc.next();
        s4=sc.next();
        checkingshuffle(s1,s2,s3,s4);
    }
    public static String checkingshuffle(String s1,String s2,String s3,String s4){
        String main_String=s1+s2+s3;
        char[] charArray=main_String.toCharArray();
        char[] shuffle_string=s4.toCharArray();
        int len,i,j,len_shuffle,count=0;
        String output=null;
        len=charArray.length;
        len_shuffle=shuffle_string.length;
        for(i=0;i<len;i++)
        {
            for(j=0;j<len_shuffle;j++)
            {
                if(charArray[i]==shuffle_string[j])
                {
                    count++;
                }
            }
        }
        if(count==len)
        {
          output="Valid";
        }
        else
        {
            output="invalid";
        }
        System.out.println(output);
        return output;
    }
}
