CREATE TABLE Billett
(
    id INTEGER AUTO_INCREMENT NOT NULL,
    navn VARCHAR(255) NOT NULL,
    antall VARCHAR(255) NOT NULL,
    fornavn VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    tlfnr VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,

    PRIMARY KEY (id)
);

