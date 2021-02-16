CREATE DATABASE practice2;

CREATE SEQUENCE base_sequence START WITH 1  INCREMENT BY 1 ;

--task 8
CREATE TABLE customer
(
	id SERIAL PRIMARY KEY,
	name VARCHAR
);

CREATE TABLE product
(
	id SERIAL PRIMARY KEY,
	name_product VARCHAR,
	description VARCHAR
);

 CREATE TABLE customer_to_product
  (
     id SERIAL PRIMARY KEY,
     customer_id INTEGER NOT NULL,
     product_id INTEGER NOT NULL,
     CONSTRAINT "FK_customer_id" FOREIGN KEY ("customer_id")
     REFERENCES "customer" ("id"),
     CONSTRAINT "FK_product_id" FOREIGN KEY ("product_id")
     REFERENCES "product" ("id")
  );

  CREATE UNIQUE INDEX "UI_customer_to_product_product_id_customer_id"
    ON "customer_to_product"
    USING btree
    ("product_id", "customer_id")

    INSERT INTO customer (id, name) VALUES
    (nextval('base_sequence'), 'Jake Williams'),
    (nextval('base_sequence'), 'Alex Piterman'),
    (nextval('base_sequence'), 'Ann Gubenko'),
    (nextval('base_sequence'), 'Silen Diore')
    ;

    INSERT INTO product (id ,name_product, description)
    VALUES
    (nextval('base_sequence'), 'apples', 'fruits'),
    (nextval('base_sequence'), 'oranges', 'fruits'),
    (nextval('base_sequence'), 'bananas','fruits'),
    (nextval('base_sequence'), 'pineapples', 'fruits')
    ;

    INSERT INTO customer_to_product(id, customer_id, product_id) VALUES
    (nextval('base_sequence'), 1, 5),
    (nextval('base_sequence'), 2, 5),
    (nextval('base_sequence'), 3, 5),
    (nextval('base_sequence'), 3, 6),
    (nextval('base_sequence'), 3, 7),
    (nextval('base_sequence'), 3, 8),
    (nextval('base_sequence'), 4, 5),
    (nextval('base_sequence'), 4, 7),
    (nextval('base_sequence'), 2, 8),
    (nextval('base_sequence'), 2, 6)
    ;

--task 9

-- вычитки всех покупателей (имён покупателей ), заказавших товар с указанным именем;
SELECT customer.*, product.name_product
FROM customer
JOIN customer_to_product ON customer_to_product.customer_id = customer.id
JOIN product ON product.id =  customer_to_product.customer_id
WHERE lower(product.name_product) = lower('apples');

-- вычитки всех имеющихся товаров с указанием имён покупателей , заказавших товар.
SELECT product.name_product, customer.name
FROM product
JOIN customer_to_product ON customer_to_product.product_id = product.id
JOIN customer ON customer.id =  customer_to_product.product_id
WHERE lower(customer.name) = lower('Jake Williams');