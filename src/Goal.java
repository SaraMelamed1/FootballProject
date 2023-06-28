import java.util.Random;
import java.util.List;
import java.util.Random;
public class Goal {




        private static int COUNT_ID = 1;
        private int id;
        private int minute;
        private Player scorer;

        public Goal(Player scorer){
            Random random = new Random();
            this.id = COUNT_ID;
            COUNT_ID++;
            this.scorer = scorer;
            this.minute = random.nextInt(1,Constants.MINUTES_OF_GAME+1);
            scorer.addGoal();
        }

        public Player getScorer() {
            return this.scorer;
        }

    }


