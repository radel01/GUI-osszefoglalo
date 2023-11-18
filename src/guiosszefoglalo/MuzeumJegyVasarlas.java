/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiosszefoglalo;

import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author Lenovo
 */
public class MuzeumJegyVasarlas extends javax.swing.JFrame {

    int dbOssz=0;
    int dbFelnott=0;
    int dbDiak=0;
    int dbCsoportos=0;
    int vegsoAr=0;
    int jegyAr=0;
    int tarlatAr=0;
    int jegyArFelnott=0;
    int jegyArDiak=0;
    int jegyArCsoportos=0;
    String tarlatIdo="";
    String osszegzes;
    String kiallitas="";
    String tarlat="";
    String jegyDiak="";
    String jegyCsoportos="";
    String jegyFelnott="";
    String darabFelnott="";
    String darabDiak="";
    String darabCsoportos="";
    String datum="";
    
    public MuzeumJegyVasarlas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlFejlec = new javax.swing.JPanel();
        lblCim = new javax.swing.JLabel();
        lblKep = new javax.swing.JLabel();
        lblKep2 = new javax.swing.JLabel();
        pnlFejlec1 = new javax.swing.JPanel();
        pnlKedvezmenyek = new javax.swing.JPanel();
        chkFelnott = new javax.swing.JCheckBox();
        chkDiak = new javax.swing.JCheckBox();
        chkCsoport = new javax.swing.JCheckBox();
        spnFelnott = new javax.swing.JSpinner();
        spnDiak = new javax.swing.JSpinner();
        spnCsoport = new javax.swing.JSpinner();
        pnlKiallitas = new javax.swing.JPanel();
        rbtSeuso = new javax.swing.JRadioButton();
        rbtMo = new javax.swing.JRadioButton();
        rbtKotar = new javax.swing.JRadioButton();
        rbtKelet = new javax.swing.JRadioButton();
        rbtPalota = new javax.swing.JRadioButton();
        rbtMuzeumkert = new javax.swing.JRadioButton();
        lblLink = new javax.swing.JLabel();
        cmbDatum = new javax.swing.JComboBox<>();
        lblVegosszeg = new javax.swing.JPanel();
        btnMegrendeles = new javax.swing.JButton();
        btnMegse = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOsszegzes = new javax.swing.JTextArea();
        lblOsszegzes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfVegosszeg = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        chkTarlat = new javax.swing.JCheckBox();
        lblTurnus = new javax.swing.JLabel();
        cmbTurnus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Múzeum Jegyvásárlás");
        setBackground(new java.awt.Color(255, 255, 255));

        pnlFejlec.setBackground(new java.awt.Color(239, 224, 203));
        pnlFejlec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlFejlec.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblCim.setFont(new java.awt.Font("Vivaldi", 0, 44)); // NOI18N
        lblCim.setText("Nemzeti Múzeum");

        lblKep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/oszlop.png"))); // NOI18N

        lblKep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/oszlop.png"))); // NOI18N

