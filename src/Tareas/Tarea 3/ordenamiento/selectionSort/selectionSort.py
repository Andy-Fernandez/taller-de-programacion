# Metodos de ordenamiento - Selection Sort
v = [5, 3, 8, 1, 2, 4, 7, 6, 9, 0]

def selectionSort(v):
    for i in range(len(v)):
        min = i
        for j in range(i+1, len(v)):
            if v[j] < v[min]:
                min = j
        v[i], v[min] = v[min], v[i]
    return v

print(selectionSort(v))