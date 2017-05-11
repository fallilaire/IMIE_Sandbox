function faireAddition(x) { 
    return (y) => x + y;
};

var ajout5 = faireAddition(5);
console.log(ajout5(2));  // 7

/*
var ajout10 = faireAddition(10);
console.log(ajout10(2)); // 12
*/