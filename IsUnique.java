public class IsUnique
{
    //normal one
    boolean isUnique(String str)
    {
        if (str.length() > 128)
            return false;
        boolean[] isUnique = new boolean[128];
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i); // get the positon of character in  string
            if (isUnique[val])
                return false;
            isUnique[val] = true;
        }
        return true;
    }
    //bit vector one
    boolean isUniqueChars(String str)
    {
         int checker = 0;
         for (int i = 0; i < str.length(); i++)
         {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0)
                return false;
            checker |= (1 << val);
         }
         return true;
    }
}
