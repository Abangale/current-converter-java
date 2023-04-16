package TubesPBO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class pageRupee extends JPanel implements ActionListener {
    private JLabel l1, l2;
    private JTextField t1, t2;
    private JButton b1, b2, b3;
    private double rateIDR, rateUSD, rateBaht, rateRupee;
    public pageRupee() {
        setLayout(null);
        setSize(450,255);
        setBackground(Color.lightGray);

        hargaKurs();

        l1 = new JLabel("Input Mata Uang Rupee");
        l2 = new JLabel("Hasil Konversi Mata Uang");
        t1 = new JTextField("");
        t2 = new JTextField("");
        b1 = new JButton("IDR");
        b2 = new JButton("USD");
        b3 = new JButton("Baht");

        add(l1);
        l1.setBounds(30,0,200,100);

        add(t1);
        t1.setBounds(200,41,200,20);

        add(t2);
        t2.setBounds(200, 180,200,20);

        add(b1);
        b1.setBounds(30,100,100,50);

        add(b2);
        b2.setBounds(170,100,100,50);

        add(b3);
        b3.setBounds(300,100,100,50);

        add(l2);
        l2.setBounds(30,138,200,100);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void hargaKurs() {
        rateIDR = 15591.50;
        rateUSD = 1;
        rateBaht = 33.96;
        rateRupee = 82.78;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        //Convert to IDR
        if (source == b1) {
            double rupee = Double.parseDouble(t1.getText());
            double usd = rupee / rateRupee;
            double idr = usd * rateIDR;
            t2.setText(idr + "");
            l2.setText("Hasil Konversi IDR");
        }

        //Convert to USD
        else if (source == b2) {
            double rupee = Double.parseDouble(t1.getText());
            double usd = rupee / rateRupee;
            t2.setText(usd + "");
            l2.setText("Hasil Konversi USD");
        }

        //Convert to Baht
        else if (source == b3) {
            double rupee = Double.parseDouble(t1.getText());
            double usd = rupee / rateRupee;
            double baht = usd * rateBaht;
            t2.setText(baht + "");
            l2.setText("Hasil Konversi Baht");
        }
    }
}