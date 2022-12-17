# change calculator
from math import trunc

print("how much does this item cost?")
cost = float(input())
print("how much are you paying?")
pay = float(input())
owe = pay - cost
print(owe)

bux = trunc(owe/1)
rem1 = owe - bux
quarter = trunc(rem1/0.25)
rem2 = rem1 - quarter*0.25
dime = trunc(rem2/0.10)
rem3 = rem2 - dime*0.10
nickel = trunc(rem3/0.05)
rem4 = rem3 - nickel*0.05
cent = trunc(rem4/0.01)
rem5 = rem4 - cent*0.01
print("change is " + str(bux) + " bucks")
print(str(quarter)+" quarters")
print(str(dime)+" dimes")
print(str(nickel)+" nickels")
print(str(cent)+" pennis")
