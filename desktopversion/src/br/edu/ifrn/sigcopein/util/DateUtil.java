/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.sigcopein.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 1935921
 */
public class DateUtil {

    
    public static Calendar convertToCalendar(Date date) {
        Calendar cal = null;
            //DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            //date = (Date) formatter.parse(date.toString());
            cal = Calendar.getInstance();
            cal.setTime(date);
       
        return cal;
    }
    
    public static String dateConverter(Date date){
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormatter.format(date);
    }

}
