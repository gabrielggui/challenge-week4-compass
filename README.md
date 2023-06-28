## Desafio Compass UOL
### Semana 4

Considere o desenvolvimento de um sistema de controle de veículos, onde é necessário modelar diferentes
tipos de veículos e suas características. Sua tarefa é implementar a classe base "Veiculo" que possui os
seguintes atributos:
* Motor (Sim/Não)
* Volante (Sim/Não)
* Quantidade de passageiros
* Quantidade de portas
* Quantidade de rodas
* É de carga (Sim/Não)
* Capacidade de carga (KG)
  
Além desses atributos, a classe "Veiculo" deve conter um atributo chamado "Combustivel", que será
representado por uma outra classe com os seguintes atributos:
* Gasolina
* Alcool
* Diesel
* Eletricidade
* Humano
* Animal

Sua tarefa é escrever a classe "Veiculo" utilizando herança e polimorfismo, aproveitando ao máximo os
recursos oferecidos pela linguagem Java.
Lembre-se de que a herança permite que uma classe filha herde atributos e métodos de uma classe pai,
enquanto o polimorfismo permite tratar objetos de diferentes classes de forma uniforme. Utilize esses
conceitos para criar uma estrutura hierárquica de classes que represente adequadamente os diferentes tipos de
veículos e suas características.
Para ajudar, você pode criar classes filhas da classe "Veiculo" para representar diferentes categorias de
veículos, como "Carro", "Moto" e "Caminhao". Cada uma dessas classes filhas pode adicionar atributos
específicos e/ou sobrescrever métodos da classe pai, se necessário.
Não se esqueça de definir os construtores, getters e setters para acessar e manipular os atributos da classe
"Veiculo" e suas subclasses, conforme necessário.
Além da classe base “Veiculo” você deverá implementar as seguintes classes filhas:
* Moto
  * Atributo adicional:
    * Partida elétrica
* Bicicleta
  * Atributos adicionais:
    * É elétrica
    * Tem bagageiro
* Charrete
* Caminhao
  * Atributo adicional:
    * Quantidade de eixos
* Carro
  * Atributos adicionais:
    * Possui ar condicionado
    * Possui radio
