import java.util.HashMap;
import java.util.Map;

class AudioFormatAdapter {
    private AudioProcessingLibrary adaptee;
    private Map<String, String> formatConversionMap;

    AudioFormatAdapter(AudioProcessingLibrary adaptee) {
        this.adaptee = adaptee;
        formatConversionMap = new HashMap<>();
        // Define format conversion rules
        formatConversionMap.put("MP3-WAV", "Converting MP3 to WAV");
        formatConversionMap.put("WAV-MP3", "Converting WAV to MP3");
        formatConversionMap.put("MP3-M4A", "Converting MP3 to M4A");
        formatConversionMap.put("M4A-MP3", "Converting M4A to MP3");
        formatConversionMap.put("M4A-WAV", "Converting M4A to WAV");
        formatConversionMap.put("WAV-M4A", "Converting WAV to M4A");
    }

    void play(String file, String sourceFormat, String targetFormat) {
        String conversionKey = sourceFormat.toUpperCase() + "-" + targetFormat.toUpperCase();
        System.out.println(formatConversionMap.getOrDefault(conversionKey, "No format conversion needed."));
        adaptee.play(file, targetFormat);
    }

    void pause(String format) {
        adaptee.pause(format);
    }

    void stop(String format) {
        adaptee.stop(format);
    }
}