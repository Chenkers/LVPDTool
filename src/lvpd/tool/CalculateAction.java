/*
 * Copyright (C) 2014 Chenko
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

/**
 *
 * @author Chenko@MTG
 */
public class CalculateAction {
    
    public static int TotalTime;
    public static int TotalFine;
    public static int TotalStrikes;
    public static String CommandString; 
        
    public static void actionPerformed(java.awt.event.ActionEvent e) {
        if("Calculate".equals(e.getActionCommand())) {
            
             if(MainGUI.jCheckBox1.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox1.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox1.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox1.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox1.getText());
                 }
             }
             if(MainGUI.jCheckBox2.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox2.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox2.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox2.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox2.getText());
                 }
             }
             if(MainGUI.jCheckBox3.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox3.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox3.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox3.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox3.getText());
                 }
             }
             if(MainGUI.jCheckBox4.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox4.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox4.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox4.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox4.getText());
                 }
             }
             if(MainGUI.jCheckBox5.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox5.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox5.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox5.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox5.getText());
                 }
             }
             if(MainGUI.jCheckBox6.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox6.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox6.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox6.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox6.getText());
                 }
             }
             if(MainGUI.jCheckBox7.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox7.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox7.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox7.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox7.getText());
                 }
             }
             if(MainGUI.jCheckBox8.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox8.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox8.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox8.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox8.getText());
                 }
             }
             if(MainGUI.jCheckBox9.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox9.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox9.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox9.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox9.getText());
                 }
             }
             if(MainGUI.jCheckBox10.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox10.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox10.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox10.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox10.getText());
                 }
             }
             if(MainGUI.jCheckBox11.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox11.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox11.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox11.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox11.getText());
                 }
             }
             if(MainGUI.jCheckBox12.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox12.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox12.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox12.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox12.getText());
                 }
             }
             if(MainGUI.jCheckBox13.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox13.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox13.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox13.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox13.getText());
                 }
             }
             if(MainGUI.jCheckBox14.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox14.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox14.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox14.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox14.getText());
                 }
             }
             if(MainGUI.jCheckBox15.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox15.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox15.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox15.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox15.getText());
                 }
             }
             if(MainGUI.jCheckBox16.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox16.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox16.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox16.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox16.getText());
                 }
             }
             if(MainGUI.jCheckBox17.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox17.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox17.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox17.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox17.getText());
                 }
             }
             if(MainGUI.jCheckBox18.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox18.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox18.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox18.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox18.getText());
                 }
             }
             if(MainGUI.jCheckBox20.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox20.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox20.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox20.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox20.getText());
                 }
             }
             if(MainGUI.jCheckBox21.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox21.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox21.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox21.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox21.getText());
                 }
             }
             if(MainGUI.jCheckBox22.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox22.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox22.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox22.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox22.getText());
                 }
             }
             if(MainGUI.jCheckBox23.isSelected()) { 
                 int idx = MainGUI.weaponsComboBox.getSelectedIndex();
                 switch(idx) {
                     case 0:
                         TotalTime += 5;
                         TotalFine += 500;
                         break;
                     case 1: 
                         TotalTime += 10;
                         TotalFine += 1500;
                         break;
                     case 2: 
                         TotalTime += 15;
                         TotalFine += 3000;                  
                         break;
                     case 3: 
                         TotalTime += 12;
                         TotalFine += 3500;                
                         break;
                     case 4: 
                         TotalTime += 20;
                         TotalFine += 15000;
                         break;
                 }
             }
             if(MainGUI.jCheckBox24.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox24.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox24.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox24.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox24.getText());
                 }
             }
             if(MainGUI.jCheckBox25.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox25.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox25.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox25.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox25.getText());
                 }
             }
             if(MainGUI.jCheckBox26.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox26.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox26.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox26.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox26.getText());
                 }
             }
             if(MainGUI.jCheckBox27.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox27.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox27.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox27.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox27.getText());
                 }
             }
             if(MainGUI.jCheckBox28.isSelected()) {
                 int amount = Integer.parseInt(MainGUI.drugsTextField.getText());
                 switch(MainGUI.drugsComboBox.getSelectedIndex()) {
                     case 0:
                         if(amount <= 5) {
                             TotalFine += 625;
                         }
                         else if(amount > 6 && amount <= 20) {
                             TotalFine += 3500;
                             TotalTime += 6;
                         }
                         else if(amount > 20 && amount <= 40) {
                             TotalFine += 6500;
                             TotalTime += 20;
                         }
                         else if(amount > 40 && amount <= 80) {
                             TotalFine += 12500;
                             TotalTime += 35;
                         }
                         else if(amount > 80 && amount <= 100) {
                             TotalFine += 15000;
                             TotalTime += 40;
                         }
                         else if(amount > 100 && amount <= 120) { 
                             TotalFine += 17500;
                             TotalTime += 40;
                         }
                         else if(amount > 120 && amount <= 140) {
                             TotalFine += 20000;
                             TotalTime += 40;
                         }
                         else if(amount > 140) {
                             TotalFine += 25000;
                             TotalTime += 50;
                         }
                         break;
                     case 1:
                         if(amount <= 20) {
                             TotalFine += 625;
                         }
                         else if(amount > 20 && amount <= 100) {
                             TotalFine += 3000;
                             TotalTime += 5;
                         }
                         else if(amount > 100 && amount <= 200) {
                             TotalFine += 5000;
                             TotalTime += 10;
                         }
                         else if(amount > 200) {
                             TotalFine += 7000;
                             TotalTime += 15;
                         }
                         break;
                     case 2:
                         if(amount <= 5) {
                             TotalFine += 500;
                         }
                         else if(amount > 6 && amount <= 20) {
                             TotalFine += 2800;
                             TotalTime += 10;
                         }
                         else if(amount > 20 && amount <= 50) {
                             TotalFine += 7000;
                             TotalTime += 12;
                         }
                         else if(amount > 50 && amount <= 100) {
                             TotalFine += 14000;
                             TotalTime += 15;
                         }
                         else if(amount > 100 && amount <= 200) {
                             TotalFine += 16000;
                             TotalTime += 25;
                         }
                         else if(amount > 200) {
                             TotalFine += 25000;
                             TotalTime += 50;
                         }
                         break;                       
                 }
             }
             if(MainGUI.jCheckBox29.isSelected()) {
                  int amount = Integer.parseInt(MainGUI.drugsTextField.getText());
                  if(amount <= 10) {
                      TotalFine += 250;
                  }
                  else if(amount > 10 && amount <= 30) {
                      TotalFine += 750;
                      TotalTime += 5;
                  }
                  else if(amount > 30 && amount <= 60) {
                      TotalFine += 1000;
                      TotalTime += 10;
                  }
                  else if(amount > 60 && amount <= 90) {
                      TotalFine += 1500;
                      TotalTime += 15;
                  }
                  else if(amount > 90 && amount <= 120) {
                      TotalFine += 1800;
                      TotalTime += 20;
                  }
                  else if(amount > 120 && amount <= 150) {
                      TotalFine += 2200;
                      TotalTime += 25;
                  }
                  else if(amount > 150 && amount <= 300) {
                      TotalFine += 8000;
                      TotalTime += 30;
                  }
                  else if(amount > 300) {
                      TotalFine += 12000;
                      TotalTime += 40;
                  }
             }
             if(MainGUI.jCheckBox30.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox30.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox30.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox30.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox30.getText());
                 }
             }
             if(MainGUI.jCheckBox31.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox31.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox31.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox31.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox31.getText());
                 }
             }
             if(MainGUI.jCheckBox32.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox32.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox32.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox32.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox32.getText());
                 }
             }
             if(MainGUI.jCheckBox33.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox33.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox33.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox33.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox33.getText());
                 }
             }
             if(MainGUI.jCheckBox34.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox34.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox34.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox34.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox34.getText());
                 }
             }
             if(MainGUI.jCheckBox35.isSelected()) {

                 if(MainGUI.materialsTraffick.isSelected()) {
                     TotalTime += 15;
                     TotalFine += 5000;
                 }
                 if(MainGUI.drugsTraffick.isSelected()) {
                     TotalTime += 15;
                     TotalFine += 5000;
                 }
                 if(MainGUI.firearmsTraffick.isSelected()) {
                     TotalTime += 20;
                     TotalFine += 5000;
                 }
             }            
             if(MainGUI.jCheckBox37.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox37.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox37.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox37.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox37.getText());
                 }
             }
             if(MainGUI.jCheckBox38.isSelected()) {
                 switch(MainGUI.dischargeComboBox.getSelectedIndex()) {
                     case 0:
                         TotalTime += 10;
                         TotalFine += 2500;
                         break;
                     case 1:
                         TotalTime += 12;
                         TotalFine += 5000;
                         break;
                 }
             }
             if(MainGUI.jCheckBox39.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox39.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox39.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox39.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox39.getText());
                 }
             }
             if(MainGUI.jCheckBox40.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox40.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox40.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox40.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox40.getText());
                 }
             }
             if(MainGUI.jCheckBox41.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox41.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox41.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox41.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox41.getText());
                 }
             }
             if(MainGUI.jCheckBox42.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox42.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox42.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox42.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox42.getText());
                 }
             }
             if(MainGUI.jCheckBox43.isSelected()) {
                 TotalTime += 30;
                 TotalFine += 10000;

                 if(MainGUI.attemptedLEO.isSelected()) {
                     TotalTime += 20;
                     TotalFine += 5000;
                 }
             }
             if(MainGUI.jCheckBox44.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox44.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox44.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox44.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox44.getText());
                 }
             }
             if(MainGUI.jCheckBox45.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox45.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox45.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox45.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox45.getText());
                 }
             }
             if(MainGUI.jCheckBox46.isSelected()) {
                 TotalTime += 30;
                 TotalFine += 10000;

                 if(MainGUI.kidnappingLEO.isSelected()) {
                     TotalTime += 20;
                     TotalFine += 15000;
                 }
             }
             if(MainGUI.jCheckBox47.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox47.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox47.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox47.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox47.getText());
                 }
             }
             if(MainGUI.jCheckBox48.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox48.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox48.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox48.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox48.getText());
                 }
             }       
             if(MainGUI.jCheckBox50.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox50.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox50.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox50.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox50.getText());
                 }
             }
             if(MainGUI.jCheckBox51.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox51.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox51.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox51.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox51.getText());
                 }
             }
             if(MainGUI.jCheckBox52.isSelected()) {
                 TotalTime += 15;
                 TotalFine += 2000;

                 if(MainGUI.assaultLEO.isSelected()) {
                     TotalTime += 5;
                     TotalFine += 500;
                 }
             }
             if(MainGUI.jCheckBox53.isSelected()) {
                 TotalTime += 20;
                 TotalFine += 2500;

                 if(MainGUI.assaultandbatteryLEO.isSelected()) {
                     TotalTime += 5;
                     TotalFine += 3500;
                 }
             }
             if(MainGUI.jCheckBox54.isSelected()) {
                 TotalTime += 20;
                 TotalFine += 5000;

                 if(MainGUI.assaultdeadlyLEO.isSelected()) {
                     TotalTime += 5;
                     TotalFine += 1000;
                 }
             }
             if(MainGUI.jCheckBox55.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox55.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox55.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox55.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox55.getText());
                 }
             }
             if(MainGUI.jCheckBox56.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox56.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox56.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox56.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox56.getText());
                 }
             }
             if(MainGUI.jCheckBox57.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox57.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox57.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox57.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox57.getText());
                 }
             }
             if(MainGUI.jCheckBox58.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox58.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox58.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox58.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox58.getText());
                 }
             }
             if(MainGUI.jCheckBox59.isSelected()) {
                 TotalTime += 45;
                 TotalFine += 20000;

                 if(MainGUI.successfulLEO.isSelected()) {
                     TotalTime += 5;
                     TotalFine += 5000;
                 }
             }
             if(MainGUI.jCheckBox60.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox60.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox60.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox60.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox60.getText());
                 }
             }
             if(MainGUI.jCheckBox61.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox61.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox61.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox61.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox61.getText());
                 }
             }
             if(MainGUI.jCheckBox62.isSelected()) {
                 TotalTime += CrimesSource.getCrimeTimeByName(MainGUI.jCheckBox62.getText());
                 TotalFine += CrimesSource.getCrimeFineByName(MainGUI.jCheckBox62.getText());

                 if(TotalStrikes < CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox62.getText())) {
                     TotalStrikes = CrimesSource.getCrimeStrikesByName(MainGUI.jCheckBox62.getText());
                 }
             }

             if(TotalTime > 50) {
                 TotalTime = 50;
             }
             if(TotalFine > 25000) {
                 TotalFine = 25000;
             }
             if(TotalStrikes > 3) {
                 TotalStrikes = 3;
             }

             CommandString = "/arrest "+MainGUI.playeridSpinner.getValue()+" "+TotalTime+" "+TotalFine+" "+TotalStrikes;
             MainGUI.jTextPane1.setText(CommandString);
             MainGUI.jLabel5.setText("<html><b>Fine:</b> $"+TotalFine+"<br><br><b>Time: </b>"+TotalTime+" minutes<br><br><b>Strikes: </b>"+TotalStrikes);
               
             LVPDProperties.incrementProperty(LVPDProperties.LIFETIME_ARRESTS);
             LVPDProperties.incrementProperty(LVPDProperties.LIFETIME_FINES, TotalFine);
             LVPDProperties.incrementProperty(LVPDProperties.LIFETIME_STRIKES, TotalStrikes);
             LVPDProperties.incrementProperty(LVPDProperties.LIFETIME_TIME, TotalTime);
             
             
             try { 
                 LVPDProperties.saveProperties();
             }
             catch(java.io.IOException exc) {}
             
             TotalTime = 0;
             TotalFine = 0;
             TotalStrikes = 0;
            
        }
    }
}
