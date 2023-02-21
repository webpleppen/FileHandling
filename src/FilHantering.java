import java.io.*;

public class FilHantering {
    // Skapar en filreferens
    File file = new File("filnamn.txt");


    public FilHantering (){
        FileWrite();
        FileWrite();
        ReadFile(file);

    }

    public void ReadFile(File filename) { // Läser från filen
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Kunde inte läsa från filen");
        }
        }
    public void FileWrite() {
            // Skriver till filen
        try {
                FileWriter writer = new FileWriter(file, false);
                writer.write("Hej, detta är skrivet till filen.");
                writer.close();
            System.out.println("File written sucessfully!");
        } catch (IOException e) {
                System.out.println("Kunde inte skriva till filen");
        }
    }
}
