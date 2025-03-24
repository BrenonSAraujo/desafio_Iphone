## Minha solução em UML do desafio.

```mermaid
classDiagram
    class AparelhoTelefonico {
        #ligar(String numero)
        #atender()
        #iniciarCorreioVoz()
    }

    class ReprodutorMusical {
        <<interface>>
        +playMusic(String musica)
        +pauseMusic()
        +stopMusic()
    }

    class NavegadorNaInternet {
        <<interface>>
        +abrirPagina(String url)
        +atualizarPagina()
        +adicionarAosFavoritos(String url)
    }

    class IPhone {
        -sistemaOperacional: String = "Linux"
    }

    AparelhoTelefonico <|-- IPhone
    IPhone ..|> ReprodutorMusical
    IPhone ..|> NavegadorNaInternet


