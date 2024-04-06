public class Act {
    private String name;
    private int length;
    private Actor[] actors;
    private int level;

    public Act(String name, int level, int length){
        this.name = name;
        this.length = length;
        this.level = level;
        this.actors = new Actor[0];
    }
    boolean addActor(Actor actor){
        boolean isAdded = false;
        if(!this.doesExist(actor)) {
            if (actor.actorType() >= level) {
                isAdded = true;
                Actor[] temp = new Actor[this.actors.length + 1];
                for (int i = 0; i < this.actors.length; i++) {
                    temp[i] = this.actors[i];
                }
                temp[temp.length - 1] = actor;
                this.actors = temp;
            }
        }
        return isAdded;
    }
    boolean doesExist(Actor actor){
        boolean exist = false;
        for (int i = 0; i < this.actors.length; i++) {
            if(actor.getName().equals(this.actors[i].getName()) &&
                    actor.getAge() == (this.actors[i].getAge())){
                exist = true;
                break;
            }
        }
        return exist;
    }
    String mostSkilled(){
        int mostActs = this.actors[0].getActs();
        String name = this.actors[0].getName();
        for (int i = 1; i < this.actors.length; i++) {
            if(this.actors[i].getActs() > mostActs){
                mostActs = this.actors[i].getActs();
                name = this.actors[i].getName();
            }
        }
        return name;
    }
}
