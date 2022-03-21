import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Formatter;


public class Formula1ChampionshipManager implements ChampionshipManager {


    public void createDriver(Formula1Driver[] arr) {

        for (int x = 0; x < arr.length; x++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the driver name : ");
            String driverName = input.next();

            System.out.println("Enter the driver location: ");
            String location = input.next();

            System.out.println("Enter the driver team: ");
            String team = input.next();

            System.out.println("Enter the current points: ");
            int CurrentPoints = input.nextInt();

            System.out.println("How many races do driver participated: ");
            int participatedRaces = input.nextInt();

            System.out.println("How many first positions do driver achieved: ");
            int firstPosition = input.nextInt();

            System.out.println("How many second positions do driver achieved: ");
            int secondPosition = input.nextInt();

            System.out.println("How many third positions do driver achieved: ");
            int thirdPosition = input.nextInt();

            arr[x] = new Formula1Driver(driverName, location, team, CurrentPoints, firstPosition, secondPosition, thirdPosition, participatedRaces);

        }
    }


    public void deleteDriver(Formula1Driver[] arr) {

        /*while (true) {

            System.out.println("Driver Names are");
            for (int i = 0; i < arr.length; i++) {

                System.out.println(" Driver " + i + " Named by : " + arr[i].getDriverName());

            }*/

            Scanner input = new Scanner(System.in);
            String deldriver;
            System.out.println("Enter the  driver name want to delete:");
            deldriver = input.next();
            int driverPos = 0;
            boolean examining = false;

            for (int x = 0; x < arr.length; x++) {
                if (deldriver.equals(arr[x].getDriverName())) {

                    driverPos = x;

                    arr[driverPos].setDriverName("");
                    arr[driverPos].setLocation("");
                    arr[driverPos].setTeam("");
                    arr[driverPos].setCurrentPoints(0);
                    arr[driverPos].setParticipatedRaces(0);
                    arr[driverPos].setFirstPosition(0);
                    arr[driverPos].setSecondPosition(0);
                    arr[driverPos].setThirdPosition(0);

                    System.out.println(" driver in list  " + x);
                    examining = true;
                }

            }
            if (!examining) {

                System.out.println("There are no driver on that name \nPlease enter the correct name again ! \n");

            }
        }


    public void changeDriver(Formula1Driver[] arr) {

        while (true) {

            System.out.println("Driver Names are");
            for (int x = 0; x < arr.length; x++) {

                System.out.println(" Driver " + x + " Named by : " + arr[x].getDriverName());

            }

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the team do want to change:");
            String teamName = input.next();

            System.out.println("Enter the driver name : ");
            String driverName = input.next();

            System.out.println("Enter the driver location: ");
            String location = input.next();

            System.out.println("Enter the current points: ");
            int CurrentPoints = input.nextInt();

            System.out.println("How many races do driver participated: ");
            int participatedRaces = input.nextInt();

            System.out.println("How many first positions do driver achieved: ");
            int firstPosition = input.nextInt();

            System.out.println("How many second positions do driver achieved: ");
            int secondPosition = input.nextInt();

            System.out.println("How many third positions do driver achieved: ");
            int thirdPosition = input.nextInt();

            int driverpo = 0;
            boolean examining = false;

            for (int x = 0; x < arr.length; x++) {
                if (teamName.equals(arr[x].getTeam())) {

                    driverpo = x;

                    examining = true;
                }
            }
            if (!examining) {

                System.out.println("There are no driver on that name \nPlease enter the correct name again ! \n");

            }

            arr[driverpo].setDriverName(driverName);
            arr[driverpo].setLocation(location);
            arr[driverpo].setCurrentPoints(CurrentPoints);
            arr[driverpo].setParticipatedRaces(participatedRaces);
            arr[driverpo].setFirstPosition(firstPosition);
            arr[driverpo].setSecondPosition(secondPosition);
            arr[driverpo].setThirdPosition(thirdPosition);

        }
    }


    public void singledriverStats(Formula1Driver[] arr) {

        while (true) {

            System.out.println("Driver Names are");
            for (int x = 0; x < arr.length; x++) {

                System.out.println(" Driver " + x + " Named by : " + arr[x].getDriverName());

            }

            Scanner input = new Scanner(System.in);
            String findriver;
            System.out.println("Enter the driver name want to see his data:");
            findriver = input.next();

            boolean examining = false;
            for (int i = 0; i < arr.length; i++) {

                if (findriver.equals(arr[i].getDriverName())) {

                    System.out.println(" Driver name : " + arr[i].getDriverName());
                    System.out.println(" Driver Location :" + arr[i].getLocation());
                    System.out.println(" Driver Team : " + arr[i].getTeam());
                    System.out.println(" Driver Current Position: " + arr[i].getCurrentPoints());
                    System.out.println(" Races the driver participated: " + arr[i].getParticipatedRaces());
                    System.out.println(" Driver First Position Archived: " + arr[i].getFirstPosition());
                    System.out.println(" Driver Second Position Archived: " + arr[i].getSecondPosition());
                    System.out.println(" Driver Third Position Archived: " + arr[i].getThirdPosition());

                    examining = true;
                }
            }
            if (!examining) {
                System.out.println("There are no Driver on that name \nPlease enter the correct name again !");
            }
        }
    }

