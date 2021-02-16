import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception  {

        try {

            File file = new File("src/config.txt");

            FileReader fr = new FileReader(file);

            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {


                if(line.equals("Word00")) {

                    WordFactory wordFactory = new Word00Factory();
                    Client client = new Client(wordFactory);
                    client.run();

                }
                else if(line.equals("Word10")) {

                    WordFactory wordFactory = new Word10Factory();
                    Client client = new Client(wordFactory);
                    client.run();
                }
                else if(line.equals("Word20")) {

                    WordFactory wordFactory = new Word20Factory();
                    Client client = new Client(wordFactory);
                    client.run();
                }
                else if(line.equals("Word90")) {

                    WordFactory wordFactory = new Word90Factory();
                    Client client = new Client(wordFactory);
                    client.run();
                }
                else {

                    System.out.println("Error, this is an invalid line");
                }
            }


        }
        catch (FileNotFoundException e) {

            System.out.println("File not found");
        }
        catch(IOException e) {

            System.out.println("IO Exception detected");
        }


    }
}
