const fs = require('fs');
const path = require('path');
function nowString(){
  const d=new Date();const p=n=>String(n).padStart(2,'0');
  return `${d.getFullYear()}-${p(d.getMonth()+1)}-${p(d.getDate())} ${p(d.getHours())}:${p(d.getMinutes())}:${p(d.getSeconds())}`;
}
const dir='logs'; const file=path.join(dir,'app.log');
if(!fs.existsSync(dir)) fs.mkdirSync(dir);
fs.appendFileSync(file, `[${nowString()}] - Ejecución exitosa\n`);
const lines = fs.readFileSync(file,'utf8').trim().split('\n');
console.log('Últimas 5 ejecuciones:');
console.log(lines.slice(-5).join('\n'));
