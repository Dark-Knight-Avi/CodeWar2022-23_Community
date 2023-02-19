/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let rev = 0
    while (x !== 0) {
        let rem = x % 10
        rev = rev * 10 + rem
        x = Math.trunc(x / 10)
    }
    return rev <= -Math.pow(2, 31) || rev >= Math.pow(2, 31) ? 0 : rev
};
