package cam;
import java.io.*;
import java.util.ArrayList;

/**
 * Reader
 * Utility Functions for reading files
 * @since           1.0
 * @author          craigmcleod
 */

class Reader {
    /**
     * readFile
     * Creates an arrayList from a text file.
     * @since           1.0
     * @author          craigmcleod
     * @param fileName  The name of a file (minus its extension) that is located in the working folder of the application.
     * @return          A String ArrayList that contains the context of the file, seperated
     *                  by line.
     */

    public ArrayList<String> readFile(String fileName) throws IOException {
        ArrayList<String> input = new ArrayList<>();
        File file = new File("./"+fileName+".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e){
            throw new FileNotFoundException("\n⚠️ File ("+fileName+".txt) not found\nPlease put the file into the working folder.");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null){
            input.add(st);
        }
        return input;
    }
}
