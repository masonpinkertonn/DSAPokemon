public class Pokemon {
    public String name;
    public String[] status;
    public String[] moveList;
    public String type;
    public String secondaryType;
    //stats:
    public int HP;
    public int atk;
    public int def;
    public int spAtk;
    public int spDef;
    public int speed;

    public Pokemon(String name, String[] status, String[] moveList, int HP, int atk, int def, int spAtk, int spDef, int speed){
        this.name = name;
       
        this.status = new String[1];
        
        String csvFile = "Gen1PokemonStats.csv";
        String line = "";
        //fill in the instance variables from this


    }








}
