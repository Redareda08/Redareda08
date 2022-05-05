
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



exercice 4 :
4.7/
Les interfaces Tenor et Soprano nous permettent de maitriser le comportement des instruments sans implémenter des méthodes qui ne nous intéressent pas, ainsi quand on compile, il ne subsiste aucun soucis avec les méthodes que nous ne voulons pas implémenter.

4.9/ 
a) 
Pour ajouter des nouveaux instruments il n’y a plus besoin de faire des modifications dans les classes, il suffit de les faire hériter d’un type d’instrument et c’est donc plus facile. 

b) 
En modifiant une classe nous n’avons pas le besoin d’en modifier d’autres que celle concernée de base. Il faudra néanmoins créer une nouvelle méthode pour jouer d’une autre manière. Il faudra ensuite créer une interface pour  l’implémenter à l’instrument concerné et implémenter la méthode de l’interface dans la classe de l’instrument.

c) 
La classe Orchestra est facile à réutiliser car il n’y a pas besoin de la modifier pour composer une autre Music.

4.10/
Ici les 5 principes SOLID sont respectés, notamment nous pouvons étendre le comportement d’une classe sans la modifier donc ce design correspond au principe Ouvert/Fermé. D’autre part aucune méthode n’est inutile ainsi le principe de Liskov est respecté. Le principe de la responsabilité unique est respecté car ici aucune méthode ne fait plus que ce qu’elle ne doit faire. Les classes de haut   niveau ne dépendent pas des classes de bas niveau et donc le principe des inversions des dépendances est respecté. Pour finir il reste le principe de ségrégation des interfaces qui grâce au fait que les classes ne sont pas forcées d’implémenter des méthodes qui n’ont pas de sens pour les classes alors ce principe est respecté.


