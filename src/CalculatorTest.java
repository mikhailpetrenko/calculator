import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();


        myCalc.performOperation(10.5);
        myCalc.performOperation("+");
        myCalc.performOperation(5.2);
        myCalc.performOperation("*");
        myCalc.performOperation(10);
        myCalc.performOperation("=");
        myCalc.getResult();

        System.out.println(myCalc.getResult());
    }
    public static class Calculator {
        private List<Double> operands;
        private List<String> operations;
        private double result;
        public Calculator() {
            operands = new ArrayList<>();
            operations = new ArrayList<>();
            result = 0;
        }

        public void performOperation(double operand) {
            operands.add(operand);
        }
        public void performOperation(String operation) {
            operations.add(operation);
        }
        private void calculation(){
            result = operands.get(0);
            for (int i = 0; i <operations.size(); i++){
                if (operations.get(i).equals("+")) {
                    result += operands.get(i+1);
                } else if (operations.get(i).equals("-")) {
                    result-= operands.get(i+1);
                } else if (operations.get(i).equals("*")) {
                    result*= operands.get(i+1);
                } else if (operations.get(i).equals("/")) {
                    result/= operands.get(i+1);
                } else {
                        System.out.println("The operation sign is wrong");
                }
            }
        }
        public double getResult() {
            calculation();
            return result;
        }
    }
}
