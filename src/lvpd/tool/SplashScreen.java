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

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
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
        window.setSize(500, 400);
        
        java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize(); 
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
        
        setupAudio();
        window.setVisible(true);
    
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Caught InterrupedException");
        }
        
        window.setVisible(false);
        window.dispose();
    }
    
    private static void setupAudio() {
        try { 
            Clip clip = AudioSystem.getClip();
            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(SplashScreen.class.getResource("resources/sounds/SplashAudio.wav"));
           
            clip.open(audioInput);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-30.0f);
            clip.start();
        }
        catch(LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
        }
    }
}
