
import java.awt.Color;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
 
/**
 *
 * @author teo
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Dashboard() throws Exception {
        initComponents();
        myConnection();
        createlog();
        mainpanel.removeAll();
        mainpanel.add(welcome);
        validate();
        repaint();
        setVisible(true);
        WindowListener listener = new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                try {
                    dbConnection.close();
                    System.out.println("CONNECTION CLOSED!");
                } catch (SQLException ex) {
                    Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        addWindowListener(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        loans = new javax.swing.JButton();
        members = new javax.swing.JButton();
        books = new javax.swing.JButton();
        writers = new javax.swing.JButton();
        publishers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mainpanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("example_library");

        jPanel2.setBackground(new java.awt.Color(45, 83, 158));
        jPanel2.setPreferredSize(new java.awt.Dimension(154, 584));

        loans.setBackground(new java.awt.Color(80, 96, 172));
        loans.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        loans.setText("Loans");
        loans.setBorderPainted(false);
        loans.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loans.setFocusPainted(false);
        loans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loansActionPerformed(evt);
            }
        });

        members.setBackground(new java.awt.Color(80, 96, 172));
        members.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        members.setText("Members");
        members.setPreferredSize(new java.awt.Dimension(102, 24));
        members.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersActionPerformed(evt);
            }
        });

        books.setBackground(new java.awt.Color(80, 96, 172));
        books.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        books.setText("Books");
        books.setPreferredSize(new java.awt.Dimension(102, 24));
        books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksActionPerformed(evt);
            }
        });

        writers.setBackground(new java.awt.Color(80, 96, 172));
        writers.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        writers.setText("Writers");
        writers.setBorderPainted(false);
        writers.setFocusPainted(false);
        writers.setPreferredSize(new java.awt.Dimension(102, 24));
        writers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writersActionPerformed(evt);
            }
        });

        publishers.setBackground(new java.awt.Color(80, 96, 172));
        publishers.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        publishers.setText("Publishers");
        publishers.setPreferredSize(new java.awt.Dimension(102, 24));
        publishers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishersActionPerformed(evt);
            }
        });

        jLabel2.setText("<html>" + "Copyright © 2022" + "<br><b><i>" + "SimpleDevs." + "</i></b><br>" + "All Rights Reserved.");

        jButton1.setBackground(new java.awt.Color(80, 96, 172));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        jButton1.setText("Dashboard");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loans, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addComponent(members, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addComponent(books, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addComponent(writers, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addComponent(publishers, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(loans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(members, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(books, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(writers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(publishers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainpanel.setBackground(new java.awt.Color(232, 233, 236));
        mainpanel.setPreferredSize(new java.awt.Dimension(700, 700));
        mainpanel.setLayout(new javax.swing.BoxLayout(mainpanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(80, 96, 172));

        jLabel1.setFont(new java.awt.Font("Manjari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 237, 237));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INTEGRATED LIBRARY SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void membersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersActionPerformed
        member = new Members();
        mainpanel.removeAll();
        mainpanel.add(member);
        validate();
        repaint();
        setVisible(true) ;
    }//GEN-LAST:event_membersActionPerformed

    private void writersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writersActionPerformed
        writer = new Writers();
        mainpanel.removeAll();
        mainpanel.add(writer);
        validate();
        repaint();
        setVisible(true);
    }//GEN-LAST:event_writersActionPerformed

         
    private void booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksActionPerformed
        book = new Books();
        mainpanel.removeAll();
        mainpanel.add(book);
        validate();
        repaint();
        setVisible(true);
    }//GEN-LAST:event_booksActionPerformed

    private void publishersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishersActionPerformed
        publisher = new Publishers();
        mainpanel.removeAll();
        mainpanel.add(publisher);
        validate();
        repaint();
        setVisible(true);
    }//GEN-LAST:event_publishersActionPerformed

    private void loansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loansActionPerformed
       loan = new Loans();
       mainpanel.removeAll();
       mainpanel.add(loan);
       validate();
       repaint();
       setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_loansActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mainpanel.removeAll();
       mainpanel.add(welcome);
       validate();
       repaint();
       setVisible(true);    
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Dashboard().setVisible(true);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
    }
    Loans loan;
    Publishers publisher;
    Writers writer;
    Members member;
    Books book;
    public Welcome welcome = new Welcome();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton books;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loans;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton members;
    private javax.swing.JButton publishers;
    private javax.swing.JButton writers;
    // End of variables declaration//GEN-END:variables

    
    //Database variables declaration
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "YOUR_JDBC" ;
    public static Connection dbConnection = null;
    static String     username = "YOUR_USERNAME";
    static String     passwd = "YOUR_PASSWORD";
    static Statement statement = null;
    
    private void myConnection() throws Exception {
        
        try{
            Class.forName(driverClassName);
        }catch (ClassNotFoundException ex){
            
        }
        try{
        dbConnection = DriverManager.getConnection (url, username, passwd);
        
        statement = dbConnection.createStatement();
        
        //DIAGRAFW TOUS PINAKES AN YPARXOUN HDH
        statement.executeQuery("SELECT dropdb()"); 
        
        //DHMIOURGW TOUS PINAKES
        statement.executeQuery("SELECT createdb()");
        //MINIMA AN PIGAN OLA KALA
        System.out.println("TABLES CREATED SUCCESSFULLY");
                                        
        //GEMIZW TOUS PINAKES   
        statement.executeQuery("SELECT insertdb()");
        //MINIMA AN PHGAN OLA KALA
        System.out.println("ROWS INSERTED SUCCESSFULLY\n");
                                        
        dbConnection.close();
        }catch(SQLException ex){
            
            while(ex != null){
                JOptionPane.showMessageDialog(null, ex.getMessage(),"NewJFrame",JOptionPane.INFORMATION_MESSAGE);
                System.out.println("--SQL Exception--");
                System.out.println("SQL State: "+ex.getSQLState());
                System.out.println("Error Code: "+ex.getErrorCode());
                ex = ex.getNextException();
                System.out.println("");
            }
        }
    }

    private void createlog() {
        Books.createLog();
        Publishers.createLog();
        Loans.createLog();
        Writers.createLog();
        Members.createLog();
    }
}
