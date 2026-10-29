public class Main
{
    public static void main(String[] args) {
        try {
            Pokedex.readMoves();
        } catch (Exception e) {
            System.out.println(".()");
        }
        
    }

    /*public void battle(Trainer t1, Trainer t2) {
        Trainer[] gurrs = compareSpeed(t1, t2);
        Trainer start = gurrs[0];
        Trainer next = gurrs[1];
        String choice;
        boolean gameStatus = true;
        Action player1action = null;
        Action player2action = null;
        while (gameStatus) {
            choice = start.chooseAction();

            if (choice == "switch") {
                // list
            }
            else {
                player1action = start.fight();
            }
            choice = next.chooseAction();
            if (choice == "switch") {
                // list
            }
            else {
                player2action = next.fight();
            }

            playOut(player1action, player2action);

            gameStatus = proceed();
        }
    }

    public Trainer[] compareSpeed(Trainer t1, Trainer t2) {
        return null;
    }

    public void playOut(Action p1, Action p2) {

    }

    public boolean proceed() {
        return false;
    }*/
}