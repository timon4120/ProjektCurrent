package Projekt;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;


import java.awt.event.ActionListener;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.util.ResourceBundle;

public class SelectCountryFrame extends JFrame
{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private ResourceBundle ressBundle = ResourceBundle.getBundle("Projekt/label", new Locale("en"));
    private JPanel contentPane,panel ;
    public String selCountry = ressBundle.getString("dis.disNameOutbreak");
    public int countryIndex;
    JButton back,set;
    public JLabel select;
    private JComboBox<String> countries;
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                try
                {
                    SelectCountryFrame frame = new SelectCountryFrame();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */

    public SelectCountryFrame()
    {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle(selCountry);
        setBounds(100, 100, 450, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        panel = new JPanel();
        panel.setBounds(0, 0, 434, 261);
        contentPane.add(panel);
        panel.setLayout(null);

        select = new JLabel(ressBundle.getString("dis.disNameOutbreak"));
        select.setFont(new Font("Tahoma", Font.BOLD, 13));
        select.setHorizontalAlignment(SwingConstants.CENTER);
        select.setBounds(122, 25, 200, 44);
        panel.add(select);

        set = new JButton(ressBundle.getString("x.sel"));
        set.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                selCountry = countries.getSelectedItem().toString();
                countryIndex = countries.getSelectedIndex();
                Projekt.title.setText(selCountry);
                String val = String.valueOf((countryIndex+1));
                Projekt.countr.setText("Indeks państwa: "+val);
                Projekt.generalIndex = countryIndex;
                Projekt.mainCountryName = selCountry;
                Projekt.changeNameofCountry(selCountry);
                dispose();
            }
        });
        set.setBounds(114, 116, 103, 23);
        panel.add(set);

        back = new JButton(ressBundle.getString("x.an"));
        back.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                selCountry="";
                dispose();
            }
        });
        back.setBounds(227, 116, 99, 23);
        panel.add(back);

        countries = new JComboBox<String>(getAllCountries());
        countries.setBounds(111, 77, 215, 23);
        panel.add(countries);


    }
    public String returned() {
        return selCountry;
    }
    public int returnedIndex() {return countryIndex; }
    public String[] getAllCountries()
    {
        String[] countries = new String[Locale.getISOCountries().length];
        String[] countryCodes = Locale.getISOCountries();
        for (int i = 0; i < countryCodes.length; i++)
        {
            Locale obj = new Locale("", countryCodes[i]);
            countries[i] = obj.getDisplayCountry();
        }
        return countries;
    }
}