const fs = require('fs').promises;
(async ()=>{
  const [,, origen, destino] = process.argv;
  if(!origen || !destino){
    console.log('Uso: node copiarArchivo.js origen.txt destino.txt');
    return;
  }
  try {
    await fs.access(origen);
    await fs.copyFile(origen, destino);
    console.log(`Archivo copiado de ${origen} a ${destino}`);
  } catch(e){ console.error('Error:', e.message); }
})();
