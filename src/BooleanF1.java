public class BooleanF1 {
    public static void main (String []args){
        boolean a = true || false;
        boolean b = true && true;
        boolean c = false && true;
        boolean d = a && (c || b);
    }
}
