print("information de votre personne:")
taille = float(input("taille? "))
poids = float(input("poids? "))
 
bmi = poids / taille** 2 * 703
 
if bmi < 18.5:
  print("maigre")
elif bmi < 25:
  print("normal")
elif bmi < 30:
  print("surpoids")
else:
  print("obèse")
 