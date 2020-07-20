
package clases;

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


public class Empleados extends javax.swing.JFrame {

    JFrame empleado = new JFrame();
    
    public Empleados() {
        
        initComponents();
        empleado.setVisible(true);
        empleado.setContentPane(principal);
        empleado.pack();
        empleado.setResizable(false);
        empleado.setLocationRelativeTo(null);
        
    }
    
    static int usuarioconectado = 0;
    PreparedStatement ps;
    ResultSet rs;
    public static final String URL = "jdbc:mysql://localhost:3306/empresa?autoReconnet=true&useSSL=false";
    static Connection conexion = null;
    
    
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
  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        principal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_Identificacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Txt_Direccion = new javax.swing.JTextField();
        Txt_Telefono = new javax.swing.JTextField();
        Txt_Correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbb_Cargo = new javax.swing.JComboBox<>();
        Cbb_Sexo = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Txt_Identificacion1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Txt_Nombre1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Txt_apellido1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Txt_Direccion1 = new javax.swing.JTextField();
        Txt_Telefono1 = new javax.swing.JTextField();
        Txt_Correo1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbb_Cargo1 = new javax.swing.JComboBox<>();
        Cbb_Sexo1 = new javax.swing.JComboBox<>();
        btn_salir1 = new javax.swing.JButton();
        btn_Limpiar1 = new javax.swing.JButton();
        bton_buscarEmpleados = new javax.swing.JButton();
        bton_Actualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();
        rb_administrador = new javax.swing.JRadioButton();
        rb_secretaria = new javax.swing.JRadioButton();
        rb_vigilante = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Identificacion");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Direccion");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Telefono");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Cargo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Sexo");

        cbb_Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretaria", "Vigilante" }));

        Cbb_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbb_Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(Txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cbb_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cbb_Sexo)
                    .addComponent(cbb_Cargo)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        principal.addTab("Registro de Empleados", jPanel1);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Identificacion");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Nombre");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Apellido");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Direccion");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("Correo");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Telefono");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel15.setText("Cargo");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Sexo");

        cbb_Cargo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Secretaria", "Vigilante" }));

        Cbb_Sexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });

        btn_Limpiar1.setText("Limpiar");
        btn_Limpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Limpiar1ActionPerformed(evt);
            }
        });

        bton_buscarEmpleados.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bton_buscarEmpleados.setText("Buscar");
        bton_buscarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_buscarEmpleadosActionPerformed(evt);
            }
        });

        bton_Actualizar.setText("Actualizar");
        bton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bton_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bton_buscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Identificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_Direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_Cargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_Telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(Txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Cbb_Sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(bton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Limpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Txt_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Txt_Identificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bton_buscarEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txt_Direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Correo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bton_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cbb_Sexo1)
                    .addComponent(cbb_Cargo1)
                    .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 897, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        principal.addTab("Actualizar Empleados", jPanel3);

        tbl_empleados.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Nombre", "Apellido", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_empleados);
        if (tbl_empleados.getColumnModel().getColumnCount() > 0) {
            tbl_empleados.getColumnModel().getColumn(0).setMinWidth(50);
            tbl_empleados.getColumnModel().getColumn(0).setMaxWidth(110);
            tbl_empleados.getColumnModel().getColumn(1).setMaxWidth(160);
            tbl_empleados.getColumnModel().getColumn(2).setMaxWidth(160);
            tbl_empleados.getColumnModel().getColumn(3).setMaxWidth(250);
            tbl_empleados.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        buttonGroup1.add(rb_administrador);
        rb_administrador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_administrador.setText("Administradores");
        rb_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_administradorMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_secretaria);
        rb_secretaria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_secretaria.setText("Secretarias");
        rb_secretaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_secretariaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_vigilante);
        rb_vigilante.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rb_vigilante.setText("Vigilantes");
        rb_vigilante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_vigilanteMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(rb_administrador)
                            .addGap(118, 118, 118)
                            .addComponent(rb_secretaria)
                            .addGap(143, 143, 143)
                            .addComponent(rb_vigilante))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_administrador)
                    .addComponent(rb_secretaria)
                    .addComponent(rb_vigilante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );

        principal.addTab("Consulta de Empleados", jPanel2);

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
   
    
    
    
    
    
    
    //boton que guarda empleados nuevos
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
          RegistrarEmpleado(); // llamamos el ingresar empleados
          limpiarCajas(); //llamamos limpiar cajas
          
    }//GEN-LAST:event_btn_guardarActionPerformed

    
    
    //boton que busca empleados
    private void bton_buscarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_buscarEmpleadosActionPerformed
        buscarEmpleados();
        
    }//GEN-LAST:event_bton_buscarEmpleadosActionPerformed

    
    //Boton para actualizar un empleado
    
    private void bton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bton_ActualizarActionPerformed
        actualizarEmpleado();
        limpiarCajas();
    }//GEN-LAST:event_bton_ActualizarActionPerformed

    
    
    
    
    
    
    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        empleado.dispose();
        new Clases.MenuPrincipal();
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       empleado.dispose();
        new Clases.MenuPrincipal();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_Limpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Limpiar1ActionPerformed
       limpiarCajas2();
       
    }//GEN-LAST:event_btn_Limpiar1ActionPerformed

    private void rb_administradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_administradorMouseClicked
        consultaradmin();
    }//GEN-LAST:event_rb_administradorMouseClicked

    private void rb_secretariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_secretariaMouseClicked
        consultarsecretaria();
    }//GEN-LAST:event_rb_secretariaMouseClicked

    private void rb_vigilanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_vigilanteMouseClicked
        consultarvigilante();
    }//GEN-LAST:event_rb_vigilanteMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        empleado.dispose();
        new Clases.MenuPrincipal();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //************************************************************************************************************************************
    //pensataña registrar empleado
    
    
    //metodo para limpiar las cajas ventana registro--------------------------------------------------------------------
    
    public void limpiarCajas(){
        
        Txt_Identificacion.setText("");
        Txt_Correo.setText("");
        Txt_Nombre.setText("");
        Txt_apellido.setText("");
        Txt_Direccion.setText("");
        Txt_Telefono.setText("");
    
    }
    
    //metodo para registrar un empleado -----------------------------------------------------------------
    
    public void RegistrarEmpleado(){
            int resultado =0;
        try {
            
            Connection con = GetConnection();//establecemos conexion
            
            ps = con.prepareStatement("insert into empleado (identificacion,nombres,apellidos,direccion,correo,telefono,cargo,sexo) "
                                        + "values (?,?,?,?,?,?,?,?)");
            ps.setString(1, Txt_Identificacion.getText());
            ps.setString(2, Txt_Nombre.getText());
            ps.setString(3, Txt_apellido.getText());
            ps.setString(4, Txt_Direccion.getText());
            ps.setString(5, Txt_Correo.getText());
            ps.setString(6, Txt_Telefono.getText());
            ps.setString(7, cbb_Cargo.getSelectedItem().toString());
            ps.setString(8, Cbb_Sexo.getSelectedItem().toString()); // emviamos todos la datos que traemos de las caas de texto
            
            resultado = ps.executeUpdate(); // ejecutamos el update a la bd y guardamos el resultado en un int para hacer luego la comprabcion
            
            if (resultado!=0) { // si el entero es diferente de 0 es que se realizo el update
                JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error "+ ex);
        }
        
    
    }
    
    //*****************************************************************************************************************************************
    //pestaña actualizar empleados
    
    
    //meodo para buscar empleados por identificacion ---------------------------------------------------
    
    public void buscarEmpleados(){
    
        try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("SELECT identificacion,nombres,apellidos,direccion,correo,telefono,cargo,sexo "
                                        + "FROM empresa.empleado "
                                         + "where identificacion = '"+ Txt_Identificacion1.getText()+"'");
            rs = ps.executeQuery();
            
            if (rs.next()) {
                System.out.println(rs.getString(2));
                Txt_Identificacion1.setText(rs.getString(1));
                Txt_Correo1.setText(rs.getString(5));
                Txt_Nombre1.setText(rs.getString(2));
                Txt_apellido1.setText(rs.getString(3));
                Txt_Direccion1.setText(rs.getString(4));
                Txt_Telefono1.setText(rs.getString(6));
                cbb_Cargo1.setSelectedItem(rs.getString(7));
                 Cbb_Sexo1.setSelectedItem(rs.getString(8));
            }else{
                JOptionPane.showMessageDialog(null, "NO Existe este empleado");
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error "+ e);
            
        }
            

    }
    
            // metodo para actualizar un empleado--------------------------------------------------------
    
        public void  actualizarEmpleado(){
        
             int resultado =0;
        try {
            
            Connection con = GetConnection();//establecemos conexion
            
            ps = con.prepareStatement("update empleado set nombres=? , apellidos=?, direccion=? , correo=? , telefono=? , cargo=? , Sexo=?  "
                                         + "where identificacion = '"+ Txt_Identificacion1.getText()+"'");
            
            ps.setString(1, Txt_Nombre1.getText());
            ps.setString(2, Txt_apellido1.getText());
            ps.setString(3, Txt_Direccion1.getText());
            ps.setString(4, Txt_Correo1.getText());
            ps.setString(5, Txt_Telefono1.getText());
            ps.setString(6, cbb_Cargo1.getSelectedItem().toString());
            ps.setString(7, Cbb_Sexo1.getSelectedItem().toString()); // emviamos todos la datos que traemos de las caas de texto
            System.out.println("a actualizar");
            resultado = ps.executeUpdate(); // ejecutamos el update a la bd y guardamos el resultado en un int para hacer luego la comprabcion
            
            if (resultado!=0) { // si el entero es diferente de 0 es que se realizo el update
                JOptionPane.showMessageDialog(null, "Empleado Actualizado exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error "+ ex);
        }
        
        
        }
        //metodo para limpiar las cajas ventana consultas--------------------------------------------------------------------
    
    public void limpiarCajas2(){
        
        Txt_Identificacion1.setText("");
        Txt_Correo1.setText("");
        Txt_Nombre1.setText("");
        Txt_apellido1.setText("");
        Txt_Direccion1.setText("");
        Txt_Telefono1.setText("");
    
    }
    
    
    //**********************************************************************************************************************************
    //pestaña consultar empleados
    
    //consultamos el usuario cargo administrador
    public void consultaradmin(){
        DefaultTableModel modelo = (DefaultTableModel) tbl_empleados.getModel(); //creamos un nuevo modelo de la tabla 
        modelo.setRowCount(0); //inicializamos los row en 0
         try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("SELECT identificacion,nombres,apellidos,direccion,telefono "
                                        + "FROM empresa.empleado "
                                         + "where cargo = 'Administrador'");//realizamos la consulta
             
            rs = ps.executeQuery();
             while (rs.next()) { //mientras existan datos en rs continuara
                 Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
             
                modelo.addRow(v);//eniavmos a la tabla lo obtenido en el resultset y lo metemos en un vector el cual enviamos a la tabla
                tbl_empleados.setModel(modelo);
  
             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error "+ e);
            
        }

    }
    
      //consultamos el usuario cargo secretaria
    public void consultarsecretaria(){
        DefaultTableModel modelo = (DefaultTableModel) tbl_empleados.getModel(); //creamos un nuevo modelo de la tabla 
        modelo.setRowCount(0); //inicializamos los row en 0
         try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("SELECT identificacion,nombres,apellidos,direccion,telefono "
                                        + "FROM empresa.empleado "
                                         + "where cargo = 'Secretaria'");//realizamos la consulta
             
            rs = ps.executeQuery();
             while (rs.next()) { //mientras existan datos en rs continuara
                 Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                
                modelo.addRow(v);//eniavmos a la tabla lo obtenido en el resultset y lo metemos en un vector el cual enviamos a la tabla
                tbl_empleados.setModel(modelo);
  
             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error "+ e);
            
        }

    }
    
      //consultamos el usuario cargo Vigilante
    public void consultarvigilante(){
        DefaultTableModel modelo = (DefaultTableModel) tbl_empleados.getModel(); //creamos un nuevo modelo de la tabla 
        modelo.setRowCount(0); //inicializamos los row en 0
         try {
            Connection con = GetConnection();
            
            ps = con.prepareStatement("SELECT identificacion,nombres,apellidos,direccion,telefono "
                                        + "FROM empresa.empleado "
                                         + "where cargo = 'Vigilante'");//realizamos la consulta
             
            rs = ps.executeQuery();
             while (rs.next()) { //mientras existan datos en rs continuara
                 Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
               
                modelo.addRow(v);//eniavmos a la tabla lo obtenido en el resultset y lo metemos en un vector el cual enviamos a la tabla
                tbl_empleados.setModel(modelo);
  
             }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error "+ e);
            
        }

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbb_Sexo;
    private javax.swing.JComboBox<String> Cbb_Sexo1;
    private javax.swing.JTextField Txt_Correo;
    private javax.swing.JTextField Txt_Correo1;
    private javax.swing.JTextField Txt_Direccion;
    private javax.swing.JTextField Txt_Direccion1;
    private javax.swing.JTextField Txt_Identificacion;
    private javax.swing.JTextField Txt_Identificacion1;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_Nombre1;
    private javax.swing.JTextField Txt_Telefono;
    private javax.swing.JTextField Txt_Telefono1;
    private javax.swing.JTextField Txt_apellido;
    private javax.swing.JTextField Txt_apellido1;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Limpiar1;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JButton bton_Actualizar;
    private javax.swing.JButton bton_buscarEmpleados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbb_Cargo;
    private javax.swing.JComboBox<String> cbb_Cargo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane principal;
    private javax.swing.JRadioButton rb_administrador;
    private javax.swing.JRadioButton rb_secretaria;
    private javax.swing.JRadioButton rb_vigilante;
    private javax.swing.JTable tbl_empleados;
    // End of variables declaration//GEN-END:variables
}
