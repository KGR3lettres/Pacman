package PACMAN;

public abstract class StateBonus extends StatePacman {

    protected void becomeInvincible(GPacboule g) {
        setState(g, new StateInvincible());
    }
    
}
