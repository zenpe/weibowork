package com.test.zp.sort;

public class SortTest {
	
	public static void main(String[] args) {

		int[] a = CommonUtils.generateArray(20);
		
		CommonUtils.printArrays(a);
		
//		quickSort(a, 0, a.length-1);
//		CommonUtils.printArrays(a);
		
		
//		bubbleSort(a);
//		CommonUtils.printArrays(a);
		
		insertSort(a);
		CommonUtils.printArrays(a);
		
//		selectSort(a);
//		CommonUtils.printArrays(a);
		
	}

	
	/**
	 * quick Sort
	 * @param a
	 * @return
	 */
	public static void quickSort(int[] a, int begin, int end){
		int base = a[begin] ;
		while(begin <= end){
			while(begin < end && a[end] <= base){
				end--;
			}
			a[begin] = a[end];
			while(begin <= end && a[begin] > base){
				begin++;
			}
			a[end] = base;
		}
		
		
	}
	
	
	
	
	

	/**
	 * Bubble Sort
	 * @param a
	 * @return
	 */
	private static void bubbleSort(int[] a) {
		for(int i=a.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(a[j] > a[j+1]) CommonUtils.swap(a, j, j+1);
			}
		}
	}
	
	
	/**
	 * InsertSort
	 * @param a
	 * @return
	 */
	public static int[] insertSort(int[] a){
		for(int i=1; i<a.length; i++){
			int k = i;
			for(int j=i; j>=0; j--){
				if(a[i] > a[j]){
					k=j;
				}
			}
			
			int temp = a[i];
			while(i>k){
				CommonUtils.swap(a, i, i-1);
				i--;
			}
			a[k] = temp ;
			
		}
		return a;
	}
	
	/**
	 * Select Sort
	 * @param a
	 * @return
	 */
	public static int[] selectSort(int[] a){
		
		for(int i=0; i<a.length; i++){
			int k = i;
			for(int j=i; j<a.length; j++){
				if(a[j] > a[k]){
					k =j ;
				}
			}
			CommonUtils.swap(a, k, i);
		}
		
		return a;
	}
	
}
