let v = [9, 54, 4, 32, 22, 1, 8, 7, 62]

function bubbleSort(v) {
  for (let i = 0; i < v.length; i++) {
    for (let j = 0; j < v.length - 1; j++) {
      if (v[j] > v[j + 1]) {
        let aux = v[j]
        v[j] = v[j + 1]
        v[j + 1] = aux
      }
    }
  }
  return v
}
v = bubbleSort(v)
console.log(v)

// recursive version
console.log('recursive version: ')
v = [9, 54, 4, 32, 1, 23, 100, 22, 1, 8, 7, 62]
function bubbleSortRecursive(v, i = 0) {
  if (i < v.length) {
    for (let j = 0; j < v.length - 1; j++) {
      if (v[j] > v[j + 1]) {
        let aux = v[j]
        v[j] = v[j + 1]
        v[j + 1] = aux
      }
    }
    return bubbleSortRecursive(v, i + 1)
  }
  return v
}
v = bubbleSortRecursive(v)
console.log(v)