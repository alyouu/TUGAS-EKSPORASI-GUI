import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

// interface
interface Aksi {
    void tambah();
    void pesan();
}

// abstract class
abstract class DataJuice extends JFrame {
    abstract void tampilkanData();
}

class JuiceBar extends DataJuice implements Aksi {

    JTextField nama = new JTextField();
    JTextField jumlah = new JTextField();

    JComboBox<String> varian = new JComboBox<String>(new String[]{
        "Mango Sunset - Rp 15000",
        "Berry Breeze - Rp 18000",
        "Fresh Orange - Rp 12000"
    });

    DefaultTableModel model = new DefaultTableModel(
        new String[]{"Pemesan", "Menu Jus", "Jumlah", "Subtotal"}, 0
    );
    JTable tabel = new JTable(model);

    JuiceBar() {

        setTitle("Aplikasi Pemesanan Juice Bar");
        setSize(450, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // BorderLayout
        JPanel panel = new JPanel(new BorderLayout(5, 5));

        // GridLayout
        JPanel isi = new JPanel(new GridLayout(0, 1, 5, 5));

        isi.add(new JLabel("JUICE BAR", JLabel.CENTER));
        isi.add(new JLabel("Nama Pemesan"));
        isi.add(nama);

        isi.add(new JLabel("Varian Jus"));
        isi.add(varian);

        isi.add(new JLabel("Jumlah Gelas"));
        isi.add(jumlah);

        JButton tombolTambah = new JButton("Tambah");
        JButton tombolPesan = new JButton("Pesan");

        // FlowLayout
        JPanel tombol = new JPanel(new FlowLayout());

        tombol.add(tombolTambah);
        tombol.add(tombolPesan);

        JPanel atas = new JPanel(new BorderLayout());
        atas.add(isi, BorderLayout.CENTER);
        atas.add(tombol, BorderLayout.SOUTH);

        panel.add(atas, BorderLayout.NORTH);
        panel.add(new JScrollPane(tabel), BorderLayout.CENTER);

        // Event Listener
        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambah();
            }
        });

        tombolPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesan();
            }
        });

        add(panel);
        setVisible(true);
    }

    @Override
    public void tambah() {

        if (nama.getText().isEmpty() || jumlah.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data belum lengkap!");
        } else {
            tampilkanData();
        }
    }

    @Override
    public void tampilkanData() {

        int[] harga = {15000, 18000, 12000};
        String[] menu = {"Mango Sunset", "Berry Breeze", "Fresh Orange"};

        int index = varian.getSelectedIndex();
        int jml = Integer.parseInt(jumlah.getText());
        int subtotal = harga[index] * jml;

        model.addRow(new Object[]{nama.getText(), menu[index], jml, subtotal});
        jumlah.setText("");
    }

    @Override
    public void pesan() {

        JOptionPane.showMessageDialog(this, "Terima kasih sudah order di Juice Bar!");
        model.setRowCount(0);
        nama.setText("");
    }
}

public class Main {
    public static void main(String[] args) {
        new JuiceBar();
    }
}