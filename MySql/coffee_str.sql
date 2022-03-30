create database coffee_str;
use coffee_str;
create table products(
id int auto_increment primary key,name varchar(30),
price decimal(4,2),
coffee_orign varchar(30));

create table orders(
id int auto_increment primary key,
product_id int,
customer_id int,
order_time datetime
);

create table customers(
id int auto_increment primary key,
first_name varchar(30),
last_name varchar(30),
gender enum('M','F'),
phone_number varchar(11)
);

show tables;

describe products;

insert into products(name,price,coffee_orign)
values('Espresso',2.50,'Brazil');
 
-- entering multiple rows of data

insert into products(name,price,coffee_orign)
values('Macchiato',3.00,'Brazil'),('Cappuccino',3.50,'Cost Rica'); 

insert into products(name,price,coffee_orign)
values('Latte',3.50,'Indonesia'),('Americano',3.00,'Brazil'),('Flat White',3.50,'Indonesia'),('Filter',3.00,'India');

select * from products;
truncate table products;

-- updating the data 

update <table_name>
set <column_name>='value'
where <column_name>='value';

update products
set coffee_orign='Sri Lanka'
where name='Filter';

update products
set coffee_origin='Sri Lanka'
where id=7;

set sql_safe_updates=0;

select * from products;
-- changing the price and coffee_origin of Americano
update products
set price=3.25,coffee_orign='Ethiopia'
where name='Americano';

-- changing multiple rows of data 

update products
set coffee_orign='Columbia'
where coffee_orign='Brazil';

INSERT INTO orders (product_id,customer_id,order_time) VALUES
(1,1,'2017-01-01 08-02-11'),(1,2,'2017-01-01 08-05-16'),
(5,12,'2017-01-01 08-44-34'),(3,4,'2017-01-01 09-20-02'),
(1,9,'2017-01-01 11-51-56'),(6,22,'2017-01-01 13-07-10'),
(1,1,'2017-01-02 08-03-41'),(3,10,'2017-01-02 09-15-22'),
(2,2,'2017-01-02 10-10-10'),(3,13,'2017-01-02 12-07-23'),
(1,1,'2017-01-03 08-13-50'),(7,16,'2017-01-03 08-47-09'),
(6,21,'2017-01-03 09-12-11'),(5,22,'2017-01-03 11-05-33'),
(4,3,'2017-01-03 11-08-55'),(3,11,'2017-01-03 12-02-14'),
(2,23,'2017-01-03 13-41-22'),(1,1,'2017-01-04 08-08-56'),
(3,10,'2017-01-04 11-23-43'),(4,12,'2017-01-05 08-30-09'),
(7,1,'2017-01-06 09-02-47'),(3,18,'2017-01-06 13-23-34'),
(2,16,'2017-01-07 09-12-39'),(2,14,'2017-01-07 11-24-15'),
(4,5,'2017-01-08 08-54-11'),(1,1,'2017-01-09 08-03-11'),
(6,20,'2017-01-10 10-34-12'),(3,3,'2017-01-10 11-02-11'),
(4,24,'2017-01-11 08-39-11'),(4,8,'2017-01-12 13-20-13'),
(1,1,'2017-01-14 08-27-10'),(4,15,'2017-01-15 08-30-56'),
(1,7,'2017-01-16 10-02-11'),(2,10,'2017-01-17 09-50-05'),
(1,1,'2017-01-18 08-22-55'),(3,9,'2017-01-19 09-00-19'),
(7,11,'2017-01-19 11-33-00'),(6,12,'2017-01-20 08-02-21'),
(3,14,'2017-01-21 09-45-50'),(5,2,'2017-01-22 10-10-34'),
(6,24,'2017-01-23 08-32-19'),(6,22,'2017-01-23 08-45-12'),
(6,17,'2017-01-23 12-45-30'),(2,11,'2017-01-24 08-01-27'),
(1,1,'2017-01-25 08-05-13'),(6,11,'2017-01-26 10-49-10'),
(7,3,'2017-01-27 09-23-57'),(7,1,'2017-01-27 10-08-16'),
(3,18,'2017-01-27 10-13-09'),(4,19,'2017-01-27 11-02-40'),
(3,10,'2017-01-28 08-03-21'),(1,2,'2017-01-28 08-33-28'),
(1,12,'2017-01-28 11-55-33'),(1,13,'2017-01-29 09-10-17'),
(6,6,'2017-01-30 10-07-13'),(1,1,'2017-02-01 08-10-14'),
(2,14,'2017-02-02 10-02-11'),(7,10,'2017-02-02 09-43-17'),
(7,20,'2017-02-03 08-33-49'),(4,21,'2017-02-04 09-31-01'),
(5,22,'2017-02-05 09-07-10'),(3,23,'2017-02-06 08-15-10'),
(2,24,'2017-02-07 08-27-26'),(1,1,'2017-02-07 08-45-10'),
(6,11,'2017-02-08 10-37-10'),(3,13,'2017-02-09 08-58-18'),
(3,14,'2017-02-10 09-12-40'),(5,4,'2017-02-10 11-05-34'),
(1,2,'2017-02-11 08-00-38'),(3,8,'2017-02-12 08-08-08'),
(7,20,'2017-02-12 09-22-10'),(1,1,'2017-02-13 08-37-45'),
(5,2,'2017-02-13 12-34-56'),(4,3,'2017-02-14 08-22-43'),
(5,4,'2017-02-14 09-12-56'),(3,5,'2017-02-15 08-09-10'),
(6,7,'2017-02-15 09-05-12'),(1,8,'2017-02-15 09-27-50'),
(2,9,'2017-02-16 08-51-12'),(3,10,'2017-02-16 13-07-46'),
(4,11,'2017-02-17 08-03-55'),(4,12,'2017-02-17 09-12-11'),
(5,10,'2017-02-17 11-41-17'),(6,18,'2017-02-17 13-05-56'),
(7,19,'2017-02-18 08-33-27'),(1,17,'2017-02-19 08-12-31'),
(1,1,'2017-02-20 09-50-17'),(3,5,'2017-02-20 09-51-29'),
(4,6,'2017-02-20 10-43-39'),(3,1,'2017-02-21 08-32-17'),
(1,1,'2017-02-21 10-30-11'),(3,2,'2017-02-21 11-08-45'),
(4,3,'2017-02-22 11-46-32'),(2,15,'2017-02-22 13-35-16'),
(6,13,'2017-02-23 08-34-48'),(4,24,'2017-02-24 08-32-03'),
(2,13,'2017-02-25 08-03-12'),(7,17,'2017-02-25 09-34-23'),
(7,23,'2017-02-25 11-32-54'),(5,12,'2017-02-26 11-47-34'),
(6,4,'2017-02-27 12-12-34'),(1,1,'2017-02-28 08-59-22');

