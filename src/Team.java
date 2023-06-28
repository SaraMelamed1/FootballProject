import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



    public class Team{

        private static int COUNT_ID = 1;
        private int id;
        private String name;
        private List<Player> players;
        private int points;

        private int countGoals;

        private int countRivalGoals;

        public Team(String name){
            this.id = COUNT_ID;
            COUNT_ID++;
            this.name = name;
            this.players = new ArrayList<>();
            this.players = IntStream
                    .range(0, Constants.PLAYERS_NUM).mapToObj(i -> new Player()).collect(Collectors.toList());
            this.points = 0;
            this.countGoals =0;
            this.countRivalGoals =0;
        }

        public String getName() {
            return this.name;
        }

        public boolean isEqualId(int id){
            return this.id == id;
        }

        public boolean isPlayerInTeam(Player player){
            return this.players.stream().anyMatch(player1 -> player1==player);
        }

        public List<Player> getPlayers() {
            return this.players;
        }

        public void addPoints(int add){
            this.points+=add;
        }

        public int getPoints(){
            return this.points;
        }

        public void addGoals(){
            this.countGoals++;
        }
        public void addRivalGoals(){
            this.countRivalGoals++;
        }

        public int getGoalDifference(){
            return this.countGoals - this.countRivalGoals;
        }

        public int getNumGoals(){
            return this.countGoals;
        }


        public String toString()
        {
            return this.name;
        }

    }

