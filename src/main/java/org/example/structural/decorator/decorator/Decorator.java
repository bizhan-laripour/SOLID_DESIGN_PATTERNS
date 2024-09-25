package org.example.structural.decorator.decorator;

public class Decorator extends Component{

    private final Component component;

    protected Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
