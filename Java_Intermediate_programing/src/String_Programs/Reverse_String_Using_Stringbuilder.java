package String_Programs;

public class Reverse_String_Using_Stringbuilder {
    public  static void main(String args[])
    {
        String main_string="Ragul reverse the string";
        String Reversed_String;
        StringBuilder sb=new StringBuilder(main_string);
        Reversed_String=sb.reverse().toString();
        System.out.println(Reversed_String);
    }
}
