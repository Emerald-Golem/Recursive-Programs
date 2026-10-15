public class Recursive4 {
    public void recursion(String s, int n){
        int l = s.length();
        int temp = (int) ((l/2.0)+0.5);
        if(l==n&&helper(s.substring(0,l/2))==helper(s.substring(temp))){
            System.out.println(s);
        }
        if(l>n){
            return;
        }
        recursion(s+"0",n);
        recursion(s+"1",n);
    }
    public int helper(String s){
        if(s.indexOf("0")!=-1){
            return helper(s.substring(0,s.indexOf("0"))+s.substring(s.indexOf("0")+1));
        }else{
            return s.length();
        }
    }
    public void starter(int n){
        recursion("",n);
    }
    public static void main(String[] args) {
        Recursive4 r = new Recursive4();
        r.starter(10);
    }
}
