<h1 align="center">ShoppingList</h1>

<p align="center">
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=23"><img src="https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat" border="0" alt="API"></a>
  <br>
  <a href="https://wa.me/+5571991154541"><img alt="WhatsApp" src="https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white"/></a>
  <a href="https://www.linkedin.com/in/emerson-dos-santos-silva-398319206/"><img alt="Linkedin" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white"/></a>
  <a href="mailto:emersonsantos1921@gmail.com"><img alt="Gmail" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"/></a>
</p>

<p align="center">  

⭐ Esse é um projeto para demonstrar meu conhecimento técnico no desenvolvimento Android nativo com Kotlin. Mais informações técnicas abaixo.

Aplicativo que mostra uma listagem de produtos que permite efetuar uma compra e demonstra uma tela de conclusão quando efetuada.

</p>

</br>

<p float="left" align="center">
<img alt="screenshot" width="30%" src="screenshoots/screenshot_1.png"/>
<img alt="screenshot" width="30%" src="screenshoots/screenshot_2.png"/>
<img alt="screenshot" width="30%" src="screenshoots/screenshot_3.png"/>
</p>

## Download

Faça o download da <a href="apk/app-debug.apk?raw=true">APK diretamente</a>. Você pode ver <a href="https://www.google.com/search?q=como+instalar+um+apk+no+android">aqui</a> como instalar uma APK no seu aparelho android.

## Tecnologias usadas e bibliotecas de código aberto

- Minimum SDK level : 23
- [Linguagem Kotlin](https://kotlinlang.org/)

- Jetpack 
  - Lifecycle: Observe os ciclos de vida do Android e manipule os estados da interface do usuário após as alterações do ciclo de vida.
  - ViewModel: Gerencia o detentor de dados relacionados à interface do usuário e o ciclo de vida. Permite que os dados sobrevivam a alterações de configuração, como rotações de tela.
  - Custom Views: View customizadas feitas do zero usando XML.
  - Recycler View: Torna eficiente a exibição de grandes conjuntos de dados, criando os elementos de forma dinâmica.
  - Intent : Descrição abstrata  de uma operação a ser executada. Neste projeto foi utilizado para aberturas de novas activities e passagem de dados.

- Arquitetura
  - MVVM (View - ViewModel - Model)

## Arquitetura

**Shopping List** utiliza a arquitetura MVVM que segue as [recomendações oficiais do Google](https://developer.android.com/topic/architecture).
</br></br>
<img src="screenshoots/arquitetura.png" width="60%"/>
<br>

## Features

### Listagem de produtos
<img src="screenshoots/device-1.gif" width="25%"/>

Listagem de produtos utilizando o recycler view, Layout de card criado usando Cardview e Constraint Layout.

### Conclusão da compra
<img src="screenshoots/device-2.gif" width="25%"/>

Conclusão de compra utilizando botões interativos e múltiplas telas seguindo o ciclo de vida de uma Activity.

# Licença

```xml
   Copyright [2023] [Emerson Dos Santos]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
