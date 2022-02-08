import java.text.DecimalFormat;

public class Utils {
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        String pattern = "###";

        if (precisie > 0) {
            pattern += "." + "0".repeat(precisie);
        }

        DecimalFormat df = new DecimalFormat(pattern);
        return df.format(bedrag);
    }
}
