/* codigo para el Ejercicio 1 y 2 (Usso basico de Yargs con validacion)
----------------------------------------------------------------------

import yargs from 'yargs';
import { hideBin } from 'yargs/helpers';

const argv = yargs(hideBin(process.argv))
  .option('nombre', {
    describe: 'Tu nombre',
    demandOption: true, 
    type: 'string',
    alias: 'n'
  })
  .option('edad', {
    describe: 'Tu edad',
    demandOption: true, 
    type: 'number',
    alias: 'e'
  })
  .check((argv) => {
    if (argv.edad <= 0) {
      throw new Error('La edad debe ser un número mayor que 0');
    }
    return true;
  })
  .help()
  .argv;
console.log(`Hola ${argv.nombre}, tenes ${argv.edad} años.`);

---------------------------------------------------------------------

en la terminal: node app.js --nombre="Franco" --edad=22 */







/* codigo para el Ejercicio 5 (integrador)

----------------------------------------------------------------------

import yargs from 'yargs';
import { hideBin } from 'yargs/helpers';
import { config } from './config.js';

const argv = yargs(hideBin(process.argv))
  .option('saludo', {
    describe: 'Mensaje de saludo',
    demandOption: true,
    type: 'string',
    alias: 's'
  })
  .help()
  .argv;
console.log(`Servidor corriendo en el puerto ${config.port} (modo ${config.mode}): ${argv.saludo}`);

---------------------------------------------------------------------

en la terminal: node app.js --saludo="Hola Franco!" */
