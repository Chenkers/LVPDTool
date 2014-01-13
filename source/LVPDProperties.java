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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Sergey
 */
public class LVPDProperties {
    
    public static final int LIFETIME_ARRESTS = 1;
    public static final int LIFETIME_TIME = 2;
    public static final int LIFETIME_FINES = 3;
    public static final int LIFETIME_STRIKES = 4;
    
    private static int lifetimeArrests;
    private static int lifetimeTime;
    private static int lifetimeFines;
    private static int lifetimeStrikes;
        
    public static void initProperties() throws IOException {
        
       String filePath = System.getProperty("user.home") + "\\Documents\\LVPDToolJava\\";
        
       File createDir = new File(filePath);
       
       if(createDir.isDirectory() == false) {
            createDir.mkdir();
       }
       
       Properties defaultProps = new Properties();
       try (FileInputStream in = new FileInputStream(filePath + "default.properties")) {
            defaultProps.load(in);
       }
       catch (FileNotFoundException e) {
           
           defaultProps.setProperty("lifetimeArrests", Integer.toString(0));
           defaultProps.setProperty("lifetimeTime", Integer.toString(0));
           defaultProps.setProperty("lifetimeFines", Integer.toString(0));
           defaultProps.setProperty("lifetimeStrikes", Integer.toString(0));

           defaultProps.store(new FileOutputStream(filePath + "default.properties"), null);
       }

       Properties appProps = new Properties(defaultProps);
       
       try (FileInputStream in = new FileInputStream(filePath + "settings.properties")) {
           appProps.load(in);
       }
       catch (FileNotFoundException e) {
          appProps.setProperty("lifetimeArrests", Integer.toString(0));
          appProps.setProperty("lifetimeTime", Integer.toString(0));
          appProps.setProperty("lifetimeFines", Integer.toString(0));
          appProps.setProperty("lifetimeStrikes", Integer.toString(0));
          
          appProps.store(new FileOutputStream(filePath + "settings.properties"), null);
       }
    
        lifetimeArrests = Integer.parseInt(appProps.getProperty("lifetimeArrests"));
        lifetimeTime = Integer.parseInt(appProps.getProperty("lifetimeTime"));
        lifetimeFines = Integer.parseInt(appProps.getProperty("lifetimeFines"));
        lifetimeStrikes = Integer.parseInt(appProps.getProperty("lifetimeStrikes"));       
      
    }
    
    public static void saveProperties() throws IOException {
       String filePath = System.getProperty("user.home") + "\\Documents\\LVPDToolJava\\";
       Properties appProps = new Properties();
       
       try (FileOutputStream out = new FileOutputStream(filePath + "settings.properties")) {
         
          appProps.setProperty("lifetimeArrests", Integer.toString(lifetimeArrests));
          appProps.setProperty("lifetimeTime", Integer.toString(lifetimeTime));
          appProps.setProperty("lifetimeFines", Integer.toString(lifetimeFines));
          appProps.setProperty("lifetimeStrikes", Integer.toString(lifetimeStrikes));
          
          appProps.store(out, null);
       }
       catch (FileNotFoundException e) {
           System.out.println("LVPD Props: FileNotFoundException: saveProperties()");
       }
    }
    
    public static void incrementProperty(int idx) {
        lifetimeArrests ++;
    }
    
    public static void incrementProperty(int idx, int amount) {
        switch(idx){
            case LIFETIME_ARRESTS:
                lifetimeArrests += amount;
                break;
            case LIFETIME_TIME:
                lifetimeTime += amount;
                break;
            case LIFETIME_FINES:
                lifetimeFines += amount;
                break;
            case LIFETIME_STRIKES:
                lifetimeStrikes += amount;
                break; 
        }
    }
    
    public static int getStat(int idx) {
        switch(idx) {
            case LIFETIME_ARRESTS:
                return lifetimeArrests;
            case LIFETIME_TIME:
                return lifetimeTime;
            case LIFETIME_FINES:
                return lifetimeFines;
            case LIFETIME_STRIKES:
                return lifetimeStrikes;
        }
        return 0;
    }
    
    public static void resetStats() {
        lifetimeArrests = 0;
        lifetimeTime = 0;
        lifetimeFines = 0;
        lifetimeStrikes = 0;
        try {
            saveProperties();
        }
        catch (IOException e) {}
    }
}
