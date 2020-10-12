package factory_builder.ver_2;

public class BetterWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new BetterWatch();
    }
}
