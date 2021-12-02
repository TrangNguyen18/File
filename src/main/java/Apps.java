import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Apps {
    public static void main(String[] args) {
        try {
            File myFile = new File("trang.txt");
            if (myFile.createNewFile()) {
                System.out.println("Creat the file successfully " + myFile.getName());
            } else
                System.out.println("File is existed");
        } catch (IOException e) {
            System.out.println("Create file unsuccessfully");
            e.printStackTrace();
        }
        // tao file o mot thu muc khac voi thu muc mac dinh  --> tao file tren desktop
        try {
            File myFile2 = new File("C:\\Users\\trang.nguyen18_onemo\\Desktop\\trangpage.txt");
            if (myFile2.createNewFile()) {
                System.out.println("Create file successfully " + myFile2.getName());
            } else
                System.out.println("File existed");
        } catch (IOException e) {
            System.out.println("Create file unsuccessfully");
        }

        // write something to the file
//        try {
//            FileWriter myWrite = new FileWriter("C:\\Users\\trang.nguyen18_onemo\\Desktop\\trangpage.txt");
//            myWrite.write("This file is create by Trang");
//            myWrite.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileWriter myWrite = new FileWriter("trang.txt");
            myWrite.write("This file is create by Trang. Trang test this file after updateing");
            myWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // read a file
        try {
            File myFile = new File("trang.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String output = myReader.nextLine();
                System.out.println(output);
            }
            myReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // delete a file

        File myFile = new File("trang.txt");
        if (myFile.delete()) {
            System.out.println("This file was deleted!");
        } else
            System.out.println("Cant not delete this file");
    }
}
