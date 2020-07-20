
package clases;

import static clases.Empleados.GetConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Turnos extends javax.swing.JFrame {
    
    
    
    
    JFrame inicio = new JFrame();
    static int usuarioconectado = 0;
    PreparedStatement ps;
    ResultSet rs;
    public static final String URL = "jdbc:mysql://localhost:3306/empresa?autoReconnet=true&useSSL=false";
    static Connection conexion = null;
    int id_empleado = 0;
    
    
    //--------------------------------------------------------------------------------------------
    // Metodo Conexion
    
    public static Connection GetConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion=DriverManager.getConnection(URL,"root","root");
    
        } catch (Exception e) {
            System.out.println("error "+ e);
            
        }
  
        return conexion;
    }
  

    JFrame turnos = new JFrame();
    
    public Turnos() {
        
        initComponents();
        turnos.setVisible(true);
        turnos.setContentPane(principal);
        turnos.pack();
        turnos.setLocationRelativeTo(null);
        turnos.setDefaultCloseOperation(EXIT_ON_CLOSE);
        turnos.setResizable(false);
        turnos.setTitle("Turnos");
        
        try {
            
            Connection con = GetConnection();
        
            ps = con.prepareStatement("select nombre_empresa from empresa_vigilada");
            rs = ps.executeQuery();
            
            while (rs.next()) {
               
                cbb_empresa.addItem(rs.getString(1));
   
            }
        
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }

    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        principal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Txt_idEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bon_buscar_Vigilante = new javax.swing.JButton();
        dia_inicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        mes_inicio = new javax.swing.JComboBox<>();
        año_inicio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dia_final = new javax.swing.JComboBox<>();
        mes_final = new javax.swing.JComboBox<>();
        año_final = new javax.swing.JComboBox<>();
        rb_turnodia = new javax.swing.JRadioButton();
        rb_turnonoche = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        Txt_Nombredel_Empleado = new javax.swing.JLabel();
        Boton_Guardar = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbb_empresa = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_ConsultaTurnos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Txt_EmpleadoId_Consultas = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Identificacion Empleado");

        bon_buscar_Vigilante.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bon_buscar_Vigilante.setText("buscar");
        bon_buscar_Vigilante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bon_buscar_VigilanteActionPerformed(evt);
            }
        });

        dia_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Fecha Inicio");

        mes_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        año_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Fecha Final");

        dia_final.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes_final.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        año_final.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        buttonGroup1.add(rb_turnodia);
        rb_turnodia.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_turnodia.setText("Turno De Dia");

        buttonGroup1.add(rb_turnonoche);
        rb_turnonoche.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_turnonoche.setText("Turno Nocturno");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Empleado");

        Txt_Nombredel_Empleado.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Boton_Guardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Guardar.setText("Guardar");
        Boton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_GuardarActionPerformed(evt);
            }
        });

        Boton_Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Salir.setText("salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Turno");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Empresa");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bon_buscar_Vigilante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Txt_Nombredel_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dia_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(dia_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(mes_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(cbb_empresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rb_turnonoche)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(rb_turnodia))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(mes_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bon_buscar_Vigilante)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_Nombredel_Empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mes_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(año_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dia_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_turnodia))
                        .addGap(18, 18, 18)
                        .addComponent(rb_turnonoche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dia_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(año_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mes_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbb_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Boton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(Boton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        principal.addTab("Ingresar Turnos", jPanel1);

        Tbl_ConsultaTurnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado Id", "Fecha Inicio", "Fecha Final", "Empresa Vigilada", "Turno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tbl_ConsultaTurnos);
        if (Tbl_ConsultaTurnos.getColumnModel().getColumnCount() > 0) {
            Tbl_ConsultaTurnos.getColumnModel().getColumn(0).setMaxWidth(120);
            Tbl_ConsultaTurnos.getColumnModel().getColumn(1).setMaxWidth(120);
            Tbl_ConsultaTurnos.getColumnModel().getColumn(2).setMaxWidth(120);
            Tbl_ConsultaTurnos.getColumnModel().getColumn(3).setMaxWidth(150);
            Tbl_ConsultaTurnos.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Emplead Id: ");

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Txt_EmpleadoId_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_EmpleadoId_Consultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        principal.addTab("Consultar Turnos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bon_buscar_VigilanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bon_buscar_VigilanteActionPerformed
        buscarVigilante();
    }//GEN-LAST:event_bon_buscar_VigilanteActionPerformed

    private void Boton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_GuardarActionPerformed
      insertarnuevoturno();
    }//GEN-LAST:event_Boton_GuardarActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        turnos.dispose();
        new Clases.MenuPrincipal();
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       sacarTurno();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       consultarTurnos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      turnos.dispose();
        new Clases.MenuPrincipal();
    }//GEN-LAST:event_jButton3ActionPerformed

//*****************************************************************************************************
    // PESTAÑA INGRESAR NUEVOS TURNOS 
    
    //metodo par abuscar vigilante
    public void buscarVigilante(){
        String n , a=""; // creamos dos variable para almacenar nombe y apellido
        try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("select idemple, nombres, apellidos from empleado "
                                         + "where identificacion = '"+Txt_idEmpleado.getText()+"' and cargo = 'Vigilante'");
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                id_empleado = rs.getInt(1); //guardamos el id del empleado vigilante para posteriormente guardarlo en los turnos
                
                n=rs.getString(2);
                a=rs.getString(3); // guadasmo ambos nombres
                
                Txt_Nombredel_Empleado.setText(n + " "+ a); // enviamos el nombre a Jtextfield
                
            }else{
                JOptionPane.showMessageDialog(null, "NO existe este empleado o no es Vigilante");

            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Turnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    // metodo para Ingresar nuev turno--------------------------------------------------------------------------------
    
    public void insertarnuevoturno(){
        int var = 0;
        
        try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("insert into turno (fecha_inicio_turno, fecha_fin_turno, empresa_vigilada_idempresa, empleado_idemple, Tipo_Turno) "
                    + "values ("+sacarFechaInicio()+","+sacarFechafinalizar()+","+sacarEmpresaCBB()+","+id_empleado+","+sacarTurno()+")");
           
            
            var = ps.executeUpdate();
            if (var>0) {
                JOptionPane.showMessageDialog(null, "Turno Ingresado Correctamente");
            }
            
        } catch (SQLException ex) {
             Logger.getLogger(Turnos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
  
    
   
    
    
    //metodo para sacar fecha de inicio --------------------------------------
    
    public String sacarFechaInicio(){
    
        String Dia=null, Mes=null, Año = null; //iniciamos tres variables para retornar fecha
        
        if (!mes_inicio.getSelectedItem().equals("Mes")) {//comprobamos que se selccione un mes del comboboxluego se le asigna un mes en numero 
            if(mes_inicio.getSelectedItem().toString().equals("Enero"))
                Mes="01";
            if(mes_inicio.getSelectedItem().toString().equals("Febrero"))
                Mes="02";
            if(mes_inicio.getSelectedItem().toString().equals("Marzo"))
                Mes="03";
            if(mes_inicio.getSelectedItem().toString().equals("Abril"))
                Mes="04";
            if(mes_inicio.getSelectedItem().toString().equals("Mayo"))
                Mes="05";
            if(mes_inicio.getSelectedItem().toString().equals("Junio"))
                Mes="06";
            if(mes_inicio.getSelectedItem().toString().equals("Julio"))
                Mes="07";
            if(mes_inicio.getSelectedItem().toString().equals("Agosto"))
                Mes="08";
            if(mes_inicio.getSelectedItem().toString().equals("Septiembre"))
                Mes="09";
            if(mes_inicio.getSelectedItem().toString().equals("Octubre"))
                Mes="10";
            if(mes_inicio.getSelectedItem().toString().equals("Noviembre"))
                Mes="11";
            if(mes_inicio.getSelectedItem().toString().equals("Diciembre"))
                Mes="12";
            
                if(!dia_inicio.getSelectedItem().equals("Dia")){ // confimarmos que se selccione un dia en el cbb y se le asigna si se selecciono
                        
                        Dia = dia_inicio.getSelectedItem().toString();
                        
                        if (!año_inicio.getSelectedItem().equals("Año")) { //confirmamos que se seleccione un año en el combobox y se le asigna
                                Año=año_inicio.getSelectedItem().toString();      
                                 return "'"+Año+"-"+Mes+"-"+Dia+"'"; //retornamos una fecha cuando aseguramos que se selccionarn dia mes y año    
                        }else{
                            JOptionPane.showMessageDialog(null, "Seleccione año para el Turno de Dia");     
                        }        
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione dia para el Turno de Dia");    
                }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione mes para el Turno de Dia");
        }

        return null;//retornamos null
    }
    
    //metodo para sacar fecha de inicio --------------------------------------
    
    public String sacarFechafinalizar(){
    
        String Dia=null, Mes=null, Año = null; //iniciamos tres variables para retornar fecha
        
        if (!mes_final.getSelectedItem().equals("Mes")) {//comprobamos que se selccione un mes del comboboxluego se le asigna un mes en numero 
            if(mes_final.getSelectedItem().toString().equals("Enero"))
                Mes="01";
            if(mes_final.getSelectedItem().toString().equals("Febrero"))
                Mes="02";
            if(mes_final.getSelectedItem().toString().equals("Marzo"))
                Mes="03";
            if(mes_final.getSelectedItem().toString().equals("Abril"))
                Mes="04";
            if(mes_final.getSelectedItem().toString().equals("Mayo"))
                Mes="05";
            if(mes_final.getSelectedItem().toString().equals("Junio"))
                Mes="06";
            if(mes_final.getSelectedItem().toString().equals("Julio"))
                Mes="07";
            if(mes_final.getSelectedItem().toString().equals("Agosto"))
                Mes="08";
            if(mes_final.getSelectedItem().toString().equals("Septiembre"))
                Mes="09";
            if(mes_final.getSelectedItem().toString().equals("Octubre"))
                Mes="10";
            if(mes_final.getSelectedItem().toString().equals("Noviembre"))
                Mes="11";
            if(mes_final.getSelectedItem().toString().equals("Diciembre"))
                Mes="12";
            
                if(!dia_final.getSelectedItem().equals("Dia")){ // confimarmos que se selccione un dia en el cbb y se le asigna si se selecciono
                        
                        Dia = dia_final.getSelectedItem().toString();
                        
                        if (!año_final.getSelectedItem().equals("Año")) { //confirmamos que se seleccione un año en el combobox y se le asigna
                                Año=año_final.getSelectedItem().toString();   
                                
                                 return "'"+Año+"-"+Mes+"-"+Dia+"'"; //retornamos una fecha cuando aseguramos que se selccionarn dia mes y año    
                        }else{
                            JOptionPane.showMessageDialog(null, "Seleccione año para el Turno de Noche");     
                        }        
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione dia para el Turno de noche");    
                }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione mes para el Turno de noche");
        }

        return null;//retornamos null
    }
    
    // sacamos la empresa selccionada en el combo box-----------------------------------------------------------------------------------------
    
    public String sacarEmpresaCBB(){
        String idempresavigilada = null; // creamos una variable para almacenar el id de la empresa
        try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("select idempresa from empresa_vigilada "
                    + "where nombre_empresa = '" + cbb_empresa.getSelectedItem().toString()+"'"); // consultamos la empresa eniando la variable seleccionada del combo box
            
            rs = ps.executeQuery();
            
            if (rs.next()) {  //si no hay resultado salta
                idempresavigilada = rs.getString(1);
              
                return idempresavigilada; //retornamos el id de la empresa en caso que se encuentre uno
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione una empresa");
            }
            con.close(); // cerramos conxion
        } catch (SQLException ex) {
            Logger.getLogger(Turnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return null;
    }
    
    // Metodo para sacar si el turno es de dia o de noche --------------------------------------------------------------
    
    public String sacarTurno(){
    
        String dia = null;
        String noche = null;
        
        if (rb_turnodia.isSelected()) {
            dia = "'Dia'";
            return  dia;
        }else{
            noche = "'Noche'";
            return noche;
        }
        
    }
    
    
    //*****************************************************************************************************************************************
    // apestaña para consultar horarios
    
    public void consultarTurnos(){
        DefaultTableModel modelo = (DefaultTableModel) Tbl_ConsultaTurnos.getModel(); //creamos un nuevo modelo de la tabla 
        modelo.setRowCount(0); //inicializamos los row en 0
         try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("SELECT fecha_inicio_turno, fecha_fin_turno, empresa_vigilada_idempresa, empleado_idemple, Tipo_Turno "
                                        + "FROM empresa.turno "
                                         + "where empleado_idemple = ?");//realizamos la consulta
             ps.setString(1, Txt_EmpleadoId_Consultas.getText());
            rs = ps.executeQuery();
             while (rs.next()) { //mientras existan datos en rs continuara
                 Vector v = new Vector();
                v.add(rs.getInt(4));
                v.add(rs.getDate(1));
                v.add(rs.getDate(2));
                v.add(rs.getInt(3));
                v.add(rs.getString(5));
             
                modelo.addRow(v);//eniavmos a la tabla lo obtenido en el resultset y lo metemos en un vector el cual enviamos a la tabla
                Tbl_ConsultaTurnos.setModel(modelo);
  
             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error "+ e);
            
        }

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Guardar;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JTable Tbl_ConsultaTurnos;
    private javax.swing.JTextField Txt_EmpleadoId_Consultas;
    private javax.swing.JLabel Txt_Nombredel_Empleado;
    private javax.swing.JTextField Txt_idEmpleado;
    private javax.swing.JComboBox<String> año_final;
    private javax.swing.JComboBox<String> año_inicio;
    private javax.swing.JButton bon_buscar_Vigilante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_empresa;
    private javax.swing.JComboBox<String> dia_final;
    private javax.swing.JComboBox<String> dia_inicio;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mes_final;
    private javax.swing.JComboBox<String> mes_inicio;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JRadioButton rb_turnodia;
    private javax.swing.JRadioButton rb_turnonoche;
    // End of variables declaration//GEN-END:variables
}
