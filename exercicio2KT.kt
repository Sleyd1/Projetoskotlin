/* corrigir os erros deste programa abaixo:
    
  fun main() {
    val discountPercentage: Int = 0
    val offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}
  
   
  */




//resposta:

fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}



/* "val" é uma variável q não pode ser atribuida logo 
as variáveis "discountPercentage" e "offer" seriam os
erros deste código pois foram reatribuidas,
A solução disso foi mudar val para var pois variáveis declaradas
com "var" podem ser reatribuidas.
 */