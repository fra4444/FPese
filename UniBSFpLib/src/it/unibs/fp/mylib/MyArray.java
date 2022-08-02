package it.unibs.fp.mylib;

public class MyArray {
	
	public void riordinaCrescente(int[] array) {
		
	}
	
	public void riordinaDecrescente(int[] array) {
		
	}
	
	public void riordinaCrescente(double[] array) {
		
	
	}
	
	public void riordinaDecrescente(double[] array) {
		
		
	}
	
	public int trovaMax(int[] array) {
		int max = array[0];
		for(int i=1; i<array.length; i++) {
			if(max<array[i]) max = array[i];
		}
		return max;
	}
	
	public int trovaMin(int[] array) {
		int min = array[0];
		for(int i=1; i<array.length; i++) {
			if(min>array[i]) min = array[i];
		}
		return min;
	}
	
	public double trovaMax(double[] array) {
			double max = array[0];
			for(int i=1; i<array.length; i++) {
				if(max<array[i]) max = array[i];
			}
			return max;
		}
	
	public double trovaMin(double[] array) {
		double min = array[0];
		for(int i=1; i<array.length; i++) {
			if(min>array[i]) min = array[i];
		}
		return min;
	}
	
	public int trovaIgnoreCase(String[] array, String string) {
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(string.equalsIgnoreCase(array[i])) { 
			index = i;
			break;
			}
		}
		return index;
	}
	
	public int trova(int[] array, int intero) {
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(array[i]==intero) { index = i;
			break;
			}
		}
		return index;
	}
	
	public int trova(double[] array, int doubl) {
		int index = -1;
		for(int i=0; i<array.length; i++) {
			if(array[i]==doubl) { index = i;
			break;
			}
		}
		return index;
	}
	
	
	
}
