package factory_builder.ver_2;

public class Main {

    public static void main(String[] args) {
        WatchCreator wc1 = new SimpleWatchCreator();
        Watch watch1 = wc1.createWatch();
        watch1.showTime();

        WatchCreator wc2 = new BetterWatchCreator();
        Watch watch2 = wc2.createWatch();
        watch2.showTime();

        WatchCreator wc3 = getCreatorByName("Simple");
        Watch watch3 = wc3.createWatch();
        watch3.showTime();

    }

    public static WatchCreator getCreatorByName(String creator) {
        if (creator.equals("Simple")) {
            return new SimpleWatchCreator();
        } else if (creator.equals("Better")) {
            return new BetterWatchCreator();
        }

        throw new RuntimeException("Другие виды часов не поддерживаются" + creator);
    }
}
