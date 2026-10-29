import java.text.DecimalFormat;

public class DecimalExample {
    public static void main(String[] args) {
        double money = 1234567.89;

        DecimalFormat df =
            new DecimalFormat("#,##0.00");

        System.out.println(df.format(money));
    }
}
