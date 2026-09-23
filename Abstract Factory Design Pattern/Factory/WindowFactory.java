package Factory;

import module.UiComponent;
import module.WindowsUiComponent;

public class WindowFactory extends GuiFactory{
    @Override
    public UiComponent getInstance() {
        return new WindowsUiComponent();
    }
}
