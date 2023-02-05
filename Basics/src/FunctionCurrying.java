import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionCurrying {
    public static void main(String[] args) {
        IntFunction<Function<Integer,Integer>> curryAdder=u->v->u+v;
        IntFunction<Function<Integer,Integer>> curryMultiplier =u->v->u*v;
        IntFunction<IntFunction<Function<Integer,Integer>>> triAdder = u->v->w->u*v*w;
        System.out.println("Addition of 2 and 3 is "+ curryAdder.apply(2).apply(3));
        System.out.println("Multiplication of 2 and 3 is "+ curryMultiplier.apply(2).apply(3));
        System.out.println("Multiplication of 2 ,3 ,6 is "+ triAdder.apply(2).apply(3).apply(6));

    }
}
