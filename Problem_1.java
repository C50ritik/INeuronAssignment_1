package in.ineuron;

public class Problem_1 {

	public static void main(String[] args) {

		System.out.println("INEURON -> ");
		
		int n=10;
		
		for(int i=0;i<n;i++) {
			//Below for loop is for "I"
			for(int j=0;j<n;j++) {
				if((i==0 || i==(n-1) || j==(n-1)/4)&&j<=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "N"
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "E"
			for(int j=0;j<n;j++) {
				if((j==(n-1)/2 || i==0 || i==(n-1) || i==(n-1)/2)&&j>=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "U"
			for(int j=0;j<n;j++) {
				if((j==(n-1)/2 && i!=(n-1) || (i==(n-1) && j>(n-1)/2 && j<(n-1)) || j==(n-1) && i!=(n-1))&&j>=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "R"
			for(int j=0;j<n;j++) {
				if((j==(n-1)/2 || ((i==0 || i==(n-1)/2) && j!=(n-1)) || (j==(n-1) && i>0 && i<(n-1)/2) || i==j)&&j>=(n-1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "O"
			for(int j=0;j<n;j++) {
				if(((j==(n-1)/4|| j==3*(n-1)/4)&&i!=0&&i!=(n-1)) || ((i==0 || i==(n-1))&& j>(n-1)/4 && j<3*(n-1)/4))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Below for loop is for "N"
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
