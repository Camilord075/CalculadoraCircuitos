/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.cuc.views;

import edu.cuc.calculadorapotencia.CalculadoraPotencia;
import javax.swing.JOptionPane;

/**
 *
 * @author camil
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
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
        EtiqResultado = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        unidad = new javax.swing.JLabel();
        jMenuItem1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora de Potencia");

        EtiqResultado.setText("Resultado: ");

        Resultado.setEditable(false);

        unidad.setText("Unidad");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(EtiqResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unidad)
                .addGap(0, 93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiqResultado)
                    .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Potencia");

        jMenuItem2.setText("Voltaje Corriente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Resistencia Corriente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Voltaje Resistencia");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem1.add(jMenu1);

        jMenu2.setText("Resistencia");

        jMenuItem5.setText("Voltaje Corriente");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Voltaje Potencia");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Potencia Corriente");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem1.add(jMenu2);

        jMenu3.setText("Corriente");

        jMenuItem8.setText("Voltaje Resistencia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("Potencia Voltaje");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Potencia Resistencia");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem1.add(jMenu3);

        jMenu4.setText("Voltaje");

        jMenuItem11.setText("Resistencia Corriente");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem12.setText("Potencia Corriente");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem13.setText("Potencia Resistencia");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem1.add(jMenu4);

        setJMenuBar(jMenuItem1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.potenciaVoltajeCorriente(voltaje, corriente);
        
        EtiqResultado.setText("Potencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("W");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.potenciaResistenciaCorriente(resistencia, corriente);
        
        EtiqResultado.setText("Potencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("W");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        
        double resultado = calculadora.potenciaVoltajeResistencia(voltaje, resistencia);
        
        EtiqResultado.setText("Potencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("W");
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.resistenciaVoltajeCorriente(voltaje, corriente);
        
        EtiqResultado.setText("Resistencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("Ohms");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        String recibePotencia = JOptionPane.showInputDialog("Ingrese la potencia: ");
        
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        double potencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        
        double resultado = calculadora.resistenciaVoltajePotencia(voltaje, potencia);
        
        EtiqResultado.setText("Resistencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("Ohms");
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibePotencia = JOptionPane.showInputDialog("Ingrese la potencia: ");
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.resistenciaPotenciaCorriente(resistencia, corriente);
        
        EtiqResultado.setText("Resistencia: ");
        Resultado.setText("" + resultado);
        unidad.setText("Ohms");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        
        double resultado = calculadora.corrienteVoltajeResistencia(voltaje, resistencia);
        
        EtiqResultado.setText("Corriente: ");
        Resultado.setText("" + resultado);
        unidad.setText("A");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeVoltaje = JOptionPane.showInputDialog("Ingrese el voltaje: ");
        String recibePotencia = JOptionPane.showInputDialog("Ingrese la potencia: ");
        
        double potencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        double voltaje = Double.parseDouble(calculadora.procesaTexto(recibeVoltaje));
        
        double resultado = calculadora.corrientePotenciaVoltaje(potencia, voltaje);
        
        EtiqResultado.setText("Corriente: ");
        Resultado.setText("" + resultado);
        unidad.setText("A");
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibePotencia = JOptionPane.showInputDialog("Ingrese el potencia: ");
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        double potencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        
        double resultado = calculadora.corrientePotenciaResistencia(potencia, resistencia);
        
        EtiqResultado.setText("Corriente: ");
        Resultado.setText("" + resultado);
        unidad.setText("A");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        
        double resistencia = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.voltajeResistenciaCorriente(resistencia, corriente);
        
        EtiqResultado.setText("Voltaje: ");
        Resultado.setText("" + resultado);
        unidad.setText("V");
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeCorriente = JOptionPane.showInputDialog("Ingrese la corriente: ");
        String recibePotencia = JOptionPane.showInputDialog("Ingrese la potencia: ");
        
        double potencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeCorriente));
        
        double resultado = calculadora.voltajePotenciaCorriente(potencia, corriente);
        
        EtiqResultado.setText("Voltaje: ");
        Resultado.setText("" + resultado);
        unidad.setText("V");
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        CalculadoraPotencia calculadora = new CalculadoraPotencia();
        
        String recibeResistencia = JOptionPane.showInputDialog("Ingrese la resistencia: ");
        String recibePotencia = JOptionPane.showInputDialog("Ingrese la potencia: ");
        
        double potencia = Double.parseDouble(calculadora.procesaTexto(recibePotencia));
        double corriente = Double.parseDouble(calculadora.procesaTexto(recibeResistencia));
        
        double resultado = calculadora.voltajePotenciaResistencia(potencia, potencia);
        
        EtiqResultado.setText("Voltaje: ");
        Resultado.setText("" + resultado);
        unidad.setText("V");
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiqResultado;
    private javax.swing.JTextField Resultado;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel unidad;
    // End of variables declaration//GEN-END:variables
}
