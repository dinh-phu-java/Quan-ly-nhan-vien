import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int userChoice=-1;
        ArrayList<String> empList=getListFromFile();
        while(userChoice!=8){
            System.out.println("--- Employee List Management----");
            System.out.println("Choose function to continue: ");
            System.out.println("1. Show List");
            System.out.println("2. Insert");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Searching");
            System.out.println("6. Read from file");
            System.out.println("7. Write to file");
            System.out.println("8. Quit");
            System.out.print("Choose function: ");
            try {
                userChoice=Integer.parseInt(in.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch(userChoice){
                case 1:
                    //do xem danh sach
                    xemDanhSach(empList,in);
                    break;
                case 2:
                    //do them moi
                    break;
                case 3:
                    //cap nhat
                    break;
                case 4:
                    //xoa
                    break;
                case 5:
                    //tim kiem
                    break;
                case 6:
                    //doc tu file
                    break;
                case 7:
                    //ghi vao file
                    break;
                case 8:
                    // cam on
                    break;
            }
        }
    }

    public static void xemDanhSach(ArrayList myUserList,BufferedReader sc){
        try {
            String enter="a";
            int count = 1;
            while (count < myUserList.size()) {

                for (int i = count; (i < count + 5) && i<myUserList.size() ; i++) {
                    System.out.println(myUserList.get(i));
                }

                System.out.println("Press Enter: ");

                while (!enter.equals("")) {
                    enter = sc.readLine();
                }
                enter="a";
                count+=5;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<String> getListFromFile() {
        ArrayList<String> myUserList = new ArrayList<>();
        try {
            CSVWriter writer = new CSVWriter(new FileWriter("output.csv", true));
            CSVReader reader = new CSVReader(new FileReader("output.csv"));

            String[] line;
            while ((line = reader.readNext()) != null) {
                myUserList.add(Arrays.toString(line));
            }
            return myUserList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}