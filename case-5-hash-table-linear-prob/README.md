# Case 5 - Hash Table Linear Probing

Implementasi Hash Table dengan Linear Probing menggunakan Java.

## Deskripsi

Program ini mengimplementasikan struktur data Hash Table dengan collision resolution menggunakan Linear Probing. Hash table berukuran 7 dan dapat menyimpan data kendaraan.

## Study Case

Buatlah sebuah program dalam bahasa Java yang mengimplementasikan Linear Probing. Hash tabel berukuran 7 dengan urutan insert:
```
Motor → Mobil → Bus → Truk → Kereta → Sepeda → Kapal
```

## Fitur Program

- **Hash Function**: Sum of ASCII values modulo capacity
- **Collision Resolution**: Linear Probing (check next slot)
- **Table Size**: 7 slots
- **Data Type**: String (nama kendaraan)
- **Operations**: Insert, Search, Display

## Struktur Kode

- **`HashTable.java`** - Kelas utama untuk hash table dengan linear probing
- **`Main.java`** - Entry point aplikasi dengan demo

## Cara Kerja Linear Probing

1. **Hash Function**: Hitung hash value dari key
2. **Insert**: Jika slot kosong, insert data
3. **Collision**: Jika slot terisi, cek slot berikutnya
4. **Search**: Gunakan linear probing untuk mencari data

## Cara Menjalankan

1. **Build project:**
   ```bash
   make build
   ```

2. **Run aplikasi:**
   ```bash
   make run
   ```

3. **Build dan run sekaligus:**
   ```bash
   make br
   ```

4. **Clean compiled files:**
   ```bash
   make clean
   ```

## Output yang Diharapkan

Program akan menampilkan:
- Proses insert setiap kendaraan
- Collision handling dengan linear probing
- Hash table final state
- Demo search functionality
- Informasi load factor dan ukuran

## Contoh Collision

Karena ukuran tabel hanya 7 dan ada 7 kendaraan, kemungkinan terjadi collision yang akan dihandle dengan linear probing.
