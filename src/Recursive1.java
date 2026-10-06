public class Recursive1 {
    public int recursion(int n){
        if(n>9&&n<1){
            return 0;
        }
        generator(0,n);
        return n;
    }

    public int generator(int n, int digits){
        int i = n+1;
        int j =i;
        String s = ""+j;
        int l = s.length();
        if(l>digits){
            return 0;
        }
        while(i>10) {
            if (i % 10 > (i / 10) % 10) {
                i /= 10;
            } else {

            }

            if (l == digits) {
                System.out.println(j);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Recursive1 r = new Recursive1();
        r.recursion(2);
    }
}
