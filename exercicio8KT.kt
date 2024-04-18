//Kotlin Compiler version 1.3.11
//do not place package here, no need


fun main(args: Array<String>) {
  println(temp("Tokyo", 20, 80))
  println(temp("New York", 50, 90))
}


fun temp (city: String, temp: Int, rain: Int): String {
  return "city: $city\nLow temperature: $temp\nchance of rain: $rain%\n "
  
  
}