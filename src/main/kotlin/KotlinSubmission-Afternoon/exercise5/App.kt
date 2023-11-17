package id.infinitelearning.KotlinSubmission.exercise5

fun main() {

    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */

   val hero = Hero()



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */


    hero.setProfile ("Tri Saputra. S", 22, 165)




    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */

    hero.profile()


    /**
    Challenge:
    ===============Class A Afternoon===============
    HA HENG -> jalan 3x, lari 2x, makan 4x, minum 1x, lompat 5x, duduk 1x
    **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    for (i in 1..5) {
        if (i == 1) {
            hero.duduk()
            hero.minum()

        }
        if (i <= 2) {
            hero.lari()
        }
        if (i <= 3) {
            hero.jalan()
        }
        if (i <= 4) {
            hero.makan()
        }
        if (i <= 5) {
            hero.lompat()
        }
    }



    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    hero.profile()


}