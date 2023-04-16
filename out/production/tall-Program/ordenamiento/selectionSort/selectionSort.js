let v = [9, 3, 8, 1, 2, 4, 7, 6];

function selectionSort(v){
    for(let i = 0; i < v.length; i++){
        let min = i;
        for(let j = i + 1; j < v.length; j++){
            if(v[j] < v[min]){
                min = j;
            }
        }
        let aux = v[i];
        v[i] = v[min];
        v[min] = aux;
    }
    return v;
}
selectionSort(v);
console.log(v);