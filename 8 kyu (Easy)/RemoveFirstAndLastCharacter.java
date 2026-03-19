// Your goal is to write a function that removes the first and last characters of a string. You're given one parameter, the original string.

// Important: Your function should handle strings of any length ≥ 2 characters. For strings with exactly 2 characters, return an empty string.

// Examples
// 'eloquent' --> 'loquen'
// 'country'  --> 'ountr' 
// 'person'   --> 'erso'
// 'ab'       --> '' (empty string)
// 'xyz'      --> 'y'

public class RemoveChars 
{
    public static String remove(String str) 
    {
      if(str == null || str.length()<=2)
        {
        return "";
      }
      
      String remove = "";
      for(int i =0; i<str.length(); i++)
        {
        if(i ==0 || i == str.length()-1)
          {
          continue;
        }
        else
          {
          remove += str.charAt(i);
        }
      }
      return remove;
        // your code here
    }
}
