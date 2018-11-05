const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Please enter n : ', (answer1) => {
    rl.question('Please enter x : ', (answer2) => {
        var result = countValleys(+answer1, answer2);
        console.log(`Total number of valleys are:  ${result}`);
        rl.close();
    });
});



function countValleys(n, s) {
  var lvl = 0;
  var v = 0;

  for(var i=0;i < s.length; i++){
    if (s.charAt(i) == 'U')
      lvl+=1;
    if (s.charAt(i) == 'D')
      lvl-=1;
    if (lvl == 0 && s.charAt(i) == 'U')
      v+=1;
  }
  return v;
}
