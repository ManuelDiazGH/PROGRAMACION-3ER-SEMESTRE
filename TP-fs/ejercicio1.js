const fs = require('fs');
function nowString() {
  const d = new Date();
  const pad = n => String(n).padStart(2, '0');
  return `${d.getFullYear()}-${pad(d.getMonth()+1)}-${pad(d.getDate())} ${pad(d.getHours())}:${pad(d.getMinutes())}:${pad(d.getSeconds())}`;
}
const logFile = 'log.txt';
fs.appendFileSync(logFile, `[${nowString()}] - Inicio del programa\n`);
let seconds = 0;
const interval = setInterval(() => {
  seconds++;
  fs.appendFileSync(logFile, `[${nowString()}] - Ejecutando tarea...\n`);
}, 1000);
setTimeout(() => {
  clearInterval(interval);
  fs.appendFileSync(logFile, `[${nowString()}] - Tarea completada\n`);
  console.log('Tarea completada. Revisa log.txt');
}, 5000);
