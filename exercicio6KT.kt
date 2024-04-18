//Kotlin Compiler version 1.3.11
//do not place package here, no need


fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(valorB = emailId))
    println(displayAlertMessage(valorA = operatingSystem, valorB = emailId))
}

//especificando um parâmetro devemos devemos especifica o valor q ele ira receber também 
fun displayAlertMessage(valorA: String = "Unknown Os", valorB: String): String {

 return "There's a new sign-in request on $valorA for your Google Account $valorB."

}