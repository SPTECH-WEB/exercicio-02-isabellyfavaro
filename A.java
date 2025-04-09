# 📦 Sistema de Logística - Padrões de Projeto com Java + Spring Boot

Este projeto tem como objetivo demonstrar, na prática, a aplicação dos padrões de projeto **Strategy**, **Adapter** e **Observer** em um módulo de logística para uma plataforma de e-commerce.

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Maven

---

## 🧠 Padrões Aplicados

### 🎯 Strategy Pattern

Utilizado para encapsular as diferentes estratégias de cálculo de frete:

- `FreteExpressa` → frete rápido com custo mais alto.
- `FreteEconomica` → frete mais barato com tempo maior.
- `FreteTransportadoraExterna` → frete via transportadora de terceiros (usando Adapter).

> Vantagem: permite adicionar novas modalidades de entrega sem modificar o código existente.

---

### 🔌 Adapter Pattern

Utilizado para integrar uma **transportadora externa** com uma interface diferente da do sistema.

- A classe `TransportadoraExternaAPI` simula uma API externa.
- A classe `FreteTransportadoraExterna` age como um adaptador, implementando a interface esperada.

> Vantagem: isola a complexidade da integração com sistemas legados ou de terceiros.

---

### 🔔 Observer Pattern

Notificações automáticas ao final da entrega.

- Observadores implementam a interface `Notificador`.
- Exemplo de notificadores:
  - `ClienteNotifier`
  - `EquipeInternaNotifier`

> Vantagem: desacopla os efeitos colaterais do processamento de entrega, facilitando a extensão futura (ex: notificações por e-mail, SMS, etc).

---

## 📦 Funcionalidades

- Cálculo dinâmico do valor do frete com base no peso e modalidade.
- Integração simulada com transportadora externa.
- Notificação automática após o processamento da entrega.

---

## 📮 Como Usar

### 📥 Requisição

**Endpoint:**  
`POST /frete/calcular`

**Body JSON:**
```json
{
  "peso": 5.0,
  "modalidade": "expressa"
}
