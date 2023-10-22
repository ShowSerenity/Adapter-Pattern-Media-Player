import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the source audio file: ");
        String file = scanner.nextLine();

        System.out.print("Enter the source format (e.g., MP3, WAV, M4A): ");
        String sourceFormat = scanner.nextLine();

        System.out.print("Enter the target format for conversion (e.g., MP3, WAV, M4A): ");
        String targetFormat = scanner.nextLine();

        // Perform the audio conversion and playback
        player.playAudio(file, sourceFormat, targetFormat);

        scanner.close();
    }
}
