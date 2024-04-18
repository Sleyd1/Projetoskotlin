//implementar matemática basica


fun main() {
  val firstNumber = 10
  val secondNumber = 5
  val thirdNumber = 8
    
  val result = add(firstNumber, secondNumber)
  val anotherResult = subtract(firstNumber, thirdNumber)
    
  println("$firstNumber + $secondNumber = $result")
  println("$firstNumber - $thirdNumber = $anotherResult")
}



fun add(firstNumber: Int, secondNumber: Int): Int {
   return firstNumber + secondNumber
    //escrever o tipo com a letra inicial maiúscula.
}

fun subtract(number1: Int, number2: Int): Int {
  return number1 - number2
  
  
}