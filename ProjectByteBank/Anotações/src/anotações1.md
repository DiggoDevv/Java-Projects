Como chamamos, em orientação a objetos, as características de uma classe?
R:  atributos são as características que especificam uma classe.

A "PrimeiraConta" é uma referencia ao objeto do tipo "Conta"

Escreva o método deposita, que recebe um valor do tipo double. Lembre-se que quando nosso método não retorna nenhum valor, devemos colocar a palavra especial void.

Vimos:

O objetivo da orientação a objetos é diminuir a escrita, e manutenção do código, que apenas um local do código seja responsável por uma coisa, para que n precise mudar todo o código.

ou seja esconder como as coisas funcionam debaixo dos panos, e quando precisar de alteração mudar somente em um único lugar.
a maneira de fazer alguma coisa com objetos é através de métodos

como definir métodos com parâmetros e retorno
como retornar algo usando a palavra chave return
como usar a referência this para acessar um atributo
que podemos passar uma referência como parâmetro do método
métodos são chamadas a partir da referência usando o operador .


No java nunca é um objeto dentro de outro objeto;
esses objetos são referencias (como se fosse flechas apontando);

os trabalho no java é normalmente feito através de métodos sem acessar as propriedades diretamente, isso se é feito através dos atributos privados (o que deixa ela inacessivel diretamente), encapsulados

O static serve para acessar a classe em 
O método static possui usos muito interessantes, mas possui suas limitações. Embora não seja do interesse do nosso projeto, não poderíamos acessar um atributo de instância via this, como saldo.


Construtor da classe, possibilitando receber argumentos e inicializar atributos a partir da criação de um objeto
Com isso, a inicialização dos atributos recebidos no construtor torna-se obrigatória
Atributos da classe, os atributos estáticos
Métodos da classe, os métodos estáticos
Ausência de referência, do this, dentro de métodos estáticos


O construtor é chamado na inicialização do objeto.

Correto, um construtor é chamado na inicialização/criação do objeto.

O construtor padrão (default) é aquele que não recebe nenhum parâmetro.

Objeto é uma instanciação de uma classe;
