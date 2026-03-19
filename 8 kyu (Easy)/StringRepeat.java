// Write a function that accepts a non-negative integer n and a string s as parameters, and returns a string of s repeated exactly n times.

// Examples (input -> output)
// 6, "I"     -> "IIIIII"
// 5, "Hello" -> "HelloHelloHelloHelloHello"

public class Solution {
    public static String repeatStr(final int repeat, final String string) 
    {
      String ns="";
      if(string == null || string.length()==0  || repeat ==0)
        {
        return ns;
      }
      for(int i=0; i<repeat; i++)
        {
          ns += string; 
      }
        return ns;
    }
}
