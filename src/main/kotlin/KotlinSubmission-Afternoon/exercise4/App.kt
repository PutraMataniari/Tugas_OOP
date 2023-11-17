package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    try {
        // Get user input for a name
        print("Enter your name: ")
        val userInput = readLine()

        // Check if the input is null or empty
        if (userInput.isNullOrBlank()) {
            throw IllegalArgumentException("Nama tidak ada atau data tidak ter input")
        }

        // Print the name if input is valid
        println("Hello, $userInput!")
    } catch (e: IllegalArgumentException) {
        // Handle the exception for invalid input
        println("Error: ${e.message}")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
