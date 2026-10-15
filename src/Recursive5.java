public class Recursive5 {
    public int helper(int c,int w){
        if(w>c){
            return 0;
        }
        int choc= c/w;
        int extra = c%w;
        return choc+helper(choc+extra,w);
    }
    public int chocolate(double m, double c, int w){
        int choc = (int) (m/c);
        return choc+helper(choc,w);
    }
    public static void main(String[] args) {
        Recursive5 r = new Recursive5();
        System.out.println(r.chocolate(250,2,3));
    }
}
