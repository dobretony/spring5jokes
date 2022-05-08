CREATE TABLE IF NOT EXISTS Jokes(
  id INT AUTO_INCREMENT PRIMARY KEY,
  joke_description VARCHAR(255) NOT NULL
);

INSERT INTO Jokes(id, joke_description) values (1, 'First Joke');
INSERT INTO Jokes(id, joke_description) values (2, 'Second Joke');
INSERT INTO Jokes(id, joke_description) values (3, 'Third Joke');
INSERT INTO Jokes(id, joke_description) values (4, 'Fourth Joke');
INSERT INTO Jokes(id, joke_description) values (5, 'Fifth Joke');
INSERT INTO Jokes(id, joke_description) values (6, 'Sixth Joke');