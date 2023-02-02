/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFagenda extends javax.swing.JFrame {

    /**
     * comentario prueba
     */
    DefaultTableModel dtm = new DefaultTableModel();

    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * contiene el metodo para no poder cambiar el tamaño de la ventana, desactivar el boton de agrandar pantalla
     * y para centrar la ventana en la pantalla
     */
    public JFagenda() {
        initComponents();
        String[] titulos = new String[]{"Id", "Nombre", "Apellido"};
        dtm.setColumnIdentifiers(titulos);

        this.tblAgenda.setModel(this.mostrarDatos());
        this.setResizable(false);
        /**
         * para no poder cambiar el tamaño de la ventana y desactivar el boton
         * de agrandar
         */
        this.setLocationRelativeTo(null);
        /**
         * para centrar la ventana en la pantalla
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgenda = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(425, 336));
        setMinimumSize(new java.awt.Dimension(425, 336));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(425, 336));
        jPanel1.setMinimumSize(new java.awt.Dimension(425, 336));

        jLabel1.setText("Id");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jScrollPane1.setViewportView(tblAgenda);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Mostrar Tabla");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.txtNombre.getText().isEmpty() || this.txtApellido.getText().isEmpty()) {
            /**
             * si no se completan las cajas de texto nombre y apellido muestra
             * este cartel de error
             */
            JOptionPane.showMessageDialog(null, "El campo nombre y el campo apellido deben estar completos", "ERROR", JOptionPane.ERROR_MESSAGE);
            Limpiar();
            LimpiarCajas();
            tblAgenda.setModel(this.mostrarDatos());
        } else if (!this.txtId.getText().isEmpty()) {
            /**
             * el ID es autonumerico, si se agrega un registro completando el ID
             * muestra este cartel de error
             */
            JOptionPane.showMessageDialog(null, "No es necesario ingresar el ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            LimpiarCajas();
            Limpiar();
            tblAgenda.setModel(this.mostrarDatos());
        } else {

            Agregar();
            Limpiar();
            tblAgenda.setModel(this.mostrarDatos());
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Eliminar();
        } catch (Exception e) {
            /**
             * si no se seleccione ninguna fila muestra este error
             */
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        /**
         * muestra toda la tabla de mysql en el jtable
         */
        Limpiar();
        tblAgenda.setModel(this.mostrarDatos());
        LimpiarCajas();

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        /**
         * limpia la tabla y muestra el resultado del metodo buscar
         */
        Limpiar();
        Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        /**
         * limpia el jtable
         */
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (!this.txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede modificar el Id", "ERROR", JOptionPane.ERROR_MESSAGE);
            LimpiarCajas();
        } else if (this.txtNombre.getText().isEmpty() & this.txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe completar un cuadro de  texto para modificar el registro",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            LimpiarCajas();
        } else {
            try {
                Modificar();
                Limpiar();
                tblAgenda.setModel(this.mostrarDatos());
            } catch (Exception e) {
                /**
                 * si no se selecciona ninguna fila muestra este cartel de error
                 */
                JOptionPane.showMessageDialog(null, "Seleccione una fila para modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        /**
         * este metodo sirve para que en la caja de texto ID solo se puedan
         * escribir numeros
         */
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 & key <= 57;
        /**
         * 48 a 57 es el rango de numeros en la tabla ASCII
         */

        if (!numeros) {
            evt.consume();
            /**
             * el metodo consume hace que no se ejecute el evento
             */
        }
        if (this.txtId.getText().length() >= 4) {
            /**
             * sirve para que no se pueda escribir mas de 4 numeros en la caja
             * id
             */
            evt.consume();
        }

    }//GEN-LAST:event_txtIdKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        /**
         * este metodo sirve para que en la caja de texto nombre solo se puedan
         * escribir letras
         */

        int key = evt.getKeyChar();
        /**
         * aca tomamos el numero ASCII de la tecla que apretamos
         */

        boolean mayusculas = key >= 65 & key <= 90;
        /**
         * es el rango de las mayusculas en la tabla ASCII
         */
        boolean minusculas = key >= 97 & key <= 122;

        if (!(minusculas || mayusculas)) {
            /**
             * el ! niega la condicion
             */
            evt.consume(); //el metodo consume hace que no se ejecute el evento
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        /**
         * este metodo sirve para que en la caja de texto Apellido solo se
         * puedan escribir numeros
         */

        int key = evt.getKeyChar();
        /**
         * aca tomamos el numero ASCII de la tecla que apretamos
         */

        boolean mayusculas = key >= 65 & key <= 90;
        /**
         * es el rango de las mayusculas en la tabla ASCII
         */
        boolean minusculas = key >= 97 & key <= 122;
        /**
         * es el rango de las minusculas en la tabla ASCII
         */

        if (!(minusculas || mayusculas)) {
            /**
             * el ! niega la condicion
             */
            evt.consume(); //el metodo consume hace que no se ejecute el evento
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased

    }//GEN-LAST:event_txtIdKeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFagenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFagenda().setVisible(true);
            }
        });
    }

    /**
     * metodo para el boton buscar. actualiza el jtable y muestra los resultados
     * de la busqueda
     */
    public DefaultTableModel Buscar() {

        String[] registros = new String[3];

        Conexion conectar = new Conexion();

        try {
            con = conectar.getConexion();
            /**
             * para buscar por nombre
             */
            if (this.txtId.getText().isEmpty() & this.txtApellido.getText().isEmpty() & !this.txtNombre.getText().isEmpty()) {
                ps = con.prepareStatement("SELECT * FROM agenda WHERE Nombre = ?");
                ps.setString(1, this.txtNombre.getText());
                /**
                 * para buscar por id
                 */
            } else if (this.txtNombre.getText().isEmpty() & this.txtApellido.getText().isEmpty() & !this.txtId.getText().isEmpty()) {
                ps = con.prepareStatement("SELECT * FROM agenda WHERE Id = ?");
                ps.setString(1, this.txtId.getText());
                /**
                 * para buscar por apellido
                 */
            } else if (this.txtNombre.getText().isEmpty() & this.txtId.getText().isEmpty() & !this.txtApellido.getText().isEmpty()) {
                ps = con.prepareStatement("SELECT * FROM agenda WHERE Apellido = ?");
                ps.setString(1, this.txtApellido.getText());
                /**
                 * error que se muestra si se apreta buscar sin haber completado
                 * ninguna caja de texto
                 */
            } else if (this.txtNombre.getText().isEmpty() & this.txtId.getText().isEmpty() & this.txtApellido.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete un parametro para realizar la busqueda", "ERROR", JOptionPane.ERROR_MESSAGE);
                Limpiar();
                tblAgenda.setModel(this.mostrarDatos());
                LimpiarCajas();
                /**
                 * error que se muestra si se intenta buscar por mas de un
                 * parametro
                 */
            } else {
                JOptionPane.showMessageDialog(null, "Solo se puede buscar por un parametro");
                Limpiar();
                tblAgenda.setModel(this.mostrarDatos());
                LimpiarCajas();
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                this.dtm.addRow(registros);
            }
        } catch (Exception e) {
            //  JOptionPane.showMessageDialog(null, "Error al conectar");
        }
        conectar.Desconectar();
        LimpiarCajas();
        return dtm;

    }

    /**
     * metodo para agregar un registro a la base de datos y lo muestre en el
     * jtable
     */
    public void Agregar() {

        Conexion conectar = new Conexion();

        try {

            con = conectar.getConexion();

            ps = con.prepareStatement("INSERT INTO agenda (Nombre,Apellido) VALUES (?,?);");
            ps.setString(1, this.txtNombre.getText());

            ps.setString(2, this.txtApellido.getText());

            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);

        }
        LimpiarCajas();
        conectar.Desconectar();
    }

    /**
     * metodo que modifica el registro seleccionado segun lo que se complete en
     * las cajas de texto
     */
    public void Modificar() {
        Conexion conectar = new Conexion();
        int fila = this.tblAgenda.getSelectedRow(); // 
        /**
         * toma el valor del ID segun la fila que se seleccione
         */
        String sel = this.tblAgenda.getValueAt(fila, 0).toString();
        /**
         * toma el valor del nombre segun la fila que se seleccione
         */
        String nombre = this.tblAgenda.getValueAt(fila, 1).toString();
        /**
         * toma el valor del apellido segun la fila que se seleccione
         */
        String apellido = this.tblAgenda.getValueAt(fila, 2).toString();

        try {

            con = conectar.getConexion();
            /**
             * modifica el nombre y el apellido si se completan ambas cajas de
             * texto
             */
            if (!this.txtNombre.getText().isEmpty() & !this.txtApellido.getText().isEmpty()) {
                ps = con.prepareStatement("UPDATE agenda SET Nombre= ?,Apellido = ? WHERE id = ?;");
                ps.setString(1, this.txtNombre.getText());
                ps.setString(2, this.txtApellido.getText());
                ps.setInt(3, Integer.parseInt(sel));
                /**
                 * modifica el apellido si solo se completa la caja de texto de
                 * nombre
                 */
            } else if (this.txtApellido.getText().isEmpty()) {
                ps = con.prepareStatement("UPDATE agenda SET Nombre= ?,Apellido = ? WHERE id = ?;");
                ps.setString(1, this.txtNombre.getText());
                ps.setString(2, apellido);
                ps.setInt(3, Integer.parseInt(sel));
                /**
                 * modifica el apellido si solo se completa la caja de texto de
                 * apellido
                 */
            } else if (this.txtNombre.getText().isEmpty()) {
                ps = con.prepareStatement("UPDATE agenda SET Nombre= ?,Apellido = ? WHERE id = ?;");
                ps.setString(1, nombre);
                ps.setString(2, this.txtApellido.getText());
                ps.setInt(3, Integer.parseInt(sel));
            }

            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);

        }
        LimpiarCajas();
        conectar.Desconectar();
    }

    /**
     * Metodo para seleccionar una fila y borrarla segun el id del registro
     */
    public void Eliminar() {
        /**
         * para seleccionar una fila
         */
        int fila = this.tblAgenda.getSelectedRow();

        String sel = this.tblAgenda.getValueAt(fila, 0).toString();
        /**
         * para seleccionar el valor de una columna de la fila
         */

        Conexion conectar = new Conexion();

        try {

            con = conectar.getConexion();

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?", "ELIMINAR REGISTRO", JOptionPane.YES_NO_OPTION);

            if (respuesta == 0) {
                ps = con.prepareStatement("DELETE FROM agenda WHERE id=?");
                ps.setInt(1, Integer.parseInt(sel));

                int res = ps.executeUpdate();

                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "completado");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR");
                }
            }
        } catch (Exception e) {
            System.err.println(e);

        }
        Limpiar();
        tblAgenda.setModel(this.mostrarDatos());
        LimpiarCajas();
        conectar.Desconectar();
    }

    /**
     * limpia el jtable
     */
    public void Limpiar() {

        int fila = dtm.getRowCount();
        for (int i = 0; i < fila; i++) {
            dtm.removeRow(0);
        }
    }

    /**
     * limpia las cajas de texto
     */
    public void LimpiarCajas() {

        this.txtId.setText(null);
        this.txtNombre.setText(null);
        this.txtApellido.setText(null);

    }

    /**
     * muestra la tabla de datos de mysql en el jtable
     */
    public DefaultTableModel mostrarDatos() {

        String[] registros = new String[3];
        String sql = "SELECT * FROM agenda";

        Conexion conectar = new Conexion();

        try {
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido");
                this.dtm.addRow(registros);
            }
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar");
        }
        conectar.Desconectar();
        return dtm;

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAgenda;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
