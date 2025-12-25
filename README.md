#   Percobaan 1

---

##  Soal

1.  Apa yang dimaksud dengan fungsi rekursif? 
2.  Pada Percobaan1, apakah hasil yang diberikan fungsi faktorialRekursif() dan fungsi faktorialIteratif() sama? Jelaskan perbedaan alur jalannya program pada penggunaan fungsi rekursif dan fungsi iteratif! 

---

##  Jawaban

1.  Fungsi rekursif adalah fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah, dengan syarat harus punya kondisi berhenti (base case) supaya tidak berjalan terus-menerus. Pada program ini, fungsi faktorialRekursif() akan terus memanggil dirinya sendiri dengan nilai n - 1 sampai n == 0, lalu berhenti dan mengembalikan nilai 1.
2.  Hasil yang diberikan oleh fungsi faktorialRekursif() dan faktorialIteratif() adalah sama, yaitu nilai faktorial dari bilangan yang sama. Pada contoh n = 5, kedua fungsi menghasilkan nilai 120.

Perbedaannya terletak pada alur program. Fungsi rekursif menghitung faktorial dengan memanggil dirinya sendiri hingga mencapai kondisi berhenti (n == 0), sedangkan fungsi iteratif menggunakan perulangan for tanpa pemanggilan fungsi berulang.

---

#   Percobaan 2

---

##  Soal

1.  Pada Percobaan2, terdapat pemanggilan fungsi rekursif hitungPangkat(bilangan, pangkat) pada fungsi main, kemudian dilakukan pemanggilan fungsi hitungPangkat() secara berulangkali. Jelaskan sampai kapan proses pemanggilan fungsi tersebut akan dijalankan! 
2.  Tambahkan kode program untuk mencetak deret perhitungan pangkatnya. Contoh: hitungPangkat(2,5) dicetak 2x2x2x2x2x1 = 32

---

##  Jawaban

1.  Proses pemanggilan fungsi rekursif hitungPangkat(x, y) akan terus dijalankan selama nilai y belum sama dengan 0. Pemanggilan akan berhenti ketika y == 0 (base case), kemudian fungsi mengembalikan nilai 1.
2.  done✅

---

#   Percobaan 3

---

##  Soal

1.  Pada Percobaan3, sebutkan blok kode program manakah yang merupakan “base case”  dan “recursion call”! 
2.  Jabarkan trace fase ekspansi dan fase subtitusi algoritma,  perhitungan laba di atas jika  diberikan nilai hitungLaba(100000,3) 

---

##  Jawaban

1.  base case:

```java
    if (tahun == 0) {
        return (saldo);
    }
```

_Recursion_ _call_ : 

```java
    return (1.11 * hitungLaba(saldo, tahun - 1));
```

2.  Trace fase ekspansi dan subtitusi untuk hitungLaba(100000, 3):

Fase Ekspansi:

```java
    hitungLaba(100000,3)
    = 1.11 * hitungLaba(100000,2)
    = 1.11 * (1.11 * hitungLaba(100000,1))
    = 1.11 * (1.11 * (1.11 * hitungLaba(100000,0)))
```

Fase Subtitusi:

```java
    hitungLaba(100000,0) = 100000
    = 1.11 * 100000
    = 111000
    = 1.11 * 111000
    = 123210
    = 1.11 * 123210
    = 136763.1
```

--- 