/**
 * @param {string} dominoes
 * @return {string}
 */
var pushDominoes = function(dominoes) {
    const next = [...dominoes].map((domino, i) => {
        if (domino !== '.') return domino // if already fallen, ignore
        else if (dominoes[i - 1] === 'R' && dominoes[i + 1] !== 'L') return 'R' // if forced right, fall right
        else if (dominoes[i - 1] !== 'R' && dominoes[i + 1] === 'L') return 'L' // if forced left, fall left
        else return domino // else, ignore
    }).join('')

    if (dominoes === next) return dominoes // if no evolution, return state
    else return pushDominoes(next) // else, evolve state
};
