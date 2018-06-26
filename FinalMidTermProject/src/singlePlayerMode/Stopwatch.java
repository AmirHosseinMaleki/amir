package singlePlayerMode;

/**
 * @author amirHosseinMaleki, mteeenBagheri, RezaTahmASBI
 * @since 1397/02/27
 *
 * <i>{@link Stopwatch}</i> class is a class which represents
 * and models an actual stopWatch in the real world which is
 * based on miliSecs.class {@link Stopwatch} contains three
 * fields and three method each for an special stopwatch purpose.
 * the boolean variable shows if the stopwatch is counting the
 * miliSecs or not.
 */
public class Stopwatch {

    private long starTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    /**
     * <i>start</i> method is a method that starts the timing in
     * miliSecs in the {@link Stopwatch}.This method also sets the
     * value of running on TRUE.
     */
    public void start() {
        starTime = System.currentTimeMillis();
        running = true;
    }

    /**
     * <i>stop</i> is method that stops the timing of the {@link Stopwatch}.
     * this method also sets the value of running on FALSE.
     */
    public void stop() {
        stopTime = System.currentTimeMillis();
        running = false;

    }

    /**
     * <i>getElapsedTime</i> is a method which returns the current time
     * that has been elapsed since we have called method <i>start</i>.
     * NOTE:There is a difference between when the <i>running</i> var
     * is true and when it is false so we've programmed different calculations
     * for each of these scenarios.
     * @return the elapsed time in miliSeconds.
     */
    public long getElapsedTime() {
        long elapsed = 0;
        if (running) {
            elapsed = (System.currentTimeMillis() - starTime);
        }
        else {
            elapsed = (stopTime - starTime);
        }
        return elapsed;
    }

    public void setToZero () {
        this.starTime = 0;
        this.stopTime = 0;
        this.running = false;
    }
}