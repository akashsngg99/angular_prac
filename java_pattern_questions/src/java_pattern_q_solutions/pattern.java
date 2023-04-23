package java_pattern_q_solutions;

class patterns{
    public void Square_Hollow_Pattern(int n)
    {
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
            
        }
        
        
    }
    
    public void Number_triangle_Pattern(int n)
    {
    	int i,j;
    	for(i=1;i<=n-1;i++)
    	{
    		for(j=1;j<n-i;j++)
    		{
    			System.out.print(" ");
    		}
    		for (j=1;j<=i;j++)
    		{
    			System.out.print(i+" ");
    		}
    		System.out.println();
    	}
    }
    
    public void Number_increasing_Pyramid_Pattern(int n)
    {
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
	
    }
    
    public void Number_increasing_reverse_Pyramid(int n)
    {
    	for(int i=n;i>=1;i--)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
    
    public void Number_changing_Pyramid(int n)
    {
    	int num=1;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(num+" ");
    			num=num+1;
    		}
    		System.out.println();
    		
    	}
    }
    
    public void Zero_One_Triangle(int n)
    {
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			if((i+j)%2==0) System.out.print(1+" ");
    			else System.out.print(0+" ");
    		}
    		System.out.println();
    			
    	}
    }
    
    public void Palindrome_Triangle(int n)
    {
    	int i,j;
    	for(i=1;i<=n;i++)
    	{
    		for(j=1;j< 2*(n-i);j++) {
    			System.out.print(" ");
    		}
    		
    		for(j=i;j>=1;j--)
    		{
    			System.out.print(j+" ");
    		}
    		
    		for(j=2;j<=i;j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
  
    }

	public void Rhombus(int n) {
		// TODO Auto-generated method stub
		int j;
		for(int i=1;i<=n;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}

	public void Diamond(int n) {
		// TODO Auto-generated method stub
		int i,j;
		
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print(" ");
                
            }
            
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        
        for(i=1;i<n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            
            for(j=1;j<n-i+1;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
	}
    
    
}
