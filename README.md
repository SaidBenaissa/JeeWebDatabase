# JeeWebDatabase
Pour tester l'application, vous aurez  besoin d'exécuter des commandes SQL dans la ligne de commande MySQL pour préparer votre base de données.
<ul>
<li>Commencez par créer une base appelée "java_ee" :</li>

<a>
CREATE DATABASE javaee DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
</a>

<li>Puis créez la structure de la table noms :</li>

<a>
CREATE TABLE  noms (
 id INT( 11 ) NOT NULL AUTO_INCREMENT ,
 nom VARCHAR( 200 ) NOT NULL ,
 prenom VARCHAR( 200 ) NOT NULL ,
 PRIMARY KEY ( id )
) ENGINE = INNODB;
</a>
</ul>
