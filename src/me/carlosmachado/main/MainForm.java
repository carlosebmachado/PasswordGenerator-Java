/*
 * MIT License
 *
 * Copyright (c) 2020 Carlos Eduardo de Borba Machado
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package me.carlosmachado.main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import me.carlosmachado.core.*;

public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

        //URL url = this.getClass().getResource("/res/icon.png");
        //Image icon = Toolkit.getDefaultToolkit().getImage(url);
        //this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCustom = new javax.swing.JPanel();
        jCheckBoxLowercase = new javax.swing.JCheckBox();
        jLabelUppercase = new javax.swing.JLabel();
        jCheckBoxUppercase = new javax.swing.JCheckBox();
        jLabelLength = new javax.swing.JLabel();
        jLabelSymbol = new javax.swing.JLabel();
        jCheckBoxSymbol = new javax.swing.JCheckBox();
        jLabelNumber = new javax.swing.JLabel();
        jCheckBoxNumbers = new javax.swing.JCheckBox();
        jLabelLowercase = new javax.swing.JLabel();
        jTextFieldLength = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jButtonGenerate = new javax.swing.JButton();
        jRadioButtonDefaultPass = new javax.swing.JRadioButton();
        jRadioButtonCustomPass = new javax.swing.JRadioButton();
        jButtonCopy = new javax.swing.JButton();
        jButtonClean = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSalvarSenha = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Password Generator");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/res/icon.png")));
        setLocationByPlatform(true);
        setName("mainForm"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelCustom.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jCheckBoxLowercase.setText("ex. abcdefgh");

        jLabelUppercase.setText("Incluir Caracteres Maiúsculos");

        jCheckBoxUppercase.setText("ex. ABCDEFGH");

        jLabelLength.setText("Tamanho da Senha");

        jLabelSymbol.setText("Incluir Símbolos");

        jCheckBoxSymbol.setText("ex. @#$%");

        jLabelNumber.setText("Incluir Números");

        jCheckBoxNumbers.setText("ex. 123456");

        jLabelLowercase.setText("Incluir Caracteres Minúsculos");

        jTextFieldLength.setText("4");
        jTextFieldLength.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLengthFocusLost(evt);
            }
        });
        jTextFieldLength.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLengthKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelCustomLayout = new javax.swing.GroupLayout(jPanelCustom);
        jPanelCustom.setLayout(jPanelCustomLayout);
        jPanelCustomLayout.setHorizontalGroup(
            jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelSymbol)
                    .addComponent(jLabelLength)
                    .addComponent(jLabelNumber)
                    .addComponent(jLabelLowercase)
                    .addComponent(jLabelUppercase))
                .addGap(18, 18, 18)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxLowercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxUppercase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxSymbol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanelCustomLayout.setVerticalGroup(
            jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLength)
                    .addComponent(jTextFieldLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSymbol)
                    .addComponent(jCheckBoxSymbol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumber)
                    .addComponent(jCheckBoxNumbers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLowercase)
                    .addComponent(jCheckBoxLowercase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUppercase)
                    .addComponent(jCheckBoxUppercase))
                .addGap(125, 125, 125))
        );

        jTextFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPasswordKeyTyped(evt);
            }
        });

        jButtonGenerate.setText("Gerar");
        jButtonGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGenerateActionPerformed(evt);
            }
        });

        jRadioButtonDefaultPass.setText("Padrão");
        jRadioButtonDefaultPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDefaultPassActionPerformed(evt);
            }
        });

        jRadioButtonCustomPass.setText("Customizado");
        jRadioButtonCustomPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCustomPassActionPerformed(evt);
            }
        });

        jButtonCopy.setText("Copiar");
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jButtonClean.setText("Limpar");
        jButtonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCleanActionPerformed(evt);
            }
        });

        jMenuArquivo.setText("Arquivo");

        jMenuItemSalvarSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalvarSenha.setText("Salvar Senha");
        jMenuItemSalvarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalvarSenhaActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSalvarSenha);

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuSobre.setText("Sobre");
        jMenuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSobreMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuSobre);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonDefaultPass)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonCustomPass))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButtonGenerate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonCopy)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonClean))
                                .addComponent(jPanelCustom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonDefaultPass)
                    .addComponent(jRadioButtonCustomPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCustom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGenerate)
                    .addComponent(jButtonCopy)
                    .addComponent(jButtonClean))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jTextFieldLengthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLengthKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldLengthKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jRadioButtonDefaultPass.setSelected(true);
        enableCustom(false);
    }//GEN-LAST:event_formWindowOpened

    private void jRadioButtonDefaultPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDefaultPassActionPerformed
        enableCustom(false);
        jRadioButtonCustomPass.setSelected(false);
        jRadioButtonDefaultPass.setSelected(true);
    }//GEN-LAST:event_jRadioButtonDefaultPassActionPerformed

    private void jRadioButtonCustomPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCustomPassActionPerformed
        enableCustom(true);
        jRadioButtonDefaultPass.setSelected(false);
        jRadioButtonCustomPass.setSelected(true);
    }//GEN-LAST:event_jRadioButtonCustomPassActionPerformed

    private void jTextFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPasswordKeyTyped
        evt.consume();
    }//GEN-LAST:event_jTextFieldPasswordKeyTyped

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(this.jTextFieldPassword.getText()), null);
    }//GEN-LAST:event_jButtonCopyActionPerformed

    private void jButtonGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGenerateActionPerformed
        if (jRadioButtonDefaultPass.isSelected()) {
            jTextFieldPassword.setText(PasswordGenerator.defaultPass());
        } else {
            if (!jCheckBoxLowercase.isSelected() && !jCheckBoxNumbers.isSelected() && !jCheckBoxSymbol.isSelected() && !jCheckBoxUppercase.isSelected()) {
                JOptionPane.showMessageDialog(null, "Por favor, selecione pelo menos uma opção.");
            } else {
                jTextFieldPassword.setText(PasswordGenerator.customPass(Integer.parseInt(jTextFieldLength.getText()), jCheckBoxLowercase.isSelected(), jCheckBoxNumbers.isSelected(), jCheckBoxSymbol.isSelected(), jCheckBoxUppercase.isSelected()));
            }

        }
    }//GEN-LAST:event_jButtonGenerateActionPerformed

    private void jTextFieldLengthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLengthFocusLost
        if (!jTextFieldLength.getText().equals("")) {
            int n = Integer.parseInt(jTextFieldLength.getText());
            if (n < 4) {
                jTextFieldLength.setText("4");
            }
            if (n > 2048) {
                jTextFieldLength.setText("2048");
            }
        } else {
            jTextFieldLength.setText("4");
        }
    }//GEN-LAST:event_jTextFieldLengthFocusLost

    private void jButtonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCleanActionPerformed
        jTextFieldPassword.setText("");
    }//GEN-LAST:event_jButtonCleanActionPerformed

    private void jMenuItemSalvarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarSenhaActionPerformed
        JFileChooser fileChooser = new JFileChooser(".");
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Arquivo de Texto", "txt");

        fileChooser.addChoosableFileFilter(extensionFilter);
        fileChooser.setFileFilter(extensionFilter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setDialogTitle("Salvar Senha");
        fileChooser.setCurrentDirectory(new File(System.getProperties().getProperty("user.home")));
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(final File f) {
                return f.isDirectory() || f.getAbsolutePath().endsWith(".txt");
            }

            @Override
            public String getDescription() {
                return "Arqivo de Texto (*.txt)";
            }
        });

        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!file.exists()) {
                Write.writeStringOnTxtFile(jTextFieldPassword.getText(), file.getAbsolutePath());
                JOptionPane.showMessageDialog(this, "Arquivo Criado.");
            } else if (file.exists()) {
                int res = JOptionPane.showConfirmDialog(this, "Já existe um arquivo com esse nome. Você deseja sobrescrever?");
                if (res == JOptionPane.YES_OPTION) {
                    Write.writeStringOnTxtFile(jTextFieldPassword.getText(), file.getAbsolutePath());
                    JOptionPane.showMessageDialog(this, "Arquivo Criado.");
                } else if (res == JOptionPane.NO_OPTION) {
                    if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                        file = fileChooser.getSelectedFile();
                        if (!file.exists()) {
                            Write.writeStringOnTxtFile(jTextFieldPassword.getText(), file.getAbsolutePath());
                            JOptionPane.showMessageDialog(this, "Arquivo Criado.");
                        }
                    }
                } else if (res == JOptionPane.CANCEL_OPTION) {
                    JOptionPane.showMessageDialog(this, "Cancelado pelo usuário.");
                }
            }
        }
    }//GEN-LAST:event_jMenuItemSalvarSenhaActionPerformed

    private void jMenuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSobreMouseClicked
        JOptionPane.showMessageDialog(null, "Criado por Carlos Machado.\nLivre para uso e modificação.");
    }//GEN-LAST:event_jMenuSobreMouseClicked

    private void enableCustom(boolean enable) {
        jTextFieldLength.setEnabled(enable);
        jCheckBoxLowercase.setEnabled(enable);
        jCheckBoxNumbers.setEnabled(enable);
        jCheckBoxSymbol.setEnabled(enable);
        jCheckBoxUppercase.setEnabled(enable);
        jPanelCustom.setEnabled(enable);
        jLabelLength.setEnabled(enable);
        jLabelLowercase.setEnabled(enable);
        jLabelNumber.setEnabled(enable);
        jLabelSymbol.setEnabled(enable);
        jLabelUppercase.setEnabled(enable);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClean;
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonGenerate;
    private javax.swing.JCheckBox jCheckBoxLowercase;
    private javax.swing.JCheckBox jCheckBoxNumbers;
    private javax.swing.JCheckBox jCheckBoxSymbol;
    private javax.swing.JCheckBox jCheckBoxUppercase;
    private javax.swing.JLabel jLabelLength;
    private javax.swing.JLabel jLabelLowercase;
    private javax.swing.JLabel jLabelNumber;
    private javax.swing.JLabel jLabelSymbol;
    private javax.swing.JLabel jLabelUppercase;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSalvarSenha;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JPanel jPanelCustom;
    private javax.swing.JRadioButton jRadioButtonCustomPass;
    private javax.swing.JRadioButton jRadioButtonDefaultPass;
    private javax.swing.JTextField jTextFieldLength;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables
}
