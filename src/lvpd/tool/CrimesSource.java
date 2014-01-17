/*
 * Copyright (C) 2014 Chenko@MTG
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package lvpd.tool;

import java.lang.reflect.Array;

/**
 *
 * @author Sergey
 */
public class CrimesSource {
    
    public static void main(String[] args) {
        int time = getCrimeStrikesByName("Failure to Provide Valid Registration");
        System.out.println(time);
    }
    
    private final static String[][] crimesArray = {
        //Crime, Category, Fine, Time, Strikes
        //0      1          2       3       4
        {"Illegal Parking", "Vehicular", "150", "0", "0"},
        {"Failure to Provide Valid Registration", "Vehicular", "750", "8", "1"},
        {"Illegal Shortcut", "Vehicular", "175", "0", "1"},
        {"Unlawful Hydraulics", "Vehicular", "150", "0", "0"},
        {"Unlawful Nos", "Vehicular", "150", "0", "1"},
        {"Reckless Driving", "Vehicular", "125", "0", "1"},
        {"Reckless Endangerment", "Vehicular", "200", "0", "1"},
        {"Street Racing", "Vehicular", "2000", "25", "3"},
        {"Driving without due care and attention", "Vehicular", "150", "0", "1"},
        {"Verbal Assault", "Light", "75", "0", "0"},
        {"Loitering on Govt Property", "Light", "200", "5", "0"},
        {"Trespassing", "Light", "200", "7", "0"},
        {"Indecent Exposure", "Light", "200", "5", "0"},
        {"Lewd Gesture", "Light", "25", "0", "0"},
        {"Vandalism", "Light", "150", "0", "0"},
        {"Affray", "Light", "1000", "10", "0"},
        {"Misuse of 911", "Light", "150", "0", "0"},
        {"Failure to Provide ID", "Light", "750", "10", "0"},
        {"Failure to Comply", "Light", "300", "8", "0"},
        {"Resisting Arrest", "Light", "300", "8", "0"},
        {"Evading Arrest", "Light", "400", "10", "0"},
        {"Disorderly Conduct", "Light", "750", "5", "0"},
        {"Vehicular Assault", "Medium", "1250", "16", "3"},
        {"(Attempted) GTA", "Medium", "1000", "10", "3"},
        {"(Successful) GTA", "Medium", "2000", "12", "3"},
        {"DUI", "Medium", "2000", "10", "2"},
        {"Impersonating a LEO", "Medium", "3000", "10", "0"},
        {"Obstruction of Justice", "Medium", "1750", "10", "0"},
        {"Conspiracy to Commit Murder, Rape, etc", "Medium", "3500", "10", "0"},
        {"Aiding and Abetting", "Medium", "400", "8", "0"},
        {"Hit and Run", "Medium", "1250", "16", "3"},
        {"Prostitution", "Medium", "2000", "7", "0"},
        {"Harassment", "Medium", "1500", "7", "0"},
        {"Public Endangerment", "Medium", "1000", "10", "0"},
        {"Fraud", "Medium", "2000", "8", "0"},
        {"Lying to a LEO", "Medium", "1000", "8", "0"},
        {"Driving whilst suspended", "Medium", "1500", "20", "0"},
        {"Instigating Public Anarchy", "Heavy", "10000", "15", "0"},
        {"Racketeering", "Heavy", "25000", "50", "0"},
        {"Robbery", "Heavy", "3000", "15", "0"},
        {"Armed Robbery", "Heavy", "5000", "30", "0"},
        {"Rape or Sexual Assault", "Heavy", "7500", "15", "0"},
        {"Illegal Gambling", "Heavy", "20000", "20", "0"},
        {"Bribery", "Heavy", "1000", "10", "0"},
        {"Extortion", "Heavy", "2500", "7", "0"},
        {"Scamming", "Heavy", "2500", "7", "0"},
        {"Arson", "Heavy", "8000", "15", "0"},
        {"Domestic Terrorism", "Capital", "25000", "50", "0"},
        {"Mass Murder", "Capital", "20000", "45", "0"},
        {"Police Corruption", "Capital", "25000", "50", "0"},
        {"Piracy (Sea)", "Capital", "12000", "30", "0"},
    };
   
    public static int getCrimeTimeByName(String name) {
        int time = 0;
        for(int i = 0; i < Array.getLength(crimesArray); i++) {
            if(crimesArray[i][0].equals(name)) {
                time = Integer.parseInt(crimesArray[i][3]);
            }
        }
        return time;
    }
    
    public static int getCrimeFineByName(String name) {
        int fine = 0;
        for(int i = 0; i < Array.getLength(crimesArray); i++) {
            if(crimesArray[i][0].equals(name)) {
                fine = Integer.parseInt(crimesArray[i][2]);
            }
        }
        return fine;
    }
    
    public static int getCrimeStrikesByName(String name) {
        int strikes = 0;
        for(int i = 0; i < Array.getLength(crimesArray); i++) {
            if(crimesArray[i][0].equals(name)) {
                strikes = Integer.parseInt(crimesArray[i][4]);
            }
        }
        return strikes;
    }
    
    public static String getCrimeTooltip(String crime) {
        for(int i = 0; i < Array.getLength(crimesArray); i++) {
            if(crimesArray[i][0].equals((crime))) {
                return "<html> <b>" + crimesArray[i][0] + "</b><br>" + "Fine: $" + crimesArray[i][2] + "<br> Time: " +crimesArray[i][3] + " minutes<br> Strikes: " + crimesArray[i][4] + "</html>";
            }
        }
        return "<html><i>The times and fines for this crime<br>varies depending on more than one variable.</html>";
    }
}
