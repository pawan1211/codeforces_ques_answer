//   https://codeforces.com/contest/1352/problem/F
import java.util.*;
import java.lang.*;
import java.io.*;
class Codeforces_1352_F
{
	public static void main (String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		
		int t=s.nextInt();
		while(t-->0)
		{
			String s1="";
			
			int i=0;
					int n1=s.nextInt();
					int n2=s.nextInt();
					int n3=s.nextInt();
					if((n1==0&&n2>0&&n3==0)||(n2==0&&n1>0&&n3==0)||(n1==0&&n3>0&&n2==0))
					{
						if(n1==0&&n2>0&&n3==0)
						{
							for(i=0;i<=n2;i++)
							{
								if(i%2==0)
									s1=s1+'0';
								else
									s1=s1+'1';
							}
						}
						
						
						else if(n2==0&&n1>0&&n3==0)
						{
							for(i=0;i<=n1;i++)
							{
									s1=s1+'0';
							
							}
						}
						
						
						else if(n1==0&&n3>0&&n2==0)
						{
							for(i=0;i<=n3;i++)
							{
								
									s1=s1+'1';
							}
						}
						
System.out.println(s1);
System.out.println("first");
						
					}
					else
					{
					
                      if(n3==0&&n1>0&&n2>0)
					  {
				
							for(i=0;i<=n2;i++)
							{
								if(i%2==0)
									s1=s1+'1';
								else
									s1=s1+'0';
							}
							for(i=1;i<=n1;i++)
							{
									s1=s1+'0';
							
							}
							System.out.println("second");
						}
						else if(n2==0&&n1>0&&n3>0)
						{
							for(i=0;i<=n3;i++)
							{
								
									s1=s1+'1';
							}
				for(i=0;i<=n1;i++)
							{
								
									s1=s1+'0';
								
							}
							System.out.println("third");
							
						}

		else
			
		{
			for(i=0;i<=n3;i++)
							{
								
									s1=s1+'1';
							}
				for(i=1;i<=n2;i++)
							{
								if(i%2!=0)
									s1=s1+'0';
								else
									s1=s1+'1';
							}
							for(i=1;i<=n1;i++)
							{
									s1=s1+'0';
							
							}
							System.out.println("fourth");
		}

System.out.println(s1);
			
					  }

        

					
					}
	}
}
			
			
