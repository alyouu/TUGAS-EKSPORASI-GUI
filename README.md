# Eksplorasi GUI Java di Aplikasi Pemesanan Juice Bar

Tugas Pemrograman Berorientasi Objek (PBO)

- **Nama:** Alya Zulfadila
- **NIM:** F1D02510102

## Struktur Kode (`Main.java`)
- `interface Aksi` : Mendeklarasikan method `tambah()` dan `pesan()`.
- `abstract class DataJuice extends JFrame`: Kelas abstrak kerangka jendela dengan method abstrak `tampilkanData()`.
- `class JuiceBar extends DataJuice implements Aksi` : Implementasi GUI (`JPanel`, `JLabel`, `JTextField`, `JComboBox`, `JButton`, `JTable`, `JOptionPane`), Layout Manager (`BorderLayout`, `GridLayout`, `FlowLayout`), dan `ActionListener`.
- `public class Main` : Method utama untuk menjalankan aplikasi.

## Dokumentasi Tampilan

### 1. Tampilan Awal


### 2. Pilihan Varian Jus (`JComboBox`)


### 3. Tambah Pesanan (`JButton` & `JTable`)


### 4. Konfirmasi Pesanan (`JOptionPane`)
