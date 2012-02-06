/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormatGUI.java
 *
 * Created on Oct 30, 2011, 9:53:37 PM
 */

package org.scouting.gui;

/*
 * @author aoneill
 * @note Made by the Netbeans built-in GUI creator
 */
public class FormatGUI_2 extends javax.swing.JFrame
{

    /** Creates new form FormatGUI */
    public FormatGUI_2()
    {
        initComponents();
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

        teamPanel = new javax.swing.JPanel();
        teamNumber = new javax.swing.JTextField();
        penaltiesBox = new javax.swing.JTextField();
        commentsPane = new javax.swing.JScrollPane();
        comments = new javax.swing.JTextArea();
        commentsLabel = new javax.swing.JLabel();
        tabbedPane = new javax.swing.JTabbedPane();
        auto = new javax.swing.JPanel();
        topLabel = new javax.swing.JLabel();
        leftLabel = new javax.swing.JLabel();
        rightLabel = new javax.swing.JLabel();
        bottomLabel = new javax.swing.JLabel();
        leftTextBox = new javax.swing.JTextField();
        rightTextBox = new javax.swing.JTextField();
        bottomTextBox = new javax.swing.JTextField();
        topTextBox = new javax.swing.JTextField();
        main = new javax.swing.JPanel();
        topLabel1 = new javax.swing.JLabel();
        leftLabel1 = new javax.swing.JLabel();
        rightLabel1 = new javax.swing.JLabel();
        bottomLabel1 = new javax.swing.JLabel();
        leftTextBox1 = new javax.swing.JTextField();
        rightTextBox1 = new javax.swing.JTextField();
        bottomTextBox1 = new javax.swing.JTextField();
        topTextBox1 = new javax.swing.JTextField();
        end = new javax.swing.JPanel();
        topLabel2 = new javax.swing.JLabel();
        leftLabel2 = new javax.swing.JLabel();
        rightLabel2 = new javax.swing.JLabel();
        bottomLabel2 = new javax.swing.JLabel();
        leftTextBox2 = new javax.swing.JTextField();
        rightTextBox2 = new javax.swing.JTextField();
        bottomTextBox2 = new javax.swing.JTextField();
        topTextBox2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Format");

        teamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        teamNumber.setText("Team ##");

        penaltiesBox.setText("Penalties");

        comments.setColumns(20);
        comments.setLineWrap(true);
        comments.setRows(5);
        commentsPane.setViewportView(comments);

        commentsLabel.setText("Additional Comments");

        topLabel.setText("Top");

        leftLabel.setText("Left");

        rightLabel.setText("Right");

        bottomLabel.setText("Bottom");

        leftTextBox.setColumns(3);

        rightTextBox.setColumns(3);

        bottomTextBox.setColumns(3);

        topTextBox.setColumns(3);

        org.jdesktop.layout.GroupLayout autoLayout = new org.jdesktop.layout.GroupLayout(auto);
        auto.setLayout(autoLayout);
        autoLayout.setHorizontalGroup(
            autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(autoLayout.createSequentialGroup()
                .addContainerGap()
                .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(leftTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(leftLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(autoLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(topLabel))
                    .add(topTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomLabel))
                .add(42, 42, 42)
                .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(rightLabel)
                    .add(rightTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        autoLayout.setVerticalGroup(
            autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(autoLayout.createSequentialGroup()
                .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(autoLayout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftLabel)
                            .add(rightLabel))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(autoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rightTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(autoLayout.createSequentialGroup()
                        .add(topLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(topTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(59, 59, 59)
                        .add(bottomLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(bottomTextBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Autonomous", auto);

        topLabel1.setText("Top");

        leftLabel1.setText("Left");

        rightLabel1.setText("Right");

        bottomLabel1.setText("Bottom");

        leftTextBox1.setColumns(3);

        rightTextBox1.setColumns(3);

        bottomTextBox1.setColumns(3);

        topTextBox1.setColumns(3);

        org.jdesktop.layout.GroupLayout mainLayout = new org.jdesktop.layout.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(leftTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(leftLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(topLabel1))
                    .add(topTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomLabel1))
                .add(42, 42, 42)
                .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(rightLabel1)
                    .add(rightTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainLayout.createSequentialGroup()
                .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainLayout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftLabel1)
                            .add(rightLabel1))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(mainLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rightTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(mainLayout.createSequentialGroup()
                        .add(topLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(topTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(59, 59, 59)
                        .add(bottomLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(bottomTextBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Main Game", main);

        topLabel2.setText("Top");

        leftLabel2.setText("Left");

        rightLabel2.setText("Right");

        bottomLabel2.setText("Bottom");

        leftTextBox2.setColumns(3);

        rightTextBox2.setColumns(3);

        bottomTextBox2.setColumns(3);

        topTextBox2.setColumns(3);

        org.jdesktop.layout.GroupLayout endLayout = new org.jdesktop.layout.GroupLayout(end);
        end.setLayout(endLayout);
        endLayout.setHorizontalGroup(
            endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(endLayout.createSequentialGroup()
                .addContainerGap()
                .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(leftTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(leftLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(endLayout.createSequentialGroup()
                        .add(9, 9, 9)
                        .add(topLabel2))
                    .add(topTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bottomLabel2))
                .add(42, 42, 42)
                .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(rightLabel2)
                    .add(rightTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        endLayout.setVerticalGroup(
            endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(endLayout.createSequentialGroup()
                .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(endLayout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftLabel2)
                            .add(rightLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(endLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(leftTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(rightTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(endLayout.createSequentialGroup()
                        .add(topLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(topTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(59, 59, 59)
                        .add(bottomLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(bottomTextBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabbedPane.addTab("End Game", end);

        org.jdesktop.layout.GroupLayout teamPanelLayout = new org.jdesktop.layout.GroupLayout(teamPanel);
        teamPanel.setLayout(teamPanelLayout);
        teamPanelLayout.setHorizontalGroup(
            teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(teamPanelLayout.createSequentialGroup()
                .add(teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(teamPanelLayout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(teamNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(teamPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(penaltiesBox, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .add(teamPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(tabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(commentsLabel)
                    .add(commentsPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        teamPanelLayout.setVerticalGroup(
            teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(teamPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(commentsLabel)
                    .add(teamNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(teamPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(commentsPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .add(teamPanelLayout.createSequentialGroup()
                        .add(tabbedPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 186, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(penaltiesBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 457, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .addContainerGap()
                    .add(teamPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 302, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(teamPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormatGUI_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auto;
    private javax.swing.JLabel bottomLabel;
    private javax.swing.JLabel bottomLabel1;
    private javax.swing.JLabel bottomLabel2;
    private javax.swing.JTextField bottomTextBox;
    private javax.swing.JTextField bottomTextBox1;
    private javax.swing.JTextField bottomTextBox2;
    private javax.swing.JTextArea comments;
    private javax.swing.JLabel commentsLabel;
    private javax.swing.JScrollPane commentsPane;
    private javax.swing.JPanel end;
    private javax.swing.JLabel leftLabel;
    private javax.swing.JLabel leftLabel1;
    private javax.swing.JLabel leftLabel2;
    private javax.swing.JTextField leftTextBox;
    private javax.swing.JTextField leftTextBox1;
    private javax.swing.JTextField leftTextBox2;
    private javax.swing.JPanel main;
    private javax.swing.JTextField penaltiesBox;
    private javax.swing.JLabel rightLabel;
    private javax.swing.JLabel rightLabel1;
    private javax.swing.JLabel rightLabel2;
    private javax.swing.JTextField rightTextBox;
    private javax.swing.JTextField rightTextBox1;
    private javax.swing.JTextField rightTextBox2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTextField teamNumber;
    private javax.swing.JPanel teamPanel;
    private javax.swing.JLabel topLabel;
    private javax.swing.JLabel topLabel1;
    private javax.swing.JLabel topLabel2;
    private javax.swing.JTextField topTextBox;
    private javax.swing.JTextField topTextBox1;
    private javax.swing.JTextField topTextBox2;
    // End of variables declaration//GEN-END:variables

}
