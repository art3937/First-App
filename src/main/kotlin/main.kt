fun main(){
    println("First App")
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1_0000

    var totalPrise = itemPrice * itemCount
    if(totalPrise > discountStart){
        totalPrise -= discount
    }
    println(totalPrise)
}