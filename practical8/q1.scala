object q1 {
  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val base = if (char.isLower) 'a' else 'A'
        ((char - base + shift) % 26 + base).toChar
      } else {
        char
      }
    }
  }

  def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
  }

  def cipher(
      process: (String, Int) => String,
      text: String,
      shift: Int
  ): String = {
    process(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "C@at"
    val shift = 3

    println(s"Plain text: $plaintext")

    val encryptedtext = cipher(encrypt, plaintext, shift)
    println(s"Encrypted Text: $encryptedtext")

    val decryptedtext = cipher(decrypt, encryptedtext, shift)
    println(s"Decrypted Text: $decryptedtext")
  }
}