        javax.swing.GroupLayout pnlFejlecLayout = new javax.swing.GroupLayout(pnlFejlec);
        pnlFejlec.setLayout(pnlFejlecLayout);
        pnlFejlecLayout.setHorizontalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFejlecLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblKep)
                .addGap(35, 35, 35)
                .addComponent(lblCim)
                .addGap(35, 35, 35)
                .addComponent(lblKep2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFejlecLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblKep, lblKep2});

        pnlFejlecLayout.setVerticalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFejlecLayout.createSequentialGroup()
                .addGroup(pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblKep, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlFejlecLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(lblCim))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFejlecLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );

        pnlFejlecLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblKep, lblKep2});

        pnlFejlec1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlKedvezmenyek.setBorder(javax.swing.BorderFactory.createTitledBorder("Jegytípus"));

        chkFelnott.setText("Felnőtt ");
        chkFelnott.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkFelnottItemStateChanged(evt);
            }
        });
        chkFelnott.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkFelnottStateChanged(evt);
            }
        });

        chkDiak.setText("Diák- Nyugdíjas (50%)");
        chkDiak.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDiakItemStateChanged(evt);
            }
        });
        chkDiak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDiakActionPerformed(evt);
            }
        });

        chkCsoport.setText("Csoportos (15 fő felett)");
        chkCsoport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkCsoportItemStateChanged(evt);
            }
        });
        chkCsoport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCsoportActionPerformed(evt);
            }
        });

        spnFelnott.setModel(new javax.swing.SpinnerNumberModel(1, 1, 14, 1));
        spnFelnott.setEnabled(false);
        spnFelnott.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnFelnottStateChanged(evt);
            }
        });

        spnDiak.setModel(new javax.swing.SpinnerNumberModel(1, 1, 14, 1));
        spnDiak.setEnabled(false);
        spnDiak.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDiakStateChanged(evt);
            }
        });

        spnCsoport.setModel(new javax.swing.SpinnerNumberModel(15, 15, 35, 1));
        spnCsoport.setEnabled(false);
        spnCsoport.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCsoportStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlKedvezmenyekLayout = new javax.swing.GroupLayout(pnlKedvezmenyek);
        pnlKedvezmenyek.setLayout(pnlKedvezmenyekLayout);
        pnlKedvezmenyekLayout.setHorizontalGroup(
            pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKedvezmenyekLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKedvezmenyekLayout.createSequentialGroup()
                        .addComponent(chkDiak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKedvezmenyekLayout.createSequentialGroup()
                        .addComponent(chkCsoport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnCsoport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKedvezmenyekLayout.createSequentialGroup()
                        .addComponent(chkFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );

        pnlKedvezmenyekLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spnCsoport, spnDiak, spnFelnott});

        pnlKedvezmenyekLayout.setVerticalGroup(
            pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKedvezmenyekLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkFelnott)
                    .addComponent(spnFelnott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDiak)
                    .addComponent(spnDiak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlKedvezmenyekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCsoport)
                    .addComponent(spnCsoport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlKiallitas.setBorder(javax.swing.BorderFactory.createTitledBorder("Kiállítás"));

        buttonGroup1.add(rbtSeuso);
        rbtSeuso.setText("A Seuso-kincs");
        rbtSeuso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtSeusoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtMo);
        rbtMo.setText("Magyarország története");
        rbtMo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtMoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtKotar);
        rbtKotar.setText("Középkori kőtár");
        rbtKotar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtKotarItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtKelet);
        rbtKelet.setText("Kelet és Nyugat határán");
        rbtKelet.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtKeletItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbtPalota);
        rbtPalota.setText("Virtuális palota");
        rbtPalota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtPalotaItemStateChanged(evt);
            }
        });
        rbtPalota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPalotaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtMuzeumkert);
        rbtMuzeumkert.setText("A múzeumkert");
        rbtMuzeumkert.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtMuzeumkertItemStateChanged(evt);
            }
        });

        lblLink.setText("<html><a href=\"link\"> Kiállításainkról bővebben</a></html>");

        cmbDatum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Dátum-", "2023.11.19.", "2023.11.20.", "2023.11.21.", "2023.11.22.", "2023.11.23.", "2023.11.24.", "2023.11.25.", "2023.11.26.", "2023.11.27.", "2023.11.27.", "2023.11.28.", "2023.11.29.", "2023.11.30.", "2023.12.01.", "2023.12.02.", "2023.12.03.", "2023.12.04.", "2023.12.05.", "2023.12.06.", "2023.12.07.", "2023.12.08.", "2023.12.09.", "2023.12.10.", "2023.12.11.", "2023.12.12.", "2023.12.13.", "2023.12.14.", "2023.12.15." }));
        cmbDatum.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDatumItemStateChanged(evt);
            }
        });
        cmbDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKiallitasLayout = new javax.swing.GroupLayout(pnlKiallitas);
        pnlKiallitas.setLayout(pnlKiallitasLayout);
        pnlKiallitasLayout.setHorizontalGroup(
            pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKiallitasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtMo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKiallitasLayout.createSequentialGroup()
                        .addGroup(pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtKelet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlKiallitasLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKiallitasLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cmbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(pnlKiallitasLayout.createSequentialGroup()
                        .addGroup(pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbtPalota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtMuzeumkert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(rbtSeuso, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtKotar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlKiallitasLayout.setVerticalGroup(
            pnlKiallitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKiallitasLayout.createSequentialGroup()
                .addComponent(rbtSeuso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtKotar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtKelet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtPalota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtMuzeumkert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(cmbDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMegrendeles.setText("Megrendelés");
        btnMegrendeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMegrendelesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMegrendelesMouseExited(evt);
            }
        });
        btnMegrendeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegrendelesActionPerformed(evt);
            }
        });

        btnMegse.setText("Mégse");
        btnMegse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMegseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMegseMouseExited(evt);
            }
        });
        btnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegseActionPerformed(evt);
            }
        });

        txaOsszegzes.setColumns(20);
        txaOsszegzes.setRows(5);
        jScrollPane1.setViewportView(txaOsszegzes);

        lblOsszegzes.setText("Összegzés:");

        jLabel1.setText("Végösszeg:");

        txtfVegosszeg.setEditable(false);

        javax.swing.GroupLayout lblVegosszegLayout = new javax.swing.GroupLayout(lblVegosszeg);
        lblVegosszeg.setLayout(lblVegosszegLayout);
        lblVegosszegLayout.setHorizontalGroup(
            lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblVegosszegLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lblVegosszegLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblOsszegzes)
                        .addGroup(lblVegosszegLayout.createSequentialGroup()
                            .addComponent(btnMegrendeles, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        lblVegosszegLayout.setVerticalGroup(
            lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblVegosszegLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblOsszegzes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(lblVegosszegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMegrendeles)
                    .addComponent(btnMegse))
                .addContainerGap())
        );

        chkTarlat.setText("Tárlatvezetéssel");
        chkTarlat.setEnabled(false);
        chkTarlat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkTarlatItemStateChanged(evt);
            }
        });

        lblTurnus.setText("Turnus:");
        lblTurnus.setEnabled(false);

        cmbTurnus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12:00", "14:00", "16:00" }));
        cmbTurnus.setEnabled(false);
        cmbTurnus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTurnusItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkTarlat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblTurnus)
                .addGap(18, 18, 18)
                .addComponent(cmbTurnus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkTarlat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTurnus)
                    .addComponent(cmbTurnus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFejlec1Layout = new javax.swing.GroupLayout(pnlFejlec1);
        pnlFejlec1.setLayout(pnlFejlec1Layout);
        pnlFejlec1Layout.setHorizontalGroup(
            pnlFejlec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFejlec1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFejlec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFejlec1Layout.createSequentialGroup()
                        .addComponent(pnlKedvezmenyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFejlec1Layout.createSequentialGroup()
                        .addComponent(pnlKiallitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFejlec1Layout.setVerticalGroup(
            pnlFejlec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFejlec1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFejlec1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFejlec1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVegosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFejlec1Layout.createSequentialGroup()
                        .addComponent(pnlKiallitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlKedvezmenyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFejlec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlFejlec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFejlec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlFejlec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkCsoportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCsoportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkCsoportActionPerformed

    private void cmbDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDatumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDatumActionPerformed

    private void rbtPalotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPalotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtPalotaActionPerformed

    private void chkDiakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDiakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkDiakActionPerformed

    private void btnMegseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegseMouseEntered
        btnMegse.setText("MÉGSE");
    }//GEN-LAST:event_btnMegseMouseEntered

    private void btnMegrendelesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegrendelesMouseEntered
        btnMegrendeles.setText("MEGRENDELÉS");
    }//GEN-LAST:event_btnMegrendelesMouseEntered

    private void btnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMegseActionPerformed

    private void btnMegseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegseMouseExited
        btnMegse.setText("Mégse");
    }//GEN-LAST:event_btnMegseMouseExited

    private void btnMegrendelesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegrendelesMouseExited
        btnMegrendeles.setText("Megrendelés");
    }//GEN-LAST:event_btnMegrendelesMouseExited

    private void rbtSeusoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtSeusoItemStateChanged
        tarlatEnabled();
        kiallitas="A Seuso-kincs";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtSeusoItemStateChanged

    private void rbtMoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtMoItemStateChanged
        tarlatEnabled();
        kiallitas="Magyarország története";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtMoItemStateChanged

    private void rbtKotarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtKotarItemStateChanged
        tarlatEnabled();
        kiallitas="Középkori kőtár";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtKotarItemStateChanged

    private void rbtKeletItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtKeletItemStateChanged
        tarlatEnabled();
        kiallitas="Kelet és nyugat határán";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtKeletItemStateChanged

    private void rbtPalotaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtPalotaItemStateChanged
        tarlatEnabled();
        kiallitas="Virtuális palota";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtPalotaItemStateChanged

    private void rbtMuzeumkertItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtMuzeumkertItemStateChanged
        tarlatEnabled();
        kiallitas="A múzeumkert";
        osszegzesKiirasa();
    }//GEN-LAST:event_rbtMuzeumkertItemStateChanged

    private void chkFelnottItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkFelnottItemStateChanged
        if (chkFelnott.isSelected()){
            jegyArFelnott=4000;
            jegyFelnott=System.lineSeparator()+"- Felnőtt ";
            darabFelnott="1 db";
            spnFelnott.setEnabled(true);
        }else{
            jegyArFelnott=0;
            jegyFelnott="";
            darabFelnott="";
            spnFelnott.setEnabled(false);
        }
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_chkFelnottItemStateChanged

    private void chkDiakItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDiakItemStateChanged
        if (chkDiak.isSelected()){
            jegyDiak=System.lineSeparator()+"- Diák- Nyugdíjas ";
            darabDiak="1 db";
            spnDiak.setEnabled(true);
            jegyArDiak=2000;
        }else{
            jegyDiak="";
            darabDiak="";
            spnDiak.setEnabled(false);
            jegyArDiak=0;
        }
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_chkDiakItemStateChanged

    private void chkCsoportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkCsoportItemStateChanged
        if (chkCsoport.isSelected()){
            jegyCsoportos=System.lineSeparator()+"- Csoportos ";
            darabCsoportos="15 db";
            spnCsoport.setEnabled(true);
            jegyArCsoportos=1800*15;
        }else{
            jegyCsoportos="";
            darabCsoportos="";
            spnCsoport.setEnabled(false);
            jegyArCsoportos=0;
        }
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_chkCsoportItemStateChanged

    private void chkTarlatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkTarlatItemStateChanged
        if (chkTarlat.isSelected()){
            tarlat=System.lineSeparator()+"Tárlatvezetéssel (12:00)";
            tarlatAr+=2000;
            cmbTurnus.setEnabled(true);
            lblTurnus.setEnabled(true);
        }else{
            tarlat="";
            tarlatAr-=2000;
            cmbTurnus.setEnabled(false);
            lblTurnus.setEnabled(true);
        }
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_chkTarlatItemStateChanged

    private void btnMegrendelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegrendelesActionPerformed
        String cim = "FIGYELEM!";
        int ikonTipus = JOptionPane.INFORMATION_MESSAGE;//0
        JOptionPane.showMessageDialog(null,"Megrendelését befogadtuk!", cim, ikonTipus); 
        System.exit(0);
    }//GEN-LAST:event_btnMegrendelesActionPerformed

    private void cmbDatumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDatumItemStateChanged

        String datumIndex=cmbDatum.getModel().getSelectedItem().toString();
        
        datum=datumIndex;
        
        osszegzesKiirasa();
    }//GEN-LAST:event_cmbDatumItemStateChanged

    private void spnFelnottStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnFelnottStateChanged
        int dbSzam= spnFelnott.getModel().getValue().hashCode();
        darabFelnott=dbSzam+" db";
        jegyArFelnott=4000*dbSzam;
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_spnFelnottStateChanged

    private void chkFelnottStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkFelnottStateChanged

    }//GEN-LAST:event_chkFelnottStateChanged

    private void spnDiakStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDiakStateChanged
        int dbSzam= spnDiak.getModel().getValue().hashCode();
        darabDiak=dbSzam+" db";
        jegyArDiak=2000*dbSzam;
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_spnDiakStateChanged

    private void spnCsoportStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCsoportStateChanged
        int dbSzam= spnCsoport.getModel().getValue().hashCode();
        darabCsoportos=dbSzam+" db";
        jegyArCsoportos=1800*dbSzam;    
        osszegzesKiirasa();
        vegosszegKiirasa();
    }//GEN-LAST:event_spnCsoportStateChanged

    private void cmbTurnusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTurnusItemStateChanged
        tarlatIdo= cmbTurnus.getSelectedItem().toString();
        tarlat=System.lineSeparator()+"Tárlatvezetéssel ("+tarlatIdo+")";
        osszegzesKiirasa();
    }//GEN-LAST:event_cmbTurnusItemStateChanged

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
            java.util.logging.Logger.getLogger(MuzeumJegyVasarlas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MuzeumJegyVasarlas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MuzeumJegyVasarlas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MuzeumJegyVasarlas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MuzeumJegyVasarlas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegrendeles;
    private javax.swing.JButton btnMegse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkCsoport;
    private javax.swing.JCheckBox chkDiak;
    private javax.swing.JCheckBox chkFelnott;
    private javax.swing.JCheckBox chkTarlat;
    private javax.swing.JComboBox<String> cmbDatum;
    private javax.swing.JComboBox<String> cmbTurnus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCim;
    private javax.swing.JLabel lblKep;
    private javax.swing.JLabel lblKep2;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblOsszegzes;
    private javax.swing.JLabel lblTurnus;
    private javax.swing.JPanel lblVegosszeg;
    private javax.swing.JPanel pnlFejlec;
    private javax.swing.JPanel pnlFejlec1;
    private javax.swing.JPanel pnlKedvezmenyek;
    private javax.swing.JPanel pnlKiallitas;
    private javax.swing.JRadioButton rbtKelet;
    private javax.swing.JRadioButton rbtKotar;
    private javax.swing.JRadioButton rbtMo;
    private javax.swing.JRadioButton rbtMuzeumkert;
    private javax.swing.JRadioButton rbtPalota;
    private javax.swing.JRadioButton rbtSeuso;
    private javax.swing.JSpinner spnCsoport;
    private javax.swing.JSpinner spnDiak;
    private javax.swing.JSpinner spnFelnott;
    private javax.swing.JTextArea txaOsszegzes;
    private javax.swing.JTextField txtfVegosszeg;
    // End of variables declaration//GEN-END:variables
private void tarlatEnabled() {
        if (rbtKelet.isSelected() || rbtKotar.isSelected() || rbtMo.isSelected() || rbtMuzeumkert.isSelected() || rbtPalota.isSelected()|| rbtSeuso.isSelected()){
            chkTarlat.setEnabled(true);
        }
    }
private void osszegzesKiirasa(){
        String jegyek="Jegyek: "+jegyFelnott+darabFelnott+ jegyDiak+darabDiak+jegyCsoportos+darabCsoportos;
        osszegzes = "Kiállítás: "+kiallitas+System.lineSeparator()+"Dátum: "+datum+System.lineSeparator()+ jegyek + tarlat;
        txaOsszegzes.setText(osszegzes);
    }
private void vegosszegKiirasa(){
        jegyAr=jegyArDiak+jegyArFelnott+jegyArCsoportos;
        vegsoAr = jegyAr + tarlatAr;
        System.out.println(vegsoAr);
        txtfVegosszeg.setText(vegsoAr+" Ft");
}

}
