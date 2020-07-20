
package Clases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inicio_Sesion extends javax.swing.JFrame {

    JFrame inicio = new JFrame();
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
  
    
    //------------------------------------------------
    // Metodo Main QUe inicia la Aplicacion
    
     public static void main(String args[]) {    
      new Inicio_Sesion(); // llamamos la clase para iniciar
    }
    
    public Inicio_Sesion() {
        
        //Colocamos para poder visualizar la ventana
        initComponents();
        inicio.setVisible(true);
        inicio.setTitle("Inicio De Sesion");
        inicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
        inicio.setContentPane(principal);
        inicio.pack();
        inicio.setLocationRelativeTo(null);
        inicio.setResizable(false);

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Boton_IniciarSesion = new javax.swing.JButton();
        Boton_Salir = new javax.swing.JButton();
        Txt_Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/22260-security-NSA-Edward_Snow.jpg"))); // NOI18N

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setText("Inicio de Sesiòn");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");

        Boton_IniciarSesion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_IniciarSesion.setText("Iniciar");
        Boton_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IniciarSesionActionPerformed(evt);
            }
        });

        Boton_Salir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(Boton_IniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_IniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(Boton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------------------------------------------------
    //Metodo para iniciar sesion 
    
    public void verificarUsuario(){
        String varusuario = "";
        String varpass = "";
        String usuario = Txt_Usuario.getText();
       
        String pass = new String(Txt_Contraseña.getPassword());
        
        try {
            Connection con = GetConnection(); //establecemos conexion
            
            ps = con.prepareStatement("SELECT idusua,usuario,contraseña FROM empresa.usuario where usuario = '" + usuario + "'");
            
            rs = ps.executeQuery();
           
            if(rs.next()) { // Verificamos que la consulta hecha tenga datos
                
                usuarioconectado = rs.getInt("idusua");
                
                varusuario = rs.getString("usuario"); // obtenemos el dato del usuario
                varpass = rs.getString("contraseña");  // obtenemos el dato de la contraseña
                
 
                 if (varpass.equals(pass)) {//verificamos que la contraseña sea = a la ingresada
                
                if (varusuario.equals(usuario)) { // verificamos que el usuario sea = al ingresado 
                    inicio.dispose();
                    new MenuPrincipal();
                }else{JOptionPane.showMessageDialog(null, "Usuario Incorrecto");}
                
            }else{JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");}
                
            }
            
           
            
        } catch (SQLException ex) {
            Logger.getLogger(Inicio_Sesion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }
    
    
    private void Boton_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IniciarSesionActionPerformed
       verificarUsuario(); // llamamos el metodo para buscar el usuario en la BD
        
    }//GEN-LAST:event_Boton_IniciarSesionActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
    
        //salimos del programa
        System.exit(0);
 
    }//GEN-LAST:event_Boton_SalirActionPerformed
    
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_IniciarSesion;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPasswordField Txt_Contraseña;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel principal;
    // End of variables declaration//GEN-END:variables
}
