package program;
interface LambdaExpressions1{
	double add(double a, double b);
}
public class LambdaExpression {
	public static void main(String[] args) {
		LambdaExpressions1 addition = (a,b) -> {
			System.out.println("Addition");
			double result= a+b;
			System.out.println("result:"+result);
			return result;
		};
		LambdaExpressions1 subtract =(a,b)->{
			System.out.println("Subtraction");
			double result = a-b;
			return result;
		};
		//Syntax for lambda expression is (parameters List)->body(operations
		double a =1000.0, b=2000.0;
		addition.add(a, b);
		System.out.println("Subtraction:"+subtract.add(a,b));
	}
}
