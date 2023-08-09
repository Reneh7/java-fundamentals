import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main 
{
    public static void main(String[] args)
    {
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
     //************************************************************************************** 
        flipNHeads(2);

     //************************************************************************************** 

        clock();

     //**************************************************************************************    
        roll(4);
        int[] array= {1 ,1 ,2};
        System.out.println(containsDuplicates(array));

     //**************************************************************************************     
       
        int[] array2 = {30,30,30};
        System.out.println(calculateAverage(array2));
        
     //************************************************************************************** 
        int[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
        };

        System.out.println(Arrays.toString(arraysOfArrays(weeklyMonthTemperatures)));
      //**************************************************************************************    
    }

    public static String pluralize(String word, int count) {
        if (count == 0 || count > 1) {
            return word + "s";
        } else
            return word;
    }

 //************************************************************************************** 

    public static void flipNHeads(int n) {
        int counter = 0;
        int headsFlip = 0;

        while (headsFlip < n) {
            double numFlips = Math.random();
            counter++;

            if (numFlips < 0.5) {
                System.out.println("tails");
                headsFlip = 0;
            } else {
                System.out.println("heads");
                headsFlip++;
            }
        }
        System.out.println("It took " + counter + " flips to flip " + n + " heads in a row");
    }

 //************************************************************************************** 

    public static void clock() {
        LocalDateTime previousTime = LocalDateTime.MIN;
        DateTimeFormatter formatter = (DateTimeFormatter.ofPattern("HH:mm:ss"));
        while (true) {
            LocalDateTime now = LocalDateTime.now();
            if (!now.equals(previousTime)) {
                String time = now.format(formatter);
                System.out.println(time);
                previousTime = now;
            }
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

     //************************************************************************************** 

    public static int[] roll(int n) {
        int[] array = new int[n];
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            int result = (int) (Math.random() * 6) + 1;
            array[i] = result;
            System.out.print(result);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        return array;
    }

     //************************************************************************************** 

    public static boolean containsDuplicates(int[] array)
    {
        for(int i=0; i< array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++) 
            {
               if(array[i] == array[j]) return true;
            }
        }
        return false;
    }


     //************************************************************************************** 
    
    public static double calculateAverage(int[] array2) 
    {
        double summation = 0;
                              
        for (int i = 0; i < array2.length; i++) 
        {
            summation += array2[i];
        }

        double average= summation / array2.length;
        return average;
    }

     //************************************************************************************** 

 public static int[] arraysOfArrays(int[][] array)
    {
        int minAvg = Integer.MAX_VALUE;
        int minIndex = -1;
        for(int i=0; i < array.length; i++)
        {
            int summation = 0;
            for(int j=0; j < array[i].length; j++)
            {             
               summation += array[i][j];
            }
            int average= summation / array[i].length;
            if (average < minAvg) 
            {
                minAvg = average;
                minIndex = i;
            }
        }
         return array[minIndex]; 
    }
}


