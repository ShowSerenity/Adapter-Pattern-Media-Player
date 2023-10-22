class MediaPlayer {
    void playAudio(String file, String sourceFormat, String targetFormat) {
        System.out.println("Request to play " + targetFormat + " audio: " + file);
        AudioFormatAdapter adapter = new AudioFormatAdapter(new AudioProcessingLibrary());
        adapter.play(file, sourceFormat, targetFormat);
    }

    void pauseAudio(String format) {
        System.out.println("Request to pause " + format + " audio");
        AudioFormatAdapter adapter = new AudioFormatAdapter(new AudioProcessingLibrary());
        adapter.pause(format);
    }

    void stopAudio(String format) {
        System.out.println("Request to stop " + format + " audio");
        AudioFormatAdapter adapter = new AudioFormatAdapter(new AudioProcessingLibrary());
        adapter.stop(format);
    }
}