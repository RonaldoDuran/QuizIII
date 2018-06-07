/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Cliente;
import Clases.Factura;
import Clases.Habitacion;
import Clases.Listas;
import Clases.Reserva;
import Clases.Temporada;
import Clases.Tipo_Habitacion;
import Clases.Usuario;
import Metodos.Metodos;
import com.placeholder.PlaceHolder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author RONALDO
 */
public class JD_Reservas extends javax.swing.JDialog {

    Metodos mt = new Metodos();
    Date FechaActual = new Date(System.currentTimeMillis());
    Listas ls = new Listas();
    DateFormat df = DateFormat.getDateInstance();

    /**
     * Creates new form Reservas
     */
    public JD_Reservas(java.awt.Frame parent, boolean modal, Listas ls) {
        super(parent, modal);
        initComponents();
        this.ls = ls;
        llenarCliente();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        String newstring = new SimpleDateFormat("dd/MM/yyyy").format(FechaActual);
        fecha_a.setText(newstring);
        consecutivo();
        System.out.println(ls.getLt().getLista_Temporada());

    }

    void llenarCliente() {
        this.cbx_Cliente.removeAllItems();
        for (Cliente c : ls.getLc().getLista_Cliente()) {
            this.cbx_Cliente.addItem(c.getNombres() + " " + c.getApellidos() + " Id: " + c.getId());
        }
    }

    void consecutivo() {
        int id = this.ls.getLr().getLista_Reserva().size() + 1;
        this.lbl_Consecutivo.setText(id + "");

    }

    void registro() {
        Temporada temp = null;
        Factura fc= null;
        Habitacion T_H = null;
        Usuario usua = null;
        String Nombre;
//        System.out.println("Tipo de tempo: "+ ls.getLt().getLista_Temporada().get(0).getNombre_Temporada()+" Incremento: "+ ls.getLt().getLista_Temporada().get(0).getNombre_Temporada());
//        System.out.println("Tipo de tempo: "+ ls.getLt().getLista_Temporada().get(1).getNombre_Temporada()+" Incremento: "+ ls.getLt().getLista_Temporada().get(1).getNombre_Temporada());
//        System.out.println("Tipo de tempo: "+ ls.getLt().getLista_Temporada().get(2).getNombre_Temporada()+" Incremento: "+ ls.getLt().getLista_Temporada().get(2).getNombre_Temporada());
        String fa = new SimpleDateFormat("dd/MM/yyyy").format(FechaActual);
        String fi = df.format(fecha_i.getDate());
        String fs = df.format(fecha_s.getDate());
//        String diai = mt.Obtener_dia(fi);
//        String dias = mt.Obtener_dia(fs);
        int Mesi = Integer.parseInt(mt.Obtener_Mes(fi));
        switch (Mesi) {
            case 1:
                temp = this.ls.getLt().getLista_Temporada().get(0);
                break;
            case 2:
                temp = this.ls.getLt().getLista_Temporada().get(2);
                break;
            case 3:
                temp = this.ls.getLt().getLista_Temporada().get(2);
                break;
            case 4:
                temp = this.ls.getLt().getLista_Temporada().get(1);
                break;
            case 5:
                temp = this.ls.getLt().getLista_Temporada().get(1);
                break;
            case 6:
                temp = this.ls.getLt().getLista_Temporada().get(0);
                break;
            case 7:
                temp = this.ls.getLt().getLista_Temporada().get(0);
                break;
            case 8:
                temp = this.ls.getLt().getLista_Temporada().get(1);
                break;
            case 9:
                temp = this.ls.getLt().getLista_Temporada().get(2);
                break;
            case 10:
                temp = this.ls.getLt().getLista_Temporada().get(1);
                break;
            case 11:
                temp = this.ls.getLt().getLista_Temporada().get(2);
                break;
            case 12:
                temp = this.ls.getLt().getLista_Temporada().get(0);
                break;
        }
        int p = cbx_tipo_habitacion.getSelectedIndex();
        switch (p) {
            case 1:
                T_H = this.ls.getLh().getLista_Habitacion().get(0);
                break;
            case 2:
                T_H = this.ls.getLh().getLista_Habitacion().get(1);
                break;
            case 3:
                T_H = this.ls.getLh().getLista_Habitacion().get(2);
                break;
        }
        int pos_cliente = cbx_Cliente.getSelectedIndex();
        Reserva r = new Reserva(lbl_Consecutivo.getText(),
                FechaActual,
                fecha_i.getDate(),
                fecha_s.getDate(),
                T_H,
                temp,
                ls.getLc().getLista_Cliente().get(pos_cliente),
                JF_Principal.User_Sesion,
                cbx_TipoR.getSelectedItem().toString());
        ls.getLr().getLista_Reserva().add(r);
        JOptionPane.showMessageDialog(this, "Reserva Exitosa");
        
//        System.out.println("Fecha de inicio "+ r.getFechaI()+" Fecha de fin "+ r.getFechaF()+" Habitacion "+r.getHa().getTh().getNombre()+" Cliente "+ r.getCl().getNombres()+" "+r.getCl().getApellidos()+" Usuario que registro todo: "+ r.getUs().getNombres()+" Fecha Actual "+FechaActual);
    }

    void Limpiar() {   
       fecha_i.setDate(null);
       fecha_s.setDate(null);
        cbx_tipo_habitacion.setSelectedIndex(0);
        cbx_TipoR.setSelectedIndex(0);
        cbx_Cliente.setSelectedIndex(0);
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
        fecha_i = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        fecha_s = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        cbx_tipo_habitacion = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        lbl_Consecutivo = new javax.swing.JLabel();
        fecha_a = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbx_TipoR = new javax.swing.JComboBox<>();
        cbx_Cliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservas-Hotel La Casita De La Abuela");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Ingreso:");

        fecha_i.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha de salida:");

        fecha_s.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo de habitacion:");

        cbx_tipo_habitacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbx_tipo_habitacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Suite", "Ejecutiva", "Basica" }));
        cbx_tipo_habitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_tipo_habitacionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Id Reserva:");

        lbl_Consecutivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_Consecutivo.setText("\"CONSECUTIVO\"");

        fecha_a.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fecha_a.setText("\"FECHA\"");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Reservar.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReservarG.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/ReservarG.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Limpiar.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LimpiarG.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LimpiarG.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Salir.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirG.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/SalirG.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tipo de reservacion:");

        cbx_TipoR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbx_TipoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Web", "Telefonica", "Personal" }));

        cbx_Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbx_Cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbx_Cliente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbx_TipoR, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE)
                                    .addComponent(cbx_tipo_habitacion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fecha_s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fecha_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(235, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Consecutivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fecha_a, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbl_Consecutivo)
                    .addComponent(fecha_a))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(fecha_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_tipo_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbx_TipoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbx_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_tipo_habitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_tipo_habitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_tipo_habitacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        registro();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbx_Cliente;
    private javax.swing.JComboBox<String> cbx_TipoR;
    private javax.swing.JComboBox cbx_tipo_habitacion;
    private javax.swing.JLabel fecha_a;
    private com.toedter.calendar.JDateChooser fecha_i;
    private com.toedter.calendar.JDateChooser fecha_s;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_Consecutivo;
    // End of variables declaration//GEN-END:variables
}
