/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Screens;

import DataClasses.DataListaDependencias;
import DataClasses.DataTramite;
import DataClasses.Dependencia;
import DataClasses.Documento;
import DataClasses.Fecha;
import DataManagers.ListaDependenciasManager;
import DataManagers.TramiteManager;
import static java.lang.Integer.valueOf;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import tda.Cola;
import tda.Pila;
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.GregorianCalendar;
import tda.Lista;
import tda.Nodo;

/**
 *
 * @author MARIEL
 */
public class TramiteBuscadoScreen extends javax.swing.JFrame {

    /**
     * Creates new form TramiteBuscadoScreen
     */
    private DataTramite tramite;
    private DefaultTableModel modelo_1;
    private DefaultTableModel modelo_2;
    public TramiteBuscadoScreen(DataTramite tram) {
        initComponents();
        this.tramite = tram;
        id_label.setText("ID: "+ tramite.getId());
        
        
        String dia = String.valueOf(tramite.getFechaIni().getDia());
        int dia_len = String.valueOf(dia).length();
        if (dia_len == 1) {
            dia = "0" + dia;
        }
        String mes = String.valueOf(tramite.getFechaIni().getMes());
        int mes_len = String.valueOf(mes).length();
        if (mes_len==1) {
            mes = "0"+mes;
        }
        String annio = String.valueOf(tramite.getFechaIni().getAnnio());
        fechaIni_label.setText("FECHA INICIAL: " + dia + "/" + mes + "/" + annio);

        desc_label.setText("DESCRIPCION: "+tramite.getDescripcion());
        
        if (tramite.isTerminado()) {
            terminado_label.setText("TERMINADO: TRAMITE TERMINADO");
        }
        else{
            terminado_label.setText("TERMINADO: TRAMITE NO TERMINADO");
        }
        
        if (tramite.getFechaFin()!=null) {
            fechaFin_label.setText("FECHA FIN: " +tramite.getFechaFin().toString());
        }
        else{
            fechaFin_label.setText("FECHA FIN: NA" );
        }        
        
        modelo_1 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
        };
        
        modelo_1.addColumn("NRO");
        modelo_1.addColumn("DOCUMENTO");
        
