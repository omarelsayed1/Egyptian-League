/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;



/**
 *
 * @author Seiko
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Seiko
 */
class Final extends JFrame
{
     private JLabel playername;
    private JLabel username,admin;
    JButton Admin,User,DT,ST,DTP,DTs,Top,UteamInfo,teamInfo,Dpp,EPInfo,pr,pi,r,a,am,DTm,cm,
            tr,te,g,UPInfo, EMInfo;
    private JLabel teamname;
     public String s3,s6,s4,s7,s17,s12="zmalek",s14,s15,s16,s22,s11="ahly",s1,x9="tarek",
             x10="marwan",x11="shenawy",x12,x13,x14,x15,x16,x17;
    public Final() 
    {
        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.validate();
        this.setResizable(true);
        
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        admin=new JLabel("Enter as admin");
        admin.setLocation(210, 70);
        admin.setSize(300,200 );
        admin.setFont(new Font("Arial Black", Font.PLAIN,15));
        
        this.add(admin);
       Icon icon1 = new ImageIcon("E:\\user2.jpg");
        Admin=new JButton (icon1);
       
       Admin.setBorder(BorderFactory.createLineBorder(Color.black, 5));
      
       Admin.setOpaque(true);
       Admin.setSize(150,130);
       Admin.setLocation(200,200);
       Buttons b=new Buttons();
       Admin.addActionListener(b);
       this.add(Admin);
       
       username=new JLabel("Enter as user");
        username.setLocation(420, 70);
        username.setSize(300,200 );
        username.setFont(new Font("Arial Black", Font.PLAIN,15));
        this.add(username);
        
      Icon icon2 = new ImageIcon("E:\\user1.jpg");
       User=new JButton (icon2);
       User.setBorder(BorderFactory.createLineBorder(Color.black, 5)); 
       User.setSize(150,130);
       User.setLocation(400,200);
       Buttons bt=new Buttons();
       User.addActionListener(bt);
       this.add(User);
       
        
    }
    private class Buttons implements ActionListener
    {
       String s1,s2="admin",pass="1234",pss;
       private JLabel name;
        @Override
        public void actionPerformed(ActionEvent e)
        {
           Object buttonPressed=e.getSource();
           if(buttonPressed.equals(Admin))
           {
                s1=JOptionPane.showInputDialog("Enter UserName");
        pss=JOptionPane.showInputDialog("Enter password");
        if(s1.equals(s2)&&pss.equals(pass)){
             JFrame f=new JFrame("Admin Page");
        f.setSize(700,700);
       f.getContentPane().setBackground(Color.LIGHT_GRAY);
        f.setVisible(true);
        f.setLayout(null);
        name=new JLabel("ADMIN");
        name.setLocation(250,100);
        name.setSize(125, 80);
        name.setFont(new Font("Arial Black", Font.PLAIN,30));
        f.add(name);
        
        
        teamInfo=new JButton("Enter Team Info");
        teamInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        teamInfo.setSize(125, 80);
        teamInfo.setLocation(250,200);
        Buttons bc = new Buttons();
        teamInfo.addActionListener(bc);
        f.add(teamInfo);
        
        
        UteamInfo=new JButton("Update Team Info");
        UteamInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        UteamInfo.setSize(125, 80);
        UteamInfo.setLocation(100,200);
        Buttons b9=new Buttons();
        UteamInfo.addActionListener(b9);
        f.add(UteamInfo);
        
        EPInfo=new JButton("Enter Player Info");
        EPInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        EPInfo.setSize(125, 80);
        EPInfo.setLocation(400,200);
        Buttons b10= new Buttons();
        EPInfo.addActionListener(b10);
        f.add(EPInfo);
        
        
        
        
        UPInfo=new JButton("Update Player Info");
        UPInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        UPInfo.setSize(125, 80);
        UPInfo.setLocation(100,300);
        Buttons bbb=new Buttons();
        UPInfo.addActionListener(bbb);
        f.add(UPInfo);
        
        
       EMInfo=new JButton("Enter Match Info");
        EMInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        EMInfo.setSize(125, 80);
        EMInfo.setLocation(250,300);
        Buttons bb10=new Buttons();
        EMInfo.addActionListener(bb10);
        f.add(EMInfo);
        
        JButton UMInfo=new JButton("Update Player Info");
        UMInfo.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        UMInfo.setSize(125, 80);
        UMInfo.setLocation(400,300);
        f.add(UMInfo);
            
        }
        else 
            JOptionPane.showMessageDialog(null,"Password or UserName invalid");
        
       
       }
           if(buttonPressed.equals(User))
           {
                
       
        JFrame u=new JFrame("User Page");
        u.setSize(700,700);
       u.getContentPane().setBackground(Color.LIGHT_GRAY);
        u.setVisible(true);
        u.setLayout(null);
        
        DT=new JButton("Search for a team");
        DT.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        DT.setSize(125, 80);
        Buttons bb=new Buttons();
        DT.addActionListener(bb);
        DT.setLocation(250,200);
        u.add(DT);
        
        ST=new JButton("Search For a Player");
        ST.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        ST.setSize(125, 80);
        ST.setLocation(100,200);
        Buttons b3=new Buttons();
        ST.addActionListener(b3);
        u.add(ST);
        
        DTP=new JButton("Search for Matches");
        DTP.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        DTP.setSize(125, 80);
        DTP.setLocation(400,200);
         Buttons b4=new Buttons();
        DTP.addActionListener(b4);
        u.add(DTP);
        
       
        Top=new JButton("Ranks");
        Top.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        Top.setSize(125, 80);
        Top.setLocation(250,300);
        Buttons b5=new Buttons();
        Top.addActionListener(b5);
        u.add(Top);
        
        }
           if(buttonPressed.equals(DT))
           {
                String s2;
       
       
        
        
        JFrame T=new JFrame("User Page");
        T.setSize(500,500);
        T.getContentPane().setBackground(Color.LIGHT_GRAY);
        T.setVisible(true);
        T.setLayout(null);
        
       s22= JOptionPane.showInputDialog("Enter Team Name");
        
        teamname=new JLabel(s22);
        teamname.setLocation(250,100);
        teamname.setSize(125, 80);
        teamname.setFont(new Font("Arial Black", Font.PLAIN,35));
        T.add(teamname);
        
        Dpp=new JButton("Display Players");
        Dpp.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        Dpp.setSize(125, 80);
        Dpp.setLocation(100,200);
        Buttons b1000=new Buttons();
        Dpp.addActionListener(b1000);
        T.add(Dpp);
        
          DTs=new JButton("Display Scores");
        DTs.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        DTs.setSize(125, 80);
        DTs.setLocation(250,200);
        Buttons b20=new Buttons();
        DTs.addActionListener(b20);
        T.add(DTs);
        
        DTm=new JButton("Display Matches");
        DTm.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        DTm.setSize(125, 80);
        DTm.setLocation(400,200);
        Buttons b435=new Buttons();
        DTm.addActionListener(b435);
      
        T.add(DTm);
        
        
        }
         
           
           if(buttonPressed.equals(EPInfo))
           {
               JOptionPane.showInputDialog("Enter PLayer Name");
              x15=  JOptionPane.showInputDialog("Enter PLayer age");
              x16=JOptionPane.showInputDialog("Enter PLayer role");
              x17=JOptionPane.showInputDialog("Enter Player Team");
           }
           if(buttonPressed.equals(ST))
           {
                 JFrame p=new JFrame("Players");
        p.setSize(700,700);
        p.getContentPane().setBackground(Color.LIGHT_GRAY);
        p.setVisible(true);
        p.setLayout(null);  
        
         s3= JOptionPane.showInputDialog("Enter Name");
        
        playername=new JLabel(s3);
        playername.setLocation(250,100);
        playername.setSize(300,150);
        playername.setFont(new Font("Arial Black", Font.PLAIN,35));
        p.add(playername);
        
        
        
        pi=new JButton("Display info");
        pi.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        pi.setSize(125, 80);
        pi.setLocation(100,200);
        Buttons b11 = new Buttons();
        pi.addActionListener(b11);
        p.add(pi);
        
        pr=new JButton("Display Role");
        pr.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        pr.setSize(125, 80);
        pr.setLocation(250,200);
        Buttons b7 = new Buttons ();
        pr.addActionListener(b7);
         p.add(pr);
        
        }
           if(buttonPressed.equals(DTP))
           {
       
          JFrame m=new JFrame("Players");
          m.setSize(500,500);
          m.getContentPane().setBackground(Color.LIGHT_GRAY);
          m.setVisible(true);
          m.setLayout(null);
        
        
        
        
        am=new JButton("Display All Matches");
        am.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        am.setSize(125, 80);
        am.setLocation(100,200);
        Buttons b425=new Buttons();
        am.addActionListener(b425);
        m.add(am);
        
        cm=new JButton("Display match");
        cm.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        cm.setSize(125, 80);
        cm.setLocation(250,200);
        Buttons b444=new Buttons();
        cm.addActionListener(b444);
        m.add(cm);
        
        }
           
           
           
             if(buttonPressed.equals(UPInfo))
           {
              JOptionPane.showInputDialog("Enter PLayer Name");
              JOptionPane.showInputDialog("Enter PLayer age");
              JOptionPane.showInputDialog("Enter PLayer role");
              JOptionPane.showInputDialog("Enter Player Team");
           }
              if(buttonPressed.equals(EMInfo))
              {
              JOptionPane.showInputDialog("Enter 1st Team");
              JOptionPane.showInputDialog("Enter 2nd Team");
              JOptionPane.showInputDialog("Enter Date");
              JOptionPane.showInputDialog("Enter Score");
              }
             
           if(buttonPressed.equals(Top))
           {
       
        
        JFrame r=new JFrame("Ranks");
        r.setSize(500,500);
        r.getContentPane().setBackground(Color.LIGHT_GRAY);
        r.setVisible(true);
        r.setLayout(null);
        
        
        
        
         a=new JButton("Top 3 Players");
        a.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        a.setSize(125, 80);
        a.setLocation(100,200);
        Buttons b400 = new Buttons();
        a.addActionListener(b400);
        r.add(a);
        
           g=new JButton("Top 3 goalies");
        g.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        g.setSize(125, 80);
        g.setLocation(250,200);
        Buttons b900=new Buttons();
        g.addActionListener(b900);
        r.add(g);
        
            tr=new JButton("Top rank");
        tr.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        tr.setSize(125, 80);
        tr.setLocation(400,200);
        Buttons b800=new Buttons();
        tr.addActionListener(b800);
        r.add(tr);
        
          te=new JButton("Top 3 Teams");
        te.setBorder(BorderFactory.createLineBorder(Color.black, 5));
        te.setSize(125, 80);
        te.setLocation(100,300);
        Buttons b700=new Buttons();
        te.addActionListener(b700);
        r.add(te);
        
           }
           if(buttonPressed.equals(UteamInfo))
           {
               s6=JOptionPane.showInputDialog("Enter Team Name");
               JOptionPane.showInputDialog("Enter Team scores");
               JOptionPane.showInputDialog("Enter Team rank");
               JOptionPane.showInputDialog("Enter Team new player");
           }
            
             if(buttonPressed.equals(teamInfo))
           {
              s4= JOptionPane.showInputDialog("Enter Team Name");
              x12=  JOptionPane.showInputDialog("Enter Team Player1");
              x13=JOptionPane.showInputDialog("Enter Team Player2");
              x14=JOptionPane.showInputDialog("Enter Team Player3");
                
           }
             if(buttonPressed.equals(pi))
             {
                 if(s3.equals(x9)){
                 JFrame Tarek=new JFrame("Frame");
                 Tarek.setSize(700, 700);
                 Tarek.setVisible(true);
                 Tarek.setLayout(null);
                 JLabel Hamed=new JLabel("tarek Hamed");
                 Hamed.setSize(250, 200);
                 Hamed.setLocation(200,250);
                 Hamed.setFont(new Font("Arial Black",Font.BOLD,24));
                 
                 JLabel ageHamed=new JLabel("Age: 29");
                 ageHamed.setSize(200, 200);
                 ageHamed.setLocation(200, 300);
                 ageHamed.setFont(new Font("Arial Black",Font.BOLD,24));
                 Tarek.add(Hamed);
                 Tarek.add(ageHamed);
                 }
                 else if(s3.equals(x10)){
                  JFrame Marwan=new JFrame("Frame");
                    Marwan.setSize(700, 700);
                 Marwan.setVisible(true);
                 Marwan.setLayout(null);
                 JLabel Mohsen=new JLabel("marwan Mohsen");
                 Mohsen.setSize(300, 200);
                 Mohsen.setLocation(200,200);
                 Mohsen.setFont(new Font("Arial Black",Font.BOLD,24));
                 
                 JLabel ageMarwan=new JLabel("Age:32");
                 ageMarwan.setSize(200, 200);
                 ageMarwan.setLocation(200, 300);
                 ageMarwan.setFont(new Font("Arial Black",Font.BOLD,24));
                 Marwan.add(ageMarwan);
                 Marwan.add(Mohsen);   
                 }
                 else if(s3.equals(x11)){
                     JFrame Elshenawy=new JFrame("Frame");
                    Elshenawy.setSize(400, 400);
                 Elshenawy.setVisible(true);
                 Elshenawy.setLayout(null);
                 JLabel Mohamed=new JLabel("elshenawy");
                 Elshenawy.setSize(350, 200);
                 Mohamed.setLocation(50,120);
                 Mohamed.setFont(new Font("Arial Black",Font.BOLD,24));
                 Elshenawy.add(Mohamed);
                 }
                 else
                     JOptionPane.showMessageDialog(null,"No Player found");
                         
                         
             }
              if(buttonPressed.equals(DTs))
              {
                  JFrame ahlyscore=new JFrame("Frame");
                  ahlyscore.setSize(400,400);
                  ahlyscore.setVisible(true);
                  ahlyscore.setLayout(null);
                  JLabel score=new JLabel("3 points");
                  score.setSize(350, 350);
                  score.setLocation(200, 200);
                  score.setFont(new Font("Arial Black",Font.BOLD,29));
                  ahlyscore.add(score);
                  
              }
             if(buttonPressed.equals(a))
             {
                 JFrame top3P=new JFrame("Top 3 Players");
                 top3P.setSize(700, 700);
                 top3P.setVisible(true);
                 top3P.setLayout(null);
                 
                 JLabel top1=new JLabel("1: Marwan Mohsen");
                 top1.setSize(350, 350);
                 top1.setLocation(300, 100);
                 top1.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top1);
                 
                 JLabel top2=new JLabel("2: Magdy Afsha");
                 top2.setSize(350, 350);
                 top2.setLocation(300, 200);
                 top2.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top2);
                 
                 
                 JLabel top3=new JLabel("3: Abu Treka");
                 top3.setSize(350, 350);
                 top3.setLocation(300, 300);
                 top3.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top3);
                 
                 

             }
              
              if(buttonPressed.equals(g))
             {
                 JFrame top3P=new JFrame("Top 3 Goalies");
                 top3P.setSize(700, 700);
                 top3P.setVisible(true);
                 top3P.setLayout(null);
                 
                 JLabel top1=new JLabel("1: Abdelwahed");
                 top1.setSize(350, 350);
                 top1.setLocation(300, 100);
                 top1.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top1);
                 
                 JLabel top2=new JLabel("2: Gennesh");
                 top2.setSize(350, 350);
                 top2.setLocation(300, 200);
                 top2.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top2);
                 
                 
                 JLabel top3=new JLabel("3: Abo Remas");
                 top3.setSize(350, 350);
                 top3.setLocation(300, 300);
                 top3.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top3);
                 
                 

             }
              
            
              
              if(buttonPressed.equals(te))
             {
                 JFrame top3P=new JFrame("Top 3 Teams");
                 top3P.setSize(700, 700);
                 top3P.setVisible(true);
                 top3P.setLayout(null);
                 
                 JLabel top1=new JLabel("1: Al Ahly");
                 top1.setSize(350, 350);
                 top1.setLocation(300, 100);
                 top1.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top1);
                 
                 JLabel top2=new JLabel("2: Zamalek");
                 top2.setSize(350, 350);
                 top2.setLocation(300, 200);
                 top2.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top2);
                 
                 
                 JLabel top3=new JLabel("3: Pyramids");
                 top3.setSize(350, 350);
                 top3.setLocation(300, 300);
                 top3.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top3);
                 
                 

             }
              
              
              
              if(buttonPressed.equals(tr))
             {
                 JFrame top3P=new JFrame("Top 3 Players");
                 top3P.setSize(700, 700);
                 top3P.setVisible(true);
                 top3P.setLayout(null);
                 
                 JLabel top1=new JLabel("1: Marwan Mohsen");
                 top1.setSize(350, 350);
                 top1.setLocation(300, 100);
                 top1.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top1);
                 
                 JLabel top1info = new JLabel("30 Goals");
                 top1info.setSize(350,350);
                 top1info.setLocation(300,150);
                 top1info.setFont(new Font("Arial Black" , Font.BOLD,29));
                 top3P.add(top1info);
                 
                 
                 JLabel top2=new JLabel("2: Magdy Afsha");
                 top2.setSize(350, 350);
                 top2.setLocation(300, 200);
                 top2.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top2);
                 
                 JLabel top2info = new JLabel("25 Goals");
                 top2info.setSize(350,350);
                 top2info.setLocation(300,250);
                 top2info.setFont(new Font("Arial Black" , Font.BOLD,29));
                 top3P.add(top2info);
                 
                 
                 JLabel top3=new JLabel("3: Abu Treka");
                 top3.setSize(350, 350);
                 top3.setLocation(300, 300);
                 top3.setFont(new Font("Arial Black",Font.BOLD,29));
                 top3P.add(top3);
                 
                 JLabel top3info = new JLabel("22Goals");
                 top3info.setSize(350,350);
                 top3info.setLocation(300,350);
                 top3info.setFont(new Font("Arial Black" , Font.BOLD,29));
                 top3P.add(top3info);
                 
                 

             }
              if(buttonPressed.equals(pr)&&s3.equals(x9))
              {
                  JFrame mid= new JFrame();
                  mid.setSize(700,700);
                  mid.setVisible(true);
                  mid.setLayout(null);
                  JLabel nos = new JLabel("Midfielder");
                  nos.setSize(350,350);
                  nos.setLocation(350,350);
                  nos.setFont(new Font("Arial black ",Font.BOLD,24));
                  mid.add(nos);}
              
                else if(buttonPressed.equals(pr)&&s3.equals(x10))
            {
                JFrame att= new JFrame();
                  att.setSize(700,700);
                  att.setVisible(true);
                  JLabel hgoom = new JLabel("Attacker");
                  hgoom.setSize(350,350);
                  hgoom.setLocation(350,350);
                  hgoom.setFont(new Font("Arial black ",Font.BOLD,24));
                  att.add(hgoom);}
               else if(buttonPressed.equals(pr)&&s3.equals(x11))
            {
                JFrame gk= new JFrame();
                  gk.setSize(700,700);
                  gk.setVisible(true);
                  JLabel hares = new JLabel("Goalkeeper");
                  hares.setSize(350,350);
                  hares.setLocation(350,350);
                  hares.setFont(new Font("Arial black ",Font.BOLD,24));
                  gk.add(hares);}
              
              
              if(buttonPressed.equals(am))
              {
                  JFrame all= new JFrame();
                  all.setSize(700,700);
                  all.setVisible(true);
                  all.setLayout(null);
                  JLabel allm = new JLabel("Home: Zamalek vs Ahly :5pm");                 
                  allm.setSize(350,350);
                  allm.setLocation(350,100);
                  allm.setFont(new Font("Arial black ",Font.BOLD,24));
                  
                   JLabel allmatches = new JLabel("Away: Ahly vs Zamalek :10pm ");                 
                  allmatches.setSize(350,350);
                  allmatches.setLocation(350,200);
                  allmatches.setFont(new Font("Arial black ",Font.BOLD,24));
                  
                  all.add(allm);
                 all.add(allmatches);
              }
               if(buttonPressed.equals(cm))
              {
                  JFrame match= new JFrame();
                  match.setSize(700,700);
                  match.setVisible(true);
                  match.setLayout(null);
                  JLabel firstmatch = new JLabel("  Zamalek vs Ahly ");                 
                  firstmatch.setSize(350,350);
                  firstmatch.setLocation(350,150);
                  firstmatch.setFont(new Font("Arial black ",Font.BOLD,24));
                  match.add(firstmatch);
              
              
            }
               if(buttonPressed.equals(DTm))
              {
                  JFrame dism= new JFrame();
                  dism.setSize(700,700);
                  dism.setVisible(true);
                  dism.setLayout(null);
                  JLabel disms = new JLabel("Home: Zamalek vs Ahly :5pm ");                 
                  disms.setSize(350,350);
                  disms.setLocation(350,200);
                  disms.setFont(new Font("Arial black ",Font.CENTER_BASELINE,24));
                  
                   JLabel allmatches = new JLabel("Away: Ahly vs Zamalek :10pm ");                 
                  allmatches.setSize(350,350);
                  allmatches.setLocation(350,100);
                  allmatches.setFont(new Font("Arial black ",Font.BOLD,24));
                  dism.add(disms);
                  dism.add(allmatches);
              }
               s17=s4;
               if(buttonPressed.equals(Dpp))
               {
                  if(s22.equals(s11)){
                  JFrame la3eeba= new JFrame();
                  la3eeba.setSize(400,400);
                  la3eeba.setVisible(true);
                  la3eeba.setLayout(null);
                  JLabel la3eeb = new JLabel("saad samir ");
                  la3eeb.setSize(200,250);
                  la3eeb.setLocation(100,100);
                  la3eeb.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel player = new JLabel("magdy afsha ");
                  player.setSize(200,250);
                  player.setLocation(100,180);
                  player.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel ah = new JLabel("ahmed beckam ");
                  ah.setSize(200,250);
                  ah.setLocation(100,250);
                  ah.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel ahl = new JLabel("mohamed taher");
                  ahl.setSize(200,250);
                  ahl.setLocation(100,350);
                  ahl.setFont(new Font("Arial black ",Font.BOLD,24));
                  la3eeba.add(la3eeb);
                  la3eeba.add(player);
                  la3eeba.add(ah);
                  la3eeba.add(ahl);
                  }
                   
                   else if(s22.equals(s12))
                   {
                  JFrame la3eeba1= new JFrame();
                  la3eeba1.setSize(400,400);
                  la3eeba1.setVisible(true);
                  la3eeba1.setLayout(null);
                  JLabel la3eeb = new JLabel("Frgani");
                  la3eeb.setSize(150,150);
                  la3eeb.setLocation(50,180);
                  la3eeb.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel player = new JLabel("ZIZO");
                  player.setSize(250,250);
                  player.setLocation(50,180);
                  player.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel ah = new JLabel("Ashraf ");
                  ah.setSize(350,350);
                  ah.setLocation(50,180);
                  ah.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel ahl = new JLabel("Genesh");
                  ahl.setSize(150,150);
                  ahl.setLocation(50,180);
                  ahl.setFont(new Font("Arial black ",Font.BOLD,24));
                  la3eeba1.add(la3eeb);
                  la3eeba1.add(player);
                  la3eeba1.add(ah);
                  la3eeba1.add(ahl);
                   }
                   
                  else if(s4.equals(s17))
                   {
                  JFrame la3eeba2= new JFrame();
                  la3eeba2.setSize(400,400);
                  la3eeba2.setVisible(true);
                  la3eeba2.setLayout(null);
                  JLabel la3eeb = new JLabel(s14);
                  la3eeb.setSize(150,150);
                  la3eeb.setLocation(50,180);
                  la3eeb.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel player = new JLabel(s15);
                  player.setSize(250,250);
                  player.setLocation(50,180);
                  player.setFont(new Font("Arial black ",Font.BOLD,24));
                   JLabel ah = new JLabel(s16);
                  ah.setSize(350,350);
                  ah.setLocation(50,180);
                  ah.setFont(new Font("Arial black ",Font.BOLD,24));
                 
                  
                  la3eeba2.add(la3eeb);
                  la3eeba2.add(player);
                  la3eeba2.add(ah);
                 
                   }
                   else 
                      JOptionPane.showMessageDialog(null,"Team not Found");
               }
                      
               
            if(buttonPressed.equals(DTs))
            {
                 JFrame score= new JFrame();
                  score.setSize(700,700);
                  score.setVisible(true);
                  score.setLayout(null);
                  JLabel scores = new JLabel(" 15 points, Won 4, Draw 2, Lost 1");                 
                  scores.setSize(600,600);
                  scores.setLocation(300,200);
                  scores.setFont(new Font("Arial black ",Font.CENTER_BASELINE,24));
                  score.add(scores);
            }
            
              
          /*    
             
                 try{
            FileOutputStream fileOs=new FileOutputStream("FileName");
            ObjectOutputStream os=new ObjectOutputStream(fileOs);
            os.writeBytes("////");
            os.close();
            }catch(FileNotFoundException x)
            {
               x.printStackTrace(); 
            }
            
               
                    try
                   {
                    FileInputStream fileIs=new FileInputStream(FileName);
                    ObjectInputStream is=new ObjectInputStream(fileIs);
                    ree =is.readLine();
                    is.close();
                    
                   }catch(IOException z)
                   {
                       z.printStackTrace();
                   }
            */ 
              
              
              
              
              
              
           }
        
         
           }
           
           
           
  
         
     }

