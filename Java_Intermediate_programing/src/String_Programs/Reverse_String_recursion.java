package String_Programs;

public class Reverse_String_recursion {
    public static void main(String args[])
    {
        String main_string="Ragul reverse the string";
        String Reversed_String=reverstring(main_string);
        System.out.println(Reversed_String);
    }
    public static String reverstring(String main_string)
    {
        if(main_string.isEmpty())
        {
            return main_string;
        }
        else {

            return  reverstring(main_string.substring(1))+main_string.charAt(0);
        }
    }
}
