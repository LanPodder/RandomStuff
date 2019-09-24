package playingWithLambdas;

import java.util.function.Function;

public class LambdaParameter <T>{
	public static void main(String[] args) {
		LambdaParameter<Integer> inter = new LambdaParameter<>();
		LambdaParameter<String> stringer = new LambdaParameter<>();
		LambdaParameter<Double> doubler = new LambdaParameter<>();
		System.out.println(inter.twice(x -> x*x, 4));
		System.out.println(stringer.twice(x->x+x, "."));
		System.out.println(doubler.twice(x->x+x, 3.0));
		
		System.out.println(inter.twice(new MyFunction<Integer>() {
			@Override
			public Integer run(Integer f) {
				return f*f;
			}
		},4));
	}
	
	public T calc(Function<T, T> s, T x) {
		return s.andThen(s).apply(x);
	}
	
	public T twice(MyFunction<T> f, T x) {
		return f.run(f.run(x));
	}
}

interface MyFunction<T>{
	public T run(T f);
}
