import java.util.*;
import java.util.Scanner;
class cpyzeros
{
	public static void main(String args[])
	{
		int arr[]={1,2,0,3,4,0,5,0,7};
		int len = arr.length-1;
		for(int i=len;i>=0;i--)
		{
			if(arr[i]==0 && i!=len)
			{
				for(int j=len;j>i;j--)
				{
					if(j<len)
					{
						arr[j+1]=arr[j];
					}
				}
				arr[i+1]=0;
			}
		}
		for(int i=0;i<len;i++){
		System.out.print(arr[i]);
		}
	}
}