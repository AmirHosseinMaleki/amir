package singlePlayerMode;

/**
 * @author mateenBagheri, amirhosseinMaleki ,rezaTahmasbi
 * @since 1397/02/26
 * <i>{@link TimeManager}</i> class is a class that carries
 * one static method for a special time managing purpose and
 * each method requires a long value as the entering argument
 * which is provided by {@link Stopwatch}.
 */
public class TimeManager {
    /**
     * <i>getDeadline</i> is a getter method which returns the
     * time that the player has got to make the move and enter the
     * character(s) in miliSeconds.If the currentTime argument is
     * entered wrong the returned value will be -1.
     * @param currentTime  represents the current time of the
     *                     game that we are on it. a long
     *                     value between 60 and zero (0).
     * @return the time that Player has got to enter the letter(S).
     */
    public static int getDeadline (long currentTime){
        if (currentTime >=0 && currentTime < 10000) {
            return 4000;
        }
        else if (currentTime >=10000  && currentTime <15000) {
            return 3600;
        }
        else if (currentTime >=15000 && currentTime <20000) {
            return 3200;
        }
        else if (currentTime >=20000 && currentTime <25000) {
            return 2800;
        }
        else if (currentTime >=25000 && currentTime <30000) {
            return 2400;
        }
        else if (currentTime >=30000 && currentTime <40000) {
            return 2000;
        }
        else if (currentTime >=40000 && currentTime <50000) {
            return 1600;
        }
        else if (currentTime >=50000 && currentTime <52000) {
            return 1200;
        }
        else if (currentTime >=52000 && currentTime <54000) {
            return 800;
        }
        else if (currentTime >=54000 && currentTime <58000) {
            return 400;
        }
        else if (currentTime >=58000 && currentTime <=60000) {
            return 200;
        }
        else
            return -1;
    }
}
