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
