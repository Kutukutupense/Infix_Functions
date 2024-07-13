fun main() {
    val sonuc = 3 topla 5 topla 10
    println(sonuc)

    val sonuc2 = "İmam hatipler" birlestir " Kapatılsın"
    println(sonuc2)

}
infix fun Int.topla(other: Int): Int {
    return this + other
}
infix fun String.birlestir(other: String): String{
    return this + other
}

// infix functions kodun daha okunabilir olmasını sağlamak amacı ile kullanılan fonksiuonlardır
// infixler bir class a ait olmalıdır. Int.topla yaptık mesela ya da String.birlestir gibi
// sadece 1 parametre içerebilir. birden fazla parametre ve vararg da kullanılamaz
// burada this  değeri ilk parametreyi yani 3 ü.
// other değeri 5 i ve 10 u verir.