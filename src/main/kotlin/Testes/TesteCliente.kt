package Testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val marialice = Cliente (
        nome = "Marialice Freitas",
        cpf ="087.887.894-70",
        clienteTipo = ClienteTipo.PF,
        senha = "123senha"
    )
    println(marialice)
    TesteAutenticacao().autentica(marialice)
}