/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lfo.simulator.objects;

import lfo.simulator.Action;
import lfo.simulator.State;
import lfo.simulator.shapes.Shape;
import util.XMLWriter;
import java.util.List;
import org.jdom.Element;

/**
 *
 * @author santi
 */
public class Dirt extends PhysicalObject {

    public Dirt(Shape s, double x, double y, double a) {
        position.x = x;
        position.y = y;
        angle = a;
        shape = s;
    }

    public Dirt(Element e) {
        position.x = Double.parseDouble(e.getChildText("x"));
        position.y = Double.parseDouble(e.getChildText("y"));
        angle = Double.parseDouble(e.getChildText("angle"));
        shape = Shape.fromxml(e.getChild("shape"));
        ID = Integer.parseInt(e.getAttributeValue("id"));
    }

    public void toxml(XMLWriter w) {
        w.tagWithAttributes("dirt", "id = \"" + ID + "\"");
        w.tag("x",position.x);
        w.tag("y",position.y);
        w.tag("angle",angle);
        w.tag("shape");
        shape.toxml(w);
        w.tag("/shape");
        w.tag("/dirt");
    }

    public Object clone() {
        return new Dirt(shape,position.x,position.y,angle);
    }

    public void cycle(List<Action> actions, State s, double time) throws Exception {
    }
}
