import java.util.*;
public class InsertionSort {
	public static void main (String[] args){
		int[] list = {4,3,2,5,9,6,3,21,42,4,3,6};
		list = insertionSort(list);
		System.out.println(Arrays.toString(list));
	}
	public static int[] insertionSort(int[] list){
		if(list.length <2){
			return list;
		}
		for(int i =1; i<list.length;i++){
			int j = i-1;
			int current = list[i];
			while(j>-1 && list[j]>current){
				list[j+1] = list [j];
				j--;
			}
			list[j+1] = current;
		}
		return list;
	}
}
