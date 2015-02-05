// Author: Nikolce Ambukovski
// Student Number: s2008618

package simulator.states;

import simulator.SimulationManager;

public class SimStateLosing extends SimState {

    public SimStateLosing(SimulationManager simulationManager) {
        super(simulationManager);
        this.simState = SimStateType.LOSING;
    }

    @Override
    public void runSimForward() {
        // No action taken in this state
    }

    @Override
    public void runSimBackward() {
        // No action taken in this state
    }

    @Override
    public void stopSim() {
        // No action taken in this state
    }

    @Override
    public void resetSim() {
        simulationManager.setSimStateToStopped();
        simulationManager.reset();
    }

    @Override
    public void stepSimForward() {
        // No action taken in this state
    }

    @Override
    public void stepSimBackward() {
        // No action taken in this state
    }

    @Override
    public void speedUpSim() {
        // No action taken in this state
    }

    @Override
    public void slowDownSim() {
        // No action taken in this state
    }

}
