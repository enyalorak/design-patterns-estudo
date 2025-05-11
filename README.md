
# Padrões de Projeto em Java - GOF (Estudo)
Este é um projeto simples de estudo sobre alguns dos principais **padrões de projeto** descritos pelos "Gang of Four" (GoF), implementados em Java.

Este projeto foi desenvolvido durante as aulas do **Bootcamp Bradesco - Java Cloud Native** na **Digital Innovation One (DIO)**.

## ✏️ Padrões implementados

### 🔁 Singleton
Garante que uma classe tenha apenas **uma instância** e fornece um ponto global de acesso a ela.

Neste projeto, explorei 3 formas:
- `SingletonLazy`: cria a instância apenas quando for usada pela primeira vez.
- `SingletonEager`: cria a instância imediatamente ao carregar a classe.
- `SingletonLazyHolder`: usa uma classe interna para carregar a instância apenas quando necessário (forma mais eficiente e thread-safe).

### 🤖 Strategy
Permite definir diferentes comportamentos e alterá-los em tempo de execução, sem mudar a lógica principal da classe.

Implementei um exemplo com um robô que pode mudar seu comportamento para:
- `Normal`
- `Defensivo`
- `Agressivo`

### 🧱 Facade
Simplifica chamadas complexas escondendo múltiplas operações por trás de uma única interface.

Implementei uma classe `Facade` que simula a **migração de cliente**, escondendo os detalhes internos como validação de CEP e cadastro.

## ✅ O que aprendi

- A importância de aplicar padrões para manter o código **organizado e reutilizável**.
- Como implementar diferentes versões do **Singleton** e entender as vantagens de cada uma.
- A usar o **padrão Strategy** para tornar comportamentos flexíveis.
- Como o **Facade** ajuda a esconder complexidade e tornar a interface mais simples.

## 📚 Fontes de estudo

- Curso da Digital Innovation One (DIO)
- Documentações oficiais sobre padrões de projeto

