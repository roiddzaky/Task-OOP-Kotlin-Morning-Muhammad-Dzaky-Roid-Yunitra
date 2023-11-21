package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun bagi(angkaPembilang: Int, angkaPenyebut: Int) {
        if (angkaPenyebut != 0) {
            val hasil = angkaPembilang / angkaPenyebut
            println("Hasil pembagian: $hasil")
        } else {
            println("Tidak bisa melakukan pembagian dengan nol")
        }
    }

    bagi(10, 0)
}

