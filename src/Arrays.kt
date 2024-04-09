fun main() {
    val simpleArray = arrayOf(1,2,3)
    println(simpleArray.joinToString())

    val namesOfArray = arrayOf("Alex", "Maria", "Joaquim")
    println(namesOfArray.joinToString(postfix = "!"))
    println("Meu nome é: ${namesOfArray[0]}.")
}