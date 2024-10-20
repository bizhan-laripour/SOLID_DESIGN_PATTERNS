package org.example.behavioral.visitor;

public class XmlExportVisitor implements Visitor{


    public String export(Shape ... shape){
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Shape sh : shape) {
            sb.append(sh.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitDot(Dot dot) {
        StringBuilder builder = new StringBuilder();
        builder.append("<dot> \n").append("<id>").append(dot.getId()).append("</id>\n")
                .append("<x>").append(dot.getX()).append("</x>\n")
                .append("<y>").append(dot.getY()).append("</y>\n").append("</dot>");
        return builder.toString();
    }

    @Override
    public String visitCircle(Circle circle) {
        StringBuilder builder = new StringBuilder();
        builder.append("<circle> \n").append("<id>").append(circle.getId()).append("</id>\n")
                .append("<x>").append(circle.getX()).append("</x>\n")
                .append("<y>").append(circle.getY()).append("</y>\n")
                .append("<radius>").append(circle.getRadius()).append("</radius>\n")
                .append("</circle>");
        return builder.toString();
    }

    @Override
    public String visitRectangle(Rectangle rectangle) {
        StringBuilder builder = new StringBuilder();
        builder.append("<rectangle> \n").append("<id>").append(rectangle.getId()).append("</id>\n")
                .append("<x>").append(rectangle.getX()).append("</x>\n")
                .append("<y>").append(rectangle.getY()).append("</y>\n")
                .append("<width>").append(rectangle.getWidth()).append("</width>\n")
                .append("<height>").append(rectangle.getHeight()).append("</height>\n")
                .append("</rectangle>");
        return "";
    }

    @Override
    public String visitCompoundGraphic(CompoundShape cg) {
        return "<compound_graphic>" + "\n" +
                "   <id>" + cg.getId() + "</id>" + "\n" +
                _visitCompoundGraphic(cg) +
                "</compound_graphic>";
    }


    public String _visitCompoundGraphic(CompoundShape cg) {
        StringBuilder builder = new StringBuilder();
        cg.children.forEach(shape -> {
            String obj = shape.accept(this);
            // Proper indentation for sub-objects.
            obj = "    " + obj.replace("\n", "\n    ") + "\n";
            builder.append(obj);
        });
        return builder.toString();
    }
}
