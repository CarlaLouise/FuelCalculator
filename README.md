# Calculadora de Gasto de Combustível

# Screenshots
![Fuel Calculator](https://github.com/user-attachments/assets/679cbe85-658f-4195-8f99-31890fa637bd)

# Descrição
Este projeto foi desenvolvido como parte de um **desafio de programação**, com o objetivo de criar uma aplicação Android que calcula o valor a ser gasto com combustível com base na distância percorrida. 
O aplicativo foi construído em **Kotlin** e é ideal para quem deseja planejar viagens e estimar o custo com combustível.

## Desafio
O desafio proposto foi o de desenvolver um aplicativo que, ao receber a distância a ser percorrida, o consumo do veículo (km/L) e o valor do combustível (R$/L), forneça o valor total a ser gasto com combustível. 
Esse desafio foi uma excelente oportunidade para praticar e aplicar os conhecimentos de desenvolvimento mobile com Kotlin.

## Funcionalidades
**Tela Principal (MainActivity):**
- Contém um botão de navegação para iniciar o processo de cálculo de gastos de combustível.
- Utiliza Intent para navegar para a próxima tela (ActivityPreco).
 
**Tela de Inserção de Preço do Combustível (ActivityPreco):**
- Recebe o preço do combustível digitado pelo usuário.
- Exibe uma mensagem (Snackbar) caso o campo esteja vazio.
- Ao inserir o preço, o valor é enviado para a próxima tela utilizando Intent com o método putExtra.
 
**Tela de Inserção do Consumo do Veículo (ActivityConsumo):**
- Permite que o usuário insira o consumo médio do veículo (Km/L).
- Valida a entrada de dados e exibe um Snackbar em caso de erro.
- Navega para a tela de distância, passando os dados através do Intent.
 
**Tela de Inserção da Distância Percorrida (ActivityDistancia):**
- Permite que o usuário insira a distância até o destino.
- Valida os dados inseridos e exibe mensagens de erro via Snackbar caso a entrada esteja incorreta.
- Envia os dados de distância, preço e consumo para a tela de resultado.
 
**Tela de Resultado Final (ActivityResultado):**
- Calcula o valor total a ser gasto com combustível com base nos dados fornecidos (preço, consumo e distância).
- Exibe os resultados formatados para o usuário, com o custo total e detalhes da viagem.
- Oferece a opção de recalcular os valores, redirecionando o usuário para a tela inicial (MainActivity).  

## Tecnologias Utilizadas
- Kotlin: Linguagem de programação principal utilizada para desenvolvimento das atividades e lógica do aplicativo Android.
- Android SDK: Conjunto de ferramentas necessárias para o desenvolvimento de aplicativos Android.
- ViewBinding: Utilizado para vincular as views do XML com as atividades, substituindo o tradicional findViewById.
- Material Design: Elementos como Snackbar e TextInputLayout fazem parte do Material Design, proporcionando uma interface moderna e acessível.
- Intent: Utilizado para navegação entre as atividades e passagem de dados através do método putExtra().
- Snackbar: Utilizado para exibição de mensagens de erro ou feedback de entrada de dados, garantindo uma boa experiência do usuário.

## Estrutura das Views e Layouts
**ConstraintLayout**: Todos os layouts das telas utilizam ConstraintLayout para organização dos elementos, proporcionando uma interface responsiva.

**Imagens e Ícones**: Utilizados elementos gráficos personalizados (como ImageView) para representar visualmente o conceito de preço, consumo e distância.

**Botões de Navegação**: Cada tela possui botões para avançar para a próxima etapa do cálculo ou retornar à tela inicial.

**TextInputLayout e TextInputEditText**: São utilizados para entrada de dados pelo usuário, com sugestões de exemplo para facilitar o preenchimento correto.


## Author
Carla Louise Alves Leite (follow me on Linkedin)

## License
The MIT License (MIT)

Copyright (c) 2021 Carla Louise Alves Leite

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
