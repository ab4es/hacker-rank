import java.io.*;

/**
 * Created by abindra on 6/23/2016.
 */
public class Bot_saves_princess {

    public static void main(String[] args) throws IOException {
        /**************** Program vars ****************/
        int gridSize;
        // bot coordinates
        int m_row = -1;
        int m_col = -1;
        // princess coordinates
        int p_row = -1;
        int p_col = -1;

        /***************** Read input *****************/
        File file = new File("./data/Bot_saves_princess_2.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String input;

        int row = 0; // keep track of lines read
        while ((input = reader.readLine()) != null) {
            if (row == 0) {
                gridSize = Integer.parseInt(input);
            } else {
                if (input.contains("m")) {
                    m_row = row - 1;
                    m_col = input.indexOf("m");
                } else if (input.contains("p")) {
                    p_row = row - 1;
                    p_col = input.indexOf("p");
                }
            }
            row++;
        }

        System.out.println("BOT: [" + m_row + ", " + m_col + "]");
        System.out.println("PRINCESS: [" + p_row + ", " + p_col + "]");

        /************** Locate princess **************/
        while (m_row > p_row) {
            System.out.println("UP");
            m_row--;
        }
        while (m_row < p_row) {
            System.out.println("DOWN");
            m_row++;
        }
        while (m_col > p_col) {
            System.out.println("LEFT");
            m_col--;
        }
        while (m_col < p_col) {
            System.out.println("RIGHT");
            m_col++;
        }

    }

}
