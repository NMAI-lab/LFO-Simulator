/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package toydomain;

import lfo.agents.discrete.*;
import java.util.LinkedList;
import java.util.List;
import lfo.simulator.Action;
import lfo.simulator.perception.Perception;
import java.util.Random;
import lfo.agents.Agent;
import util.Pair;

/**
 *
 * @author santi
 */

// LEVEL 2 agent
public class ToyLevel2AgentA extends Agent {
    
    public void start()
    {
    }    
    
    public Action cycle(int id,Perception p, double timeStep) {
        if (p.getInteger("state")==0) return new Action("right",id);
        if (p.getInteger("state")==1) return new Action("right",id);
        return new Action("left",id);
    }

    public List<Integer> internalStateToBayesNetVariables() {
        List<Integer> l = new LinkedList<Integer>();
        return l;
    }

}
