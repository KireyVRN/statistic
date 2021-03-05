DROP TABLE IF EXISTS CITIES;

create TABLE CITIES (
    id INT AUTO_INCREMENT,
    name VARCHAR (255),
    area INT,
    foundation_date INT,
    population INT,
    dialing_code INT (255),
    amount_of_crimes INT,
    PRIMARY KEY (ID)
    );

DROP TABLE IF EXISTS DISTRICTS;

create TABLE DISTRICTS (
    id INT AUTO_INCREMENT,
    name VARCHAR(255),
    area INT,
    population INT,
    amount_of_crimes INT,
    city_id INT,
    PRIMARY KEY (ID),
    FOREIGN KEY (city_id) REFERENCES CITIES (id)
);

