-- Inserção de dados de teste para ENTREGAS_DB

USE ENTREGAS_DB;

-- Inserir dados na tabela "enderecos"
INSERT INTO enderecos (rua, numero, cidade, estado, pais, cep)
VALUES
  ('Rua A', '123', 'Cidade A', 'Estado A', 'Pais A', '12345'),
  ('Rua B', '456', 'Cidade B', 'Estado B', 'Pais B', '67890');

-- Inserir dados na tabela "clientes"
INSERT INTO clientes (nome, email, telefone)
VALUES
  ('Cliente 1', 'cliente1@example.com', '111-1111'),
  ('Cliente 2', 'cliente2@example.com', '222-2222');

-- Inserir dados na tabela "pedidos"
INSERT INTO pedidos (cliente_id, data_pedido, total)
VALUES
  (1, NOW(), 100.00),
  (2, NOW(), 200.00);

-- Inserir dados na tabela "entregas"
INSERT INTO entregas (pedido_id, endereco_id, status, data_entrega)
VALUES
  (1, 1, 'Em trânsito', NULL),
  (2, 2, 'Entregue', NOW());


-- Inserção de dados de teste para COMPRAS_DB

USE COMPRAS_DB;

-- Inserir dados na tabela "clientes"
INSERT INTO clientes (nome, email, telefone)
VALUES
  ('Cliente 1', 'cliente1@example.com', '111-1111'),
  ('Cliente 2', 'cliente2@example.com', '222-2222');

-- Inserir dados na tabela "produtos"
INSERT INTO produtos (nome, preco, estoque)
VALUES
  ('Produto 1', 10.00, 100),
  ('Produto 2', 20.00, 200);

-- Inserir dados na tabela "enderecos"
INSERT INTO enderecos (rua, numero, cidade, estado, pais, cep)
VALUES
  ('Rua A', '123', 'Cidade A', 'Estado A', 'Pais A', '12345'),
  ('Rua B', '456', 'Cidade B', 'Estado B', 'Pais B', '67890');

-- Inserir dados na tabela "pedidos"
INSERT INTO pedidos (cliente_id, data_pedido, status)
VALUES
  (1, NOW(), 'Pendente'),
  (2, NOW(), 'Concluído');

-- Inserir dados na tabela "itens_pedido"
INSERT INTO itens_pedido (pedido_id, produto_id, quantidade)
VALUES
  (1, 1, 2),
  (2, 2, 1);
