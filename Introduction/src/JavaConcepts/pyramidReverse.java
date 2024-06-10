package JavaConcepts;

public class pyramidReverse {

	public static void main(String[] args) {
		int k=1;
		/*for(int i=4;i>=0;i--)
		{
			for(int j=1;j<=4-i;j++)
				{
					System.out.print(k);
					System.out.print("\t");
					k++;
				}
			System.out.println("");
		}*/
		
		//Also works like this
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				{
					System.out.print(j);
					System.out.print("\t");
					//k++;
				}
			System.out.println("");
		}

	}

	}