INSERT INTO customers (first_name, last_name, gender,
phone_number) VALUES ('Chris','Martin','M','01123147789'),
('Emma','Law','F','01123439899'),
('Mark','Watkins','M','01174592013'),
('Daniel','Williams','M',NULL),
('Sarah','Taylor','F','01176348290'),
('Katie','Armstrong','F','01145787353'),
('Michael','Bluth','M','01980289282'),
('Kat','Nash','F','01176987789'),
('Buster','Bluth','M','01173456782'),
('Charlie',NULL,'F','01139287883'),
('Lindsay','Bluth','F','01176923804'),
('Harry','Johnson','M',NULL),('John','Smith','M','01174987221'),
('John','Taylor','M',NULL),('Emma','Smith','F','01176984116'),
('Gob','Bluth','M','01176985498'),
('George','Bluth','M','01176984303'),
('Lucille','Bluth','F','01198773214'),
('George','Evans','M','01174502933'),
('Emily','Simmonds','F','01899284352'),
('John','Smith','M','01144473330'),('Jennifer',NULL,'F',NULL),
('Toby','West','M','01176009822'),
('Paul','Edmonds','M','01966947113');


use coffee_str;
select * from customers;
select * from products;
select * from orders;

-- selecting only one column from the table
select last_name from customers;

-- selecting multiple columns from a table
select last_name,phone_number from customers;

-- selecting particular rows of data according to a condition
select * from products
where coffee_orign='Columbia';

select * from products
where price=3.00;

-- selecting a row with more than one condition
select * from products
where price=3.00
and coffee_orign='Columbia';
-- selecting rows of data which meets either one of the criteria/ condition 
select * from products
where price=3.00
or coffee_orign='Columbia';

/*
Inequality symbols
> : greater than
>=: greater than or equal to
<: less than
<=:less than or equal to
*/

select * from products;

select * from products 
where price>3.00;

select * from products 
where price<3.00;

select * from products 
where price<=3.00;
-- dealing with null values
select * from customers;
-- IS 
select * from customers
where phone_number is null;
-- IS NOT
select * from customers
where phone_number is not null;

/*Exercise-1 solutio*/
use coffee_str;
-- 1ST EXERCISE
-- 1st solution
select * from customers;
select first_name,phone_number from customers
where gender='F'
and last_name='Bluth';

-- 2nd solution
select name from products
where price>3.00
or coffee_orign='Sri Lanka';

-- 3rd solution
select * from customers
where gender='M'
and phone_number is null;

-- selecting rows containing two or more values
select * from customers
where last_name in ('Bluth','Taylor','Armstrong');

-- selecting rows not containing two or more values
select * from customers
where first_name not in ('Katie','George','John');

select * from orders;

-- selecting rows/ data which lie between a range of values
-- on dates
select product_id, customer_id, order_time from orders
where order_time between '2017-01-01' and '2017-01-07';
-- on numbers
select product_id, customer_id, order_time from orders
where customer_id between 5 and 10;

