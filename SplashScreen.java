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

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author Sergey
 */
public class SplashScreen {
    
    public static void splashInit() {
        JWindow window = new JWindow();
        java.net.URL imgURL = SplashScreen.class.getResource("resources/images/SplashScreen.png");
        window.getContentPane().add(
                new JLabel("", new ImageIcon(imgURL), SwingConstants.CENTER));
        window.setBounds(500, 150, 300, 200);
        window.setSize(500, 350);
        window.setVisible(true);
        
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Caught InterrupedException");
        }
        
        window.setVisible(false);
        window.dispose();
    }
}
