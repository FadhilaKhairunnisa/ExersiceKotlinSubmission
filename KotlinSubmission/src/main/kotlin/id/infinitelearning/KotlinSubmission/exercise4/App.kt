package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */


    fun foo(number: Int) {
        val result =  try {
            if (number != 1) {
                throw IllegalArgumentException()
            }
            true
        } catch (e: IllegalArgumentException) {
            false
        }

        println (3)
    }
}