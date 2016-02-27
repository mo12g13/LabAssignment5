package com.Momo;
import org.omg.PortableInterceptor.ServerRequestInfo;

import java.nio.channels.Pipe;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      Map<String, Double> map = new HashMap<>();
	// write your code here
        String lakeName;
        String timeRun;
        do {
            System.out.println("Enter the Lake Name");
            lakeName = input.nextLine();
            System.out.println("Enter number of minutes run");
            timeRun = input.nextLine();
            if(lakeName.equalsIgnoreCase("") || timeRun.equalsIgnoreCase("")){

                break;
            }
            Double finalRun = Double.parseDouble(timeRun);
            map.put(lakeName, finalRun);



        } while(true);
        Double max = 0.0;

        Map.Entry<String, Double> maxval = null;
        for(Map.Entry<String, Double> ob: map.entrySet()){

            String key  = ob.getKey();
            Double value = ob.getValue();

            if (maxval == null || ob.getValue().compareTo(maxval.getValue()) > 0)
            {
                maxval = ob;
            }




            System.out.println(maxval);
        }

    }
}
