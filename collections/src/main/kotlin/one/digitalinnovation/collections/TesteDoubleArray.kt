package one.digitalinnovation.collections

fun main () {
    val salarios = doubleArrayOf(365.6, 125.9, 548.5, 251.8, 798.3)
    //também pode declarar só o tamanho e nomear em baixo como feito das outras vezes (melhor opção)

    for (salario in salarios) {
        println(salario)
    }

    println("\n ORDENANDO OS SALÁRIOS...")

    salarios.sort()

    salarios.forEach {
        println(it)
    }

    println("\n AUMENTANDO NO SALÁRIO..")

    salarios.forEachIndexed { index, salario -> //para iterrar o salario (no caso de uma comissão, por exemplo)
        salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println(it)
    }

    val salarios2 = DoubleArray(5) //outra forma de declarar

    salarios2[0] = 984.9
    salarios2[1] = 784.3
    salarios2[2] = 142.8
    salarios2[3] = 165.4
    salarios2[4] = 120.3

    println ("\nOutra forma de declarar Double Array...")

    salarios2.sort()

    salarios2.forEach {
        println(it)
    }
}
