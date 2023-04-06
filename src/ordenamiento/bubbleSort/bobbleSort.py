# without order:
myArray = [9, 54, 4, 32, 22, 1, 8, 7, 62]
print(myArray)

# bubbleSort:
def bubbleSort(myArray):
  for i in range(len(myArray)):
    for j in range(len(myArray) - 1):
      if myArray[j] > myArray[j + 1]:
        myArray[j], myArray[j + 1] = myArray[j + 1], myArray[j]
# print(bubbleSort(myArray))

# Recursive:
def bubbleSortRecursive(myArray):
    if len(myArray) == 1:
        return myArray
    else:
        for i in range(len(myArray) - 1):
            if myArray[i] > myArray[i + 1]:
                myArray[i], myArray[i + 1] = myArray[i + 1], myArray[i]
        return bubbleSortRecursive(myArray[:-1]) + [myArray[-1]]
myArray = bubbleSortRecursive(myArray)

# Mayor a Menor:
def bubbleSortMayorMenor(myArray):
   for i in range(len(myArray)):
    for j in range(len(myArray) - 1):
      if myArray[j] < myArray[j + 1]:
        myArray[j], myArray[j + 1] = myArray[j + 1], myArray[j]
# print(bubbleSortMayorMenor(myArray))

# Recursive Mayor a Menor:
def bubbleSortRecursiveMayorMenor(myArray):
    if len(myArray) == 1:
        return myArray
    else:
        for i in range(len(myArray) - 1):
            if myArray[i] < myArray[i + 1]:
                myArray[i], myArray[i + 1] = myArray[i + 1], myArray[i]
        return bubbleSortRecursiveMayorMenor(myArray[:-1]) + [myArray[-1]]
# myArray = bubbleSortRecursiveMayorMenor(myArray)
# with order:
print(myArray)


# With a flag to stop the loop if the array is already sorted:
def bubbleSortRecursive(myArray):
    flag = True
    if len(myArray) == 1:
        return myArray
    else:
        for i in range(len(myArray) - 1):
            if myArray[i] > myArray[i + 1]:
                myArray[i], myArray[i + 1] = myArray[i + 1], myArray[i]
                flag = False
        print(myArray)
        if (flag):
              return myArray
        return bubbleSortRecursive(myArray[:-1]) + [myArray[-1]]
# myArray = bubbleSortRecursive(myArray)