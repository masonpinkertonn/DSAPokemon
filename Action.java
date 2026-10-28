public class Action {
    public String name;
    public String description;
    public String attackType;
    public String type;
    
    public Action(String name, String description, String attackType, String type) {
        this.name = name;
        this.description = description;
        this.attackType = attackType;
        this.type = type;
    }

    public void useAction(Pokemon owner) {
        //what the action does
        if (type.equals("physical")) {

        }
        else if (type.equals("special")) {

        }
        else if (type.equals("status")) {

        }
    }

    
    public double efficacy(Action move, Pokemon defender){
        //check types and use datatable to find efficacy
        return 0;
    }
}
