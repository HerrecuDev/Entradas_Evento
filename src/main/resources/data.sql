create table entradas_eventos.evento
(
    id            int auto_increment
        primary key,
    nombre        varchar(50)    null,
    descripcion   varchar(200)   null,
    lugar         varchar(200)   null,
    precio_base   decimal(10, 2) null,
    recargo_vip   decimal(10, 2) null,
    recargo_grada decimal(10, 2) null,
    fecha_hora    datetime       null
);



create table entradas_eventos.compra_entradas
(
    id               int auto_increment
        primary key,
    evento_id        int            not null,
    nombre_comprador varchar(100)   null,
    email_comprador  varchar(100)   null,
    numero_entradas  int            null,
    precio_unitario  decimal(10, 2) null,
    precio_total     decimal(10, 2) null,
    fecha_compra     datetime       null
);
INSERT INTO entradas_eventos.evento (id, nombre, descripcion, lugar, precio_base, recargo_vip, recargo_grada, fecha_hora) VALUES
(1, 'Concierto Rock 2024', 'Gran concierto de rock con bandas nacionales e internacionales', 'Estadio Nacional', 85.00, 25.00, 15.00, '2024-06-15 20:00:00'),
(2, 'Festival Jazz', 'Festival de jazz con artistas reconocidos internacionalmente', 'Teatro Municipal', 120.00, 40.00, 20.00, '2024-07-20 19:30:00'),
(3, 'Partido Final Liga', 'Partido final del campeonato de liga profesional', 'Estadio Metropolitano', 95.00, 35.00, 10.00, '2024-05-25 18:00:00'),
(4, 'Exposición Arte Moderno', 'Exposición de arte moderno y contemporáneo', 'Museo de Arte', 45.00, 15.00, 5.00, '2024-08-10 10:00:00');

INSERT INTO entradas_eventos.compra_entradas (evento_id, nombre_comprador, email_comprador, numero_entradas, precio_unitario, precio_total, fecha_compra) VALUES
(1, 'Carlos González', 'carlos.gonzalez@email.com', 4, 110.00, 440.00, '2024-05-10 14:30:00'),
(1, 'María López', 'maria.lopez@email.com', 2, 85.00, 170.00, '2024-05-12 09:15:00'),
(2, 'Juan Rodríguez', 'juan.rodriguez@email.com', 3, 160.00, 480.00, '2024-06-05 16:45:00'),
(3, 'Ana Martínez', 'ana.martinez@email.com', 6, 105.00, 630.00, '2024-05-01 11:20:00'),
(4, 'Pedro Sánchez', 'pedro.sanchez@email.com', 2, 60.00, 120.00, '2024-07-15 13:00:00');


