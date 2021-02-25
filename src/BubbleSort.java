
public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]={12,23,6,34,18,93};
		int n=6, temp;
		boolean x;
		
		for(int i=0; i<n; i++)
		{
			x=false;
			for(int j=0; j<n-1; j++)
			{
				if(arr[j+1]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					x=true;
				}
			}
			if(x==false)
				break;
		}
		
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
