Hachemi Reda 3A-32
exercice 1 :
1.2/
a)  Pour ajouter des  nouveaux types d’instruments, il faut à chaque fois ajouter une nouvelle classe de l’instrument puis une nouvelle méthode add(), une nouvelle méthode tune et une nouvelle liste. 
Ce qui rend la tache difficile.
Maintenant si on rajoute un nouveau type d’instrument Stringed, il faudra implémenter des nouvelles méthodes dans orchestra avec l’ajout des méthodes et variables énoncées précédemment.

b) Si on veut composer une autre Music il faudra rajouter des variables et des méthodes. Cela est donc difficile.

1.3/ 
Il n’y a pas d’abstraction donc non ce design n’est pas conforme au principe Ouvert/Fermé puisqu’on on ne peut pas étendre le comportement d’une classe sans la modifier. 

1.4/
 Dans tuneAll() il faudrait modifier le code avec une  condition pour ne pas jouer les instruments de type Brass. 
Donc non, cela ne respecte pas le principe de substitution de Liskov.


