package Projekt;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Window.Type;
import java.util.Locale;
import java.util.ResourceBundle;


public class Projekt
{
    JFrame frame;
    private static ResourceBundle resBundle = ResourceBundle.getBundle("Projekt/label", new Locale("en"));
    JButton stopButton,savButton,resetButton,startButton,exitButton,nButton,showPanel,hidePanel;
    TitledBorder tit,pit,git;
    JPanel panel,buttonPanel,menuPanel,statistics,panelDisName,panelCountryName,data,data2;
    JLabel time,weeks,disNamee;
    static JLabel countryNam;
    JMenuItem cholera,sars,dzuma,corona,center,tim,lang1,lang2,lang3,lang4;
    JMenu illnesses,parameters,aspects,languageMenu,menu;
    JButton copyrights,info;
    JCheckBox notifics;
    public String disease = resBundle.getString("dis.disNameCho");
    public String country = resBundle.getString("dis.disNameOutbreak");
    protected static JLabel countr;
    protected static JLabel title;
    private JMenuItem step;
    protected static int generalIndex;
    protected static String mainCountryName = resBundle.getString("info.countryName");
    BufferedImage image;
    /**
     * Launch the application.
     */

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    Projekt window = new Projekt();
                    window.frame.setSize(1440,1000);
                    window.frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //opcjonalnie na pĂłĹşniej - FULLSCREEN
                    window.frame.setUndecorated(true);
                    window.frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Projekt() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        frame = new JFrame();
        frame.setForeground(Color.LIGHT_GRAY);
        frame.setType(Type.POPUP);
        frame.setBackground(Color.LIGHT_GRAY);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        WorldMapPanel panel = new WorldMapPanel();
        panel.setBounds(0, 0, 1440, 800);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        JPanel changedPanel = new JPanel();
        hidePanel = new JButton(resBundle.getString("but.hide"));
        showPanel = new JButton(resBundle.getString("but.show"));
        panel.add(changedPanel);
        showPanel.setBounds(640, 785, 80, 15);
        panel.add(showPanel);
        hidePanel.setBounds(720, 785, 80, 15);
        panel.add(hidePanel);
        hidePanel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                buttonPanel.setVisible(false);
                menuPanel.setVisible(false);
                statistics.setVisible(false);
                startButton.setVisible(false);
                stopButton.setVisible(false);
                savButton.setVisible(false);
                resetButton.setVisible(false);
                nButton.setVisible(false);
                exitButton.setVisible(false);
                panel.setBounds(0, 0, 1440, 960);
                showPanel.setBounds(640, 945, 80, 15);
                hidePanel.setBounds(720, 945, 80, 15);
            }
        });
        showPanel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                changedPanel.setVisible(true);
                buttonPanel.setVisible(true);
                menuPanel.setVisible(true);
                statistics.setVisible(true);
                startButton.setVisible(true);
                stopButton.setVisible(true);
                savButton.setVisible(true);
                resetButton.setVisible(true);
                nButton.setVisible(true);
                exitButton.setVisible(true);
                panel.setBounds(0, 0, 1440, 800);
                showPanel.setBounds(640, 785, 80, 15);
                hidePanel.setBounds(720, 785, 80, 15);
            }
        });

        buttonPanel = new JPanel();
        buttonPanel.setBounds(450, 800, 540, 160);
        buttonPanel.setLayout(new GridLayout(2,2));
        frame.getContentPane().add(buttonPanel);
        buttonPanel.setLayout(null);

        startButton = new JButton(resBundle.getString("but.start"));
        startButton.setBounds(15, 24, 150, 50);
        buttonPanel.add(startButton);

        savButton = new JButton(resBundle.getString("but.save"));
        savButton.setBounds(15, 86, 150, 50);
        savButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(frame,
                        "PaĹ„stwo: "+mainCountryName+"\nZapisany index: "+(generalIndex+1),
                        "A plain message",
                        JOptionPane.PLAIN_MESSAGE);
            }
        });
        buttonPanel.add(savButton);

        nButton = new JButton("N");
        nButton.setBounds(375, 24, 150, 50);
        buttonPanel.add(nButton);

        exitButton = new JButton(resBundle.getString("but.exit"));
        exitButton.setBounds(375, 86, 150, 50);
        exitButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);


        resetButton = new JButton(resBundle.getString("but.reset"));
        resetButton.setBounds(195, 86, 150, 50);
        buttonPanel.add(resetButton);

        stopButton = new JButton(resBundle.getString("but.stop"));
        stopButton.setBounds(195, 24, 150, 50);
        buttonPanel.add(stopButton);

        menuPanel = new JPanel();
        menuPanel.setBounds(0, 800, 800, 160);
        frame.getContentPane().add(menuPanel);
        menuPanel.setLayout(null);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 800, 22);
        menuPanel.add(menuBar);

        info = new JButton(resBundle.getString("but.disInfo"));


        menu = new JMenu(resBundle.getString("main.menu"));
        menuBar.add(menu);

        illnesses = new JMenu(resBundle.getString("menuIt.select"));
        menu.add(illnesses);

        cholera = new JMenuItem(resBundle.getString("menuIt.disChol"));
        cholera.setActionCommand(resBundle.getString("menuIt.selectChol"));
        cholera.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                disease=resBundle.getString("menuIt.disChol");
                changeNameofDisease(disease);
                info.setActionCommand(resBundle.getString("menuIt.selectChol"));

            }
        });
        sars = new JMenuItem(resBundle.getString("menuIt.disSARS"));
        sars.setActionCommand(resBundle.getString("menuIt.selectSARS"));
        sars.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                disease=resBundle.getString("menuIt.disSARS");
                changeNameofDisease(disease);
                info.setActionCommand(resBundle.getString("menuIt.selectSARS"));
            }
        });
        dzuma = new JMenuItem(resBundle.getString("menuIt.disDzum"));
        dzuma.setActionCommand(resBundle.getString("menuIt.selectDzum"));
        dzuma.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                disease=resBundle.getString("menuIt.disDzum");
                changeNameofDisease(disease);
                info.setActionCommand(resBundle.getString("menuIt.selectDzum"));
            }
        });
        corona = new JMenuItem(resBundle.getString("menuIt.disCorona"));
        corona.setActionCommand(resBundle.getString("menuIt.selectCorona"));
        corona.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                disease=resBundle.getString("menuIt.disCorona");
                changeNameofDisease(disease);
                info.setActionCommand(resBundle.getString("menuIt.selectCorona"));
            }
        });

        illnesses.add(cholera);
        illnesses.add(sars);
        illnesses.add(dzuma);
        illnesses.add(corona);

        parameters = new JMenu(resBundle.getString("menuIt.parSel"));
        menu.add(parameters);

        center = new JMenuItem(resBundle.getString("menuIt.outbreak"));
        center.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e)
            {
                SelectCountryFrame frame2 = new SelectCountryFrame();
                frame2.setVisible(true);
                String s = center.getText();
                changeLanFr(s,frame2);
                country = frame2.returned(); // zwraca nam wybrane panstwo
            }
        });

        parameters.add(center);
        SelectCountryFrame frame3 = new SelectCountryFrame();

        tim = new JMenuItem(resBundle.getString("menuIt.time"));
        parameters.add(tim);

        SelectCountryFrame fram3 = new SelectCountryFrame();
        fram3.returned();

        step = new JMenuItem(resBundle.getString("menuIt.timeIter"));
        parameters.add(step);

        aspects = new JMenu(resBundle.getString("menuIt.addAsp"));
        menu.add(aspects);

        notifics = new JCheckBox(resBundle.getString("lab.Notif"));
        aspects.add(notifics);

        languageMenu = new JMenu(resBundle.getString("langIt.lang"));
        lang1 = new JMenuItem(resBundle.getString("langIt.pl"));
        lang1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String z = disNamee.getText();
                resBundle = ResourceBundle.getBundle("Projekt/label", new Locale("pl"));
                changeLangName();
                if(z.equals("Cholera")||z.equals("Xолeра"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disChol"));
                    info.setActionCommand(resBundle.getString("menuIt.selectChol"));
                }
                else if(z.equals("SARS")||z.equals("TOPC"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disSARS"));
                    info.setActionCommand(resBundle.getString("menuIt.selectSARS"));
                }
                else if(z.equals("The Black Death")||z.equals("Dżuma")||z.equals("Der Schwarze Tod")||z.equals("Чyma"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disDzum"));
                    info.setActionCommand(resBundle.getString("menuIt.selectDzum"));
                }
                else if(z.equals("The COVID-19(Coronavirus)")||z.equals("COVID-19(Koronawirus)")||z.equals("Das COVID-19(Coronavirus)")||z.equals("COVID-19 (Коронавирус)"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disCorona"));
                    info.setActionCommand(resBundle.getString("menuIt.selectCorona"));
                }
                else
                {
                    changeNameofDisease(resBundle.getString("dis.disNameCho"));
                }

            }
        });
        lang2 = new JMenuItem(resBundle.getString("langIt.en"));
        lang2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String z = disNamee.getText();
                resBundle = ResourceBundle.getBundle("Projekt/Label", new Locale("en"));
                changeLangName();
                if(z.equals("Cholera")||z.equals("Xолeра"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disChol"));
                    info.setActionCommand(resBundle.getString("menuIt.selectChol"));
                }
                else if(z.equals("SARS")||z.equals("TOPC"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disSARS"));
                    info.setActionCommand(resBundle.getString("menuIt.selectSARS"));
                }
                else if(z.equals("The Black Death")||z.equals("Dżuma")||z.equals("Der Schwarze Tod")||z.equals("Чyma"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disDzum"));
                    info.setActionCommand(resBundle.getString("menuIt.selectDzum"));
                }
                else if(z.equals("The COVID-19(Coronavirus)")||z.equals("COVID-19(Koronawirus)")||z.equals("Das COVID-19(Coronavirus)")||z.equals("COVID-19 (Коронавирус)"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disCorona"));
                    info.setActionCommand(resBundle.getString("menuIt.selectCorona"));
                }
                else
                {
                    changeNameofDisease(resBundle.getString("dis.disNameCho"));
                }
            }
        });
        lang3 = new JMenuItem(resBundle.getString("langIt.ge"));
        lang3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String z = disNamee.getText();
                resBundle = ResourceBundle.getBundle("Projekt/Label", new Locale("ge"));
                changeLangName();
                if(z.equals("Cholera")|| z.equals("Xолeра"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disChol"));
                    info.setActionCommand(resBundle.getString("menuIt.selectChol"));
                }
                else if(z.equals("SARS")||z.equals("TOPC"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disSARS"));
                    info.setActionCommand(resBundle.getString("menuIt.selectSARS"));
                }
                else if(z.equals("The Black Death")||z.equals("Dżuma")||z.equals("Der Schwarze Tod") || z.equals("Чyma"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disDzum"));
                    info.setActionCommand(resBundle.getString("menuIt.selectDzum"));
                }
                else if(z.equals("The COVID-19(Coronavirus)")||z.equals("COVID-19(Koronawirus)")||z.equals("Das COVID-19(Coronavirus)")||z.equals("COVID-19 (Коронавирус)"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disCorona"));
                    info.setActionCommand(resBundle.getString("menuIt.selectCorona"));
                }
                else
                {
                    changeNameofDisease(resBundle.getString("dis.disNameCho"));
                }
            }
        });
        lang4 = new JMenuItem(resBundle.getString("langIt.ru"));
        lang4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String z = disNamee.getText();
                resBundle = ResourceBundle.getBundle("Projekt/Label", new Locale("ru"));
                changeLangName();
                if(z.equals("Cholera") || z.equals("Xолeра"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disChol"));
                    info.setActionCommand(resBundle.getString("menuIt.selectChol"));
                }
                else if(z.equals("SARS")||z.equals("TOPC"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disSARS"));
                    info.setActionCommand(resBundle.getString("menuIt.selectSARS"));
                }
                else if(z.equals("The Black Death")||z.equals("Dżuma")||z.equals("Der Schwarze Tod")|| z.equals("Чyma"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disDzum"));
                    info.setActionCommand(resBundle.getString("menuIt.selectDzum"));
                }
                else if(z.equals("The COVID-19(Coronavirus)")||z.equals("COVID-19(Koronawirus)")||z.equals("Das COVID-19(Coronavirus)")||z.equals("COVID-19 (Коронавирус)"))
                {
                    changeNameofDisease(resBundle.getString("menuIt.disCorona"));
                    info.setActionCommand(resBundle.getString("menuIt.selectCorona"));
                }
                else
                {
                    changeNameofDisease(resBundle.getString("dis.disNameCho"));
                }
            }
        });
        languageMenu.add(lang1);
        languageMenu.add(lang2);
        languageMenu.add(lang3);
        languageMenu.add(lang4);
        menuBar.add(languageMenu);

        copyrights = new JButton(resBundle.getString("but.authors"));
        copyrights.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, resBundle.getString("lab.authInfo"), resBundle.getString("lab.authInfoL"), JOptionPane.INFORMATION_MESSAGE);
            }
        });
        copyrights.setHorizontalAlignment(SwingConstants.LEFT);
        menuBar.add(copyrights);

        info.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent wybor)
            {
                if(wybor.getActionCommand() == resBundle.getString("menuIt.selectChol"))
                {
                    JOptionPane.showMessageDialog(null, resBundle.getString("info.notifChol")
                            , resBundle.getString("info.notifCholName"), JOptionPane.INFORMATION_MESSAGE);
                }
                else if(wybor.getActionCommand() == resBundle.getString("menuIt.selectSARS"))
                {
                    JOptionPane.showMessageDialog(null, resBundle.getString("info.notifSARS")
                            , resBundle.getString("info.notifSARSName"), JOptionPane.INFORMATION_MESSAGE);
                }
                else if(wybor.getActionCommand() == resBundle.getString("menuIt.selectDzum"))
                {
                    JOptionPane.showMessageDialog(null,resBundle.getString("info.notifDzum") ,
                            resBundle.getString("info.notifDzumName"), JOptionPane.INFORMATION_MESSAGE);
                }
                else if(wybor.getActionCommand() == resBundle.getString("menuIt.selectCorona"))
                {
                    JOptionPane.showMessageDialog(null,resBundle.getString("info.notifCorona") ,
                            resBundle.getString("info.notifCoronaName"), JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        menuBar.add(info);
        tit = new TitledBorder("");
        pit = new TitledBorder("");
        git = new TitledBorder("");
        menuPanel.setBorder(tit);

        countr = new JLabel(country);
        countr.setBounds(228, 33, 160, 20);
        menuPanel.add(countr);

        title = new JLabel(resBundle.getString("info.countryName"));
        title.setBounds(112, 33, 100, 20);
        menuPanel.add(title);
        buttonPanel.setBorder(pit);

        statistics = new JPanel();
        statistics.setBounds(990, 800, 450, 160);
        frame.getContentPane().add(statistics);
        statistics.setBorder(git);
        statistics.setLayout(null);

        panelDisName = new JPanel();
        panelDisName.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelDisName.setBackground(Color.WHITE);
        panelDisName.setBounds(35, 24, 177, 50);
        statistics.add(panelDisName);

        disNamee = new JLabel(disease);
        panelDisName.add(disNamee);
        disNamee.setForeground(Color.RED);
        disNamee.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
        disNamee.setHorizontalAlignment(SwingConstants.CENTER);
        disNamee.setBackground(Color.WHITE);

        panelCountryName = new JPanel();
        panelCountryName.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        panelCountryName.setBackground(Color.WHITE);
        panelCountryName.setBounds(238, 24, 177, 50);
        statistics.add(panelCountryName);

        countryNam = new JLabel(mainCountryName);
        panelCountryName.add(countryNam,BorderLayout.CENTER);
        countryNam.setForeground(Color.RED);
        countryNam.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
        countryNam.setHorizontalAlignment(SwingConstants.CENTER);
        countryNam.setBackground(Color.WHITE);


        data = new JPanel();
        data.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        data.setBackground(Color.WHITE);
        data.setBounds(35, 86, 177, 50);
        statistics.add(data);
        data.setLayout(null);

        data2 = new JPanel();
        data2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        data2.setBackground(Color.WHITE);
        data2.setBounds(238, 86, 177, 50);
        statistics.add(data2);
        data2.setLayout(null);

        weeks = new JLabel(resBundle.getString("lab.week"));				//licznik trwania choroby, w budowie w przyszĹ‚osci :)
        weeks.setBounds(20, 15, 140, 24);
        weeks.setHorizontalAlignment(SwingConstants.CENTER);
        weeks.setForeground(Color.RED);
        weeks.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
        weeks.setBackground(Color.WHITE);
        data2.add(weeks);

        time = new JLabel("");
        time.setHorizontalAlignment(SwingConstants.CENTER);
        time.setBounds(18, 12, 140, 28);
        data.add(time);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");   // licznik czasu, chwilowo obecny czas uruchomienia programu
        Date date = new Date();
        time.setText( formatter.format(date));

    }
    public void changeNameofDisease(String name)
    {
        disNamee.setText(name);
        disNamee.setForeground(Color.RED);
        disNamee.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
        disNamee.setHorizontalAlignment(SwingConstants.CENTER);
        disNamee.setBackground(Color.WHITE);
    }
    public static void changeNameofCountry(String cName)
    {
        countryNam.setText(cName);
        countryNam.setForeground(Color.RED);
        countryNam.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
        countryNam.setHorizontalAlignment(SwingConstants.CENTER);
        countryNam.setBackground(Color.WHITE);
    }
    public void changeLangName()
    {
        cholera.setText(resBundle.getString("menuIt.disChol"));
        sars.setText(resBundle.getString("menuIt.disSARS"));
        dzuma.setText(resBundle.getString("menuIt.disDzum"));
        corona.setText(resBundle.getString("menuIt.disCorona"));
        illnesses.setText(resBundle.getString("menuIt.select"));
        parameters.setText(resBundle.getString("menuIt.parSel"));
        aspects.setText(resBundle.getString("menuIt.addAsp"));
        copyrights.setText(resBundle.getString("but.authors"));
        info.setText(resBundle.getString("but.disInfo"));
        center.setText(resBundle.getString("menuIt.outbreak"));
        tim.setText(resBundle.getString("menuIt.time"));
        step.setText(resBundle.getString("menuIt.timeIter"));
        notifics.setText(resBundle.getString("menuIt.time"));
        title.setText(resBundle.getString("info.countryName"));
        countr.setText(resBundle.getString("dis.disNameOutbreak"));
        startButton.setText(resBundle.getString("but.start"));
        savButton.setText(resBundle.getString("but.save"));
        stopButton.setText(resBundle.getString("but.stop"));
        resetButton.setText(resBundle.getString("but.reset"));
        nButton.setText(resBundle.getString("but.sth"));
        nButton.setText(resBundle.getString("but.sth"));
        exitButton.setText(resBundle.getString("but.exit"));
        showPanel.setText(resBundle.getString("but.show"));
        hidePanel.setText(resBundle.getString("but.hide"));
        weeks.setText(resBundle.getString("lab.week"));
        languageMenu.setText(resBundle.getString("langIt.lang"));
        menu.setText(resBundle.getString("main.menu"));
        lang1.setText(resBundle.getString("langIt.pl"));
        lang2.setText(resBundle.getString("langIt.en"));
        lang3.setText(resBundle.getString("langIt.ge"));
        lang4.setText(resBundle.getString("langIt.ru"));
        countryNam.setText(resBundle.getString("info.countryName"));

    }
    public void changeLanFr(String s, SelectCountryFrame frame)
    {
        if(s.equals("Ognisko epidemii") || s.equals("Đ¦ĐµĐ˝Ń‚Ń€ ŃŤĐżĐ¸Đ´ĐµĐĽĐ¸Đ¸") || s.equals("Outbreak")||s.equals("Ausbruch"))
        {
            frame.selCountry = resBundle.getString("dis.disNameOutbreak");
            frame.setTitle(frame.selCountry);
            frame.set.setText(resBundle.getString("x.sel"));
            frame.back.setText(resBundle.getString("x.an"));
            frame.select.setText(frame.selCountry);
        }
    }

}
