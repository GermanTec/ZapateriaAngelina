/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Toshiba-PC
 */
public class ActualizarCat extends javax.swing.JFrame {

    /**
     * Creates new form ActualizarCat
     */
    public ActualizarCat() {
        initComponents();
        this.setLocationRelativeTo(this);
        PanelCatalago.setVisible(true);
        PanelLibros.setVisible(true);
        PanelDatos.setVisible(false);
        PanelCatalago.setVisible(true);
        PanelCatalagoM.setVisible(false);
        Libro1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCatalago = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelCatalago3 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        PanelCatalagoM = new javax.swing.JPanel();
        PanelCatalago5 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        PanelCatalago6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        PanelCatalago7 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        Libro1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCatalago = new javax.swing.JTable();
        PanelLibros = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtPedido = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmbCalzado = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        sTalla = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        txtPedido1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCatalago.setBackground(new java.awt.Color(255, 255, 255));

        PanelCatalago3.setBackground(new java.awt.Color(255, 255, 255));
        PanelCatalago3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCatalago3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCatalago3MouseExited(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-familia-min.jpg"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-calzado-min.jpg"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALZADO CONFORT.jpg"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-familia-min.jpg"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-calzado-min.jpg"))); // NOI18N

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALZADO CONFORT.jpg"))); // NOI18N
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-calzado-min.jpg"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALZADO CONFORT.jpg"))); // NOI18N
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel41MouseClicked(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-familia-min.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelCatalago3Layout = new javax.swing.GroupLayout(PanelCatalago3);
        PanelCatalago3.setLayout(PanelCatalago3Layout);
        PanelCatalago3Layout.setHorizontalGroup(
            PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCatalago3Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCatalago3Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCatalago3Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PanelCatalago3Layout.setVerticalGroup(
            PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCatalago3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(PanelCatalago3);

        javax.swing.GroupLayout PanelCatalagoLayout = new javax.swing.GroupLayout(PanelCatalago);
        PanelCatalago.setLayout(PanelCatalagoLayout);
        PanelCatalagoLayout.setHorizontalGroup(
            PanelCatalagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE))
        );
        PanelCatalagoLayout.setVerticalGroup(
            PanelCatalagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCatalago, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 430));

        PanelCatalagoM.setBackground(new java.awt.Color(255, 255, 255));

        PanelCatalago5.setBackground(new java.awt.Color(255, 255, 255));
        PanelCatalago5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCatalago5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCatalago5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCatalago5MouseExited(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALZADO CONFORT.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelCatalago5Layout = new javax.swing.GroupLayout(PanelCatalago5);
        PanelCatalago5.setLayout(PanelCatalago5Layout);
        PanelCatalago5Layout.setHorizontalGroup(
            PanelCatalago5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        PanelCatalago5Layout.setVerticalGroup(
            PanelCatalago5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCatalago5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(24, 24, 24))
        );

        PanelCatalago6.setBackground(new java.awt.Color(255, 255, 255));
        PanelCatalago6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCatalago6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCatalago6MouseExited(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-calzado-min.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelCatalago6Layout = new javax.swing.GroupLayout(PanelCatalago6);
        PanelCatalago6.setLayout(PanelCatalago6Layout);
        PanelCatalago6Layout.setHorizontalGroup(
            PanelCatalago6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCatalago6Layout.setVerticalGroup(
            PanelCatalago6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCatalago7.setBackground(new java.awt.Color(255, 255, 255));
        PanelCatalago7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCatalago7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCatalago7MouseExited(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/andrea-familia-min.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelCatalago7Layout = new javax.swing.GroupLayout(PanelCatalago7);
        PanelCatalago7.setLayout(PanelCatalago7Layout);
        PanelCatalago7Layout.setHorizontalGroup(
            PanelCatalago7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalago7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCatalago7Layout.setVerticalGroup(
            PanelCatalago7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCatalago7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout PanelCatalagoMLayout = new javax.swing.GroupLayout(PanelCatalagoM);
        PanelCatalagoM.setLayout(PanelCatalagoMLayout);
        PanelCatalagoMLayout.setHorizontalGroup(
            PanelCatalagoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalagoMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCatalago5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCatalago6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCatalago7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelCatalagoMLayout.setVerticalGroup(
            PanelCatalagoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalagoMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCatalagoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelCatalago7, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelCatalagoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelCatalago6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelCatalago5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelCatalagoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 430));

        Libro1.setBackground(new java.awt.Color(255, 255, 255));

        tblCatalago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "312", "Zapato", "Negrp", "Hombre", null}
            },
            new String [] {
                "Codigo Catalogo", "Codigo Calzado", "Tipo", "Color", "Genero", "Precio"
            }
        ));
        tblCatalago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCatalagoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblCatalago);

        javax.swing.GroupLayout Libro1Layout = new javax.swing.GroupLayout(Libro1);
        Libro1.setLayout(Libro1Layout);
        Libro1Layout.setHorizontalGroup(
            Libro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );
        Libro1Layout.setVerticalGroup(
            Libro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        getContentPane().add(Libro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 430));

        PanelLibros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Hoefler Text", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleccione Libro");
        PanelLibros.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jButton5.setText("Salir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelLibros.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, 90));

        jButton6.setText("Editar portada");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        PanelLibros.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 80, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        jLabel4.setToolTipText("");
        PanelLibros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 130));

        getContentPane().add(PanelLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 950, 130));

        PanelDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio");
        PanelDatos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));
        PanelDatos.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 90, 40));

        txtPedido.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        txtPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedidoActionPerformed(evt);
            }
        });
        txtPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedidoKeyTyped(evt);
            }
        });
        PanelDatos.add(txtPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 90, 30));

        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Codigo Pedido");
        PanelDatos.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        cmbCalzado.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        cmbCalzado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bota", "Bota vaquera", "Calzado de protecci??n", "Chancla", "Huarache", "Mocas??n", "Pantufla", "Sandalia", "Calzado deportivo", "Zapato", "Zapatilla de plataforma", "Zapatilla de tac??n" }));
        PanelDatos.add(cmbCalzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 110, 30));

        jLabel23.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tipo de Calzado");
        PanelDatos.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        cmbColor.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Azul", "Marr??n", "Gris", "Verde", "Naranja", "Rosa", "P??rpura", "Rojo", "Blanco", "Amarillo" }));
        PanelDatos.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 30));

        jLabel24.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Color");
        PanelDatos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer", "Ni??o", "Ni??a" }));
        PanelDatos.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, 30));

        sTalla.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        sTalla.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(20.5f), Float.valueOf(1.0f), Float.valueOf(40.0f), Float.valueOf(0.5f)));
        PanelDatos.add(sTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 70, -1));

        jLabel21.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Genero");
        PanelDatos.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        txtPedido1.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        txtPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPedido1ActionPerformed(evt);
            }
        });
        txtPedido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPedido1KeyTyped(evt);
            }
        });
        PanelDatos.add(txtPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 30));

        jLabel25.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Codigo Catalogo");
        PanelDatos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelDatos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 60));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelDatos.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 110, 60));

        jButton3.setText("Modificar");
        PanelDatos.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 110, 60));

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelDatos.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        PanelDatos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 130));

        getContentPane().add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 950, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedidoActionPerformed

    private void txtPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedidoKeyTyped

    }//GEN-LAST:event_txtPedidoKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PanelDatos.setVisible(false);
        PanelLibros.setVisible(true);
        PanelCatalago.setVisible(true);
        Libro1.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblCatalagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCatalagoMouseClicked
        int seleccionar=tblCatalago.rowAtPoint(evt.getPoint());
        txtPedido.setText(String.valueOf(tblCatalago.getValueAt(seleccionar,0)));
        cmbCalzado.setSelectedIndex(1);
        cmbColor.setSelectedItem(1);
        txtPrecio.setText(String.valueOf(tblCatalago.getValueAt(seleccionar, 3)));
        
        PanelCatalago.setVisible(false);
        Libro1.setVisible(false);

        
    }//GEN-LAST:event_tblCatalagoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            Principal a=new Principal();
            a.setVisible(rootPaneCheckingEnabled);
            this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void PanelCatalago5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago5MouseClicked
            
    }//GEN-LAST:event_PanelCatalago5MouseClicked

    private void PanelCatalago5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago5MouseEntered

    private void PanelCatalago5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago5MouseExited

    private void PanelCatalago6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago6MouseEntered

    private void PanelCatalago6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago6MouseExited

    private void PanelCatalago7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago7MouseEntered

    private void PanelCatalago7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelCatalago7MouseExited

    private void PanelCatalago3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago3MouseExited
        //PanelCatalago3.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_PanelCatalago3MouseExited

    private void PanelCatalago3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCatalago3MouseEntered
        //PanelCatalago3.setBackground(new java.awt.Color(204,204,255));
    }//GEN-LAST:event_PanelCatalago3MouseEntered

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jLabel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        PanelCatalago.setVisible(false);
        Libro1.setVisible(true);
        PanelDatos.setVisible(true);
        PanelLibros.setVisible(false);
    }//GEN-LAST:event_jLabel34MouseClicked

    private void txtPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPedido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedido1ActionPerformed

    private void txtPedido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPedido1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPedido1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizarCat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Libro1;
    private javax.swing.JPanel PanelCatalago;
    private javax.swing.JPanel PanelCatalago3;
    private javax.swing.JPanel PanelCatalago5;
    private javax.swing.JPanel PanelCatalago6;
    private javax.swing.JPanel PanelCatalago7;
    private javax.swing.JPanel PanelCatalagoM;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelLibros;
    private javax.swing.JComboBox<String> cmbCalzado;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSpinner sTalla;
    private javax.swing.JTable tblCatalago;
    private javax.swing.JTextField txtPedido;
    private javax.swing.JTextField txtPedido1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
