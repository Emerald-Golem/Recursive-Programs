public class Recursive3 {
    public void recursion(int l, String s){
        if(s.length()==l) {
            System.out.println(s);
        } else if (s.length()>l) {
            return;
        }
        recursion(l, s+"0");
        if (s.length()==0||!s.substring( s.length() - 1).equals("1")) {
            recursion(l, s + "1");
        }

    }

    public static void main(String[] args) {
        Recursive3 r = new Recursive3();
        r.recursion(4,"");
    }
}
