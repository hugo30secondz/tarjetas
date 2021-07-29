create table tarjetas(
	id INT AUTO_INCREMENT PRIMARY KEY,
	passion VARCHAR(400) NOT NULL,
	minsalary INT NOT NULL,
	maxsalary INT NOT NULL,
	minage 	INT NOT NULL,
	maxage INT NOT NULL,
	cards VARCHAR(400) NOT NULL
);

insert into tarjetas values (1,'shopping',7000,14999,18,23,'B-smart. Afinity Card');
insert into tarjetas values (2,'shopping',7000,14999,24,32,'B-smart, Clasica, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot');
insert into tarjetas values (3,'shopping',7000,14999,33,75,'B-smart. Afinity Card');
insert into tarjetas values (4,'shopping',15000,34999,18,23,'B-smart, Clasica, Afinity Card');
insert into tarjetas values (5,'shopping',15000,34999,24,32,'Oro, Afinity Card, Office Depot, Costco, Best Buy Banamex, The Home Depot');
insert into tarjetas values (6,'shopping',15000,34999,33,75,'Oro, Office Depot, Costco, Best Buy Banamex, The Home Depot');
insert into tarjetas values (7,'shopping',35000,49999,18,23,'B-smart, Afinity card');
insert into tarjetas values (8,'shopping',35000,49999,24,75,'Platinum, Office Depot, Costco, Best Buy Banamex, The Home Depot');
insert into tarjetas values (9,'shopping',50000,999999,18,23,'B-smart, Afinity Card');
insert into tarjetas values (10,'shopping',50000,999999,24,75,'Platinum');