package exercices.calculator;


public class ExpressionEvaluator {
   public static int evaluate(String expression) {
       int res=-1;
       if (expression.equals("")) {
           res=0;
       }
       return res;
   }
}
