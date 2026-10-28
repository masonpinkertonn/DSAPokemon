public class Action {
    public String name;
    public String description;
    public String attackType;
    public String type;
    public int pp;
    
    public Action(String name, String description, String attackType, String type, int pp) {
        this.name = name;
        this.description = description;
        this.attackType = attackType;
        this.type = type;
        this.pp = pp;
    }

    public void useAction(Pokemon owner) {
        if (type.equals("physical")) {

        }
        else if (type.equals("special")) {

        }
        else if (type.equals("status")) {

        }
    }

    public String display() {
        return null;
    }
}
