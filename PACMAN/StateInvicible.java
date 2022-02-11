package PACMAN;
public class StateInvicible extends StatePacman{
    
@Override
public void touch(Pacman p, Enemy e){
    if (p.force > 0){
        --p.force;
        p.moveToStart();
    }
    if (p.force == 0){
        becomeDead(p);
    }
}

}
