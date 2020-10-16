package com.cenfotec.componentes.examen.control;

import java.text.ParseException;
import java.util.Random;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class Mastermind extends javax.swing.JPanel {

    char c;
    Random rand = new Random();
    int contadorIntentos = 0;
    int intentosRestantes = 8;
    int contadorAciertosP = 0;
    int contadorAciertosT = 0;

    private static final Colores[] colores = {
        Colores.A,
        Colores.R,
        Colores.B,
        Colores.N,
        Colores.V,
        Colores.M
    };
    Colores[] codigoSecreto;

    public Mastermind() {

        initComponents();
        lblAciertosParciales.setText("" + contadorAciertosP);
        lblAciertosTotales.setText("" + contadorAciertosT);
        lblEstadoDeLaPartida.setText("JUEGO BLOQUEADO, presione el boton para empezar");
        btnCompararCodigo.setEnabled(false);
        txtIntentoCodigo.setEditable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        btnIniciarJuego = new javax.swing.JButton();
        txtIntentoCodigo = new javax.swing.JTextField();
        btnCompararCodigo = new javax.swing.JButton();
        lblAciertosTotales = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTotalIntentos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIntentosRestantes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblEstadoDeLaPartida = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAciertosParciales = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        btnIniciarJuego.setText("Iniciar Juego");
        btnIniciarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarJuegoMouseClicked(evt);
            }
        });

        txtIntentoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntentoCodigoActionPerformed(evt);
            }
        });
        txtIntentoCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIntentoCodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntentoCodigoKeyTyped(evt);
            }
        });

        btnCompararCodigo.setText("Comparar Código");
        btnCompararCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCompararCodigoMouseClicked(evt);
            }
        });

        jLabel1.setText("Total Intentos: ");

        jLabel2.setText("Intentos Restantes: ");

        jLabel3.setText("Estado de la partida:");

        jLabel4.setText("Aciertos Totales:");

        jLabel5.setText("Aciertos Parciales:");

        jLabel6.setText("Colores: A, R, B, N, V, M");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciarJuego)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIntentosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstadoDeLaPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCompararCodigo)
                            .addComponent(txtIntentoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAciertosTotales, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(lblAciertosParciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnIniciarJuego)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblTotalIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblIntentosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblEstadoDeLaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIntentoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(lblAciertosTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompararCodigo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblAciertosParciales, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarJuegoMouseClicked
        contadorIntentos = 0;
        intentosRestantes = 8;
        contadorAciertosP = 0;
        contadorAciertosT = 0;
        txtIntentoCodigo.setText("");
        txtIntentoCodigo.setEditable(true);
        lblTotalIntentos.setText("" + contadorIntentos);
        lblIntentosRestantes.setText("" + intentosRestantes);
        lblAciertosParciales.setText("" + contadorAciertosP);
        lblAciertosTotales.setText("" + contadorAciertosT);

        codigoSecreto = generarCodigo();
        lblEstadoDeLaPartida.setText("En juego");
//Para probar cuando gana el usuario
        for (Colores color : codigoSecreto) {
            System.out.println(color);
        }
        System.out.println("-------------------------");

        btnIniciarJuego.setEnabled(false);
        btnCompararCodigo.setEnabled(true);

    }//GEN-LAST:event_btnIniciarJuegoMouseClicked

    private void btnCompararCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCompararCodigoMouseClicked
        contadorAciertosP = 0;
        contadorAciertosT = 0;
        lblAciertosParciales.setText("" + contadorAciertosP);
        lblAciertosTotales.setText("" + contadorAciertosT);
        String codigo = txtIntentoCodigo.getText();
        String[] codigoArray = codigo.split("");
        for (int i = 0; i < codigoArray.length; i++) {
            if (codigoSecreto[i] == Colores.valueOf(codigoArray[i])) {
                contadorAciertosT++;
            } else if (codigo.indexOf(codigoSecreto[i].name()) >= 0) {
                contadorAciertosP++;
            }
        }

        if (contadorAciertosT == 4) {
            lblEstadoDeLaPartida.setText("VICTORIA!!");
            lblAciertosParciales.setText("" + contadorAciertosP);
            lblAciertosTotales.setText("" + contadorAciertosT);
            lblTotalIntentos.setText("" + ++contadorIntentos);
            lblIntentosRestantes.setText("" + --intentosRestantes);
            btnCompararCodigo.setEnabled(false);
            txtIntentoCodigo.setEditable(false);
            btnIniciarJuego.setEnabled(true);

        } else {
            lblIntentosRestantes.setText("" + --intentosRestantes);
            lblTotalIntentos.setText("" + ++contadorIntentos);
            lblAciertosParciales.setText("" + contadorAciertosP);
            lblAciertosTotales.setText("" + contadorAciertosT);
            txtIntentoCodigo.setText("");
            if (contadorIntentos == 8) {
                btnCompararCodigo.setEnabled(false);
                txtIntentoCodigo.setEditable(false);
                btnIniciarJuego.setEnabled(true);
                lblEstadoDeLaPartida.setText("DERROTA!,presione el botón para volver a jugar");
                lblAciertosParciales.setText("" + 0);
                lblAciertosTotales.setText("" + 0);
            }
        }

    }//GEN-LAST:event_btnCompararCodigoMouseClicked

    private void txtIntentoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntentoCodigoActionPerformed

    }//GEN-LAST:event_txtIntentoCodigoActionPerformed

    private void txtIntentoCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntentoCodigoKeyTyped
        c = evt.getKeyChar();
        if (txtIntentoCodigo.getText().length() >= 4) {
            evt.consume();
        }
        if (Character.isLetter(c) || Character.isISOControl(c)) {
            if (c == 'A' || c == 'R' || c == 'B' || c == 'N' || c == 'V' || c == 'M') {
                evt = evt;
            } else {
                evt.consume();
            }
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_txtIntentoCodigoKeyTyped

    private void txtIntentoCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntentoCodigoKeyReleased
//        int pos = txtIntentoCodigo.getCaretPosition();
//        txtIntentoCodigo.setText(txtIntentoCodigo.getText().toUpperCase());
//        txtIntentoCodigo.setCaretPosition(pos);
    }//GEN-LAST:event_txtIntentoCodigoKeyReleased

    private Colores[] generarCodigo() {
        Colores[] codigoSecreto = new Colores[4];
        codigoSecreto[0] = colores[rand.nextInt(6)];
        codigoSecreto[1] = colores[rand.nextInt(6)];
        codigoSecreto[2] = colores[rand.nextInt(6)];
        codigoSecreto[3] = colores[rand.nextInt(6)];

        return codigoSecreto;

    }

    private enum Colores {
        A,
        R,
        B,
        N,
        V,
        M
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompararCodigo;
    private javax.swing.JButton btnIniciarJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblAciertosParciales;
    private javax.swing.JLabel lblAciertosTotales;
    private javax.swing.JLabel lblEstadoDeLaPartida;
    private javax.swing.JLabel lblIntentosRestantes;
    private javax.swing.JLabel lblTotalIntentos;
    private javax.swing.JTextField txtIntentoCodigo;
    // End of variables declaration//GEN-END:variables
}
