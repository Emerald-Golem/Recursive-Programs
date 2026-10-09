public class Recursive2 {
    public int recursion(int n , int m){
        if(m==0){
            return n;
        }
        int i = ((n*(n-1))+2*(n))/2;
        if(m==1) {
            return i;
        }else if(n>1){
            return recursion(n,m-1) + recursion(n-1,m);
        }
        return recursion(n,m-1);
    }

    public static void main(String[] args) {
        Recursive2 r = new Recursive2();
        System.out.println(r.recursion(0,4));
    }
}
