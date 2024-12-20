package exercices.calculator;


public class ExpressionEvaluator {
   public static int evaluate(String expression) {
       int somme=0;
       int res=-1;
       if (expression.equals("")) {
           res=0;
       }else{
           for (int i=0;i<expression.length();i++) {
               char ch=expression.charAt(i);
               if (ch == ',')   continue;
               int chiffre =Integer.parseInt(String.valueOf(ch));
               somme += chiffre;
           }
           res = somme;
       }
       return res;
   }
}
