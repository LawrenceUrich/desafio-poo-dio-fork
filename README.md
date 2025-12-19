# Desafio POO - Bootcamp Java ☕🚀

Projeto desenvolvido como parte do desafio **Aprendendo na Prática o Paradigma de Programação Orientada a Objetos**, proposto pela **Digital Innovation One (DIO)**.

## 🎯 Objetivo
Modelar um domínio de **Bootcamp de programação**, aplicando na prática os **4 pilares da Programação Orientada a Objetos (POO)**:

- Abstração  
- Encapsulamento  
- Herança  
- Polimorfismo  

---

## 🧠 Domínio da Aplicação
O sistema simula um bootcamp composto por:
- **Cursos**
- **Mentorias**
- **Devs (alunos)**

Os devs se inscrevem no bootcamp, progridem nos conteúdos e acumulam XP.

---

## 🧩 Pilares da POO aplicados

### 🔺 Abstração
A classe abstrata `Conteudo` define atributos e comportamentos comuns a cursos e mentorias.

### 🔺 Encapsulamento
As regras de negócio são protegidas:
- Coleções internas são imutáveis externamente
- Alterações ocorrem apenas via métodos controlados

### 🔺 Herança
As classes `Curso` e `Mentoria` herdam de `Conteudo`.

### 🔺 Polimorfismo
O método `calcularXp()` possui implementações diferentes para cada tipo de conteúdo.

---

## ▶️ Como executar o projeto
1. Clone o repositório
2. Abra em uma IDE Java (IntelliJ, VS Code, Eclipse)
3. Execute a classe `Main`

---

## 🛠️ Tecnologias utilizadas
- Java
- Programação Orientada a Objetos
- Git & GitHub

---

## 🤝 Créditos
Projeto base fornecido pela **Digital Innovation One (DIO)**  
Fork e evoluções realizadas para fins educacionais e de portfólio.
