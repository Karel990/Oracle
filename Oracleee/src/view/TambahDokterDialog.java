
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model_RS.Dokter;
import model_RS.RumahSakit;

/**
 *
 * @author user only
 */
public class TambahDokterDialog extends JDialog {

    private RumahSakit rumahSakit;
    private JLabel tambahDokterLabel;
    private JLabel _________________;
    private JLabel idDokterLabel;
    private JTextField idDokterText;
    private JLabel namaDokterLabel;
    private JTextField namaDokterText;
    private JButton tambahButton;
    private MyDokterDialog owner;

    public TambahDokterDialog(MyDokterDialog owner, RumahSakit rs) {
        super(owner);
        rumahSakit = rs;
        this.owner= owner;
        init();
    }

    /**
     * Fungsi untuk inisialisasi
     */
    public void init() {
        // set size
        setSize(400, 300);
        // set layout
        setLayout(null);
        // tambah Tombol Tambah
        tambahButton = new JButton("TAMBAH");
        tambahButton.setBounds(50, 200, 100, 30);
        add(tambahButton);
        
        tambahDokterLabel = new JLabel("TAMBAH DOKTER");
        tambahDokterLabel.setBounds(50, 25, 200, 30);
        add(tambahDokterLabel);
        
        _________________ = new JLabel("_______________");
        _________________.setBounds(50, 26, 200, 30);
        add(_________________);
        
        idDokterLabel = new JLabel("ID DOKTER : ");
        idDokterLabel.setBounds(50, 50, 200, 30);
        add(idDokterLabel);
        
          idDokterText = new JTextField(25);
        idDokterText.setBounds(50, 75, 200, 30);
        add(idDokterText);
        
          namaDokterLabel = new JLabel("NAMA DOKTER : ");
        namaDokterLabel.setBounds(50, 100, 200, 30);
        add(namaDokterLabel);
        
          namaDokterText = new JTextField(25);
        namaDokterText.setBounds(50, 125, 200, 30);
        add(namaDokterText);
        
        // set action listener button
        tambahButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahDokter();
            }
        });

    }

    public void tambahDokter() {
        Dokter dr1 = new Dokter (idDokterText.getText() , namaDokterText.getText());
        rumahSakit.tambahDokter(dr1);
        owner.refreshTabelDokter();
        dispose();
        
    }
}
