/**
 * Solution.js
 * Copyright © 2013-2022 David Han, all rights reserved.
 */
var Solution = (function(fn) {
    'use strict';
    var getUnits = function(s, match) {
        match = match || /^(?:\(([bcr][1-9])\+([bcr][1-9])\))|([bcr][1-9])/.exec(s);
        if(!match) {
            return null;
        }
        var units = [];
        if(match[3]) {
            units[0] = match[3];
        }
        else {
            units[0] = match[1];
            units[1] = match[2];
        }
        return units;
    };
    var getClues = function(s, cb) {
        var clues = [];
        // units
        var match = /^(?:\(([bcr][1-9])\+([bcr][1-9])\))|([bcr][1-9])/.exec(s);
        if(match && match.index === 0) {
            clues.units = getUnits(s, match);
            s = s.substr(match[0].length);
        }
        else {
            s = '+' + s;
        }
        while(s.length) {
            if(/^[+-]\(/.test(s)) {
                var ri = s.indexOf(')');
                var cl = 0;
                var cr = 0;
                while(ri > 0) {
                    cl = s.substr(0, ri).match(/\(/g).length;
                    cr++;
                    if(cl === cr) {
                        break;
                    }
                    ri = s.indexOf(')', ri + 1);
                }
                if(cl === cr) {
                    var clueString = s.substr(0, ri + 1);
                    var clue = {op: clueString.charAt(0)};
                    var subclues = getClues(clueString.substr(2, clueString.length - 3));
                    if(!subclues) {
                        return null;
                    }
                    clue.clues = subclues;
                    clues.push(clue);
                    s = s.substr(ri + 1);
                }
                else {
                    return null;
                }
            }
            else if(/^[+-][bcr][1-9]/.test(s)) {
                clues.push({
                    op: s.charAt(0),
                    unit: s.substr(1)
                });
                s = s.substr(3);
            }
            else if(/^[+-][1-9][1-9]/.test(s)) {
                clues.push({
                    op: s.charAt(0),
                    box: s.charAt(1) - 1,
                    cell: s.charAt(2) - 1
                });
                s = s.substr(3);
            }
            else if(s.indexOf(')') === 0 && typeof(cb) === 'function') {
                clues.isWing = true;
                cb('(' + clues.units.join('+') + ')' + s.substr(1));
                break;
            }
            else {
                return null;
            }
        }
        return clues;
    };
    var isCompoundClue = function(c) {
        return c.clues && c.clues.units;
    };
    var isMultiClue = function(c) {
        return c.clues && !c.clues.units;
    };
    var isUnitClue = function(c) {
        return !c.clues && c.unit;
    };
    var isSimpleClue = function(c) {
        return !c.clues && !c.unit;
    };
    var fromString = function(s) {
        var so = {solution: s};
        var si = 0;
        // solution
        var match = /^([1-9])([1-9])([1-9])\b/.exec(s);
        if(!match) {
            return null;
        }
        si += match[0].length;
        so.box = match[1] - 1;
        so.cell = match[2] - 1;
        so.number = match[3] - 0;
        // conflict
        s = so.solution.substr(si);
        match = /^(=|!)/.exec(s);
        if(!match) {
            return null;
        }
        si += match[0].length;
        so.conflict = (match[1] === '!');
        // clues
        if(s.indexOf('((') === 1) {
            s = so.solution.substr(si + 1);
            so.wings = getClues(s, function(s) {
                so.clues = getClues(s);
            });
        }
        else {
            s = so.solution.substr(si);
            so.clues = getClues(s);
        }
        if(!so.clues) {
            return null;
        }
        return so;
    };
    fn.rate = function(s) {
        const so = fromString(s);
        if (!so) {
            return -1;
        }
        if (so.clues.units.length > 1) {
            for (const clue of so.clues) {
                if (clue.op == '+') {
                    return 7
                }
            }
            return 6
        } else {
            var pointout = false;
            var fitin = false;
            var compound = false;
            for (const clue of so.clues) {
                if (clue.op == '+') {
                    fitin = true
                } else {
                    pointout = true
                }
                if (isCompoundClue(clue)) {
                    compound = true
                }
            }
            if (pointout && !fitin && !compound) {
                return 1;
            } else if (pointout && !fitin && compound) {
                return 2;
            } else if (!pointout && fitin && !compound) {
                return 3;
            } else if (!pointout && fitin && compound) {
                return 4;
            } else if (pointout && fitin) {
                return 5;
            }
            return 0;
        }
    };
    return fn;
}(Solution || {}));
