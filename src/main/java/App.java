import java.util.ArrayList;
import java.util.Scanner;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Enter path: ");//foreign_names.csv
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();

        System.out.println("Enter separator: ");//;
        char separator = in.next().charAt(0);

        ReadFile readFile = new ReadFile();
        readFile.setList(path, separator);
        ArrayList<Human> list = readFile.getList();

        for (int index = 0; index < list.size(); index++)
            list.get(index).println();

        in.close();

    }
}
