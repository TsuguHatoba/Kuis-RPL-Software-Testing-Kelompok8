class StudentController () {
    val mahasiswa = Student()

    fun getFormatTanggal(tanggal: String): String {
        return mahasiswa.formatTanggal(tanggal)
    }
}