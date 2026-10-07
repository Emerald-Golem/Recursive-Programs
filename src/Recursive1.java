public class Recursive1 {
    public int recursion(int n){
        if(n>9&&n<1){
            return 0;
        }
        generator(0,n);
        return n;
    }

    public int generator(int n, int digits){

        int j =n;
        String s = ""+j;
        int l = s.length();
        if(l==digits||digits==1){
            System.out.println(j);
            return 0;
        }
        for(int k=0; k<9;k++) {
            generator((j*10)+(j%10)+1,digits);
            j++;
        }
    }

    public static void main(String[] args) {
        Recursive1 r = new Recursive1();
        r.recursion(3);
    }
}
