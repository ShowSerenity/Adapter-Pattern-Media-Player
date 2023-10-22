class AudioProcessingLibrary {
    void play(String file, String format) {
        System.out.println("Playing " + format + " audio: " + file);
    }

    void pause(String format) {
        System.out.println("Pausing " + format + " audio");
    }

    void stop(String format) {
        System.out.println("Stopping " + format + " audio");
    }
}