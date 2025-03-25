package br.pucrs;

public class FindMax {
    public int iterations = 0;
        public FindMax(){
    
        }    
    
        public  long maxVal(long[] arr, int size){
            long max = arr[0];
            for (int i = 1; i < size; i++) { 
                iterations++; 
            if( arr[i] > max ) 
                max = arr[i];
        }
        return max;
    }

    public long maxVal2(long[]A, int init, int end){
        if(end - init <= 1){
            return max(A[init], A[end]);
        }
        iterations++;
        int m = (init+end)/2;
        long v1 = maxVal2(A,init,m);   
        long v2 = maxVal2(A,m+1,end);
        return max(v1,v2);
        
    }

    private long max(long a, long b){
        iterations++;
        return Math.max(a, b);
    }
}
