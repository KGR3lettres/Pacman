public abstract class StatePacman{
        protected void setState(Pacman p, StatePacman state) {
            p.state = state;
        }
        protected void becomeAlive(Pacman p) {
            setState(p, new StateAlive());
        }
        protected void becomeInvincible(Pacman p) {
            setState(p, new StateInvincible());
            p.time = 40;}
        protected void becomeDead(Pacman p) {
            setState(p, new StateDead());
        }
        public abstract void touch(Pacman p, Enemy e);
        public void move(Pacman p) { }

        public boolean isDead(){
            return false;
        }
             
    }
    
}
