/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.WholesaleUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author shubham_yadav
 */
public class OpenPdf {

    public static void OpenById(String id) {
        try {
            File file = new File(WholesaleUtils.billPath + id + ".pdf");

            if (file.exists()) {
                // Use the 'open' command on macOS
                Process p = Runtime.getRuntime().exec(new String[]{"open", file.getAbsolutePath()});
            } else {
                JOptionPane.showMessageDialog(null, "File Not Exists.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
