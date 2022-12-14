public class peepoo{
    public static int collatz(long x){
        int counter = 0;
        while(x!=1){
            counter++;
            if(x%2==0){
                x=x/2;
            }else{
                x=1+3*x;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        int g = 0;
        int c;
        long d = 0;
        for(long i=1;i<1000000; i++){
            c = collatz(i);
            if(c>g){
                g=c;
                if(i>d){
                    d=i;
                }
            }
        }
        System.out.println(d);
    }
}
