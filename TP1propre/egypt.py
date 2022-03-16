#Multiplication egyptienne question 3 Hachemi Reda#
a=int(input())

b=int(input())

sum=0

 

while b!=0:

    if b%2 !=0 :

        sum+=a

    a=a+a

    b//=2

   

print(sum)