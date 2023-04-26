# without order:
myArray = [9, 54, 4, 32, 22, 1, 8, 7, 62]
print(myArray)

# bubbleSort:
for i in range(len(myArray)):
  for j in range(len(myArray) - 1):
    if myArray[j] > myArray[j + 1]:
      myArray[j], myArray[j + 1] = myArray[j + 1], myArray[j]

# with order:
print(myArray)