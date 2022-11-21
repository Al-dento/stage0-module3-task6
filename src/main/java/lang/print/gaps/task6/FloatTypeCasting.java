package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
       int resultNumber = Math.round(numberToBeRounded);
        System.out.println(resultNumber);
    }

    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        floatTypeCasting.roundNumber(1234L);
    }
}
