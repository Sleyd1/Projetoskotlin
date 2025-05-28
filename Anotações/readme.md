

````kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}


````

A função ``onCreate()`` é o ponto de entrada do app Android e chama outras funções para criar a interface do usuário. Nos programas Kotlin, a função ``main()`` é o ponto de entrada/de partida da execução. Em apps Android, a função ``onCreate()`` cumpre esse papel.


A função ``setContent()`` na função ``onCreate()`` é usada para definir o layout usando funções de composição. Todas as funções marcadas com a anotação ``@Composable`` podem ser chamadas na função ``setContent()`` ou em outras funções de composição. A anotação diz ao compilador Kotlin que essa função é usada pelo Jetpack Compose para gerar a IU.

``
Observação: o compilador usa o código Kotlin que você escreveu, analisa cada linha e traduz em algo que o computador entenda. Esse processo é chamado de compilação do código.
``

Agora, observe a função Greeting(). A função Greeting() é combinável e, por esse motivo, a anotação @Composable aparece acima dela. Essa função recebe uma entrada e gera o que será mostrado na tela.

`````kotlin
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

`````

existem algumas diferenças em relação às funções de composição. 

![image](https://github.com/user-attachments/assets/3229a988-156a-454d-8ca9-c439314e3fa9)

1.  A anotação @Composable é adicionada antes da função.
2.  Nomes de funções @Composable usam letras maiúsculas.
3.  As funções @Composable não podem retornar nada.

````kotlin
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


````

1. Para criar um novo projeto: abra o Android Studio, clique em New Project > Empty Activity > Next, digite um nome para o projeto e defina as configurações.
1. Para ver a aparência do app, use o painel Preview.
1. As funções de composição são como funções normais, com algumas diferenças: os nomes delas começam com letras maiúsculas, você adiciona a anotação @Composable antes da função, e as funções @Composable não podem retornar nada.
1. Um Modifier pode ser usado para aumentar ou decorar um elemento combinável.

