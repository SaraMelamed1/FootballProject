import java.util.Random;


    public class Player {

        private static int COUNT_ID = 1;
        private int id;
        private String firstName;
        private String lastName;

        private int countGoals;

        public Player(){
            this.id = COUNT_ID;
            COUNT_ID++;
            this.countGoals =0;
            Random random = new Random();
            this.firstName = Constants.PLAYERS_FIRST_NAMES[random.nextInt(0,Constants.PLAYERS_FIRST_NAMES.length)];
            this.lastName = Constants.PLAYERS_LAST_NAMES[random.nextInt(0,Constants.PLAYERS_LAST_NAMES.length)];

        }

        public void addGoal(){
            this.countGoals++;
        }

        public int getGoals(){
            return this.countGoals;
        }

        public int getId(){
            return this.id;
        }

        public String toString(){
            return this.firstName + " " + this.lastName;
        }

    }


