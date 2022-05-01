
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


exercice 2 :
2.3/

a) Pour ajouter des nouveaux types d’instruments il faut créer la classe correspondante pour ensuite la faire hériter d’un type d’instrument. Il est donc plus facile d’ajouter de nouveaux types d’instruments.

b) Nous n’avons plus besoin de modifier le classe orchestra pour la réutiliser, il est donc plus simple de la réutiliser. 

2.4/
Nous retrouvons l’abstraction avec la classe instrument. De plus nous pouvons étendre le comportement d’une classe sans la modifier donc ce design correspond au principe Ouvert/Fermé.

2.6/
Pour ajouter des options aux instruments il faut modifier les classes donc le principe des inversions dépendances n’est pas respecté.
Néanmoins ce design respecte en partit ce principe car la classe orchestra de haut niveau dépend uniquement de la classe instrument mais pas des classes de type instrument de bas niveau.


exercice 3
3.9/ 
 Le soucis de cet affichage c’est qu’on ne peut pas contrôler son mode de fonctionnement complètement, notamment guitar de type Ténor implémente la méthode playLikeASoprano().

3.10/ 
a) 
Il n’y a pas besoin de modifier les classes pour ajouter des nouveaux instruments, il suffit de les faire hériter d’un type d’instruments. C’est donc facile d’en ajouter de nouveaux.

b) 
Nous pouvons facilement réutiliser la classe orchestra ( sans la modifier) pour composer une autre Music.

3.11/
Nous retrouvons l’abstraction avec la classe instrument. De plus nous pouvons étendre le comportement d’une classe sans la modifier donc ce design correspond au principe Ouvert/Fermé.

3.12/
Mettre en pause les instruments de type Brass nécessite de les faire hériter d’une classe abstraite « pause » qui va hériter d’un instrument et implémenter une méthode play pour mettre en pause.
Ainsi le principe de Liskov est respecté.
3.14/
Avec les méthodes playLikeASoprano et playLikeATenor, les classes sont forcées de les implémenter alors que ces méthodes n’ont pas de sens pour les classes et donc le principe de Ségrégations des interfaces n’est pas respecté.



