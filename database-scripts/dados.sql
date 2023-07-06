-- Inserção de dados de teste para ENTREGAS_DB

USE ENTREGAS_DB;

-- Inserindo dados na tabela enderecos
INSERT INTO enderecos (rua, numero, cidade, estado, pais, cep)
VALUES ('Rua A', '123', 'Cidade A', 'Estado A', 'País A', '12345'),
       ('Rua B', '456', 'Cidade B', 'Estado B', 'País B', '67890');

-- Inserindo dados na tabela clientes
INSERT INTO clientes (nome, email, telefone)
VALUES ('Cliente 1', 'cliente1@example.com', '111-111-1111'),
       ('Cliente 2', 'cliente2@example.com', '222-222-2222');

-- Inserindo dados na tabela pedidos
INSERT INTO pedidos (cliente_id, data_pedido, total)
VALUES (1, '2023-07-06 10:00:00', 50.00),
       (2, '2023-07-06 11:00:00', 75.50);

-- Inserindo dados na tabela entregas
INSERT INTO entregas (pedido_id, endereco_id, status, data_entrega)
VALUES (1, 1, 'Em trânsito', NULL),
       (2, 2, 'Entregue', '2023-07-06 12:30:00');


-- Inserção de dados de teste para COMPRAS_DB

USE COMPRAS_DB;

-- Inserindo dados na tabela clientes
INSERT INTO clientes (nome, email, telefone)
VALUES ('Cliente 1', 'cliente1@example.com', '111-111-1111'),
       ('Cliente 2', 'cliente2@example.com', '222-222-2222');

-- Inserindo dados na tabela produtos
INSERT INTO produtos (nome, preco, estoque)
VALUES ('Produto 1', 10.99, 100),
       ('Produto 2', 24.50, 50);

-- Inserindo dados na tabela enderecos
INSERT INTO enderecos (rua, numero, cidade, estado, pais, cep)
VALUES ('Rua X', '789', 'Cidade X', 'Estado X', 'País X', '54321'),
       ('Rua Y', '987', 'Cidade Y', 'Estado Y', 'País Y', '09876');

-- Inserindo dados na tabela pedidos
INSERT INTO pedidos (cliente_id, produto_id, endereco_id, data_pedido, status)
VALUES (1, 1, 1, '2023-07-06 14:00:00', 'Em processamento'),
       (2, 2, 2, '2023-07-06 15:00:00', 'Enviado');
