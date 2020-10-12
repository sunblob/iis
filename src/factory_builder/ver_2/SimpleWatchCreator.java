package factory_builder.ver_2;

public class SimpleWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new SimpleWatch();
    }
}
