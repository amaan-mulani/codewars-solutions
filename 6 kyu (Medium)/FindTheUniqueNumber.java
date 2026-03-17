// There is an array with some numbers. All numbers are equal except for one. Try to find it!

// Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
// Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
// It’s guaranteed that array contains at least 3 numbers.

public class Kata 
{
    public static double findUniq(double arr[]) 
  {
        double value = 0.0;
        for(int i = 0; i < arr.length; i++) 
        {
            boolean foundMatch = false;
            for(int j = 0; j < arr.length; j++) 
            {
                if(i != j && arr[j] == arr[i]) 
                {
                    foundMatch = true;
                    break;
                }
            }
            if(!foundMatch) 
            {
                value = arr[i];
                break;
            }
        }
        return value;
    }
}
