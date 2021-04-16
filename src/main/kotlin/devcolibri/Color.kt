enum class Color(val colorHex: String, val opacity: Double = 1.0) {

    RED("#11111"),
    BLACK("#22222", 0.25),
    WHITE("#33333", 0.25),
    GREEN("#44444", 0.25);

    fun some(){
        print("my logic")
    }

}