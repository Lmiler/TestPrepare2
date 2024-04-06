public class Actor {
    private String name;
    private int age;
    private int acts;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getActs() {
        return acts;
    }
    int actorType(){
        int type = 0;
        if(this.age >= 25 && this.acts >= 5){
            type = 2;
        } else if(this.age >= 16 && this.acts >= 3){
            type = 1;
        }
        return type;
    }
}
