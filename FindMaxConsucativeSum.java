/*******************************************
	Find 3 consucative Max sum of a given array
	Example:---
		arr ={5,3,1}
		k = 2 // Find sum of 2 consucative number;

		output :- 8

		arr ={1,8,30,-5,8,20}
		k= 3 // Find sum of 3 consucative number 
		output = 39
*******************************************/

class FindMaxConsucativeSum{
	
	public static void display(int[] arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]);
			if(i!=len-1){
				System.out.print(" ");
			}
		}
	}
	public static int[] maxConsucativeSum(int[] arr,int len,int k){
		int maxSum=0,sum=0;
		int startIndex=0;
		int endIndex=0;
		int j=0;
		for(int i=0;i<len;i++){
			if((i-j+1) <= k){
				sum +=arr[i];
				maxSum=sum;
			}else{
				sum = sum -arr[j]+arr[i];
				if(sum > maxSum){
					maxSum =sum;
					startIndex =j+1;
					endIndex = i;
				}
				j++;
			}
		}
		int[] response={startIndex,endIndex,maxSum};
		return response;
	}
	
	public static void main(String[] args){
		int[] arr ={1,8,30,-5,8,20};
		int len = arr.length;
		int k=2; // number of consucative item
		FindMaxConsucativeSum obj = new FindMaxConsucativeSum();
		
		
		/***** Display array ******/	
		System.out.print("Given array is :-[");
		obj.display(arr,len);
		System.out.print("]");
		System.out.println("");
		/****** Display Max sum of 3 consucative number *****/
		
		int[] response= obj.maxConsucativeSum(arr,len,k);
		int startIndex = response[0];
		int endIndex = response[1];
		int maxSum = response[2];
		System.out.print("Max Sum array is :-[");
		for(int i=startIndex;i<=endIndex;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println("");
		
		System.out.println("MaxSum=="+maxSum);
	}

}
