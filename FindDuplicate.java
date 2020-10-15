/***
 * Array Duplicate Values 
 * Q1. Print all duplicate values ?. ANSWER :- functionName :- findDuplicate
 * Q2. Print all missing values ?. ANSWER :- functionName:- findMissingElement
 * Q3. find count of Duplicate values. ANSER :- 
 * Q4. Make an perfact array that do not contain duplicate values. ANSWER :- FunctionName :- removeDuplicateAndPutMissingValue
 */


class FindDuplicate{

    public static void findDuplicate(int[] arr,int len){
        int[] sortedArr = swapSort(arr,len);
        System.out.print("Duplicate Values:- [");
        for(int i=0;i<len;i++){
            if(sortedArr[i] != i+1){
                System.out.print(sortedArr[i]+" ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
    public static void findMissingElement(int[] arr,int len){
        int[] sortedArr = swapSort(arr,len);
        System.out.print("Missing Value :- [");
        for(int i=0;i<len;i++){
            if(sortedArr[i] != i+1){
                System.out.print((i+1) +" ");
            }
        }
        System.out.print("]");
        System.out.println("");
    }
    public static void removeDuplicateAndPutMissingValue(int[] arr,int len){
        int[] sortedArr = swapSort(arr,len);
        for(int i=0;i<len;i++){
            if(sortedArr[i] != i+1){
                sortedArr[i] = i+1;
            }
        }
        System.out.print("Perfect array is :-        [");
        display(sortedArr,len);
		System.out.print("]");
        System.out.println("");
       

    }
    public static int[] swapSort(int[] arr,int len){
        int i=0;
        int temp=0;
        while(i<len){
            if(arr[i]!=arr[arr[i]-1]){
                temp =arr[i] + arr[arr[i]-1];
                arr[arr[i]-1] = temp-arr[arr[i]-1];
                arr[i] = temp-arr[arr[i]-1];
            }else{
                i++;
            }
        }
        return arr;
    }
    public static void display(int[] arr,int len){
		for(int i=0;i<len;i++){
			System.out.print(arr[i]);
			if(i!=len-1){
				System.out.print(" ");
			}
		}
    }
    public static void main(String[] args){
        int[] arr ={1, 6, 10, 4, 8, 9, 7, 1, 9, 10};
        int len = arr.length;
        FindDuplicate obj = new FindDuplicate();

        /***** Display array ******/	
		System.out.print("Given array is :-        [");
		obj.display(arr,len);
		System.out.print("]");
        System.out.println("");
        /**** End of Display ***** */
         
        /*System.out.print("Perfect array is :-        [");
		obj.display(perfectArr,len);
		System.out.print("]");
        System.out.println("");*/

        obj.findDuplicate(arr,len);
        obj.findMissingElement(arr,len);
        obj.removeDuplicateAndPutMissingValue(arr,len);
    }

}