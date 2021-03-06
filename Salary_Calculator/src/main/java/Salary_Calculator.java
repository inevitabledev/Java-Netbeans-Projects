/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coup
 */
public class Salary_Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Salary_Calculator
     */
    public Salary_Calculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfbs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbpost = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbrural = new javax.swing.JRadioButton();
        rburban = new javax.swing.JRadioButton();
        cbtransport = new javax.swing.JCheckBox();
        cbuniform = new javax.swing.JCheckBox();
        cbfitness = new javax.swing.JCheckBox();
        cbcomm = new javax.swing.JCheckBox();
        cbentert = new javax.swing.JCheckBox();
        jbCalculateearn = new javax.swing.JButton();
        jbcalculatededuct = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfDA = new javax.swing.JTextField();
        tfHRA = new javax.swing.JTextField();
        tfOthers = new javax.swing.JTextField();
        tfEarnings = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfIT = new javax.swing.JTextField();
        tfPF = new javax.swing.JTextField();
        tfSC = new javax.swing.JTextField();
        tfTD = new javax.swing.JTextField();
        jbCalculateSal = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        tfSalarynHand = new javax.swing.JTextField();
        rbp = new javax.swing.JRadioButton();
        rbt = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Basic Salary");

        jLabel2.setText("Status");

        jLabel3.setText("Designation");

        cbpost.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chairman", "Manager", "Team Leader", "Worker" }));

        jLabel4.setText("Allowance");

        jLabel5.setText("Area");

        buttonGroup2.add(rbrural);
        rbrural.setText("Rural");

        buttonGroup2.add(rburban);
        rburban.setText("Urban");

        cbtransport.setText("Transport");

        cbuniform.setText("Uniform");

        cbfitness.setText("Fitness");

        cbcomm.setText("Communication");

        cbentert.setText("Entertainment");

        jbCalculateearn.setText("Calculate Earnings");
        jbCalculateearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculateearnActionPerformed(evt);
            }
        });

        jbcalculatededuct.setText("Calculate Deductions");
        jbcalculatededuct.setEnabled(false);
        jbcalculatededuct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcalculatedeductActionPerformed(evt);
            }
        });

        jLabel6.setText("D A");

        jLabel7.setText("H R A");

        jLabel8.setText("Other");

        jLabel9.setText("Total Earnings");

        tfDA.setEditable(false);
        tfDA.setEnabled(false);
        tfDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDAActionPerformed(evt);
            }
        });

        tfHRA.setEditable(false);
        tfHRA.setEnabled(false);

        tfOthers.setEditable(false);
        tfOthers.setEnabled(false);

        tfEarnings.setEditable(false);
        tfEarnings.setEnabled(false);

        jLabel10.setText("Income Tax");

        jLabel11.setText("P F");

        jLabel12.setText("Social Contribution");

        jLabel13.setText("Total Deductions");

        tfIT.setEditable(false);
        tfIT.setEnabled(false);
        tfIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfITActionPerformed(evt);
            }
        });

        tfPF.setEditable(false);
        tfPF.setEnabled(false);

        tfSC.setEditable(false);
        tfSC.setEnabled(false);

        tfTD.setEditable(false);
        tfTD.setEnabled(false);

        jbCalculateSal.setText("Calculate Salary in Hand");
        jbCalculateSal.setEnabled(false);
        jbCalculateSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCalculateSalActionPerformed(evt);
            }
        });

        jButton4.setText("RESET");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("STOP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Salary in Hand");

        tfSalarynHand.setEditable(false);
        tfSalarynHand.setEnabled(false);
        tfSalarynHand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalarynHandActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbp);
        rbp.setText("Permanent");

        buttonGroup1.add(rbt);
        rbt.setText("Temporary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63)
                        .addComponent(tfbs, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67)
                        .addComponent(cbpost, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106)
                        .addComponent(rbp)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel5)
                        .addGap(118, 118, 118)
                        .addComponent(rbrural))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(rbt)
                        .addGap(298, 298, 298)
                        .addComponent(rburban))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(cbtransport)
                        .addGap(25, 25, 25)
                        .addComponent(cbuniform)
                        .addGap(38, 38, 38)
                        .addComponent(cbfitness)
                        .addGap(55, 55, 55)
                        .addComponent(cbcomm)
                        .addGap(45, 45, 45)
                        .addComponent(cbentert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jbCalculateearn)
                        .addGap(301, 301, 301)
                        .addComponent(jbcalculatededuct))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jbCalculateSal)
                        .addGap(105, 105, 105)
                        .addComponent(jButton4)
                        .addGap(217, 217, 217)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(tfSalarynHand, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(106, 106, 106)
                                .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(117, 117, 117)
                                .addComponent(tfDA, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(98, 98, 98)
                                .addComponent(tfOthers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(41, 41, 41)
                                .addComponent(tfEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(220, 220, 220)
                                .addComponent(jLabel13)))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfSC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfIT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfPF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(tfbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbp)
                    .addComponent(rbrural)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbt)
                    .addComponent(rburban))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbtransport)
                    .addComponent(cbuniform)
                    .addComponent(cbfitness)
                    .addComponent(cbcomm)
                    .addComponent(cbentert))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCalculateearn)
                    .addComponent(jbcalculatededuct))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tfDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(tfHRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tfOthers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(tfEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(tfTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCalculateSal)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addComponent(tfSalarynHand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCalculateearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculateearnActionPerformed
        // TODO add your handling code here:
        double Basic;
        double DA,HRA,Others=0,Earnings;
        Basic = Double.parseDouble(tfbs.getText());
        if(rbp.isSelected())
        {
            if(cbpost.getSelectedIndex()==0)
            DA = 0.50*Basic;
            else if(cbpost.getSelectedIndex()==1)
            DA = 0.60*Basic;
            else if(cbpost.getSelectedIndex()==2)
            DA = 0.80*Basic;
            else if(cbpost.getSelectedIndex()==3)
            DA = 0.90*Basic;
            else
            DA=0;
        }
        else
        DA=1000;
        if(rbrural.isSelected())
        HRA=4000;
        else if (rburban.isSelected())
        HRA=8000;
        else
        HRA=0;

        if(cbtransport.isSelected())
        Others=3000;
        if(cbuniform.isSelected())
        Others=1000;
        if(cbfitness.isSelected())
        Others=2000;
        if(cbcomm.isSelected())
        Others=1500;
        if(cbentert.isSelected())
        Others=500;
        Earnings=DA+HRA+Others;
        tfDA.setText(Double.toString(DA));
        tfHRA.setText(Double.toString(HRA));
        tfOthers.setText(Double.toString(Others));
        tfEarnings.setText(Double.toString(Earnings));
        jbcalculatededuct.setEnabled(true);

    }//GEN-LAST:event_jbCalculateearnActionPerformed

    private void jbcalculatedeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcalculatedeductActionPerformed
        // TODO add your handling code here:
        double BasicDA;
        double DA,IT,PF=0,Social=0,Deductions;
        DA=Double.parseDouble(tfDA.getText());
        BasicDA= Double.parseDouble(tfbs.getText())+DA;
        //Calculation for Income Tax
        if(rbp.isSelected())
        {  
            if(BasicDA>=300000)
            {
                IT=0.30*BasicDA;
            }
            else if(BasicDA>=150000)
            {
                IT=0.20*BasicDA;
            }
            else 
            {
                IT=0.10*BasicDA;
            }
            PF=0.10*BasicDA;
            Social=3000;
        }
        else
        //for temporary
        IT=1000;
        Deductions=IT+PF+Social;
        tfIT.setText(Double.toString(IT));
        tfPF.setText(Double.toString(PF));
        tfSC.setText(Double.toString(Social));
        tfTD.setText(Double.toString(Deductions));
        jbCalculateSal.setEnabled(true);

    }//GEN-LAST:event_jbcalculatedeductActionPerformed

    private void tfDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDAActionPerformed

    private void tfITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfITActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfITActionPerformed

    private void jbCalculateSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCalculateSalActionPerformed
        // TODO add your handling code here:
        double Basic=Double.parseDouble(tfbs.getText());
        double Earnings=Double.parseDouble(tfEarnings.getText());
        double Deductions=Double.parseDouble(tfTD.getText());
        tfSalarynHand.setText(Double.toString(Basic+Earnings-Deductions));
    }//GEN-LAST:event_jbCalculateSalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        tfbs.setText("0");
        tfDA.setText("0");
        tfHRA.setText("0");
        tfOthers.setText("0");
        tfEarnings.setText("0");
        tfIT.setText("0");
        tfPF.setText("0");
        tfSC.setText("0");
        tfTD.setText("0");
        cbpost.setSelectedIndex(0);
        rbp.setSelected(false);
        rbt.setSelected(false);
        rburban.setSelected(false);
        rbrural.setSelected(false);
        cbtransport.setSelected(false);
        cbuniform.setSelected(false);
        cbfitness.setSelected(false);
        cbcomm.setSelected(false);
        cbentert.setSelected(false);
        jbcalculatededuct.setSelected(false);
        jbCalculateSal.setSelected(false);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tfSalarynHandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalarynHandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalarynHandActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbcomm;
    private javax.swing.JCheckBox cbentert;
    private javax.swing.JCheckBox cbfitness;
    private javax.swing.JComboBox<String> cbpost;
    private javax.swing.JCheckBox cbtransport;
    private javax.swing.JCheckBox cbuniform;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbCalculateSal;
    private javax.swing.JButton jbCalculateearn;
    private javax.swing.JButton jbcalculatededuct;
    private javax.swing.JRadioButton rbp;
    private javax.swing.JRadioButton rbrural;
    private javax.swing.JRadioButton rbt;
    private javax.swing.JRadioButton rburban;
    private javax.swing.JTextField tfDA;
    private javax.swing.JTextField tfEarnings;
    private javax.swing.JTextField tfHRA;
    private javax.swing.JTextField tfIT;
    private javax.swing.JTextField tfOthers;
    private javax.swing.JTextField tfPF;
    private javax.swing.JTextField tfSC;
    private javax.swing.JTextField tfSalarynHand;
    private javax.swing.JTextField tfTD;
    private javax.swing.JTextField tfbs;
    // End of variables declaration//GEN-END:variables
}
