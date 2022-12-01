/**
 * program
 */
public class program {
    public static void main(String[] args) {
        var a = 123;
        var b = "12bb3";
        System.out.println(b);
        System.out.println(a);
        var d = 123.123;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
        System.out.println(b.charAt(2)); //b только в стрингах
    }

static String getType(Object o) {
    return o.getClass().getSimpleName();
}

    
}
    
