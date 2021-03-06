/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author micro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        centralizarComponente();
    }

    public void centralizarComponente() {
        Dimension ds = Toolkit.getDefaultToolkit().getScreenSize(); Dimension dw = getSize(); setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2); }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoLogar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotaoLogar = new javax.swing.JButton();
        LoginSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        BotaoLogar2 = new javax.swing.JButton();

        BotaoLogar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotaoLogar1.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLogar1.setText("Entrar");
        BotaoLogar1.setToolTipText("Entrar");
        BotaoLogar1.setBorder(null);
        BotaoLogar1.setBorderPainted(false);
        BotaoLogar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLogar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Production Planner");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usu??rio");

        LoginUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LoginUsuario.setToolTipText("Digite o usu??rio");
        LoginUsuario.setCaretColor(new java.awt.Color(102, 102, 102));
        LoginUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LoginUsuario.setName(""); // NOI18N
        LoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        BotaoLogar.setBackground(java.awt.SystemColor.textHighlight);
        BotaoLogar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotaoLogar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLogar.setText("Entrar");
        BotaoLogar.setToolTipText("Entrar");
        BotaoLogar.setBorder(null);
        BotaoLogar.setBorderPainted(false);
        BotaoLogar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogarActionPerformed(evt);
            }
        });

        LoginSenha.setToolTipText("Digite a senha");
        LoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginSenhaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(50, 50, 50));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(java.awt.SystemColor.textHighlight);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        jPanel2.setForeground(java.awt.SystemColor.textHighlight);
        jPanel2.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(0, 153, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCTION PLANNER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotaoLogar2.setBackground(java.awt.SystemColor.textHighlight);
        BotaoLogar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotaoLogar2.setForeground(new java.awt.Color(255, 255, 255));
        BotaoLogar2.setText("Cadastrar usu??rio");
        BotaoLogar2.setToolTipText("Entrar");
        BotaoLogar2.setBorder(null);
        BotaoLogar2.setBorderPainted(false);
        BotaoLogar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoLogar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLogar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(LoginUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LoginSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoLogar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotaoLogar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotaoLogar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogarActionPerformed
        String nome = LoginUsuario.getText();
        String senha = new String(LoginSenha.getPassword());

        try {
            if (nome.equals("") || senha.equals("") ) {
                throw new Exception("Preencha o login e senha corretamente!");
            }

            if (statement == null) {

                Class.forName("org.gjt.mm.mysql.Driver").getConstructor().newInstance();
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productionplanner", "root", "1234");
                statement = connection.createStatement();
            }

            ResultSet result = statement.executeQuery("SELECT * FROM usuario WHERE nome='" + nome
                + "' AND senha='" + senha + "' AND permicao= 'Administrador'");

            if (result.next()) {
                TelaOperacoes cadastro = new TelaOperacoes();
                cadastro.setTitulo("Usuario logado: " + result.getString("nome"));
                cadastro.setVisible(true);
                this.setVisible(false);
            }
           
            ResultSet result2 = statement.executeQuery("SELECT * FROM usuario WHERE nome='" + nome
                + "' AND senha='" + senha + "' AND permicao= 'Usu??rio'");
            
            if (result2.next()) {
                OPSemVoltar cadastro = new OPSemVoltar();
                cadastro.setTitulo("Usuario logado: " + result2.getString("nome"));
                cadastro.setVisible(true);
                this.setVisible(false);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                e.getMessage(),
                "ERRO",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_BotaoLogarActionPerformed

    private void LoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginUsuarioActionPerformed

    private void LoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginSenhaActionPerformed

    private void BotaoLogar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoLogar1ActionPerformed

    private void BotaoLogar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLogar2ActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Cadastrar usu??rio?", "CONFIRMA????O", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
            GerenciarUsuPadrao usu = new GerenciarUsuPadrao();
            usu.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BotaoLogar2ActionPerformed

    Connection connection = null;
    Statement statement = null;


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        statement.close();
        connection.close();
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogar;
    private javax.swing.JButton BotaoLogar1;
    private javax.swing.JButton BotaoLogar2;
    private javax.swing.JPasswordField LoginSenha;
    private javax.swing.JTextField LoginUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
