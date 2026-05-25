INSERT INTO beverages (id, name, description, price)
VALUES ('123e4567-e89b-12d3-a456-426614174000', 'Café Americano', 'Café negro clásico preparado con agua caliente',
        2.50),
       ('987e6543-e21b-34d5-c678-426614174001', 'Cappuccino', 'Espresso con partes iguales de leche al vapor y espuma',
        3.75),
       ('a1b2c3d4-e5f6-7890-1234-56789abcdef0', 'Té Verde Matcha', 'Té verde japonés en polvo con leche', 4.20),
       ('b2c3d4e5-f6a7-8901-2345-6789abcdef01', 'Agua Mineral', 'Agua mineral con gas natural (500ml)', 1.50),
       ('c3d4e5f6-a7b8-9012-3456-789abcdef012', 'Jugo de Naranja', 'Jugo natural 100% recién exprimido', 3.00),
       ('d4e5f6a7-b8c9-0123-4567-89abcdef0123', 'Refresco de Cola', 'Lata de refresco azucarado (355ml)', 1.80),
       ('e5f6a7b8-c9d0-1234-5678-9abcdef01234', 'Smoothie de Frutos Rojos', 'Batido helado de fresa, mora y arándanos',
        4.50),
       ('f6a7b8c9-d0e1-2345-6789-abcdef012345', 'Cerveza Artesanal', 'Cerveza tipo IPA con notas cítricas', 5.00);

INSERT INTO desserts (id, name, description, price)
VALUES ('223e4567-e89b-12d3-a456-426614174000', 'Tiramisú',
        'Postre italiano clásico con capas de bizcocho bañadas en café y crema de mascarpone', 5.50),
       ('387e6543-e21b-34d5-c678-426614174001', 'Cheesecake de Frambuesa',
        'Tarta de queso horneada al estilo Nueva York con cobertura de mermelada de frambuesa', 6.00),
       ('41b2c3d4-e5f6-7890-1234-56789abcdef0', 'Brownie con Helado',
        'Cuadro de bizcocho de chocolate intenso servido caliente con helado de vainilla', 4.75),
       ('52c3d4e5-f6a7-8901-2345-6789abcdef01', 'Macarons Surtidos',
        'Caja de 4 delicadas galletas francesas de almendra con diferentes rellenos', 5.20),
       ('63d4e5f6-a7b8-9012-3456-789abcdef012', 'Volcán de Chocolate',
        'Bizcocho esponjoso con interior fundido de chocolate amargo', 6.50),
       ('74e5f6a7-b8c9-0123-4567-89abcdef0123', 'Tarta de Manzana',
        'Tarta tradicional con rodajas de manzana, canela y base de masa crujiente', 4.50),
       ('85f6a7b8-c9d0-1234-5678-9abcdef01234', 'Flan Casero',
        'Flan tradicional de vainilla horneado al baño maría con caramelo líquido', 3.50),
       ('96a7b8c9-d0e1-2345-6789-abcdef012345', 'Panna Cotta',
        'Suave postre italiano a base de crema de leche con coulis de frutos rojos', 4.80);
-- Insertar Clientes
INSERT INTO customers (id, first_name, last_name, email, phone) VALUES
('11111111-1111-1111-1111-111111111111', 'Carlos', 'Gómez', 'carlos.gomez@email.com', '+573001234567'),
('22222222-2222-2222-2222-222222222222', 'María', 'Rodríguez', 'maria.rod@email.com', '+573109876543');

-- Insertar Empleados (PersonEntity)
INSERT INTO person_entity (id, first_name, last_name, email, phone) VALUES
('33333333-3333-3333-3333-333333333333', 'Andrés', 'Pérez', 'andres.perez@empresa.com', '+573201112233'),
('44444444-4444-4444-4444-444444444444', 'Laura', 'Martínez', 'laura.martinez@empresa.com', '+573114445566');

-- Insertar Facturas (Cabeceras)
-- Relacionadas con el cliente 1 y empleado 3, y cliente 2 y empleado 4
INSERT INTO invoice (id, client_id, employee_id, created_at, total) VALUES
('55555555-5555-5555-5555-555555555555', '11111111-1111-1111-1111-111111111111', '33333333-3333-3333-3333-333333333333', '2026-05-24 10:00:00', 15.20),
('66666666-6666-6666-6666-666666666666', '22222222-2222-2222-2222-222222222222', '44444444-4444-4444-4444-444444444444', '2026-05-24 14:30:00', 10.50);

-- Insertar Detalles de Factura
-- Relacionamos los productos (Bebidas o Postres de tus entidades anteriores) con las facturas
INSERT INTO invoice_detail (id, product_id, product_type, quantity, price, invoice_id) VALUES
-- Detalles para la Factura 1 (Total: 15.20)
('77777777-7777-7777-7777-777777777771', 101, 'BEVERAGE', 2, 5.00, '55555555-5555-5555-5555-555555555555'), -- Subtotal: 10.00
('77777777-7777-7777-7777-777777777772', 201, 'DESSERT', 1, 5.20, '55555555-5555-5555-5555-555555555555'), -- Subtotal: 5.20

-- Detalles para la Factura 2 (Total: 10.50)
('88888888-8888-8888-8888-888888888881', 202, 'DESSERT', 3, 3.50, '66666666-6666-6666-6666-666666666666'); -- Subtotal: 10.50