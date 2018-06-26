package singlePlayerMode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author RezaTahmasbi, MateenBagheri, Amirhossein Maleki.
 * @since 1397/03/04
 *
 * Class <code>{@link CharacterListener}</code> is a class which
 * implements <code>{@link KeyListener}</code>
 */
public class CharacterListener implements KeyListener {
    char [] inputChar = {' ',' ',' ',' '};
    private int counter = 0;

    @Override
    public void keyPressed(KeyEvent inputChar) {
        if (inputChar.getKeyCode() > 96 && inputChar.getKeyCode() < 123) {
            this.inputChar[counter] = (char) (inputChar.getKeyCode() - 32);
        }
        else if (inputChar.getKeyCode() > 64 && inputChar.getKeyCode() <91){
            this.inputChar[counter] =(char) (inputChar.getKeyCode());
        }
        this.counter++;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) { }

    public char[] getInputChar() {
        return inputChar;
    }

    public int getCounter() {
        return counter;
    }

    public void setToDefaultInputChar(int index) {
        for (int counter = 0; counter < index; counter++){
            this.inputChar[counter] = ' ';
        }
    }

    public void setCounterToDefault() {
        this.counter = 0;
    }
}