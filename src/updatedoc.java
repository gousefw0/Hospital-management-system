import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yousef walid
 */
public class updatedoc extends javax.swing.JFrame {

    /**
     * Creates new form updatedoc
     */
    public updatedoc() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        dep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 78, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Age");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("contact no");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 158, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 198, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("salary");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 238, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 275, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("dept_id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 315, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 75, 232, -1));

        age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 115, 232, -1));

        contact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 155, 229, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 195, 229, -1));

        salary.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 235, 229, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 275, 229, -1));

        dep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(dep, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 315, 78, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("doc_id");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 90, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton3.setText("close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wgMLUS.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String patientID =id.getText();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useSSL=false", "root", "root");
            PreparedStatement stmt=con.prepareStatement("select *from doctor where doctor_id='"+patientID+"'");
            ResultSet set=stmt.executeQuery();
            if(set.next())
            {
                name.setText(set.getString(2));
                age.setText(set.getString(3));
                contact.setText(set.getString(4));
                gender.setText(set.getString(5));
                address.setText(set.getString(6));
                salary.setText(set.getString(7));
                dep.setText(set.getString(8));
                id.setEditable(false);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"patientID does not Exist");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"connection error");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String name=this.name.getText();
        String patientID=this.id.getText();
        String age=this.age.getText();
        String contact=this.contact.getText();
        String gender=this.gender.getText();
        String address=this.address.getText();
        String salary=this.salary.getText();
        String dep=this.dep.getText();
      try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital?useSSL=false", "root", "root");
            PreparedStatement stmt=con.prepareStatement("update doctor set Name=?,age=?,contactno=?,gender=?,Address=?,salary=?,dept_id=? where doctor_id='"+patientID+"'");
            stmt.setString(1,name);
            stmt.setString(2,age);
            stmt.setString(3,contact);
            stmt.setString(4,gender);
            stmt.setString(5,address);
            stmt.setString(6,salary);
            stmt.setString(7,dep);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "scussful");

      }catch(Exception e)
      {
           JOptionPane.showMessageDialog(null,"Connection error");
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(updatedoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatedoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatedoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatedoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatedoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField dep;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}
