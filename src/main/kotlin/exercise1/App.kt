package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan = "Muhammad Dzaky"
    val namaBelakang = "Roid Yunitra"
    val umur = 22
    val  statusSingle = false

    println("Nama Depan: $namaDepan\nNama Belakang: $namaBelakang\nUmur: $umur\nStatus Single: $statusSingle")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupName: String, groupMember: List<Any>, session: String): Any {
    return "Nama Group: $groupName\nDaftar Member: $groupMember\nSesi: $session"
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupDetail = listOf("Dzaky", "Jamal", "Ratna", "Wulan", "Fyga", "Jaya", "Yudi", "Owen", "Amel", "Silvi")
    return listOf("${groupDetail[0]}")
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): String {

    val mentor = arrayOf<String>("Kak Reza", "Kak Widya", "Kak Ayat")
    val countOfGroup = arrayOf<String>("Dzaky", "Jamal", "Ratna", "Wulan", "Fyga", "Jaya", "Yudi", "Owen", "Amel", "Silvi")
    val count = "${mentor.size + countOfGroup.size}"

    return "$count"
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("POSESIVE", listOf("Dzaky","Jamal", "Ratna", "Wulan", "Fyga", "Jaya", "Yudi", "Owen", "Amel", "Silvi"), "Morning")

}