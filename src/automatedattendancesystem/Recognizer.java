/**
 *
 * @author Oginni
 */
package automatedattendancesystem;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class StreamGobbler extends Thread {

    InputStream is;
    String type;

    StreamGobbler(InputStream is, String type) {
        this.is = is;
        this.type = type;
    }

    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(type + ">" + line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

public class Recognizer {

    Variables var = new Variables();
    final static String FILE_NAME = "c://faces/image.txt";
    final static String OUTPUT_FILE_NAME = "C:\\Temp\\output.txt";
    final static Charset ENCODING = StandardCharsets.UTF_8;

    Recognizer(String[] arg) {
       // recognize(arg);
    }

    public static void recognize(String[] arg) {
        try {
            String osName = System.getProperty("os.name");
            String[] cmd = new String[3];
            System.out.println(osName);
            if (osName.equals("Windows NT (unknown)")) {
                cmd[0] = "cmd.exe";
                cmd[1] = "/C";
                cmd[2] = arg[0];
            } else if (osName.equals("Windows NT")) {
                cmd[0] = "cmd.exe";
                cmd[1] = "/C";
                cmd[2] = arg[0];
            } else if (osName.equals("Windows 95")) {
                cmd[0] = "command.com";
                cmd[1] = "/C";
                cmd[2] = arg[0];
            }

            Runtime rt = Runtime.getRuntime();
            System.out.println("Execing " + cmd[0] + " " + cmd[1] + " " + cmd[2]);
            Process proc = rt.exec(cmd);
            // any error message?
            StreamGobbler errorGobbler = new StreamGobbler(proc.getErrorStream(), "ERROR");

            // any output?
            StreamGobbler outputGobbler = new StreamGobbler(proc.getInputStream(), "OUTPUT");

            // kick them off
            errorGobbler.start();
            outputGobbler.start();

            // any error???
            int exitVal = proc.waitFor();
            System.out.println("ExitValue: " + exitVal);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    void writeSmallTextFile(List<String> aLines, String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        Files.write(path, aLines, ENCODING);
    }

    //For larger files
    static String readFile(String aFileName) throws IOException {
        Path path = Paths.get(aFileName);
        try {
            Scanner scanner = new Scanner(path, ENCODING.name());
            while (scanner.hasNextLine()) {
                //process each line in some way
                return scanner.nextLine();
            }
        } catch (Exception e) {
        }
        return null;
    }

    static void writeFile(String aFileName,String text) throws IOException {
       try{
        PrintWriter writer= new PrintWriter(FILE_NAME,"UTF-8");
        writer.println(text);
        writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void log(Object aMsg) {
        System.out.println(String.valueOf(aMsg));
    }

    public static void main(String args[]) throws IOException {
        Vector<String> lst = new Vector<String>();
        lst.addElement("personname");
       writeFile(FILE_NAME, "personname");
    //readFile(FILE_NAME);


//        String arg[] = new String[]{"C:/Users/Oginni/Documents/NetBeansProjects/AutomatedAttendanceSystem/bin/Debug/dictector.exe"};
//        //String arg[] = new String[]{"C:/Users/Oginni/Documents/NetBeansProjects/AutomatedAttendanceSystem/bin/Debug/recognizer.exe"};
//        recognize(arg);
//        System.out.println("pirrio");
    }
}
