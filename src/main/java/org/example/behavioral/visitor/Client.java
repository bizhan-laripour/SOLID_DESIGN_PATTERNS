package org.example.behavioral.visitor;

public class Client {

    public static void main(String[] args) {
        Dot dot = new Dot(1 , 10 , 55);
        Circle circle = new Circle(2,23,15,10);
        Rectangle rectangle = new Rectangle(3,10,17,20,30);
        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape compoundShape1 = new CompoundShape(5);
        compoundShape1.add(dot);

        compoundShape.add(compoundShape1);

        XmlExportVisitor xmlExportVisitor = new XmlExportVisitor();
        String xml = xmlExportVisitor.export(compoundShape);
        System.out.println(xml);
    }
}
