/*List of Odd numbers from 1 to 10000: 1 3 5 7 9 11 ......10000*/


class OddNumber  
{  
public static void main(String args[])   
{  
int number=10000;  
System.out.print("List of Odd numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
 
if (i%2!=0)     
{  
System.out.print(i + " ");  
}  
}  
}  
}  