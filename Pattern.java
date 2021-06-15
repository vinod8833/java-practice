/*
1 2 3 4 5 6 7 8 
 2 3 4 5 6 7 8 
  3 4 5 6 7 8 
   4 5 6 7 8 
    5 6 7 8 
     6 7 8 
      7 8 
       8 
*/
class Pattern
{
    public static void main(String[] args)
    {
        int rows = 8; // Number of Rows we want to print
          
         
          
        //Printing the pattern
        for (int i = 1; i <= rows; i++)
        {
          for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
          for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }  
            System.out.println();
        }
        
 
        
        }
     
    }