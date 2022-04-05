"""list =[]
a= int( input("Entrez nb d'elements"))

for i in range(0,a):
    ele= int(input())
    list.append(ele)
    
print(list)"""



"""L = input()
L = L.split(',')
T = tuple(L)
print("List : ",L)
print("Tuple : ",T)"""



"""L = input()
L = L.split(',')
T = tuple(L)
print("List : ",L)
print("Tuple : ",T)
L.sort()
print("Liste triée :",L)"""


"""L=input()
L=L.split()
L.sort()
print(L)"""


"""def removeVowels(word):
    vowels = ('a', 'e', 'i', 'o', 'u', 'y')
    for c in word:
        if c in vowels:
            res = word.replace(c,"")
    return res 

word=input()
removeVowels(word)
print(word)""" #marche pas celle la et jsp pq# 

"""def rv(str1):
    v=['a','e','i','o','u','y']
    str2=[i for i in str1 if i not in v]
    str2=''.join(str2)
    return str2
s=input()
print(rv(s))"""

def insertmiddstring(str,word):
    return str[:2] + word + str[2:]

print(insertmiddstring('programation', 'python'))
















