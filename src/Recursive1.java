public class Recursive1 {
    public void recursion(int n){
        generator(0,n);
    }

    public void generator(int n, int digits){

        int j =n;
        String s = ""+j;
        int l = s.length();
        if(l==digits&&j!=0){
            System.out.println(j);
        }
        for(int k=(j%10)+1; k<=9;k++) {
            generator((j*10)+k,digits);
        }
    }

    public static void main(String[] args) {
        Recursive1 r = new Recursive1();
        r.recursion(7);
    }
}
