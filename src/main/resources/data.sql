-- Initialisation des tables
INSERT INTO Employe(Metiers,matricule, nom, email,pourcentage,diplome,montant_Prime) VALUES
    ('C',1, 'Rémi Bastide', 'Remi.Bastide@univ-jfc.fr',10,null,null), -- Les clés sont auto-générées
    ('A',2, 'Elyes Lamine', 'Elyes.Lamine@univ-jfc.fr',null,'Master 2',null),
    ('T',3, 'Jean-Marie Pécatte', 'Jean-Marie.Pecatte@univ-jfc.fr',null,null,30);
-- On peut fixer les clés auto-générées, mais il faut ensuite
-- réinitialiser le compteur de clé auto-générée
-- Attention : la syntaxe est différente selon le SGBD utilisé
-- Ici la syntaxe pour le SGBD H2

INSERT INTO Projet (code, nom, debut, fin) VALUES
                                                (1, 'Winx','2019-12-22',null),
                                                (2,'Hamtaro','2023-07-04','2024-01-20'),
                                                (3, 'Dofus', '2026-03-05',null);

INSERT INTO Participation (id_Part,role, pourcentage) VALUES
                                                  (1,'Dev', 20),
                                                  (2,'Chef',50),
                                                  (3,'Data',30);

INSERT INTO Participation_Contributeur(Contributeur_matricule, Participation_id_part) VALUES
                                                                                          (1,1),
                                                                                          (1,2),
                                                                                          (1,3);

INSERT INTO Participation_Affectation(affectation_code, Participation_id_part) VALUES
                                                                                   (1,1),
                                                                                   (1,2),
                                                                                   (1,3);



ALTER TABLE Employe ALTER COLUMN matricule RESTART WITH 4;

