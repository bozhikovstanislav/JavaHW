package Teleric.JavaHW;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTimeF {
    public static void main(String[] args) {
        InputStreamReader rdr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(rdr);
        String datestring = null;
        try {
            datestring = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        try {
            Date dateofBirth = dateFormat.parse(datestring);
            System.out.println(dateofBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
