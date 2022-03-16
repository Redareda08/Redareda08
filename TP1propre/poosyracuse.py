#Hachemi Reda TP1 python 16/02/2022#

# Conjecture de Syracuse question 2 et 4: fonction conjecture de syracuse + lecture ecritrure fichier + POO #
class syracuse:
 def syracuse(self, n): 
    if n == 1:
        return 1
     
    while n > 1:
        if n%2 == 0:
            n = n/2
        else:
            n = n*3 + 1
    return n

file =open("students.txt","r+")
n=int(file.readline())
sy= syracuse()
file.write(str(sy.syracuse(n)))