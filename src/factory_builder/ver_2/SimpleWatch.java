package factory_builder.ver_2;

import java.util.Date;

public class SimpleWatch implements Watch{
    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
