// Count the number of Duplicates
// Write a function that will return the count of distinct case-insensitive alphabetic characters and 
// numeric digits that occur more than once in the input string. 
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

// Example
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times

public class CountingDuplicates {
    public static int duplicateCount(String text) 
    {
      String lower = text.toLowerCase();
      int count = 0;
      
      for(int i =0; i<lower.length();i++)
        {
         if(lower.indexOf(lower.charAt(i))<i) //skip checked character
          {
          continue;
          }
        
         int charCount = 0;
         for(int j = 0; j<lower.length(); j++)
          {
            if(lower.charAt(j)==lower.charAt(i))
              {
                charCount++;
              }
          }
        if(charCount>1)
          {
            count++;
          }
        }
        return count;
    }
}
