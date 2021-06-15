/*List of even numbers from 1 to 1000: 2 4 6 8 10 12 14 16 18 20 22 24 26.......... 996 998 1000*/



class EvenNumber  
{  
public static void main(String args[])   
{  
int number=1000;  
System.out.print("List of even numbers from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
 
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}  