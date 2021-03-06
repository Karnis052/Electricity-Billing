
import java.awt.print.PrinterException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class Paybill extends javax.swing.JFrame {

    /**
     * Creates new form Paybill
     */
    public Paybill() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtmeter = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtpay = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtprint = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PAY BILL");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 378, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Meter ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 170, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 40));
        jPanel1.add(txtmeter, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 330, 40));
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 330, 40));

        txtpay.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtpay.setText("Submit");
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });
        jPanel1.add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 280, -1));

        txtprint.setColumns(20);
        txtprint.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        txtprint.setRows(5);
        jScrollPane1.setViewportView(txtprint);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, 520, 440));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 575, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 170, 30));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 340, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
     String mid, name;
     public void print()
     {
          String mid = txtmeter.getText();
          String name = txtname.getText();
          txtprint.setText(txtprint.getText()+"\n");
          txtprint.setText(txtprint.getText()+ "Electricity Billing System"+ "\n");
          txtprint.setText(txtprint.getText()+"\n");
          txtprint.setText(txtprint.getText()+ "Coustomer ID: "+ 52 + "\n");
          txtprint.setText(txtprint.getText()+ "Customer name: "+ name + "\n");
          txtprint.setText(txtprint.getText()+ "Your Balance : "+4000+ "\n");
          txtprint.setText(txtprint.getText()+ "Your tatal bill : "+ 725+ "\n");
          txtprint.setText(txtprint.getText()+ "Your Remaining  Balance : "+ 3275+ "\n");
          txtprint.setText(txtprint.getText()+"Thank you for being with us.\n");
          
     }
     
    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
       
        mid = txtmeter.getText();
        name = txtname.getText();
        print();
        
        
    }//GEN-LAST:event_txtpayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            txtprint.print();
        } catch (PrinterException ex) {
            Logger.getLogger(calculate_bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Paybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paybill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paybill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtmeter;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton txtpay;
    private javax.swing.JTextArea txtprint;
    // End of variables declaration//GEN-END:variables
}
