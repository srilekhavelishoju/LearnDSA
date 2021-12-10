package EdyodaPractice.DSA.Assignments;

public class CheckStringRotation
{
    static Boolean checkRotation(String s1,String s2)
{
    if (s1.length() != s2.length())
        return false;
    String temp = s1 + s2;
    if (temp.indexOf(s2) != -1)
    {
        return true;
    }
        else
        {
            return false;
        }

}

    public static void main(String[] args)
    {
        String a="Hello";
        String b="lohel";
        if(checkRotation(a,b))
            System.out.println("Given string are rotation of each other");
        else
            System.out.println("Given Strings are not rotation of each other ");

    }

}
