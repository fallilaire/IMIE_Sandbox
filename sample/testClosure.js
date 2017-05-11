function outer() {

    var v = 0;

    function inner() {
        v++;
        return v;
    }

    console.log(v);
    return inner;
}

f = outer();

console.log(f());
console.log(outer.v);
console.log(f());
