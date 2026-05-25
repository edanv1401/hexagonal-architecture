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

INSERT INTO customers (id, first_name, last_name, email, phone)
VALUES ('11111111-1111-1111-1111-111111111111', 'Lina', 'Arroyo', 'lina.arroyo@email.com',
        '3001234567'),
       ('22222222-2222-2222-2222-222222222222', 'Carlos', 'Ramírez', 'carlos.ramirez@email.com',
        '3019876543'),
       ('33333333-3333-3333-3333-333333333333', 'María', 'González', 'maria.gonzalez@email.com',
        '3024567890'),
       ('44444444-4444-4444-4444-444444444444', 'Andrés', 'López', 'andres.lopez@email.com',
        '3206549871'),
       ('55555555-5555-5555-5555-555555555555', 'Sofía', 'Martínez', 'sofia.martinez@email.com',
        '3157894561');

INSERT INTO invoices (id, created_at, total, customer_id)
VALUES ('aaaaaaa1-aaaa-aaaa-aaaa-aaaaaaaaaaaa',
        '2026-05-24 10:30:00',
        18.00,
        '11111111-1111-1111-1111-111111111111'),

       ('bbbbbbb2-bbbb-bbbb-bbbb-bbbbbbbbbbbb',
        '2026-05-24 11:15:00',
        25.50,
        '22222222-2222-2222-2222-222222222222'),

       ('ccccccc3-cccc-cccc-cccc-cccccccccccc',
        '2026-05-24 12:00:00',
        14.75,
        '33333333-3333-3333-3333-333333333333');

INSERT INTO invoice_details (id, product_name, quantity, price, subtotal, invoice_id)
VALUES

-- Factura 1
('d1111111-1111-1111-1111-111111111111',
 'Cappuccino',
 2,
 3.75,
 7.50,
 'aaaaaaa1-aaaa-aaaa-aaaa-aaaaaaaaaaaa'),

('d2222222-2222-2222-2222-222222222222',
 'Cheesecake de Frambuesa',
 1,
 6.00,
 6.00,
 'aaaaaaa1-aaaa-aaaa-aaaa-aaaaaaaaaaaa'),

('d3333333-3333-3333-3333-333333333333',
 'Té Verde Matcha',
 3,
 4.20,
 4.50,
 'aaaaaaa1-aaaa-aaaa-aaaa-aaaaaaaaaaaa'),

-- Factura 2
('d4444444-4444-4444-4444-444444444444',
 'Smoothie de Frutos Rojos',
 2,
 4.50,
 9.00,
 'bbbbbbb2-bbbb-bbbb-bbbb-bbbbbbbbbbbb'),

('d5555555-5555-5555-5555-555555555555',
 'Volcán de Chocolate',
 1,
 6.50,
 6.50,
 'bbbbbbb2-bbbb-bbbb-bbbb-bbbbbbbbbbbb'),

('d6666666-6666-6666-6666-666666666666',
 'Cerveza Artesanal',
 2,
 5.00,
 10.00,
 'bbbbbbb2-bbbb-bbbb-bbbb-bbbbbbbbbbbb'),

-- Factura 3
('d7777777-7777-7777-7777-777777777777',
 'Café Americano',
 1,
 2.50,
 2.50,
 'ccccccc3-cccc-cccc-cccc-cccccccccccc'),

('d8888888-8888-8888-8888-888888888888',
 'Brownie con Helado',
 2,
 4.75,
 9.50,
 'ccccccc3-cccc-cccc-cccc-cccccccccccc'),

('d9999999-9999-9999-9999-999999999999',
 'Refresco de Cola',
 1,
 1.80,
 1.80,
 'ccccccc3-cccc-cccc-cccc-cccccccccccc');