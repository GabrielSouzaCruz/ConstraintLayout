# Trabalho 01 - ConstraintLayout e Activities 📱

![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=android-studio&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Repositório destinado à entrega do Trabalho 01 da disciplina de **Programação para Dispositivos Móveis**, do Bacharelado em Sistemas de Informação (IFSULDEMINAS - Campus Machado).

## 🎯 Objetivo do Projeto
Desenvolver um aplicativo Android composto por múltiplas telas (Activities) para consolidar os conceitos de estruturação de interfaces usando o `ConstraintLayout` e navegação bidirecional e unidirecional no Android.

## 🚀 Funcionalidades e Telas Implementadas

O aplicativo possui uma tela principal (`MainActivity`) que gerencia a navegação para três interfaces distintas, cada uma explorando conceitos específicos de UI e ciclo de vida:

1. **Blog Post:**
   - Construída utilizando `ScrollView` como raiz para permitir a rolagem de conteúdos extensos que ultrapassam o tamanho da tela.
   - Ancoragem correta de botões de navegação ao final do texto.

2. **Série (Interface de Exibição):**
   - Utilização do componente `SeekBar` para simular uma barra de progresso.
   - Implementação de Vector Assets interativos.
   - Uso do atributo `drawableBottomCompat` em TextViews.

3. **Concurso de Textos (Votação):**
   - Resolução de problemas de alinhamento dinâmico utilizando **Barriers** (Barreiras), garantindo que os botões acompanhem o texto de maior altura.
   - Distribuição de botões de votação utilizando **Chains** horizontais no modo *spread*.
   - Retorno do voto para a tela principal utilizando a moderna **API Activity Result** (`ActivityResultContract` e `registerForActivityResult`).

## 🛠️ Tecnologias e Conceitos Utilizados
- **Linguagem:** Java
- **Gerenciador de Layout Padrão:** `ConstraintLayout`
- **Helpers:** `Barrier`, `Chain` (Horizontal Spread) e `Guideline`
- **Navegação:** `Intent` explícita
- **Tratamento de Dados:** `Activity Result API`
- **Feedback Visual:** `Toast`
- **Monitoramento:** Implementação de Logs do ciclo de vida das Activities (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`).

## 👨‍💻 Autor
**Gabriel**
Estudante de Sistemas de Informação - IFSULDEMINAS Campus Machado
