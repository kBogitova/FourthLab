import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFile {
    private ArrayList<Human> list;

    ReadFile() {
    }


    /**
     * @return ArrayList<Human>
     */
    ArrayList<Human> getList() {
        return list;
    }


    /**
     * @param path
     * @param separator
     */
    public void setList(String path, char separator) {
        list = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            line = reader.readLine();

            while (line != null) {
                Human human = new Human();
                int beg = 0, count = 0;

                while (count != 6) {
                    int end = line.indexOf(separator, beg + 1);
                    String substr = "";

                    if (end != -1)
                        substr = line.substring(beg, end);
                    else
                        substr = line.substring(beg, line.length());

                    human.setFild(count, substr);
                    count++;
                    beg = end + 1;
                }

                list.add(human);

                line = reader.readLine();
            }

            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        list.get(0);
    }
}
