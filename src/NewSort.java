public class NewSort {

	public static void main(String[] args) {
		

		int arr[]={12,23,6,34,18,93};
		int n=6;
		
		for(int i=0; i<n; i++)
		{
			int x=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>x)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=x;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
