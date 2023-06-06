package Reverse_String;

public class Reverse_String_character_array {

    public static void main(String[] args)
    {
        String main_string="Ragul reverse the string";
        //initiate the char array
        char charArray[]=main_string.toCharArray();
        int a=0;
        int b=main_string.length()-1;
        while (a<b)
        {
            char temp=charArray[a];
            charArray[a]=charArray[b];
            charArray[b]=temp;

            a++;
            b--;
        }
        String Reversed_String=new String(charArray);
        System.out.println(Reversed_String);

    }
}
