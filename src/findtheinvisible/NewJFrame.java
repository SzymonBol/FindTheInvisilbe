package findtheinvisible;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.Random;
import java.util.TimerTask;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.Timer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

/**
 * główne okno w którym jest gra
 * @author REDBUL
 */
public class NewJFrame extends javax.swing.JFrame {

    /** etykieta w której będzie szukany obraz */
    JLabel find=new JLabel();
    /**rozmiar szukanego obrazu */
    int a;
    /**współrzędna x szukanego obrazu*/
    int x;
    /**współrzędna y szukanego obrau*/
    int y;
    /**zmienna sterująca komunikatem o dźwięku*/ 
    boolean first=true;
    /**nazwa pliku z dzwiękiem*/
    String sound;
    /** współrzędna x myszki */
    double xm;
    /** współrzędna y myszki */
    double ym;
    /** liczy sekundy rozgrywki */
    int sec;
    /** ustawia głośność dzwięku */
    int l;
    /** współrzędna x obiektu */
    int xo;
    /** współrzędna y obiektu */
    int yo;
    /** zmienna sterująca kiedy dźwięk ma być odtwarzany */
    boolean end=false; 

     /**
     * Kreator formy Frame
     */
    public NewJFrame() {
        initComponents();
         
        
        find.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                findMousePressed(evt);
            }
        });
        

        
        Toolkit tk=getToolkit();
        Dimension size=tk.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
        cowrb.setVisible(false);
        sheeprb.setVisible(false);
        catrb.setVisible(false);
        maklrb.setVisible(false);
        easyrb.setVisible(false);
        mediumrb.setVisible(false);
        hardrb.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Pheader = new javax.swing.JPanel();
        Lheader = new javax.swing.JLabel();
        exit1but = new javax.swing.JButton();
        Pobject = new javax.swing.JPanel();
        cowrb = new javax.swing.JRadioButton();
        sheeprb = new javax.swing.JRadioButton();
        catrb = new javax.swing.JRadioButton();
        maklrb = new javax.swing.JRadioButton();
        Pcow = new javax.swing.JPanel();
        Lcow = new javax.swing.JLabel();
        Pcat = new javax.swing.JPanel();
        Lcat = new javax.swing.JLabel();
        Psheep = new javax.swing.JPanel();
        Lsheep = new javax.swing.JLabel();
        Pmakl = new javax.swing.JPanel();
        Lmakl = new javax.swing.JLabel();
        level = new javax.swing.JPanel();
        Llevel = new javax.swing.JLabel();
        easyrb = new javax.swing.JRadioButton();
        mediumrb = new javax.swing.JRadioButton();
        hardrb = new javax.swing.JRadioButton();
        Peasy = new javax.swing.JPanel();
        Leasy = new javax.swing.JLabel();
        Pmedium = new javax.swing.JPanel();
        Lmedium = new javax.swing.JLabel();
        Phard = new javax.swing.JPanel();
        Lhard = new javax.swing.JLabel();
        Lchose = new javax.swing.JLabel();
        start = new javax.swing.JPanel();
        startbut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        exit2but = new javax.swing.JButton();
        Lcongrat = new javax.swing.JLabel();
        Lyfind = new javax.swing.JLabel();
        Lend = new javax.swing.JLabel();
        againbut = new javax.swing.JButton();
        menubut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        background.setLayout(new java.awt.CardLayout());

        Lheader.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lheader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lheader.setText("Find the invisible...");

        exit1but.setBackground(new java.awt.Color(255, 51, 51));
        exit1but.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        exit1but.setText("Exit");
        exit1but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1butActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PheaderLayout = new javax.swing.GroupLayout(Pheader);
        Pheader.setLayout(PheaderLayout);
        PheaderLayout.setHorizontalGroup(
            PheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PheaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lheader, javax.swing.GroupLayout.PREFERRED_SIZE, 1142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit1but, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PheaderLayout.setVerticalGroup(
            PheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lheader)
            .addComponent(exit1but)
        );

        Pobject.setMaximumSize(new java.awt.Dimension(200, 200));
        Pobject.setMinimumSize(new java.awt.Dimension(200, 200));
        Pobject.setPreferredSize(new java.awt.Dimension(200, 200));

        buttonGroup1.add(cowrb);

        buttonGroup1.add(sheeprb);

        buttonGroup1.add(catrb);

        buttonGroup1.add(maklrb);

        Lcow.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lcow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lcow.setText("COW");
        Lcow.setMaximumSize(new java.awt.Dimension(200, 200));
        Lcow.setMinimumSize(new java.awt.Dimension(200, 200));
        Lcow.setPreferredSize(new java.awt.Dimension(200, 200));
        Lcow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LcowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LcowMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LcowMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PcowLayout = new javax.swing.GroupLayout(Pcow);
        Pcow.setLayout(PcowLayout);
        PcowLayout.setHorizontalGroup(
            PcowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PcowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PcowLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lcow, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PcowLayout.setVerticalGroup(
            PcowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PcowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PcowLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lcow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Lcat.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lcat.setText("CAT");
        Lcat.setMaximumSize(new java.awt.Dimension(200, 200));
        Lcat.setMinimumSize(new java.awt.Dimension(200, 200));
        Lcat.setPreferredSize(new java.awt.Dimension(200, 200));
        Lcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LcatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LcatMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LcatMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PcatLayout = new javax.swing.GroupLayout(Pcat);
        Pcat.setLayout(PcatLayout);
        PcatLayout.setHorizontalGroup(
            PcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PcatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lcat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PcatLayout.setVerticalGroup(
            PcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PcatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lcat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Lsheep.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lsheep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lsheep.setText("SHEEP");
        Lsheep.setMaximumSize(new java.awt.Dimension(200, 200));
        Lsheep.setMinimumSize(new java.awt.Dimension(200, 200));
        Lsheep.setPreferredSize(new java.awt.Dimension(200, 200));
        Lsheep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LsheepMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LsheepMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LsheepMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PsheepLayout = new javax.swing.GroupLayout(Psheep);
        Psheep.setLayout(PsheepLayout);
        PsheepLayout.setHorizontalGroup(
            PsheepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
            .addGroup(PsheepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PsheepLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lsheep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PsheepLayout.setVerticalGroup(
            PsheepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
            .addGroup(PsheepLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PsheepLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lsheep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Lmakl.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lmakl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lmakl.setText("Maklowicz");
        Lmakl.setMaximumSize(new java.awt.Dimension(200, 200));
        Lmakl.setMinimumSize(new java.awt.Dimension(200, 200));
        Lmakl.setPreferredSize(new java.awt.Dimension(200, 200));
        Lmakl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LmaklMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LmaklMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LmaklMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PmaklLayout = new javax.swing.GroupLayout(Pmakl);
        Pmakl.setLayout(PmaklLayout);
        PmaklLayout.setHorizontalGroup(
            PmaklLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(PmaklLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PmaklLayout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(Lmakl, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PmaklLayout.setVerticalGroup(
            PmaklLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 126, Short.MAX_VALUE)
            .addGroup(PmaklLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PmaklLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lmakl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PobjectLayout = new javax.swing.GroupLayout(Pobject);
        Pobject.setLayout(PobjectLayout);
        PobjectLayout.setHorizontalGroup(
            PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PobjectLayout.createSequentialGroup()
                .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PobjectLayout.createSequentialGroup()
                        .addComponent(cowrb)
                        .addGap(0, 0, 0)
                        .addComponent(sheeprb)
                        .addGap(0, 0, 0)
                        .addComponent(catrb)
                        .addGap(0, 0, 0)
                        .addComponent(maklrb))
                    .addGroup(PobjectLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pcow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PobjectLayout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(Pmakl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(PobjectLayout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(Psheep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(304, 304, 304))
        );
        PobjectLayout.setVerticalGroup(
            PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PobjectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cowrb)
                    .addComponent(sheeprb)
                    .addComponent(catrb)
                    .addComponent(maklrb))
                .addGap(49, 49, 49)
                .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Psheep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pcow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(PobjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pmakl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        level.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Llevel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Llevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Llevel.setText("Level:");

        buttonGroup2.add(easyrb);

        buttonGroup2.add(mediumrb);
        mediumrb.setText("jRadioButton5");

        buttonGroup2.add(hardrb);
        hardrb.setText("jRadioButton5");

        Leasy.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Leasy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Leasy.setText("Easy");
        Leasy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LeasyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LeasyMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LeasyMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PeasyLayout = new javax.swing.GroupLayout(Peasy);
        Peasy.setLayout(PeasyLayout);
        PeasyLayout.setHorizontalGroup(
            PeasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
            .addGroup(PeasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PeasyLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(Leasy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PeasyLayout.setVerticalGroup(
            PeasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
            .addGroup(PeasyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PeasyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Leasy, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Lmedium.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lmedium.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lmedium.setText("Medium");
        Lmedium.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LmediumMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LmediumMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LmediumMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PmediumLayout = new javax.swing.GroupLayout(Pmedium);
        Pmedium.setLayout(PmediumLayout);
        PmediumLayout.setHorizontalGroup(
            PmediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(PmediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PmediumLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(Lmedium, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PmediumLayout.setVerticalGroup(
            PmediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
            .addGroup(PmediumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PmediumLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lmedium, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Lhard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Lhard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lhard.setText("Hard");
        Lhard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LhardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LhardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LhardMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PhardLayout = new javax.swing.GroupLayout(Phard);
        Phard.setLayout(PhardLayout);
        PhardLayout.setHorizontalGroup(
            PhardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(PhardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PhardLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(Lhard, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PhardLayout.setVerticalGroup(
            PhardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
            .addGroup(PhardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PhardLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Lhard, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Lchose.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        Lchose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout levelLayout = new javax.swing.GroupLayout(level);
        level.setLayout(levelLayout);
        levelLayout.setHorizontalGroup(
            levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelLayout.createSequentialGroup()
                .addComponent(easyrb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mediumrb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hardrb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lchose, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(levelLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(Peasy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193)
                .addComponent(Pmedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(Phard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Llevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        levelLayout.setVerticalGroup(
            levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(levelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Llevel)
                .addGap(18, 18, 18)
                .addGroup(levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(levelLayout.createSequentialGroup()
                        .addGroup(levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Peasy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pmedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Phard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(levelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(easyrb)
                            .addComponent(mediumrb)
                            .addComponent(hardrb)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, levelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Lchose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        startbut.setBackground(new java.awt.Color(153, 255, 153));
        startbut.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        startbut.setText("START");
        startbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startbutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startbutMouseExited(evt);
            }
        });
        startbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startbut, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startbut, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pheader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pobject, javax.swing.GroupLayout.DEFAULT_SIZE, 1372, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(level, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Pheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pobject, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1396, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );

        background.add(jPanel2, "card3");

        exit2but.setBackground(new java.awt.Color(255, 51, 51));
        exit2but.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        exit2but.setText("Exit");
        exit2but.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit2butActionPerformed(evt);
            }
        });

        Lcongrat.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        Lcongrat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lcongrat.setText("Congratulations!");

        Lyfind.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        Lyfind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lyfind.setText("You found....");

        againbut.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        againbut.setText("Play again");
        againbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                againbutActionPerformed(evt);
            }
        });

        menubut.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        menubut.setText("Menu");
        menubut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lcongrat, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lyfind, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(150, 458, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(againbut, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(menubut, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(619, 619, 619))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit2but, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Lend, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(547, 547, 547))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(exit2but)
                .addGap(39, 39, 39)
                .addComponent(Lcongrat, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Lyfind, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Lend, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(againbut, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menubut, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        background.add(jPanel3, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * zamiana między panelami
     * @param p panel na który ma być zamieniony 
     */
       public void zamien(JPanel p){
        background.removeAll();
        background.repaint();
        background.revalidate();
        
        background.add(p);
        background.repaint();
        background.revalidate();
    }
    /**
     * ustawia szare tło po najechaniu kursorem na panel
     * @param p wskazuje który panel
     */
       public void setcolor(JPanel p){
           p.setBackground(new Color(150,150,150));
       }
       /**
        * przywraca domyślny kolor po wyjściu kursora z panelu
        * @param p wskazuje który panel
        */
       public void resetcolor(JPanel p){
           p.setBackground(new Color(240,240,240));
       }
       /**
        * tworzy obramowanie wybranej etykiety 
        * @param lab wskazuje etykietę
        */
       public void bord(JLabel lab)
       {
           lab.setBorder(BorderFactory.createLineBorder(Color.black));
       }
       /**
        * odznacza pozostałe opcje przy wyborze obiketu po wybraniu innej opcji
        * @param lab1 wskazuje pierwszą etykietę do odznaczenia
        * @param lab2 wskazuje drugą etykietę do odznaczenia
        * @param lab3 wskazuje trzecią etykietę do odznaczenia
        */
       public void unbord(JLabel lab1, JLabel lab2 ,JLabel lab3)
       {
           lab1.setBorder(null);
           lab2.setBorder(null);
           lab3.setBorder(null);
       }
        /**
        * odznacza pozostałe opcje przy wyborze poziomu po wybraniu innej opcji
        * @param lab1 wskazuje pierwszą etykietę do odznaczenia
        * @param lab2 wskazuje drugą etykietę do odznaczenia
        */     
       public void unbord(JLabel lab1, JLabel lab2)
       {
           lab1.setBorder(null);
           lab2.setBorder(null);
       }
       /**
        * metoda po odnalezieniu obiektu
        * @param evt zmienna listenera myszki
        */
       private void findMousePressed(java.awt.event.MouseEvent evt){
           String img,ia;

           int sec2=sec*6/10;
            String secs=Integer.toString(sec2); 
            //jLabel1.setText(secs);
           if(cowrb.isSelected()){
               ia="kr";
               Lyfind.setText("You found the cow in " +secs+" seconds!");
           }   
           else if(catrb.isSelected()){
               ia="ct";
                Lyfind.setText("You found the cat "+secs+" seconds!");
           }
               
           else if(sheeprb.isSelected()){
                   ia="sh";
                   Lyfind.setText("You found the sheep in "+secs+" seconds");
                   }
               
           else {
                   ia="mk";
                   Lyfind.setText("You found the Maklowicz in "+secs+" seconds");
                   }
           ImageIcon img2 = new ImageIcon(getClass().getResource("/findtheinvisible/res/"+ia+".png"));
           Lend.setIcon(img2);

            end=true;
        zamien(jPanel3);
    }
       /**
        * ustala wielkość obrazu we wzglęgu na wybraną opcję
        * @return zwraca wielkość obrazu w px
        */
       private int setlvl(){
           if(easyrb.isSelected())
           return 150;
           else if (mediumrb.isSelected())
               return 100;
           else
               return 50;
       }
       /**
        * losuje w którym miejscu ma się znaleźć obraz
        */
       private void setcord(){
           Random rand=new Random();
           x=rand.nextInt(1250);
           y=rand.nextInt(750);
       }
       /**
        * wybór dźwięku na koniec
        * @return zwraca nazwę pliku który ma zostać odtworzony na końcu
        */
       private String ending(){
           if(cowrb.isSelected()){
               return "muuu.wav";
           }   
           else if(catrb.isSelected()){
               return "meeow.wav";
           }
               
           else if(sheeprb.isSelected()){
                  return "meee.wav";
                   }
               
           else {
               return "banany.wav";
                   }
       }
       /**
        * ustawia lub reseteuje parametry obrazu i dźwięku
        */
       private void newgame(){
           sec=0;
            a=setlvl();
            setcord();
            find.setBounds(x, y, a, a); 
            ImageIcon img1 = new ImageIcon(getClass().getResource("/findtheinvisible/res/wh.png"), "");
            find.setIcon(img1);
            xo=x+a/2;
            yo= y+a/2;
            end=false;
            jPanel2.add(find);
            
            Timer s= new Timer();
            TimerTask task=new TimerTask(){
            public void run(){
    
            if(!end){
            sec++;
            double c=Math.sqrt((xo-xm)*(xo-xm)+(yo-ym)*(yo-ym));
            if(c<=75) l=-1;
            else if(c<=125) l=-5;
            else if (c<=200) l=-10;
            else if(c<340) l=-15;
            else if (c<=450) l=-20;
            else if(c<=700) l=-30;
            else l=-40;
        try{  
            AudioInputStream ais =AudioSystem.getAudioInputStream(this.getClass().getResource("/findtheinvisible/res/"+sound));
            AudioFormat format= ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            FloatControl gainControl=(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(l);
            clip.start(); 
            }
        catch(Exception e){
            e.printStackTrace();
            }  
            }
        else
        {
            String last;
            last=ending();
            try{  
            AudioInputStream ais =AudioSystem.getAudioInputStream(this.getClass().getResource("/findtheinvisible/res/"+ending()));
            AudioFormat format= ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            FloatControl gainControl=(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(l);
            clip.start(); 
            }
        catch(Exception e){
            e.printStackTrace();
            }  
            s.cancel();
            s.purge();
            return;
        }
       
        }
    };
            
        s.schedule(task,0,600);
       }
       
       
       /**
        * przechodzi z menu do gry
        * @param evt zmienna listenera myszki
        */
    private void startbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbutActionPerformed
        if((easyrb.isSelected() || mediumrb.isSelected() || hardrb.isSelected()) && (cowrb.isSelected() || catrb.isSelected() || sheeprb.isSelected() || maklrb.isSelected()))
        {
            if(first)
            {JOptionPane.showMessageDialog(null,"Turn on the sound!");
            first=false;
            }
            if(cowrb.isSelected()){
               sound="mu1.wav";
               
            }
           else if(catrb.isSelected()){
               sound="meow1.wav";
              
           }
               
           else if(sheeprb.isSelected()){
               sound="me1.wav";
               
           }
               
           else {
               sound="ee2.wav";
               
           }
            newgame();
            zamien(jPanel2);
            
        }

         
    }//GEN-LAST:event_startbutActionPerformed
    /**
     * ustawia szare tło polu "cow" w menu po najechaniu kursora 
     * @param evt zmienna listenera myszki
     */
    private void LcowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcowMouseEntered
        setcolor(Pcow);
    }//GEN-LAST:event_LcowMouseEntered
    /**
     * usuwa szare tło po opuszczeniu kursora z pola "cow"
     * @param evt zmienna listenera myszki
     */
    private void LcowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcowMouseExited
        resetcolor(Pcow);
    }//GEN-LAST:event_LcowMouseExited
    /**
     * zaznacza pole "cow" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LcowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcowMousePressed
        unbord(Lsheep,Lmakl,Lcat);
        bord(Lcow);
        cowrb.setSelected(true);
    }//GEN-LAST:event_LcowMousePressed
     /**
     * ustawia szare tło polu "sheep" w menu po najechaniu kursora 
     * @param evt zmienna listenera myszki
     */
    private void LsheepMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LsheepMouseEntered
        setcolor(Psheep);
    }//GEN-LAST:event_LsheepMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "sheep" 
     * @param evt zmienna listenera myszki
     */
    private void LsheepMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LsheepMouseExited
        resetcolor(Psheep);
    }//GEN-LAST:event_LsheepMouseExited
    /**
     * zaznacza pole "sheep" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LsheepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LsheepMousePressed
        unbord(Lcow,Lmakl,Lcat);
        bord(Lsheep);
        sheeprb.setSelected(true);
    }//GEN-LAST:event_LsheepMousePressed
    /**
     * ustawia szare tło polu "cat" w menu po najechaniu kursora 
     * @param evt zmienna listenera myszki
     */
    private void LcatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcatMouseEntered
        setcolor(Pcat);
    }//GEN-LAST:event_LcatMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "cat" 
     * @param evt zmienna listenera myszki
     */
    private void LcatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcatMouseExited
        resetcolor(Pcat);
    }//GEN-LAST:event_LcatMouseExited
    /**
     * zaznacza pole "cat" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LcatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcatMousePressed
        unbord(Lsheep,Lmakl,Lcow);
        bord(Lcat);
        catrb.setSelected(true);
    }//GEN-LAST:event_LcatMousePressed
    /**
     * ustawia szare tło polu "maklowicz" w menu po najechaniu kursora 
     * @param evt zmienna listenera myszki
     */
    private void LmaklMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmaklMouseEntered
       setcolor(Pmakl);
    }//GEN-LAST:event_LmaklMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "maklowicz" 
     * @param evt zmienna listenera myszki
     */
    private void LmaklMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmaklMouseExited
        resetcolor(Pmakl);
    }//GEN-LAST:event_LmaklMouseExited
    /**
     * zaznacza pole "maklowicz" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LmaklMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmaklMousePressed
        unbord(Lsheep,Lcow,Lcat);
        bord(Lmakl);
        maklrb.setSelected(true);
    }//GEN-LAST:event_LmaklMousePressed
    /**
     * wychodzi z gry
     * @param evt zmienna listenera myszki
     */
    private void exit1butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1butActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit1butActionPerformed
    /**
     * ustawia szare tło polu "easy" w menu po najechaniu kursora
     * @param evt zmienna listenera myszki
     */
    private void LeasyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeasyMouseEntered
        setcolor(Peasy);
    }//GEN-LAST:event_LeasyMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "easy" 
     * @param evt zmienna listenera myszki
     */
    private void LeasyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeasyMouseExited
        resetcolor(Peasy);
    }//GEN-LAST:event_LeasyMouseExited
     /**
     * zaznacza pole "easy" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LeasyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeasyMousePressed
        unbord(Lhard,Lmedium);
        bord(Leasy);
        easyrb.setSelected(true);
    }//GEN-LAST:event_LeasyMousePressed
    /**
     * ustawia szare tło polu "medium" w menu po najechaniu kursora
     * @param evt zmienna listenera myszki
     */
    private void LmediumMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmediumMouseEntered
        setcolor(Pmedium);
    }//GEN-LAST:event_LmediumMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "medium" 
     * @param evt zmienna listenera myszki
     */
    private void LmediumMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmediumMouseExited
        resetcolor(Pmedium);
    }//GEN-LAST:event_LmediumMouseExited
     /**
     * zaznacza pole "medium" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LmediumMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LmediumMousePressed
        unbord(Lhard,Leasy);
        bord(Lmedium);
        mediumrb.setSelected(true);
    }//GEN-LAST:event_LmediumMousePressed
    /**
     * ustawia szare tło polu "hard" w menu po najechaniu kursora
     * @param evt zmienna listenera myszki
     */
    private void LhardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LhardMouseEntered
        setcolor(Phard);
    }//GEN-LAST:event_LhardMouseEntered
     /**
     * usuwa szare tło po opuszczeniu kursora z pola "hard" 
     * @param evt zmienna listenera myszki
     */
    private void LhardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LhardMouseExited
        resetcolor(Phard);
    }//GEN-LAST:event_LhardMouseExited
     /**
     * zaznacza pole "hard" po kliknięciu
     * @param evt zmienna listenera myszki
     */
    private void LhardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LhardMousePressed
        unbord(Leasy,Lmedium);
        bord(Lhard);
        hardrb.setSelected(true);
    }//GEN-LAST:event_LhardMousePressed
    /**
     * wychodzi z gry
     * @param evt zmienna listenera myszki
     */
    private void exit2butActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit2butActionPerformed
        this.dispose();
    }//GEN-LAST:event_exit2butActionPerformed
    /**
     * przycisk który przchodzi do menu
     * @param evt zmienna listenera myszki
     */
    private void menubutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubutActionPerformed
        zamien(jPanel1);
    }//GEN-LAST:event_menubutActionPerformed
    /**
     * przycisk aby zagrać jeszcze raz
     * @param evt zmienna listenera myszki
     */
    private void againbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_againbutActionPerformed
        newgame();
        zamien(jPanel2);
    }//GEN-LAST:event_againbutActionPerformed
    /**
     * przycisk rozpoczynający grę
     * @param evt zmienna listenera myszki
     */
    private void startbutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbutMouseEntered
        if(!easyrb.isSelected() && !mediumrb.isSelected() && !hardrb.isSelected() && !cowrb.isSelected() && !catrb.isSelected() && !sheeprb.isSelected() && !maklrb.isSelected())
        {Lchose.setText("Select object and level!");
         bord(Lchose);
        }
        else if(!easyrb.isSelected() && !mediumrb.isSelected() && !hardrb.isSelected())
        {Lchose.setText("Select level!");
        bord(Lchose);
        }
        else if(!cowrb.isSelected() && !catrb.isSelected() && !sheeprb.isSelected() && !maklrb.isSelected())
        {Lchose.setText("Select object to find!");
        bord(Lchose);
        }
        

        
    }//GEN-LAST:event_startbutMouseEntered
    /**
     * po wyjściu kursora z przycisku usuwa ewentualny komunikat
     * @param evt zmienna listenera myszki
     */
    private void startbutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startbutMouseExited
            Lchose.setText(" ");
            Lchose.setBorder(null);
    }//GEN-LAST:event_startbutMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed
    /**
    * pobiera współrzędne kursora podczas ruchu
    * @param evt zmienna listenera myszki
    */
    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        xm=evt.getX();
        ym=evt.getY();
        
        evt.consume();
    }//GEN-LAST:event_jPanel2MouseMoved

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    /**etykieta do wyboru objektu kota*/
    private javax.swing.JLabel Lcat;
    /**ewentualny komunikat o błędzie*/
    private javax.swing.JLabel Lchose;
    /** Napis "congratulations"*/
    private javax.swing.JLabel Lcongrat;
    /**etykieta do wyboru objektu krowy*/
    private javax.swing.JLabel Lcow;
    /**etykieta do wyboru poziomu łatwego*/
    private javax.swing.JLabel Leasy;
    /**miejsce na Pobject obiektu który został odnaleziony */
    private javax.swing.JLabel Lend;
    /**etykieta do wyboru poziomu trudnego*/
    private javax.swing.JLabel Lhard;
    /**nagłówek*/
    private javax.swing.JLabel Lheader;
    /**napis "Level:"*/
    private javax.swing.JLabel Llevel;
    /**etykieta do wyboru objektu Makłowicza*/
    private javax.swing.JLabel Lmakl;
    /**etykieta do wyboru poziomu średnioego*/
    private javax.swing.JLabel Lmedium;
    /**etykieta do wyboru objektu owcy*/
    private javax.swing.JLabel Lsheep;
    /** informacja jaki obkiet został odnaleziony i w jakim czasie */
    private javax.swing.JLabel Lyfind;
    /**tło etykiety "cat"*/
    private javax.swing.JPanel Pcat;
    /**tło etykiety "cow"*/
    private javax.swing.JPanel Pcow;
    /**tło etykiety "easy"*/
    private javax.swing.JPanel Peasy;
    /**tło etykiety "hard"*/
    private javax.swing.JPanel Phard;
    /**miejsce na nagłówek*/
    private javax.swing.JPanel Pheader;
    /**tło etykiety "maklowicz"*/
    private javax.swing.JPanel Pmakl;
    /**tło etykiety "medium"*/
    private javax.swing.JPanel Pmedium;
    /**miejsce na wybór objektu który będziemy szukać*/
    private javax.swing.JPanel Pobject;
    /**tło etykiety "sheep"*/
    private javax.swing.JPanel Psheep;
    /**przycisk aby zagrać ponownie*/
    private javax.swing.JButton againbut;
    /**panel na którym są wyświetlane pozostałe komponenty*/
    private javax.swing.JPanel background;
    /**grupa przycisków do wyboru obiektu */
    private javax.swing.ButtonGroup buttonGroup1;
    /**grupa przycisków do wyboru poziomu trudności */
    private javax.swing.ButtonGroup buttonGroup2;
    /**niewidoczny przycisk zaznaczający opcję "cat"*/
    private javax.swing.JRadioButton catrb;
    /**niewidoczny przycisk zaznaczający opcję "cow"*/
    private javax.swing.JRadioButton cowrb;
    /**niewidoczny przycisk zaznaczający poziomu trudności "easy"*/
    private javax.swing.JRadioButton easyrb;
    /**przycisk wyjścia z gry*/
    private javax.swing.JButton exit1but;
    /**przycisk wyjścia */
    private javax.swing.JButton exit2but;
    /**niewidoczny przycisk zaznaczający poziomu trudności "hard"*/
    private javax.swing.JRadioButton hardrb;
    /**panel do wyboru obiektu i poziomu trudności*/
    private javax.swing.JPanel jPanel1;
    /**panel na którym szukany jest obiekt*/
    private javax.swing.JPanel jPanel2;
    /**panel po odnalezieniu obiektu*/
    private javax.swing.JPanel jPanel3;
    /**panel do wyboru poziomu trudności*/
    private javax.swing.JPanel level;
    /**niewidoczny przycisk zaznaczający opcję "maklowicz"*/
    private javax.swing.JRadioButton maklrb;
    /**niewidoczny przycisk zaznaczający poziomu trudności "medium"*/
    private javax.swing.JRadioButton mediumrb;
    /**przycisk aby przejść do menu*/
    private javax.swing.JButton menubut;
    /**niewidoczny przycisk zaznaczający opcję "sheep"*/
    private javax.swing.JRadioButton sheeprb;
    /**panel na przycisk "start"*/
    private javax.swing.JPanel start;
    /**przycisk start, rozpoczynający grę*/
    private javax.swing.JButton startbut;
    // End of variables declaration//GEN-END:variables
}

