package exercices.calculator;


public class ExpressionEvaluator {
    public static int evaluate(String expression) {
        int somme=0;
        int Nombre =0;
        if (expression.isEmpty()) {
            return 0;
        }else{
            char[] table = expression.toCharArray();
            for ( char ch : table ) {
                if( Character.isDigit(ch)){
                    Nombre   =  Nombre * 10 + (ch- '0');
                }else if(ch==','){
                   somme+= Nombre;
                   Nombre =0;
                }
            }
            somme += Nombre;
            }

        return somme;
    }
}
