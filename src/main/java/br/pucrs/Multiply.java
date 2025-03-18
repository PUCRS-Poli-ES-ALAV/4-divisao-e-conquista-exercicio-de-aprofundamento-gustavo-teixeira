package br.pucrs;

public class Multiply {
    public Multiply(){
    }

    public long multiply(long x, long y, int nBits){
        if(nBits == 1){
            return x*y;
        }

        int m = nBits/2;

        long a = (long)(x/Math.pow(2,m));

        long b = x%(long)Math.pow(2,m);

        long c = (long)(y/Math.pow(2,m));
        
        long d = y%(long)Math.pow(2,m);


        long e = multiply(a,c ,m);

        long f = multiply(b,d ,m);

        long g = multiply(b,c ,m);
        
        long h = multiply(a,d ,m);




        return (long)((Math.pow(2,2*m)*e)+(Math.pow(2,m)*(g+h)+f));
    }

}
