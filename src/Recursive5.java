public class Recursive5 {
    public int starter(double m,double c,int w){
        return chocolate(m,c,w,0);
    }
    public int chocolate(double m, double c, int w, int wrappers){
        if(wrappers>=w){
            return 1+chocolate(m,c,w,wrappers-w);
        }
        if(c>m){
            return 0;
        }
        return 1+chocolate(m-c,c,w,wrappers+1);

    }
    public static void main(String[] args) {
        Recursive5 r = new Recursive5();
        System.out.println(r.starter(102,0.1,2));
    }
}
