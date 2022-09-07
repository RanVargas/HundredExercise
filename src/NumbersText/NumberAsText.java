package NumbersText;

public class NumberAsText {
    public static String numberAsText(final int number){
        final int remainder = number % 10;
        String valueAsText = "";
        char[] arrayValue = new String(Integer.toString(number)).toCharArray();
        StringBuilder valueAsTextB = new StringBuilder();
        for (var digit : arrayValue) {
            switch (digit) {
                case '0' -> valueAsTextB.append("ZERO ");
                case '1' -> valueAsTextB.append("ONE ");
                case '2' -> valueAsTextB.append("TWO ");
                case '3' -> valueAsTextB.append("THREE ");
                case '4' -> valueAsTextB.append("FOUR ");
                case '5' -> valueAsTextB.append("FIVE ");
                case '6' -> valueAsTextB.append("SIX ");
                case '7' -> valueAsTextB.append("SEVEN ");
                case '8' -> valueAsTextB.append("EIGHT ");
                case '9' -> valueAsTextB.append("NINE ");
            }
        }
        valueAsText =  valueAsTextB.toString().trim();


        return valueAsText;
    }
}
