public class Pacman extends Character {
 
    protected StatePacman state;
    protected int time = 0;
    protected int force = 3;
     
    public Pacman(Point position){
        super(position);
        state = new StateBonus();
    }
     
    public void touch(Enemy e){
        state.touch(this, e);
    }
     
    public void eat(Pacboule p){
        if(p instanceof Bonus){
            state.becomeInvincible(this);
        }
    }
     
    @Override
    public void move(){
        super.move();
        state.move(this);
    }
     
    @Override
    public void paintOn(Graphics g){
        state.paintOn(this, g);
    }
     
    public boolean isDead(){
        return state.isDead();
    }
}