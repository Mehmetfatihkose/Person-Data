import java.util.Scanner

// Kişi bilgilerini tutan data class
data class Kisi(val ad: String, val soyad: String, val yas: Int, val telefonNumarasi: String)

fun main() {
    val scanner = Scanner(System.`in`)
    
    print("Adınızı giriniz: ")
    val ad = scanner.nextLine()
    
    print("Soyadınızı giriniz: ")
    val soyad = scanner.nextLine()
    
    var yas: Int
    do {
        print("Yaşınızı giriniz (sadece sayı): ")
        val yasInput = scanner.nextLine()
        yas = yasInput.toIntOrNull() ?: -1
        if (yas == -1) println("Lütfen geçerli bir sayı giriniz!")
    } while (yas == -1)
    
    var telefonNumarasi: String
    do {
        print("Telefon numaranızı giriniz (sadece sayı): ")
        telefonNumarasi = scanner.nextLine()
        if (!telefonNumarasi.all { it.isDigit() } || telefonNumarasi.isEmpty()) {
            println("Lütfen sadece sayı giriniz!")
        }
    } while (!telefonNumarasi.all { it.isDigit() } || telefonNumarasi.isEmpty())

    val kisi = Kisi(ad, soyad, yas, telefonNumarasi)
    println("Girilen bilgiler: $kisi")
}
