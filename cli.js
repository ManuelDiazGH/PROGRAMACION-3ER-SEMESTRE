import yargs from 'yargs';
import { hideBin } from 'yargs/helpers';
import { suma, resta, multiplicacion, division } from './math.js';
import fs from 'fs';

yargs(hideBin(process.argv))
  .command(
    'saludar',
    'Muestra un saludo personalizado',
    {
      nombre: {
        describe: 'Tu nombre',
        demandOption: true,
        type: 'string',
        alias: 'n'
      }
    },
    (argv) => {
      console.log(`Hola ${argv.nombre}! Como estas?`);
    }
  )
  
  .command(
    'despedir',
    'Muestra una despedida personalizada',
    {
      nombre: {
        describe: 'Tu nombre',
        demandOption: true,
        type: 'string',
        alias: 'n'
      }
    },
    (argv) => {
      console.log(`Adios ${argv.nombre}! Que tengas un buen dia.`);
    }
  )
  
  .command(
    'calcular',
    'Realiza operaciones matemáticas',
    {
      operacion: {
        describe: 'Tipo de operacion: suma, resta, multiplicacion, division',
        demandOption: true,
        type: 'string',
        alias: 'o'
      },
      n1: {
        describe: 'Primer numeroo',
        demandOption: true,
        type: 'number'
      },
      n2: {
        describe: 'Segundo numero',
        demandOption: true,
        type: 'number'
      }
    },
    (argv) => {
      try {
        let resultado;
        const { operacion, n1, n2 } = argv;
        
        const operacionesValidas = ['suma', 'resta', 'multiplicacion', 'division'];
        if (!operacionesValidas.includes(operacion)) {
          throw new Error(`Operacion invalida. Usa: ${operacionesValidas.join(', ')}`);
        }
        
        switch (operacion) {
          case 'suma':
            resultado = suma(n1, n2);
            break;
          case 'resta':
            resultado = resta(n1, n2);
            break;
          case 'multiplicacion':
            resultado = multiplicacion(n1, n2);
            break;
          case 'division':
            resultado = division(n1, n2);
            break;
        }
        
        console.log(`Resultado de ${operacion} entre ${n1} y ${n2}: ${resultado}`);
      } catch (error) {
        console.error(`Error: ${error.message}`);
      }
    }
  )
  
  .command(
    'leer-json',
    'Lee y muestra el contenido de un archivo JSON',
    {
      archivo: {
        describe: 'Ruta del archivo JSON',
        demandOption: true,
        type: 'string',
        alias: 'a'
      }
    },
    (argv) => {
      try {
        
        const contenido = fs.readFileSync(argv.archivo, 'utf-8');
        const datos = JSON.parse(contenido);
        
        console.log('Contenido del archivo JSON:');
        console.log(JSON.stringify(datos, null, 2));
      } catch (error) {
        if (error.code === 'ENOENT') {
          console.error(`Error: El archivo "${argv.archivo}" no existe.`);
        } else if (error instanceof SyntaxError) {
          console.error(`Error: El archivo no es un JSON valido.`);
        } else {
          console.error(`Error: ${error.message}`);
        }
      }
    }
  )
  
  .help()
  .argv;