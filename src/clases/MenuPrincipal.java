
package Clases;

import javax.swing.JFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    JFrame menu = new JFrame();
    
    public MenuPrincipal() {
        initComponents();
        
        menu.setVisible(true);
        menu.setTitle("Menu Principal");
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setContentPane(principal);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setResizable(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        Btn_Turnos = new javax.swing.JButton();
        Btn_Empleados = new javax.swing.JButton();
        Btn_Reportes_Supervisor = new javax.swing.JButton();
        Btn_Reporte_Turnos = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        Btn_Registrar_empresa = new javax.swing.JButton();
        Btn_cerrar_sesion = new javax.swing.JButton();
        Btn_Registrar_Usuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(0, 102, 102));

        Btn_Turnos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Turnos.setText("Turnos");
        Btn_Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TurnosActionPerformed(evt);
            }
        });

        Btn_Empleados.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Empleados.setText("Empleados");
        Btn_Empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EmpleadosActionPerformed(evt);
            }
        });

        Btn_Reportes_Supervisor.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Reportes_Supervisor.setText("Reportes Del Supervisor");

        Btn_Reporte_Turnos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Btn_Reporte_Turnos.setText("Reportes de Turno");
        Btn_Reporte_Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Reporte_TurnosActionPerformed(evt);
            }
        });

        Btn_Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        Btn_Registrar_empresa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Registrar_empresa.setText("Registrar empresa ");

        Btn_cerrar_sesion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_cerrar_sesion.setText("Cerrar Sesión");

        Btn_Registrar_Usuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Btn_Registrar_Usuario.setText("Usuarios");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reporte_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reportes_Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Reportes_Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reporte_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Registrar_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Registrar_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Reporte_TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Reporte_TurnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Reporte_TurnosActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
      System.exit(0);
      
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_EmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EmpleadosActionPerformed
       menu.dispose();
       new clases.Empleados();
    }//GEN-LAST:event_Btn_EmpleadosActionPerformed

    private void Btn_TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TurnosActionPerformed
      menu.dispose();
      new clases.Turnos();
    }//GEN-LAST:event_Btn_TurnosActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Empleados;
    private javax.swing.JButton Btn_Registrar_Usuario;
    private javax.swing.JButton Btn_Registrar_empresa;
    private javax.swing.JButton Btn_Reporte_Turnos;
    private javax.swing.JButton Btn_Reportes_Supervisor;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JButton Btn_Turnos;
    private javax.swing.JButton Btn_cerrar_sesion;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables

}
