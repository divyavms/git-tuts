const arr=[1,2,3,4,5,6]
//add=(a,b)=>a+b;
//mul=(a,b)=>a*b;
//big=(a,b)=>a>b?a:b;
function perform(arr,callbck){
    let res=arr[0];
    for(let i=1;i<arr.length;i++){
        res=callback(res,arr[i]);
    }
    return res;
    }
let res=perform(arr,(a,b)=>a>b?a:b);
console.log(res)