    public void displayingStats(Formula1Driver[] arr) {


            Formatter fmt4 = new Formatter();

            fmt4.format("%2s %17s %14s %17s %17s %17s %17s %17s\n", "Name", "Location", "Team", "Points", "NumRaces", "1_position" , "2_position" , "3_position" );

            for(int i = 0;i < arr.length;i++){

                fmt4.format("%1s %15s %15s %13s %17s %21s %21s %21s\n", arr[i].getDriverName(), arr[i].getLocation(),arr[i].getTeam(),arr[i].getCurrentPoints(),arr[i].getParticipatedRaces(),arr[i].getFirstPosition(),arr[i].getSecondPosition(),arr[i].getThirdPosition());

            }
        System.out.println(fmt4);
    }


    public void addaRace(Formula1Driver[] arr) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Date ( Date/Month/Year: ");
        String date = input.next();


            System.out.println("Driver Names are");
            for (int i = 0; i < arr.length; i++) {

                System.out.println(" Driver " + i + " Named by : " + arr[i].getDriverName());

            }

            for (int i = 0; i < arr.length; i++) {
                String poDriver;
                System.out.println("Enter the name to add position :");
                poDriver = input.next();
                int x;
                int eleDriver = 0;
                boolean examining = false;

                for (x = 0; x < arr.length; x++) {

                    if (poDriver.equals(arr[x].getDriverName())) {

                        eleDriver = x;

                        examining = true;
                    }
                }
                if (!examining) {

                    System.out.println("There are no driver on that name \nPlease enter the correct name again ! \n");
                    break;

                }

                System.out.println("Enter the driver won position (1/10) :");
                int poWon = input.nextInt();

                if (poWon == 1) {

                    int one = arr[eleDriver].getCurrentPoints();
                    int one1 = one + 25;
                    arr[eleDriver].setCurrentPoints(one1);

                    int count1 = arr[eleDriver].getFirstPosition();
                    int countOne = count1 + 1;
                    arr[eleDriver].setFirstPosition(countOne);

                } else if (poWon == 2) {

                    int two = arr[eleDriver].getCurrentPoints();
                    int two2 = two + 18;
                    arr[eleDriver].setCurrentPoints(two2);

                    int count2 = arr[eleDriver].getSecondPosition();
                    int counttwo = count2 + 1;
                    arr[eleDriver].setSecondPosition(counttwo);

                } else if (poWon == 3) {

                    int three = arr[eleDriver].getCurrentPoints();
                    int three3 = three + 15;
                    arr[eleDriver].setCurrentPoints(three3);

                    int count3 = arr[eleDriver].getThirdPosition();
                    int countthree = count3 + 1;
                    arr[eleDriver].setThirdPosition(countthree);

                } else if (poWon == 4) {

                    int four = arr[eleDriver].getCurrentPoints();
                    int four4 = four + 12;
                    arr[eleDriver].setCurrentPoints(four4);

                } else if (poWon == 5) {

                    int five = arr[eleDriver].getCurrentPoints();
                    int five5 = five + 10;
                    arr[eleDriver].setCurrentPoints(five5);

                } else if (poWon == 6) {

                    int six = arr[eleDriver].getCurrentPoints();
                    int six6 = six + 8;
                    arr[eleDriver].setCurrentPoints(six6);

                } else if (poWon == 7) {

                    int seven = arr[eleDriver].getCurrentPoints();
                    int seven7 = seven + 6;
                    arr[eleDriver].setCurrentPoints(seven7);

                } else if (poWon == 8) {

                    int eight = arr[eleDriver].getCurrentPoints();
                    int eight8 = eight + 4;
                    arr[eleDriver].setCurrentPoints(eight8);

                } else if (poWon == 9) {

                    int nine = arr[eleDriver].getCurrentPoints();
                    int nine9 = nine + 2;
                    arr[eleDriver].setCurrentPoints(nine9);

                } else if (poWon == 10) {

                    int ten = arr[eleDriver].getCurrentPoints();
                    int ten10 = ten + 1;
                    arr[eleDriver].setCurrentPoints(ten10);

                }
            }
        }



    public void storeProgram(Formula1Driver[] arr) {

        try (PrintWriter out = new PrintWriter(new FileWriter(  "E:\\driver.txt"))) {
            int x;
            for (x = 0; x < arr.length; x++) {

                out.println(" Driver name : " + arr[x].getDriverName() + "at: " + x);
                out.println(" Driver Location :" + arr[x].getLocation());
                out.println(" Driver Team : " + arr[x].getTeam());
                out.println(" Driver Current Position: " + arr[x].getCurrentPoints());
                out.println(" Races the driver participated: " + arr[x].getParticipatedRaces());
                out.println(" Driver First Position Archived: " + arr[x].getFirstPosition());
                out.println(" Driver Second Position Archived: " + arr[x].getSecondPosition());
                out.println(" Driver Third Position Archived: " + arr[x].getThirdPosition());
            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("All drivers have been Saved.");
    }


    public void loadProgram(Formula1Driver[] arr) {

        try {

            File myObj = new File("E:\\driver.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println(" Error .");
            e.printStackTrace();
        }
    }
}

