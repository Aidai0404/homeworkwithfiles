import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {
        FileWriter writer=new FileWriter("Alphabet.txt");
        StringBuilder builder=new StringBuilder();
        char c='a';
        char d='z';
        char f='A';
        char v='Z';
        while (c<=d && f<=v){
            builder.append(f+""+c+"\n");
            f++;
            c++;
        }
        writer.write(String.valueOf(builder));
        for (int i = 0; i <= 9; i++) {
            writer.write(i+"\n");
        }
        writer.close();

        FileReader reader=new FileReader("Alphabet.txt");
        Scanner sc=new Scanner(reader);
        int a=0;
        int b=36;
        while(a<=b && sc.hasNext()){
            a++;
            System.out.println(a+" "+sc.nextLine());
        }
        reader.close();
    }
}
    