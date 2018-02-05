package ejemplojni;

import CLIPSJNI.*;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author's Ana Karem Reyes Argüelles Jesús Antonio Juárez Dévora Jesús Daniel
 * Pérez García
 */
public class Principal extends javax.swing.JFrame {

    Environment clips;
    PrimitiveValue rv, rv1, rv2, rv3, rv4, rv5, rv6, rv7, rv8, rv9, rv10, rv11;
    String evalString = "?*global-var*";
    String evalString1 = "?*global-var1*";
    String evalString2 = "?*global-var2*";
    String evalString3 = "?*global-var3*";
    String evalString4 = "?*global-var4*";
    String evalString5 = "?*global-var5*";
    String evalString6 = "?*global-var6*";
    String evalString7 = "?*global-var7*";
    String evalString8 = "?*global-var8*";
    String evalString9 = "?*global-var9*";
    String evalString10 = "?*global-var10*";
    String evalString11 = "?*global-var11*";

    public Principal() {
        initComponents();
        clips = new Environment();
        clips.load("codd.CLP");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnContinuar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Me gusta.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/titanic.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/the_boss_baby.png"))); // NOI18N

        jCheckBox2.setText("Me gusta.");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/forrest_gump.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/hugo.jpg"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/los_ultimos.jpg"))); // NOI18N

        jCheckBox3.setText("Me gusta.");

        jCheckBox4.setText("Me gusta.");

        jCheckBox5.setText("Me gusta.");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ejemplojni/ssss.PNG"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel7.setText("Por favor, ingresa los datos pedidos a continuación");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setText("Nombre");

        txtUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 0, 255));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel10.setText("años");

        jComboBox1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90" }));

        btnLimpiar.setText("Otra recomendación");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jCheckBox1)
                .addGap(167, 167, 167)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10))
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(182, 182, 182)
                        .addComponent(jCheckBox3)
                        .addGap(195, 195, 195)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox5)))
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(306, 306, 306)
                    .addComponent(jLabel7)
                    .addContainerGap(306, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(50, 50, 50))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(387, 387, 387)
                    .addComponent(jLabel7)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        try {
            clips.reset();
            //clips.eval("(assert (nombre (hh ww)))");
            String edad = (String) jComboBox1.getSelectedItem();
            if (jCheckBox1.isSelected() == true) {
                clips.eval("(assert (peliculas (nombre titanic) "
                        + "(generos drama romance) "
                        + "(clasificacion b) "
                        + "(director james_cameron) "
                        + "(estudio 20th_century_fox) "
                        + "(pais eu) "
                        + "(fecha 1997) "
                        + "(idiomas espanol ingles)"
                        + "(atributos romantica catastrofe dramatica triste) "
                        + "(edad_usuario " + edad + ") "
                        + "))");
            }

            if (jCheckBox2.isSelected() == true) {
                clips.eval("(assert (peliculas (nombre un_jefe_en_panales) "
                        + "(generos animacion comedia) "
                        + "(clasificacion aa) "
                        + "(director tom_mcgrath) "
                        + "(estudio dream_works) "
                        + "(pais eu) "
                        + "(fecha 2017) "
                        + "(idiomas espanol ingles) "
                        + "(atributos familia comedia animada feliz) "
                        + "(edad_usuario " + edad + ") "
                        + "))");
            }

            if (jCheckBox3.isSelected() == true) {
                clips.eval("(assert(peliculas (nombre la_invencion_de_hugo)(generos aventura fantasia)(clasificacion a)(director martin_scorsese)(estudio viacom)(pais eu)(fecha 2011)(idiomas espanol ingles)(atributos romantica aventuras fantasia feliz)(edad_usuario " + edad + ")))");
            }

            if (jCheckBox4.isSelected() == true) {
                clips.eval("(assert(peliculas (nombre forrest_gump) "
                        + "(generos drama comedia) "
                        + "(clasificacion b) "
                        + "(director robert_zemeckis) "
                        + "(estudio paramount_pictures) "
                        + "(pais eu) "
                        + "(fecha 1994) "
                        + "(idiomas espanol ingles) "
                        + "(atributos comedia romance tragedia triste)"
                        + "(edad_usuario " + edad + ")"
                        + "))");
            }

            if (jCheckBox5.isSelected() == true) {
                clips.eval("(assert(peliculas (nombre 500_dias_con_ella) "
                        + "(generos drama comedia) "
                        + "(clasificacion b) "
                        + "(director marc_webb) "
                        + "(estudio dune_entertainment) "
                        + "(pais eu) "
                        + "(fecha 2009) "
                        + "(idiomas espanol ingles) "
                        + "(atributos romantica tragedia rupturas neutro)"
                        + "(edad_usuario " + edad + ")"
                        + "))");
            }

            //long s =  clips.run();
            clips.run();
            // printout(s+"");
            String nombre = txtUsuario.getText();
            jTextArea1.setText("Hola a: " + nombre + "\n");
            //TextArea1.setText( clips.);
            rv = clips.eval(evalString);
            rv1 = clips.eval(evalString1);
            rv2 = clips.eval(evalString2);
            rv3 = clips.eval(evalString3);
            rv4 = clips.eval(evalString4);
            rv5 = clips.eval(evalString5);
            rv6 = clips.eval(evalString6);
            rv7 = clips.eval(evalString7);
            rv8 = clips.eval(evalString8);
            rv9 = clips.eval(evalString9);
            rv10 = clips.eval(evalString10);
            rv11 = clips.eval(evalString11);
            try {
                //System.out.println("rv = " + rv.stringValue());
                if (rv.stringValue().length() > 0) {
                    jTextArea1.append(rv.stringValue() + "\n");
                }
                if (rv1.stringValue().length() > 0) {
                    jTextArea1.append(rv1.stringValue() + "\n");
                }
                if (rv2.stringValue().length() > 0) {
                    jTextArea1.append(rv2.stringValue() + "\n");
                }
                if (rv3.stringValue().length() > 0) {
                    jTextArea1.append(rv3.stringValue() + "\n");
                }
                if (rv4.stringValue().length() > 0) {
                    jTextArea1.append(rv4.stringValue() + "\n");
                }
                if (rv5.stringValue().length() > 0) {
                    jTextArea1.append(rv5.stringValue() + "\n");
                }
                if (rv6.stringValue().length() > 0) {
                    jTextArea1.append(rv6.stringValue() + "\n");
                }
                if (rv7.stringValue().length() > 0) {
                    jTextArea1.append(rv7.stringValue() + "\n");
                }
                if (rv8.stringValue().length() > 0) {
                    jTextArea1.append(rv8.stringValue() + "\n");
                }
                if (rv9.stringValue().length() > 0) {
                    jTextArea1.append(rv9.stringValue() + "\n");
                }
                if (rv10.stringValue().length() > 0) {
                    jTextArea1.append(rv10.stringValue() + "\n");
                }
                if (rv11.stringValue().length() > 0) {
                    jTextArea1.append(rv11.stringValue() + "\n");
                }
            } catch (Exception e) {
                System.out.println("Invalid string value");
            }

            clips.destroy();

        } catch (Exception ex) {

            System.out.println(ex);
        }


    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        txtUsuario.setText("");
        jTextArea1.setText("");
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
    }//GEN-LAST:event_btnLimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void printout(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