select * from customers;
-- on strings
select * from customers
where last_name between 'A' and 'L';

-- like/ pattern matching starting with a letter
select * from customers
where last_name like 'W%';
-- having the letter in it
select * from customers
where last_name like '%o%';
-- ending with a particular letter
select * from customers
where last_name like '%r';
-- Underscore represents exactly one character presceding or aafter the specified letter
select * from customers
where first_name like '_o_';

-- LIKE with numbers
select * from products;
select * from products
where price like '3%';

-- ordering the data
select * from products;

select * from products
order by price asc;

select * from products
order by price desc;
-- ORDER BY ON STRINGS
select * from customers;
select * from customers
order by last_name asc;

select * from customers
order by last_name desc;
-- ORDER BY ON DATE
select * from orders;
select * from orders
where customer_id=1
order by order_time asc;


/* exercise-2
1) from products table, select the name and price of all the products with a coffee origin 
equal to columbia or Indonesia. Ordered by name from A-Z
2) from orders table, select all the orders from february 2017 for customers with id's of 2,4,6 or 8.
3)from the customers table, select the first_name and phone_number of all the customers who's last name contains the pattern 'ar'.
*/

/* 1)*/
select name,price from products 
where coffee_orign in('Columbia','Indonesia')
order by name asc;

/*2)*/
select* from orders
where order_time between '2017-02-01' and '2017-02-28'
and customer_id in(2,4,6,8);

/*3)*/
select first_name,phone_number from customers
where last_name like '%ar%' ;


select coffee_origin from products;
-- to select distinct / unique values
select distinct coffee_orign from products;
-- to get all the customers who ordered in feb without distinct
select customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- to get the distinct customers in feb
select distinct customer_id from orders 
where order_time between '2017-02-01' and '2017-02-28';
-- you will get duplicate customers because they have orderd different products
select distinct customer_id, product_id from orders 
where order_time between '2017-02-01' and '2017-02-28';

-- LIMIT
select * from customers;
select * from customers
limit 5;

select * from customers
limit 10 offset 2;

select * from customers
order by last_name
limit 10;

-- COLUMN NAME ALIAS
select * from products;
select name, price, coffee_orign from products;
-- changing the column names only in the reslut set not the database
select name as Coffee, price, coffee_orign as Country from products;


/* EXERCISE 3
1) from customers table, select distinct last names and order alphabetically from a-z.
2) from orders table , select the first 3 orders placed by customer with id 1, in february 2017.
3) from the products table, select the name , price and coffee_origin but rename the price to retail_price in the result set.alter.
*/
/*1)*/
select distinct last_name from customers
order by last_name asc;

/*2)*/

select * from orders 
where order_time between '2017-02-01' and '2017-02-28' and customer_id = 1
order by order_time asc limit 3;


/*3)*/
select name,price as retail_price,coffee_orign from products;


use coffee_str;
select * from products;
select * from orders;
select * from customers;

-- JOINS
-- INNER JOIN
-- product name field from products table and order_time from the orders table
/*select <table1>.column,<table2>.column from <table1>
inner join <table2> on <table1>.column=<table2>.column;
inner join <table3> on <table3>.colummn=<table2>.column */

select products.name,orders.order_time from orders
inner join products on products.id=orders.product_id;

select products.name,orders.order_time from orders
inner join products on products.id=orders.product_id
where products.name='Filter'
and orders.order_time between '2017-01-14' and '2017-01-31'
order by orders.order_time;


select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
order by o.order_time asc;

select p.name,p.price,o.order_time from orders o
join products p on p.id=o.product_id
where p.id=5
order by order_time asc;

select * from orders;

update orders
set customer_id=null
where id=1;
-- left join
-- Orders LEFT JOIN ON customers
select o.id,c.last_name,c.phone_number,o.order_time from orders o
left join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

-- by inter changining the table-1 and table-2 positions
select o.id,c.last_name,c.phone_number,o.order_time from customers c
left join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

-- RIGHT JOIN
-- Customers RIGHT JOIN on Orders
select o.id,c.last_name,c.phone_number,o.order_time from customers c
right join orders o on c.id=o.customer_id
order by o.order_time
limit 10;

select o.id,c.last_name,c.phone_number,o.order_time from  orders o
right join customers c on o.customer_id=c.id
order by o.order_time
limit 10;

update orders
set customer_id=1
where id=1;

-- all the tables join
select * from orders;
select * from customers;
select * from products;


select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id;

select p.name,p.price,c.first_name,c.last_name,o.order_time from products p
join orders o on p.id=o.product_id
join customers c on o.customer_id=c.id
where c.last_name='Martin'
order by o.order_time;

/*Exercise-1
1) select order id and customers phone number for all orders of product id 4.
2)select product name and order time for filter coffees sold between january 15th 2017 and february 14th 2017.
3)select the product name and the price and order time for all the orders from femails in january 2017.
