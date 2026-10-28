public class Pokemon {
    public String name;

    public String[] status;

    public String[] moveList;
    //stats:
    public int HP;
    public int atk;
    public int def;
    public int spAtk;
    public int spDef;
    public int speed;

    public Pokemon(String name, String[] status, String[] moveList, int HP, int atk, int def, int spAtk, int spDef, int speed){
        this.name = name;
        this.status = status;
        this.moveList = moveList;
        this.HP = HP;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.speed = speed;
    }








}
