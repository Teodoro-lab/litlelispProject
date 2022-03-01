import java.util.Stack;

public class PrefixEvaluator {

    static double evaluate(String exprsn) {

        Stack<String> stack = new Stack<String>();
        String numString = "";
        String currentOperand = " ";

        for (int j = exprsn.length() - 1; j >= 0; j--) {
            Character symbol = exprsn.charAt(j);

            if (isOperator(symbol)){
                currentOperand = String.valueOf(symbol);
                if (numString.length() > 0){
                    StringBuilder strReverser = new StringBuilder();
                    strReverser.append(numString);
                    stack.push(strReverser.reverse().toString());
                    numString = "";
                }
            }

            else if (symbol.equals('(')){
                Double semiresult = null;
                String smbFromStack = stack.pop();

                int count = 0;
                while(!smbFromStack.equals(")")){
                    count++;
                    if(semiresult != null && isNumeric(smbFromStack))
                        semiresult = operate(semiresult, Double.valueOf(smbFromStack), currentOperand);

                    else if(isNumeric(smbFromStack))
                        semiresult = Double.valueOf(smbFromStack);

                    smbFromStack = stack.pop();
                }

                if (count <= 1 && currentOperand.equals("-"))
                    stack.add(String.valueOf(semiresult * -1));
                else 
                    stack.push(String.valueOf(semiresult));

            } else if (Character.isDigit(symbol) || symbol.equals('.')){
                numString += String.valueOf(symbol);
            } else if (Character.isSpaceChar(symbol) || isOperator(symbol)) {
                StringBuilder strReverser = new StringBuilder();
                strReverser.append(numString);
                stack.push(strReverser.reverse().toString());
                numString = "";
            } else {
                stack.push(String.valueOf(symbol));
            }
        }

        return Double.parseDouble(stack.pop());
    }

    public static Boolean isOperator(char c) {
        if(c == '+' || c == '-' || c == '*' || c == '/')
            return true;
        return false;
    }

    private static double operate(double number1, double number2, String operator) {
        switch (operator) {
            case ("+"):
                return number1 + number2;
            case ("-"):
                return number1 - number2;
            case ("*"):
                return number1 * number2;
            case ("/"):
                return number1 / number2;
        }
        return number1;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}