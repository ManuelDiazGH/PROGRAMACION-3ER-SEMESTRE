const fs = require('fs').promises;
(async ()=>{
  const [,, archivo, palabra] = process.argv;
  if(!archivo || !palabra) {
    console.log('Uso: node contadorPalabras.js archivo.txt palabra');
    return;
  }
  try {
    const txt = await fs.readFile(archivo,'utf8');
    const re = new RegExp(`\\b${palabra}\\b`,'gi');
    const matches = txt.match(re);
    console.log(`La palabra "${palabra}" aparece ${matches?matches.length:0} veces en el archivo "${archivo}".`);
  } catch(e){ console.error(e.message); }
})();
