/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ps22788_buixuanviet_assigntment;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author ASUS
 */
public class Clook extends Thread{
 private JButton button;

    public Clook(JButton button) {
        this.button = button;
    }

    @Override
    public void run() {
        SimpleDateFormat formater = new SimpleDateFormat();
        while (true) {
            try {
                Date now = new Date();
                formater.applyPattern("hh:mm:ss:aa");
                String time = formater.format(now);
                button.setText(time);
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }   
}
