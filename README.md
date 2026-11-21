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
<img width="347" height="308" alt="Screenshot 2026-11-21 161725" src="https://github.com/user-attachments/assets/a094057d-317e-4c58-be07-9ae616f3a717" />


### 2. Pilihan Varian Jus (`JComboBox`)
<img width="659" height="633" alt="Screenshot (1401)" src="https://github.com/user-attachments/assets/a63a9c9e-821e-4171-9937-5894b96c7f38" />


### 3. Tambah Pesanan (`JButton` & `JTable`)
<img width="663" height="618" alt="Screenshot (1402)" src="https://github.com/user-attachments/assets/bd3dea3c-00c9-46a9-a9da-d143ed4247f3" />


### 4. Konfirmasi Pesanan (`JOptionPane`)
<img width="664" height="618" alt="Screenshot (1403)" src="https://github.com/user-attachments/assets/c933483b-c191-4d7d-b14c-822a9b73dde0" />
