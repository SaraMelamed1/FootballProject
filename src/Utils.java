public class Utils {


        public static void sleep(int second){
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

