fun main() {
    val a = 55
    val b = 325

    var max = a
    if( a < b) max = b



    // as expression, a varivel recebe o valor da condição.
    max = if (a > b) a else b
//    println(max)

    //as expression, else if
    val maxLimit = 1
    val maxOrLimit = if(maxLimit > a) maxLimit else if(a > b) a else b
    println("max is $max")
    println("maxOrLimit is $maxOrLimit")

    //scopo em bloco

    if(a > b){
        max = a
        print(max)
    }else{
        max = b
    }

    // when é semelhante ao switch case
    var x = 0
    when(x){
        1 -> print("x == 1")
        2 -> print("x == 2")

        else ->{ print("x is neither 1 nor  2")}

    }
}