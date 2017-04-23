import java.util.*;

class Calc {



    public static int calcExpression(String s, HashMap<Character, Integer> map) {

        char [] arr = s.toCharArray();

        Stack<Integer> stack = new Stack<>();
        Stack<Character> ops = new Stack<>();

        int result = 0;
        Character op = null;

        for(int i=0; i < arr.length; i++) {
//            System.out.println(result);

            if (arr[i] == ')') {

                int lastInt = stack.pop();
                Character lastOp = ops.pop();
                
                if ( lastOp !=null)
                    if (lastOp == '*') result*= lastInt;
                    else result += lastInt;
                
                continue;
            }

            if (arr[i] == '(') {
                stack.push(result);
                ops.push(op);

                result = 0;
                op=null;
                continue;
            }

            if ( arr[i] == '+' || arr[i] == '*' ) {
                op = arr[i];
                continue;
            }

            int currVal;

            if (arr[i] >= 'a' && arr[i] <= 'z') {
                currVal = map.get(arr[i]);
            } else {
                currVal = Character.getNumericValue(arr[i]);
            }

            if (op == null) {
                result = currVal;
            } else {
                if (op == '*') result*= currVal;
                else result += currVal;
            }
        }

        return result;
    }


    public static void main (String [] args) {

        //System.out.println(calcExpression("((2+3)*3)", new int[] {}));

        //System.out.println(calcExpression("1*3+2+6*1+((2+3)*3)", new int[] {}));


        //System.out.println(calcExpression("1+9+(6+1+(1+2+3)*3)", new int[] {}));
// 25

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('x', 1);

        System.out.println(calcExpression("1+9+(6+1+(x+2+3)*3)", map));

    }
}
