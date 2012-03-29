/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AboutGUI.java
 *
 * Created on Oct 28, 2011, 6:35:05 PM
 */

package com.edinarobotics.gui;

import com.edinarobotics.scout.Global;

/*
 * @author aoneill
 * @note Made by the Netbeans built-in GUI creator
 */
public class AboutGUI extends javax.swing.JFrame
{
    private static String VERSION = Global.VERSION;

    /**
     * Creates new form AboutGUI
     */
    public AboutGUI()
    {
        initComponents();

        // Set the Verion
        setVersion(VERSION);

        // Show the GUI
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new javax.swing.JLabel();
        devLabel = new javax.swing.JLabel();
        whoIsLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About");
        setResizable(false);

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edinarobotics/rescources/Logo.png"))); // NOI18N

        devLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        devLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        devLabel.setText("Developed By");

        whoIsLabel.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        whoIsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        whoIsLabel.setText("The Programmers of 1816");

        versionLabel.setText("Beta 0.1");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pic)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, whoIsLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(devLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(versionLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(pic)
                .add(18, 18, 18)
                .add(devLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(whoIsLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(versionLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets the content of the label containing the Version
     * @param version the version to be displayed
     */
    private void setVersion(String version)
    {
        // Set the content
        versionLabel.setText(version);
    }
    
    /**
     * The Main Runnable function of the class
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel devLabel;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JLabel whoIsLabel;
    // End of variables declaration//GEN-END:variables

}
