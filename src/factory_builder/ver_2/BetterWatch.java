package factory_builder.ver_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class BetterWatch implements Watch {
    @Override
    public void showTime() {
        GregorianCalendar calendar = new GregorianCalendar();

        DateFormat df = new SimpleDateFormat("dd MMM yyyy");

        System.out.println(df.format(calendar.getTime()));

    }
}
