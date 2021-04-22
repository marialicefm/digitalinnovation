package one.digitalinnovation.digionebank

import java.math.BigDecimal

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome + $numero"

}
