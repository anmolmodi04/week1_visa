package com.visa.prj.util;

public class ArrayUtil {
	
	public static void sort(Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if(elems[i].compareTo(elems[j])> 0 ) {
					Comparable temp = elems[i];
					elems[i] = elems[j];
					elems[j] = temp;
				}
			}
		}
	}
	
	public  static int getSum(int[] data) {
		int sum = 0;
		for(int i=0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static void swap(int xp, int yp) 
	{ 
	    int temp = xp; 
	    xp = yp; 
	    yp = temp; 
	} 
	
	public static void sort(int[] elems) {
		   int i, j; 
		   for (i = 0; i < (elems.length)-1; i++)       
		  
		       // Last i elements are already in place    
		       for (j = 0; j < (elems.length)-i-1; j++)  
		           if (elems[j] > elems[j+1]) {
		        	   int temp = elems[j];
		               elems[j] = elems[j+1];
		               elems[j+1] = temp;
		           }
		}
	
	public static int getCount(int[] elems, int no) {
		int count =0;
		for(int i=0;i<elems.length;i++) {
			if(elems[i] == no) {
				count++;
			}
		}
		return count;
	}
	
	public static int[] convert(int[][] data) {
		int data1[];
		data1 = new int[(data[0].length * data.length)];
		int k=0;
		int i,j;
		for(i=0;i<data.length;i++) {
			for(j=0;j<data[0].length;j++) {
				data1[k] = data[i][j];
				k++;
			}
		}
		return data1;
	}
}
