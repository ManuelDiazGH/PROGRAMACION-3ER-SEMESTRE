const fs = require('fs').promises;
function nowString() {
  const d = new Date();
  const pad = n => String(n).padStart(2, '0');
  return `${d.getFullYear()}-${pad(d.getMonth()+1)}-${pad(d.getDate())} ${pad(d.getHours())}:${pad(d.getMinutes())}:${pad(d.getSeconds())}`;
}
(async () => {
  try {
    await fs.writeFile('datos.txt', 'Nombre: Tu Nombre\nEdad: 30\nCarrera: Tu Carrera\n');
    console.log('datos.txt creado.');
    const contenido = await fs.readFile('datos.txt', 'utf8');
    console.log('Contenido:\n', contenido);
    await fs.appendFile('datos.txt', `Fecha de modificación: ${nowString()}\n`);
    await fs.rename('datos.txt', 'informacion.txt');
    console.log('Archivo renombrado a informacion.txt');
    setTimeout(async () => {
      await fs.unlink('informacion.txt');
      console.log('informacion.txt eliminado después de 10s');
    }, 10000);
  } catch (e) { console.error(e); }
})();
