package proxy_compositor;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }
    public void remove(Component component) {
        children.remove(component);
    }
    public Component[] getChildren() {
        return (Component[]) children.toArray();
    }

    @Override
    public void doWork() {
        for (Component component: children) {
            component.doWork();
        }
    }
}