        modelo_2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
            return false;
            }
        };        
        
        modelo_2.addColumn("NRO");
        modelo_2.addColumn("DEPENDENCIA");
        modelo_2.addColumn("FEC. INICIO");
        modelo_2.addColumn("FEC. FIN");
        
        this.documentosTable.setModel(modelo_1);
        this.dependenciasTable.setModel(modelo_2);        
        
        this.documentosTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        this.documentosTable.getColumnModel().getColumn(1).setPreferredWidth(270);
        this.dependenciasTable.getColumnModel().getColumn(0).setPreferredWidth(50);                    
    
    }
    
    private void poblarDependenciasTable(){
        int filas = this.dependenciasTable.getRowCount();
        for(int i=0;i<filas;i++)
        {
            modelo_2.removeRow(0);
        }
        
        Pila<Dependencia> pila = TramiteManager.mostrarDependencias(tramite);
        Pila<Dependencia> aux = new Pila<>();
        
        while(!pila.esVacia()){
            Dependencia dependAux = pila.desapilar();
            aux.apilar(dependAux);
        }
        
        int cont = 1;
        while(!aux.esVacia()){
            Dependencia dependNuevoAux = aux.desapilar();
            depend_label.setText(dependNuevoAux.getNombre());
            modelo_2.addRow(new Object[]{cont, dependNuevoAux.getNombre(), dependNuevoAux.getFechaIni(), dependNuevoAux.getFechaFin()});
            cont++;
            pila.apilar(dependNuevoAux);
        }
    }
    
    private void poblarDocumentosTable(){
        int filas = this.documentosTable.getRowCount();
        for(int i=0;i<filas;i++)
        {
            modelo_1.removeRow(0);
        }
        
        Cola<Documento> cola = TramiteManager.mostrarDocumentos(tramite);
        Cola<Documento> aux = new Cola<>();

        int cont = 1;
        while (!cola.esVacia()){
            Documento doc = cola.desencolar();
            modelo_1.addRow(new Object[]{cont,doc.getItem()});
            aux.encolar(doc);
            cont++;
        }
        
        while (!aux.esVacia()){
            cola.encolar(aux.desencolar());
        }        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finTramPopUp_OptionPane = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        finTram_boton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        dependenciasTable = new javax.swing.JTable();
        agregarDepend_boton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        documentosTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        depend_label = new javax.swing.JLabel();
        terminado_label = new javax.swing.JLabel();
        desc_label = new javax.swing.JLabel();
        fechaIni_label = new javax.swing.JLabel();
        fechaFin_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        depend_label1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(850, 500));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(239, 241, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        finTram_boton.setBackground(new java.awt.Color(255, 159, 28));
        finTram_boton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        finTram_boton.setForeground(new java.awt.Color(239, 241, 243));
        finTram_boton.setText("FINALIZAR TRAMITE");
        finTram_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finTram_botonActionPerformed(evt);
            }
        });
        jPanel1.add(finTram_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 170, 40));

        jButton1.setBackground(new java.awt.Color(255, 159, 28));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(239, 241, 243));
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 140, 40));

        jPanel2.setBackground(new java.awt.Color(255, 159, 28));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setColumnHeaderView(dependenciasTable);

        dependenciasTable.setBackground(new java.awt.Color(239, 241, 243));
        dependenciasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dependenciasTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        dependenciasTable.setAutoscrolls(false);
        dependenciasTable.setFillsViewportHeight(true);
        dependenciasTable.setShowVerticalLines(true);
        jScrollPane1.setViewportView(dependenciasTable);

        jScrollPane4.setViewportView(jScrollPane1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 430, 300));

        agregarDepend_boton.setBackground(new java.awt.Color(239, 241, 243));
        agregarDepend_boton.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        agregarDepend_boton.setForeground(new java.awt.Color(255, 159, 28));
        agregarDepend_boton.setText("AGREGAR  DEPENDENCIA");
        agregarDepend_boton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        agregarDepend_boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDepend_botonActionPerformed(evt);
            }
        });
        jPanel2.add(agregarDepend_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 210, 30));

        documentosTable.setBackground(new java.awt.Color(239, 241, 243));
        documentosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        documentosTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        documentosTable.setAutoscrolls(false);
        documentosTable.setFillsViewportHeight(true);
        documentosTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(documentosTable);

        jScrollPane3.setViewportView(jScrollPane2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 240, 300));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 750, 380));

        jPanel3.setBackground(new java.awt.Color(34, 56, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        depend_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        depend_label.setForeground(new java.awt.Color(239, 241, 243));
        depend_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(depend_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, 20));

        terminado_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        terminado_label.setForeground(new java.awt.Color(239, 241, 243));
        terminado_label.setText("TERMINADO:");
        jPanel3.add(terminado_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 280, -1));

        desc_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        desc_label.setForeground(new java.awt.Color(239, 241, 243));
        desc_label.setText("DESCRIPCION:");
        desc_label.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(desc_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, 100));

        fechaIni_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fechaIni_label.setForeground(new java.awt.Color(239, 241, 243));
        fechaIni_label.setText("FECHA DE INICIO:");
        jPanel3.add(fechaIni_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 280, -1));

        fechaFin_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fechaFin_label.setForeground(new java.awt.Color(239, 241, 243));
        fechaFin_label.setText("FECHA DE FIN:");
        jPanel3.add(fechaFin_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, -1));

        id_label.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        id_label.setForeground(new java.awt.Color(239, 241, 243));
        id_label.setText("ID: ");
        jPanel3.add(id_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, -1));

        depend_label1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        depend_label1.setForeground(new java.awt.Color(239, 241, 243));
        depend_label1.setText("ULTIMA DEPENDENCIA:");
        depend_label1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(depend_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 280, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 380));

        jSeparator1.setBackground(new java.awt.Color(34, 56, 67));
        jSeparator1.setForeground(new java.awt.Color(34, 56, 67));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1070, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void finTram_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finTram_botonActionPerformed
        int response = JOptionPane.showConfirmDialog(rootPane, "¿Desea finalizar el tramite?", "Confirmacion", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            tramite.setTerminado(true);
            TramiteManager.actualizarFechaFinUltimaDependencia(tramite);
            Calendar calendar = new GregorianCalendar();
            int aux = calendar.get(YEAR);
            int aux2 = calendar.get(MONTH)+1;
            int aux3 = calendar.get(DATE);
            Fecha fechafin = new Fecha(aux3, aux2, aux);
            tramite.setFechaFin(fechafin);
            terminado_label.setText("TERMINADO: TRAMITE TERMINADO");
                        
            String dia = String.valueOf(aux3);
            int dia_len = String.valueOf(aux3).length();
            if (dia_len == 1) {
                dia = "0" + dia;
            }
            String mes = String.valueOf(aux2);
            int mes_len = String.valueOf(aux3).length();
            if (mes_len==1) {
                mes = "0"+mes;
            }
            
            String annio = String.valueOf(aux);            
            fechaFin_label.setText("FECHA FIN: "+ dia + "/" + mes + "/" + annio);       
        }
        
    }//GEN-LAST:event_finTram_botonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ScreensManager.irAtras(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void agregarDepend_botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDepend_botonActionPerformed
        if (tramite.isTerminado()) {
            JOptionPane.showMessageDialog(this, "Tramite ya ha sido finalizado.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Lista<Dependencia> aux_depend = DataListaDependencias.listaDependenciasGlobal;
        Nodo<Dependencia> aux_nodo = aux_depend.getCabeza();
        JComboBox combobox = new JComboBox();
        while (aux_nodo != null) {
            combobox.addItem(aux_nodo.getItem().getNombre());
            aux_nodo = aux_nodo.getSgteNodo();
        }
        
        int input = JOptionPane.showConfirmDialog(this, combobox, "Seleccione una dependencia", JOptionPane.DEFAULT_OPTION);
        
        if(input == JOptionPane.OK_OPTION){
            String str = (String)combobox.getSelectedItem();
            if (str.equals("Otro")) {
                String nuevaDepend = JOptionPane.showInputDialog(this, "Ingrese el nombre de la dependencia a crear");
                if (nuevaDepend == null) {
                    return;
                }
                else if (nuevaDepend.isBlank()) {
                    JOptionPane.showMessageDialog(this, "Nombre de dependencia no puede estar vacío.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else {
                    Dependencia depend_nueva = new Dependencia(nuevaDepend, null);
                    boolean duplicado = ListaDependenciasManager.duplicado(depend_nueva);
                    if (!duplicado) {
                        ListaDependenciasManager.agregarDependencia(depend_nueva);
                        JOptionPane.showMessageDialog(this, "Se agregó la dependencia global.");
                        TramiteManager.actualizarFechaFinUltimaDependencia(tramite);
                        TramiteManager.ingresarDependencia(tramite, nuevaDepend); 
                    }
                }
            }
            else if(depend_label.getText().equalsIgnoreCase(str)){
                JOptionPane.showMessageDialog(this, "No se puede ingresar la misma dependencia consecutivamente", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            else {
                TramiteManager.actualizarFechaFinUltimaDependencia(tramite);
                TramiteManager.ingresarDependencia(tramite, str);
            }
            
            poblarDependenciasTable();
            poblarDocumentosTable();
        }
    }//GEN-LAST:event_agregarDepend_botonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        poblarDependenciasTable();
        poblarDocumentosTable();
    }//GEN-LAST:event_formWindowGainedFocus
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
            java.util.logging.Logger.getLogger(TramiteBuscadoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TramiteBuscadoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TramiteBuscadoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TramiteBuscadoScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Fecha aux2 = new Fecha(00, 00, 2000);
                DataTramite aux = new DataTramite(aux2, "", null, 0);
                new TramiteBuscadoScreen(aux).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDepend_boton;
    private javax.swing.JLabel depend_label;
    private javax.swing.JLabel depend_label1;
    private javax.swing.JTable dependenciasTable;
    private javax.swing.JLabel desc_label;
    private javax.swing.JTable documentosTable;
    private javax.swing.JLabel fechaFin_label;
    private javax.swing.JLabel fechaIni_label;
    private javax.swing.JOptionPane finTramPopUp_OptionPane;
    private javax.swing.JButton finTram_boton;
    private javax.swing.JLabel id_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel terminado_label;
    // End of variables declaration//GEN-END:variables
}
