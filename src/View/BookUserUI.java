
package View;


import Controllers.BookCON;
import Ex.DuplicateException;
import Model.Book;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import View.SettingsUI;
import Model.Member;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BookUserUI extends javax.swing.JFrame{
        private static Member member;
        private static Book book;
        private BookCON tBookCON = new BookCON();
     public void close(){
        
        WindowEvent winClosingEvent=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }
     
     
    public BookUserUI(Member member) {
        
        //αρχικοποίηση βιβλίων
        initComponents();
        this.member=member;
        System.out.println(member.toString());
        img1.setIcon(ipretend);
        img2.setIcon(i2030);
        img3.setIcon(irye);
        img4.setIcon(imatter);
        img5.setIcon(icornball);
        img6.setIcon(isick);
        titlosimg1.setText("Let's pretend it never happened.");
        timiimg1.setText("15.99");
        titlosimg2.setText("2030");
        timiimg2.setText("10.50");
        titlosimg3.setText("Catcher in the Rye.");
        timiimg3.setText("23.99");
        titlosimg4.setText("One day We'll matter.");
        timiimg4.setText("18.99");
        titlosimg5.setText("American Cornball.");
        timiimg5.setText("9.99");
        titlosimg6.setText("Sick in the Head.");
        timiimg6.setText("16.99");      
        
    }
    
     public void setMember(Member member) {
        this.member = member;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        comedy = new javax.swing.JRadioButton();
        thriller = new javax.swing.JRadioButton();
        psycho = new javax.swing.JRadioButton();
        prog = new javax.swing.JRadioButton();
        poetry = new javax.swing.JRadioButton();
        scifi = new javax.swing.JRadioButton();
        fantasy = new javax.swing.JRadioButton();
        history = new javax.swing.JRadioButton();
        crime = new javax.swing.JRadioButton();
        romance = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bookcatname = new javax.swing.JLabel();
        titlosimg1 = new javax.swing.JLabel();
        timiimg1 = new javax.swing.JLabel();
        titlosimg2 = new javax.swing.JLabel();
        timiimg2 = new javax.swing.JLabel();
        titlosimg3 = new javax.swing.JLabel();
        timiimg3 = new javax.swing.JLabel();
        titlosimg4 = new javax.swing.JLabel();
        timiimg4 = new javax.swing.JLabel();
        titlosimg5 = new javax.swing.JLabel();
        timiimg5 = new javax.swing.JLabel();
        titlosimg6 = new javax.swing.JLabel();
        timiimg6 = new javax.swing.JLabel();
        img1cart = new javax.swing.JButton();
        img1fave = new javax.swing.JButton();
        img2cart = new javax.swing.JButton();
        img2fave = new javax.swing.JButton();
        img3cart = new javax.swing.JButton();
        img3fave = new javax.swing.JButton();
        img4cart = new javax.swing.JButton();
        img4fave = new javax.swing.JButton();
        img5cart = new javax.swing.JButton();
        img5fave = new javax.swing.JButton();
        img6cart = new javax.swing.JButton();
        img6fave = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        settingbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Categories");

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        buttonGroup1.add(comedy);
        comedy.setForeground(new java.awt.Color(255, 255, 255));
        comedy.setSelected(true);
        comedy.setText("Κωμωδία");
        comedy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comedyItemStateChanged(evt);
            }
        });
        comedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comedyActionPerformed(evt);
            }
        });

        buttonGroup1.add(thriller);
        thriller.setForeground(new java.awt.Color(255, 255, 255));
        thriller.setText("Θριλερ");
        thriller.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thrillerItemStateChanged(evt);
            }
        });

        buttonGroup1.add(psycho);
        psycho.setForeground(new java.awt.Color(255, 255, 255));
        psycho.setText("Ψυχολογία");
        psycho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                psychoItemStateChanged(evt);
            }
        });

        buttonGroup1.add(prog);
        prog.setForeground(new java.awt.Color(255, 255, 255));
        prog.setText("Αυτοβελτίωσης");
        prog.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                progItemStateChanged(evt);
            }
        });

        buttonGroup1.add(poetry);
        poetry.setForeground(new java.awt.Color(255, 255, 255));
        poetry.setText("Ποίηση");
        poetry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                poetryItemStateChanged(evt);
            }
        });

        buttonGroup1.add(scifi);
        scifi.setForeground(new java.awt.Color(255, 255, 255));
        scifi.setText("Sci-Fi");
        scifi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                scifiItemStateChanged(evt);
            }
        });

        buttonGroup1.add(fantasy);
        fantasy.setForeground(new java.awt.Color(255, 255, 255));
        fantasy.setText("Φαντασία");
        fantasy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fantasyItemStateChanged(evt);
            }
        });

        buttonGroup1.add(history);
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setText("Ιστορία");
        history.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                historyItemStateChanged(evt);
            }
        });

        buttonGroup1.add(crime);
        crime.setForeground(new java.awt.Color(255, 255, 255));
        crime.setText("Έγκλημα");
        crime.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                crimeItemStateChanged(evt);
            }
        });

        buttonGroup1.add(romance);
        romance.setForeground(new java.awt.Color(255, 255, 255));
        romance.setText("Ρομαντισμός");
        romance.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                romanceItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thriller)
                            .addComponent(poetry)
                            .addComponent(psycho)
                            .addComponent(comedy)
                            .addComponent(prog)
                            .addComponent(scifi)
                            .addComponent(fantasy)
                            .addComponent(romance)
                            .addComponent(history)
                            .addComponent(crime))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comedy)
                .addGap(32, 32, 32)
                .addComponent(thriller)
                .addGap(30, 30, 30)
                .addComponent(psycho)
                .addGap(33, 33, 33)
                .addComponent(prog)
                .addGap(31, 31, 31)
                .addComponent(poetry)
                .addGap(29, 29, 29)
                .addComponent(scifi)
                .addGap(30, 30, 30)
                .addComponent(fantasy)
                .addGap(28, 28, 28)
                .addComponent(history)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(crime)
                .addGap(28, 28, 28)
                .addComponent(romance)
                .addGap(23, 23, 23))
        );

        jButton1.setBackground(new java.awt.Color(255, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_search.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(255, 204, 153));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 153));

        bookcatname.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        bookcatname.setForeground(new java.awt.Color(255, 255, 255));
        bookcatname.setText("Κωμωδία");

        titlosimg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg1.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg1.setText("jLabel1");

        timiimg1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg1.setForeground(new java.awt.Color(255, 255, 255));
        timiimg1.setText("jLabel3");

        titlosimg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg2.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg2.setText("jLabel6");

        timiimg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg2.setForeground(new java.awt.Color(255, 255, 255));
        timiimg2.setText("jLabel7");

        titlosimg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg3.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg3.setText("jLabel8");

        timiimg3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg3.setForeground(new java.awt.Color(255, 255, 255));
        timiimg3.setText("jLabel9");

        titlosimg4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg4.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg4.setText("jLabel10");

        timiimg4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg4.setForeground(new java.awt.Color(255, 255, 255));
        timiimg4.setText("jLabel11");

        titlosimg5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg5.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg5.setText("jLabel12");

        timiimg5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg5.setForeground(new java.awt.Color(255, 255, 255));
        timiimg5.setText("jLabel13");

        titlosimg6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titlosimg6.setForeground(new java.awt.Color(255, 255, 255));
        titlosimg6.setText("jLabel14");

        timiimg6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        timiimg6.setForeground(new java.awt.Color(255, 255, 255));
        timiimg6.setText("jLabel15");

        img1cart.setBackground(new java.awt.Color(255, 204, 153));
        img1cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img1cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img1cartActionPerformed(evt);
            }
        });

        img1fave.setBackground(new java.awt.Color(255, 204, 153));
        img1fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img1fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img1faveActionPerformed(evt);
            }
        });

        img2cart.setBackground(new java.awt.Color(255, 204, 153));
        img2cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img2cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img2cartActionPerformed(evt);
            }
        });

        img2fave.setBackground(new java.awt.Color(255, 204, 153));
        img2fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img2fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img2faveActionPerformed(evt);
            }
        });

        img3cart.setBackground(new java.awt.Color(255, 204, 153));
        img3cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img3cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img3cartActionPerformed(evt);
            }
        });

        img3fave.setBackground(new java.awt.Color(255, 204, 153));
        img3fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img3fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img3faveActionPerformed(evt);
            }
        });

        img4cart.setBackground(new java.awt.Color(255, 204, 153));
        img4cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img4cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img4cartActionPerformed(evt);
            }
        });

        img4fave.setBackground(new java.awt.Color(255, 204, 153));
        img4fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img4fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img4faveActionPerformed(evt);
            }
        });

        img5cart.setBackground(new java.awt.Color(255, 204, 153));
        img5cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img5cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img5cartActionPerformed(evt);
            }
        });

        img5fave.setBackground(new java.awt.Color(255, 204, 153));
        img5fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img5fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img5faveActionPerformed(evt);
            }
        });

        img6cart.setBackground(new java.awt.Color(255, 204, 153));
        img6cart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_shopping.png"))); // NOI18N
        img6cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img6cartActionPerformed(evt);
            }
        });

        img6fave.setBackground(new java.awt.Color(255, 204, 153));
        img6fave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/rsz_fave.png"))); // NOI18N
        img6fave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img6faveActionPerformed(evt);
            }
        });

        img1.setText("jLabel1");

        img2.setText("jLabel3");

        img3.setText("jLabel6");

        img4.setText("jLabel7");

        img5.setText("jLabel8");

        img6.setText("jLabel9");

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));

        settingbutton.setBackground(new java.awt.Color(255, 204, 153));
        settingbutton.setFont(new java.awt.Font("Script MT Bold", 1, 20)); // NOI18N
        settingbutton.setText("Settings");
        settingbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 153)));
        settingbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(721, 721, 721)
                                .addComponent(titlosimg6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(464, 464, 464)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bookcatname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timiimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titlosimg2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addComponent(titlosimg3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(timiimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(titlosimg4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(timiimg4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                    .addComponent(img4cart, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(img4fave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(img1cart, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(img1fave, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(96, 96, 96)))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(img5cart, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(img5fave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(titlosimg5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(img5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(img2cart, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(img2fave, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(titlosimg1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(165, 165, 165))
                                    .addComponent(timiimg5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(timiimg3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addComponent(img3cart, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(img3fave, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 107, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(timiimg6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(img6cart, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(img6fave, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bookcatname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlosimg3)
                    .addComponent(titlosimg2)
                    .addComponent(titlosimg1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timiimg3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timiimg2)
                        .addComponent(timiimg1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(img1cart)
                    .addComponent(img1fave)
                    .addComponent(img2cart)
                    .addComponent(img2fave)
                    .addComponent(img3cart)
                    .addComponent(img3fave))
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(img6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlosimg4)
                    .addComponent(titlosimg5)
                    .addComponent(titlosimg6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timiimg4)
                    .addComponent(timiimg5)
                    .addComponent(timiimg6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img4fave)
                    .addComponent(img5fave)
                    .addComponent(img6fave)
                    .addComponent(img4cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img5cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img6cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 890, 670));

        jLabel2.setFont(new java.awt.Font("Script MT Bold", 1, 30)); // NOI18N
        jLabel2.setText("The BookStore of Wisdom");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 360, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/books12.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 740));

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

    private void comedyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comedyActionPerformed

    }//GEN-LAST:event_comedyActionPerformed

    private void comedyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comedyItemStateChanged

        if(comedy.isSelected()){
            
            img1.setIcon(ipretend);
            titlosimg1.setText("Let's pretend it never happened.");
            timiimg1.setText("15.99");
            
            img2.setIcon(i2030);
            titlosimg2.setText("2030");
            timiimg2.setText("10.50");
            
            img3.setIcon(irye);
            titlosimg3.setText("Catcher in the Rye.");
            timiimg3.setText("23.99");
            
            img4.setIcon(imatter);
            titlosimg4.setText("One day We'll matter.");
            timiimg4.setText("18.99");
            
            img5.setIcon(icornball);
            titlosimg5.setText("American Cornball.");
            timiimg5.setText("9.99");
            
            img6.setIcon(isick);
            titlosimg6.setText("Sick in the Head.");
            timiimg6.setText("16.99");

        }

    }//GEN-LAST:event_comedyItemStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void thrillerItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_thrillerItemStateChanged
       
        if(thriller.isSelected()){
            
            img1.setIcon(ibones);
            titlosimg1.setText("These bones are not my child.");
            timiimg1.setText("13.99");
            
            img2.setIcon(ishining);
            titlosimg2.setText("The Shining.");
            timiimg2.setText("20.99");
            
            img3.setIcon(ideadletters);
            titlosimg3.setText("Dead Letters.");
            timiimg3.setText("21.99");
            
            img4.setIcon(isilentpatient);
            titlosimg4.setText("Silent patient.");
            timiimg4.setText("17.99");
            
            img5.setIcon(ieyesopen);
            titlosimg5.setText("He died with his eyes open.");
            timiimg5.setText("12.99");
            
            img6.setIcon(ikillingfloor);
            titlosimg6.setText("Killing floor.");
            timiimg6.setText("15.99");
            
        }
        
    }//GEN-LAST:event_thrillerItemStateChanged

    private void psychoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_psychoItemStateChanged
        
        if(psycho.isSelected()){
            
            img1.setIcon(ioneira);
            titlosimg1.setText("Dreams.");
            timiimg1.setText("11.99");
            
            img2.setIcon(iexeiseisai);
            titlosimg2.setText("Να έχεις ή να είσαι.");
            timiimg2.setText("22.99");
            
            img3.setIcon(initse);
            titlosimg3.setText("Όταν έκλαψε ο Νίτσε.");
            timiimg3.setText("29.99");
            
            img4.setIcon(isuccess);
            titlosimg4.setText("Success.");
            timiimg4.setText("13.99");
            
            img5.setIcon(ianthropako);
            titlosimg5.setText("¶κου ανθρωπάκο.");
            timiimg5.setText("9.99");
            
            img6.setIcon(iblink);
            titlosimg6.setText("Blink.");
            timiimg6.setText("13.99");
            
        }
        
    }//GEN-LAST:event_psychoItemStateChanged

    private void progItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_progItemStateChanged
        
        if(prog.isSelected()){
            
            img1.setIcon(igiftanger);
            titlosimg1.setText("Το δώρο του θυμού.");
            timiimg1.setText("10.99");
            
            img2.setIcon(imonk);
            titlosimg2.setText("Ο μοναχός.");
            timiimg2.setText("12.99");
            
            img3.setIcon(ifailure);
            titlosimg3.setText("Αποτυχία.");
            timiimg3.setText("13.99");
            
            img4.setIcon(ilistening);
            titlosimg4.setText("Η τέχνη του να ακούς.");
            timiimg4.setText("24.99");
            
            img5.setIcon(igiganta);
            titlosimg5.setText("Ο Γίγαντας μέσα μας.");
            timiimg5.setText("20.99");
            
            img6.setIcon(idromos);
            titlosimg6.setText("Ελευθερία.");
            timiimg6.setText("12.99");
            
        }
        
    }//GEN-LAST:event_progItemStateChanged

    private void poetryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_poetryItemStateChanged
        
        if(poetry.isSelected()){
            
            img1.setIcon(isonata);
            titlosimg1.setText("Η σονάτα του σεληνόφωτος.");
            timiimg1.setText("15.99");
            
            img2.setIcon(iaksionesti);
            titlosimg2.setText("¶ξιον εστί.");
            timiimg2.setText("10.99");
            
            img3.setIcon(ikavafi);
            titlosimg3.setText("Ιθάκη.");
            timiimg3.setText("18.99");
            
            img4.setIcon(ijpeg);
            titlosimg4.setText("Στοιχειομαχία.");
            timiimg4.setText("23.99");
            
            img5.setIcon(isekspir);
            titlosimg5.setText("Σονέτα.");
            timiimg5.setText("23.99");
            
            img6.setIcon(ipoiimataa);
            titlosimg6.setText("Ποιήματα ¶.");
            timiimg6.setText("14.99");
            
        }
        
    }//GEN-LAST:event_poetryItemStateChanged

    private void scifiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_scifiItemStateChanged
        
        if(scifi.isSelected()){
            
            img1.setIcon(ihitchickers);
            titlosimg1.setText("Hitchickers guide to the galaxy.");
            timiimg1.setText("13.99");
            
            img2.setIcon(idune);
            titlosimg2.setText("Dune.");
            timiimg2.setText("19.99");
            
            img3.setIcon(ifoundation);
            titlosimg3.setText("Foundation.");
            timiimg3.setText("16.99");
            
            img4.setIcon(isolaris);
            titlosimg4.setText("Solaris.");
            timiimg4.setText("20.99");
            
            img5.setIcon(ibodyproblem);
            titlosimg5.setText("The three body problem.");
            timiimg5.setText("9.99");
            
            img6.setIcon(ihyperion);
            titlosimg6.setText("Hyperion.");
            timiimg6.setText("7.99");
            
        }
        
    }//GEN-LAST:event_scifiItemStateChanged

    private void fantasyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fantasyItemStateChanged
        
        if(fantasy.isSelected()){
            
            img1.setIcon(ilamora);
            titlosimg1.setText("The lies of Locke Lamora.");
            timiimg1.setText("12.99");
            
            img2.setIcon(isilmarillion);
            titlosimg2.setText("Silmarillion.");
            timiimg2.setText("18.99");
            
            img3.setIcon(idarktower);
            titlosimg3.setText("The dark tower.");
            timiimg3.setText("21.99");
            
            img4.setIcon(iomens);
            titlosimg4.setText("Good omens.");
            timiimg4.setText("20.99");
            
            img5.setIcon(iamericangods);
            titlosimg5.setText("American Gods.");
            timiimg5.setText("23.99");
            
            img6.setIcon(ipedrido);
            titlosimg6.setText("Pedrido Street Station.");
            timiimg6.setText("19.99");
            
        }
        
    }//GEN-LAST:event_fantasyItemStateChanged

    private void historyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_historyItemStateChanged
        
        if(history.isSelected()){
            
            img1.setIcon(ilifenfate);
            titlosimg1.setText("Life and Fate.");
            timiimg1.setText("16.99");
            
            img2.setIcon(iordinarymen);
            titlosimg2.setText("Ordinary Men.");
            timiimg2.setText("10.99");
            
            img3.setIcon(ionwar);
            titlosimg3.setText("On War.");
            timiimg3.setText("20.99");
            
            img4.setIcon(ithehistories);
            titlosimg4.setText("The histories.");
            timiimg4.setText("25.99");
            
            img5.setIcon(iprinitng);
            titlosimg5.setText("The printing press.");
            timiimg5.setText("13.99");
            
            img6.setIcon(icrusades);
            titlosimg6.setText("The Crusades.");
            timiimg6.setText("30.99");
            
        }
        
    }//GEN-LAST:event_historyItemStateChanged

    private void crimeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_crimeItemStateChanged
        
        if(crime.isSelected()){
            
            img1.setIcon(isnowman);
            titlosimg1.setText("The snowman.");
            timiimg1.setText("17.99");
            
            img2.setIcon(imercedes);
            titlosimg2.setText("Mr Mercedes.");
            timiimg2.setText("16.99");
            
            img3.setIcon(igameshadows);
            titlosimg3.setText("A game of shadows.");
            timiimg3.setText("20.99");
            
            img4.setIcon(istilllife);
            titlosimg4.setText("Still life.");
            timiimg4.setText("13.99");
            
            img5.setIcon(iorient);
            titlosimg5.setText("Murder on the Orient Express.");
            timiimg5.setText("27.99");
            
            img6.setIcon(iheroin);
            titlosimg6.setText("American Heroin.");
            timiimg6.setText("17.99");
            
        }
        
    }//GEN-LAST:event_crimeItemStateChanged

    private void romanceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_romanceItemStateChanged
        
        if(romance.isSelected()){
            
            img1.setIcon(iprejudice);
            titlosimg1.setText("Pride and Prejudice.");
            timiimg1.setText("19.99");
            
            img2.setIcon(inotebook);
            titlosimg2.setText("The notebook.");
            timiimg2.setText("14.99");
            
            img3.setIcon(ijayne);
            titlosimg3.setText("Jayne Eyre.");
            timiimg3.setText("20.99");
            
            img4.setIcon(iwind);
            titlosimg4.setText("Gone with the wind.");
            timiimg4.setText("13.99");
            
            img5.setIcon(igeisha);
            titlosimg5.setText("Memoirs of Geisha.");
            timiimg5.setText("29.99");
            
            img6.setIcon(iitendswithus);
            titlosimg6.setText("It ends with us.");
            timiimg6.setText("8.99");
            
        }
        
    }//GEN-LAST:event_romanceItemStateChanged

    private void settingbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingbuttonActionPerformed
        SettingsUI set= new SettingsUI();
        set.setMember(member);
        set.setVisible(true);
    }//GEN-LAST:event_settingbuttonActionPerformed

    private void img1cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img1cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg1.getText()));           
    }//GEN-LAST:event_img1cartActionPerformed

    private void img2cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img2cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg2.getText())); 
    }//GEN-LAST:event_img2cartActionPerformed

    private void img3cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img3cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg3.getText())); 
    }//GEN-LAST:event_img3cartActionPerformed

    private void img4cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img4cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg4.getText())); 
    }//GEN-LAST:event_img4cartActionPerformed

    private void img5cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img5cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg5.getText())); 
    }//GEN-LAST:event_img5cartActionPerformed

    private void img6cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img6cartActionPerformed
        addToCart(BookCON.searchBookbyTitle(titlosimg6.getText())); 
    }//GEN-LAST:event_img6cartActionPerformed

    private void img1faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img1faveActionPerformed
        addToFaves(BookCON.searchBookbyTitle(titlosimg1.getText()));
    }//GEN-LAST:event_img1faveActionPerformed

    private void img2faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img2faveActionPerformed
        addToFaves(BookCON.searchBookbyTitle(titlosimg2.getText()));
    }//GEN-LAST:event_img2faveActionPerformed

    private void img3faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img3faveActionPerformed
        addToFaves(BookCON.searchBookbyTitle(titlosimg3.getText()));
    }//GEN-LAST:event_img3faveActionPerformed

    private void img4faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img4faveActionPerformed
        addToFaves(BookCON.searchBookbyTitle(titlosimg4.getText()));
    }//GEN-LAST:event_img4faveActionPerformed

    private void img5faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img5faveActionPerformed
       addToFaves(BookCON.searchBookbyTitle(titlosimg5.getText()));
    }//GEN-LAST:event_img5faveActionPerformed

    private void img6faveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img6faveActionPerformed
        addToFaves(BookCON.searchBookbyTitle(titlosimg6.getText()));
    }//GEN-LAST:event_img6faveActionPerformed

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
            java.util.logging.Logger.getLogger(BookUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookUserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookUserUI(member).setVisible(true);
                
            }
            
            
        });
    }
    
    //comedy
    ImageIcon i2030=new ImageIcon("./src/bookimg/2030.jpg");
    ImageIcon icornball=new ImageIcon("./src/bookimg/cornball.jpg");
    ImageIcon imatter=new ImageIcon("./src/bookimg/matter.jpg");
    ImageIcon ipretend=new ImageIcon("./src/bookimg/pretend.jpg");
    ImageIcon irye=new ImageIcon("./src/bookimg/rye.jpg");
    ImageIcon isick=new ImageIcon("./src/bookimg/sick.jpg");
    
    //thriller
    ImageIcon ibones=new ImageIcon("./src/bookimg/bones.jpg");
    ImageIcon ideadletters=new ImageIcon("./src/bookimg/deadletters.jpg");
    ImageIcon ieyesopen=new ImageIcon("./src/bookimg/eyesopen.jpg");
    ImageIcon ikillingfloor=new ImageIcon("./src/bookimg/killingfloor.jpg");
    ImageIcon ishining=new ImageIcon("./src/bookimg/shining.jpg");
    ImageIcon isilentpatient=new ImageIcon("./src/bookimg/silentpatient.jpg");
    
    //psycho
    ImageIcon ianthropako=new ImageIcon("./src/bookimg/anhtropako.jpg");
    ImageIcon iblink=new ImageIcon("./src/bookimg/blink.jpg");
    ImageIcon iexeiseisai=new ImageIcon("./src/bookimg/exeiseisai.jpg");
    ImageIcon initse=new ImageIcon("./src/bookimg/nitse.jpg");
    ImageIcon ioneira=new ImageIcon("./src/bookimg/oneira.jpg");
    ImageIcon isuccess=new ImageIcon("./src/bookimg/success.jpg");
    
    //progress
    ImageIcon idromos=new ImageIcon("./src/bookimg/dromos.jpg");
    ImageIcon ifailure=new ImageIcon("./src/bookimg/failure.jpg");
    ImageIcon igiftanger=new ImageIcon("./src/bookimg/giftanger.jpg");
    ImageIcon igiganta=new ImageIcon("./src/bookimg/giganta.jpg");
    ImageIcon ilistening=new ImageIcon("./src/bookimg/listening.jpg");
    ImageIcon imonk=new ImageIcon("./src/bookimg/monk.jpg");
    
    //poetry
    ImageIcon iaksionesti=new ImageIcon("./src/bookimg/aksionesti.jpg");
    ImageIcon ikavafi=new ImageIcon("./src/bookimg/kavafi.jpg");
    ImageIcon ipoiimataa=new ImageIcon("./src/bookimg/poiimata a.jpg");
    ImageIcon isekspir=new ImageIcon("./src/bookimg/sekspir.jpg");
    ImageIcon isonata=new ImageIcon("./src/bookimg/sonata.jpg");
    ImageIcon ijpeg=new ImageIcon("./src/bookimg/jpeg.jpg");
    
    //scifi
    ImageIcon ibodyproblem=new ImageIcon("./src/bookimg/bodyproblem.jpg");
    ImageIcon idune=new ImageIcon("./src/bookimg/dune.jpg");
    ImageIcon ifoundation=new ImageIcon("./src/bookimg/foundation.jpg");
    ImageIcon ihitchickers=new ImageIcon("./src/bookimg/hitchickers.jpg");
    ImageIcon ihyperion=new ImageIcon("./src/bookimg/hyperion.jpg");
    ImageIcon isolaris=new ImageIcon("./src/bookimg/solaris.jpg");
    
    //fantasy
    ImageIcon iamericangods=new ImageIcon("./src/bookimg/americangods.jpg");
    ImageIcon idarktower=new ImageIcon("./src/bookimg/darktower.jpg");
    ImageIcon ilamora=new ImageIcon("./src/bookimg/lamora.jpg");
    ImageIcon iomens=new ImageIcon("./src/bookimg/omens.jpg");
    ImageIcon ipedrido=new ImageIcon("./src/bookimg/pedrido.jpg");
    ImageIcon isilmarillion=new ImageIcon("./src/bookimg/silmarillion.jpg");
    
    //history
    ImageIcon icrusades=new ImageIcon("./src/bookimg/crusades.jpg");
    ImageIcon ilifenfate=new ImageIcon("./src/bookimg/lifenfate.jpg");
    ImageIcon ionwar=new ImageIcon("./src/bookimg/onwar.jpg");
    ImageIcon iordinarymen=new ImageIcon("./src/bookimg/ordinarymen.jpg");
    ImageIcon iprinitng=new ImageIcon("./src/bookimg/prinitng.jpg");
    ImageIcon ithehistories=new ImageIcon("./src/bookimg/thehistories.jpg");
    
    //crime
    ImageIcon igameshadows=new ImageIcon("./src/bookimg/gameshadows.jpg");
    ImageIcon iheroin=new ImageIcon("./src/bookimg/heroin.jpg");
    ImageIcon imercedes=new ImageIcon("./src/bookimg/mercedes.jpg");
    ImageIcon iorient=new ImageIcon("./src/bookimg/orient.jpg");
    ImageIcon isnowman=new ImageIcon("./src/bookimg/snowman.jpg");
    ImageIcon istilllife=new ImageIcon("./src/bookimg/stilllife.jpg");
    
    //romance
    ImageIcon igeisha=new ImageIcon("./src/bookimg/geisha.jpg");
    ImageIcon iitendswithus=new ImageIcon("./src/bookimg/itendswithus.jpg");
    ImageIcon ijayne=new ImageIcon("./src/bookimg/jayne.jpg");
    ImageIcon inotebook=new ImageIcon("./src/bookimg/notebook.jpg");
    ImageIcon iprejudice=new ImageIcon("./src/bookimg/prejudice.jpg");
    ImageIcon iwind=new ImageIcon("./src/bookimg/wind.jpg");
    
    
    public Book searchForBook(String titlos){
        return BookCON.searchBookbyTitle(titlos);    
    }
    
    public void addToCart (Book book){
        member.getCart().addToCart(book);
        }
    
    public void rmFromCart(Book book){
        member.getCart().rmFromCart(book);
    }
    
    public void addToFaves(Book book){
        member.getFaves().addToFaves(book);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookcatname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton comedy;
    private javax.swing.JRadioButton crime;
    private javax.swing.JRadioButton fantasy;
    private javax.swing.JRadioButton history;
    private javax.swing.JLabel img1;
    private javax.swing.JButton img1cart;
    private javax.swing.JButton img1fave;
    private javax.swing.JLabel img2;
    private javax.swing.JButton img2cart;
    private javax.swing.JButton img2fave;
    private javax.swing.JLabel img3;
    private javax.swing.JButton img3cart;
    private javax.swing.JButton img3fave;
    private javax.swing.JLabel img4;
    private javax.swing.JButton img4cart;
    private javax.swing.JButton img4fave;
    private javax.swing.JLabel img5;
    private javax.swing.JButton img5cart;
    private javax.swing.JButton img5fave;
    private javax.swing.JLabel img6;
    private javax.swing.JButton img6cart;
    private javax.swing.JButton img6fave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton poetry;
    private javax.swing.JRadioButton prog;
    private javax.swing.JRadioButton psycho;
    private javax.swing.JRadioButton romance;
    private javax.swing.JRadioButton scifi;
    private javax.swing.JButton settingbutton;
    private javax.swing.JRadioButton thriller;
    private javax.swing.JLabel timiimg1;
    private javax.swing.JLabel timiimg2;
    private javax.swing.JLabel timiimg3;
    private javax.swing.JLabel timiimg4;
    private javax.swing.JLabel timiimg5;
    private javax.swing.JLabel timiimg6;
    private javax.swing.JLabel titlosimg1;
    private javax.swing.JLabel titlosimg2;
    private javax.swing.JLabel titlosimg3;
    private javax.swing.JLabel titlosimg4;
    private javax.swing.JLabel titlosimg5;
    private javax.swing.JLabel titlosimg6;
    // End of variables declaration//GEN-END:variables
}
