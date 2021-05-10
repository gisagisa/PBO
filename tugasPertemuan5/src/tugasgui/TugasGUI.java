package tugasgui;

import java.awt.event.*;
import javax.swing.*;

public class TugasGUI {

    public static void main(String[] args) {
        new GUI();
    }
}

class GUI extends JFrame implements ActionListener {

    //untuk mengisi inputan
    JLabel lpanjang = new JLabel("Panjang");
    final JTextField fpanjang = new JTextField();
    JLabel llebar = new JLabel("Lebar");
    final JTextField flebar = new JTextField();
    JLabel ltinggi = new JLabel("Tinggi");
    final JTextField ftinggi = new JTextField();

    //button
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");

    //untuk menampilkan hasil
    JTextField fluas = new JTextField("");
    JTextField fkeliling = new JTextField("");
    JTextField fvolume = new JTextField("");
    JTextField fluasPermukaan = new JTextField("");

    public GUI() {
        setTitle("Perhitungan");
        setSize(350, 350);

        setLayout(null);
        add(lpanjang);
        add(llebar);
        add(ltinggi);
        add(fpanjang);
        add(flebar);
        add(ftinggi);
        add(bhitung);
        add(breset);

        //set bounds(m,n,o,p)
        lpanjang.setBounds(50, 20, 120, 20);
        fpanjang.setBounds(170, 20, 120, 20);
        llebar.setBounds(50, 60, 120, 20);
        flebar.setBounds(170, 60, 120, 20);
        ltinggi.setBounds(50, 100, 120, 20);
        ftinggi.setBounds(170, 100, 120, 20);

        bhitung.setBounds(180, 160, 100, 20);
        breset.setBounds(60, 160, 100, 20);

        setVisible(true);

        bhitung.addActionListener(this);
        breset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {
        double panjang;
        double lebar;
        double tinggi;
        if (e.getSource() == bhitung) {

            try {
                tinggi = Double.parseDouble(ftinggi.getText());
                panjang = Double.parseDouble(fpanjang.getText());
                lebar = Double.parseDouble(flebar.getText());
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                Balok balok = new Balok(panjang, lebar, tinggi);

                //untuk menampilkan hasil
                JLabel lluas = new JLabel("Luas");
                fluas = new JTextField("" + persegipanjang.Luas());
                JLabel lkeliling = new JLabel("Keliling");
                fkeliling = new JTextField("" + persegipanjang.Keliling());
                JLabel lvolume = new JLabel("Volume");
                fvolume = new JTextField("" + balok.Volume());
                JLabel lluasPermukaan = new JLabel("Luas Permukaan");
                fluasPermukaan = new JTextField("" + balok.Luaspermukaan());

                add(lluas);
                add(fluas);
                add(lkeliling);
                add(fkeliling);
                add(lvolume);
                add(fvolume);
                add(lluasPermukaan);
                add(fluasPermukaan);

                //set bounds(m,n,o,p)
                lluas.setBounds(22, 210, 60, 20);
                fluas.setBounds(8, 240, 60, 20);
                lkeliling.setBounds(85, 210, 60, 20);
                fkeliling.setBounds(78, 240, 60, 20);
                lvolume.setBounds(155, 210, 60, 20);
                fvolume.setBounds(148, 240, 60, 20);
                lluasPermukaan.setBounds(225, 210, 100, 20);
                fluasPermukaan.setBounds(218, 240, 110, 20);

                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                System.out.println("\n===OUTPUT===");
                System.out.println("Luas Persegi         : " + persegipanjang.Luas());
                System.out.println("Keliling Persegi     : " + persegipanjang.Keliling());
                System.out.println("Volume Balok         : " + balok.Volume());
                System.out.println("Luas Permukaan Balok : " + balok.Luaspermukaan());
            } catch (Exception error) {
     
                if (fpanjang.getText().equals("") || flebar.getText().equals("") || ftinggi.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "error : Input kosong, lengkapi input");
                    ftinggi.requestFocus();
                    fpanjang.requestFocus();
                    flebar.requestFocus();
                    return;
                } else {
                    JOptionPane.showMessageDialog(null, "error : Input tidak sesuai, masukkan angka");
                    ftinggi.requestFocus();
                    fpanjang.requestFocus();
                    flebar.requestFocus();
                    return;
                }
            }
        }
        if (e.getSource() == breset) {

            fpanjang.setText("");
            flebar.setText("");
            ftinggi.setText("");
            fluas.setText("");
            fkeliling.setText("");
            fluasPermukaan.setText("");
            fvolume.setText("");

        }

    }
}
