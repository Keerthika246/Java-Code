public class Digitcount
{ 
      public static void main(String[] args)
       {
	int n = 21205;
	int count = 0;
	while(n>0)
	{
	n = n/10;
	count++;
	}
	System.out.println("The digit count is:"+count);
        }
}	