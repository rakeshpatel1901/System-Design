package Factory;

import module.MacUiComponent;
import module.UiComponent;

public class MacFactory extends GuiFactory{
    @Override
    public UiComponent getInstance() {
        return new MacUiComponent();
    }
}
