fun main(){
    println("First App")
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_000

    val totalPrise = itemPrice * itemCount
   val result = if(totalPrise > discountStart){
        totalPrise -discount
    } else {
        totalPrise
   }
    println(result)
}