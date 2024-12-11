# Sistema de Gerenciamento de Restaurantes e Pedidos

Este projeto é um sistema para gerenciamento de restaurantes e pedidos, desenvolvido com base em conceitos de Programação Orientada a Objetos (POO). Ele abrange funcionalidades específicas para dois tipos de usuários: **Donos de Restaurante** e **Clientes**. O projeto inclui um diagrama UML de classes que representa as relações entre os elementos principais do sistema.

---

## **Funcionalidades do Sistema**

### Para o Dono do Restaurante:
1. **Login/Cadastro**: Acesso inicial ao sistema.
2. **Cadastrar Restaurante**: Inserir informações do restaurante.
3. **Cadastrar Produtos**: Adicionar novos produtos ao cardápio.
4. **Gerenciar Produtos**: Modificar ou remover produtos cadastrados.
5. **Salvar Alterações**: Registrar todas as modificações realizadas.

### Para o Cliente:
1. **Login/Cadastro**: Acesso inicial ao sistema.
2. **Ver Restaurantes**: Visualizar a lista de restaurantes disponíveis.
3. **Selecionar Restaurante e Produtos**: Escolher um restaurante e selecionar os produtos desejados.
4. **Exibir Total do Pedido e Tempo de Espera**: Calcular o valor total do pedido e estimar o tempo de entrega.
5. **Finalizar Pedido**: Encerramento do pedido.

---

## **Estrutura do Projeto (Diagrama UML)**
O sistema utiliza um modelo UML para representar as principais classes e suas interações. As classes incluem:

### **Classes Principais**
- **Usuario**: Classe base para usuários do sistema.
  - **Cliente**: Herda de Usuario e representa os consumidores.
  - **DonoRestaurante**: Herda de Usuario e representa os proprietários de restaurantes.
- **Restaurante**: Representa os estabelecimentos cadastrados no sistema.
- **Produto**: Representa os itens do cardápio.
  - **Comida**: Herda de Produto e inclui atributos específicos como tipo de cozinha, se é vegetariana ou vegana.
  - **Bebida**: Herda de Produto e inclui atributos como tamanho (em ml) e se é alcoólica ou não.
- **Pedido**: Representa os pedidos realizados pelos clientes.

### **Relações**
- **Herança e Polimorfismo**:
  - `Cliente` e `DonoRestaurante` herdam de `Usuario`.
  - `Comida` e `Bebida` herdam de `Produto`.
- **Composição e Agregação**:
  - `Restaurante` possui uma lista de objetos `Produto` (incluindo `Comida` e `Bebida`).
  - `Pedido` contém uma lista de `Produto` e referencia um objeto `Cliente`.

## **Tecnologias Utilizadas**
- Linguagem de programação: Java.
- Ferramenta para modelagem UML: LucidChart.
