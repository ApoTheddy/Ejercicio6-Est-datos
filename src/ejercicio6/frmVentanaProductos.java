package ejercicio6;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVentanaProductos extends javax.swing.JFrame {

    private final DefaultTableModel modelTable;
    private final ManejadorArchivos hFiles = new ManejadorArchivos("productos.txt");
    private final  String[] headersTable = {"CODIGO","DESCRIPCION","STOCK","STOCK MINIMO","PRECIO"}; 
    private String[][] dataTable;
    
    public frmVentanaProductos() {
        initComponents();
        modelTable = new DefaultTableModel(dataTable,headersTable);
        jtblTablaProductos.setModel(modelTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jtxtPrecio = new javax.swing.JTextField();
        jtxtStock = new javax.swing.JTextField();
        jtxtMinimo = new javax.swing.JTextField();
        jbtnGuardarProducto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaDescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblTablaProductos = new javax.swing.JTable();
        jbtnMostrarProductos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("GUARDAR PRODUCTO");

        jtxtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtCodigo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jtxtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jtxtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CODIGO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jtxtPrecio.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jtxtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtxtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PRECIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtStock.setBackground(new java.awt.Color(255, 255, 255));
        jtxtStock.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jtxtStock.setForeground(new java.awt.Color(0, 0, 0));
        jtxtStock.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jtxtMinimo.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMinimo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 18)); // NOI18N
        jtxtMinimo.setForeground(new java.awt.Color(0, 0, 0));
        jtxtMinimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STOCK MINIMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jbtnGuardarProducto.setBackground(new java.awt.Color(153, 255, 153));
        jbtnGuardarProducto.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jbtnGuardarProducto.setForeground(new java.awt.Color(0, 0, 0));
        jbtnGuardarProducto.setText("GUARDAR PRODUCTO");
        jbtnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarProductoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtxaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jtxaDescripcion.setColumns(20);
        jtxaDescripcion.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jtxaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jtxaDescripcion.setRows(5);
        jtxaDescripcion.setWrapStyleWord(true);
        jtxaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Victor Mono SemiBold", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane1.setViewportView(jtxaDescripcion);

        jtblTablaProductos.setBackground(new java.awt.Color(255, 255, 255));
        jtblTablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "STOCK", "STOCK MINIMO", "PRECIO"
            }
        ));
        jScrollPane2.setViewportView(jtblTablaProductos);

        jbtnMostrarProductos.setBackground(new java.awt.Color(153, 255, 153));
        jbtnMostrarProductos.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        jbtnMostrarProductos.setForeground(new java.awt.Color(0, 0, 0));
        jbtnMostrarProductos.setText("MOSTRAR PRODUCTOS");
        jbtnMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarProductosActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnGuardarProducto)
                                .addGap(18, 18, 18)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtnMostrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(26, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarProductoActionPerformed
        int codigo = Integer.parseInt(jtxtCodigo.getText());
        String descripcion = jtxaDescripcion.getText();
        int stock = Integer.parseInt(jtxtStock.getText());
        int stockMinimo = Integer.parseInt(jtxtMinimo.getText());
        double precio = Double.parseDouble(jtxtPrecio.getText());

        Producto producto = new Producto(codigo, descripcion, stock, stockMinimo, precio);
        hFiles.guardarArchivo(producto);
    }//GEN-LAST:event_jbtnGuardarProductoActionPerformed

    private void jbtnMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarProductosActionPerformed
        ArrayList<Producto> productos = new ArrayList<>();

        hFiles.obtenerProductos(productos);
        if (productos.size() >= 0) {
            productos.forEach((producto) -> {
                Object[] dataRow = {producto.getCodigo(), producto.getDescripcion(), producto.getStock(), producto.getMinimo(), producto.getPrecio()};
                modelTable.addRow(dataRow);
            });
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron datos en el archivo");
        }
        
    }//GEN-LAST:event_jbtnMostrarProductosActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new frmVentanaProductos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtnGuardarProducto;
    private javax.swing.JButton jbtnMostrarProductos;
    private javax.swing.JTable jtblTablaProductos;
    private javax.swing.JTextArea jtxaDescripcion;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtMinimo;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtStock;
    // End of variables declaration//GEN-END:variables
}
