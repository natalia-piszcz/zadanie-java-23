import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        for(int days=1; days<=7; days++){
            System.out.println(days + " dzień tygodnia to " + CalandarConverter.convertDayToString(days));
        }
    }
}
