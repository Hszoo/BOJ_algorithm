

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int i = 0;
        int j = 0;
        String tmp = "";
        String[] channels = new String[cnt];

        for (int z = 0; z < cnt; z++)
            channels[z] = br.readLine();

        while (!channels[0].equals("KBS1")) {
            if (!channels[i].equals("KBS1")) {
                bw.write("1");
                i++;

            } else {
                bw.write("4");
                tmp = channels[i];
                channels[i] = channels[i - 1];
                channels[i - 1] = tmp;
                i--;
            }

        }
        while (!channels[1].equals("KBS2")) {
            if (!channels[j].equals("KBS2")) {
                bw.write("1");
                j++;

            } else {   
                bw.write("4");
                tmp = channels[j];
                channels[j] = channels[j - 1];
                channels[j - 1] = tmp;
                j--;
            }
        }
        bw.flush();
    }
}
