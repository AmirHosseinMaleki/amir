package singlePlayerMode;

import sun.audio.AudioStream;

import java.io.*;

/**
 * @author RezaTahmasbi, AmirhosseinMaleki, MateenBagheriASL
 * @since 1397/03/11
 *
 * <code>{@link AudioPlayer}</code> class is a class which has
 * the duty of managing audios and playing them which is consisted
 * of one simple static method.
 */
public class AudioPlayer {

    /**
     * <code>playMusic</code> method is a method which gets an {@link String}
     * as inout parameter and plays the music or audio in the given path.the
     * method is static so that user can use it without the need to instantiate
     * the class.
     * @param filePath the path of the audio we want to play
     * @throws IOException In case the file is not found or access denied.
     */
    public static void playMusic(String filePath) throws IOException {
        InputStream music;
        music = new FileInputStream(new File(filePath));
        AudioStream audioStream = new AudioStream(music);
        sun.audio.AudioPlayer.player.start(audioStream);
    }
}